package io.adminshell.aas.v3.model.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/**
 * A List which uses a Set internally and provides just a subset of the List interface which is also supported by the Set interface.
 * 
 * @author br
 *
 * @param <E> the type of elements in this list
 */

@Deprecated
public class SetBasedList<E> implements List<E> {

	private final class SetBasedListIterator implements ListIterator<E> {
		private Iterator<E> iterator;

		public SetBasedListIterator(Iterator<E> iterator) {
			this.iterator = iterator;
		}

		@Override
		public boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public E next() {
			return iterator.next();
		}

		@Override
		public boolean hasPrevious() {
			throw new UnsupportedOperationException();
		}

		@Override
		public E previous() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int nextIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int previousIndex() {
			throw new UnsupportedOperationException();
		}

		@Override
		public void remove() {
			iterator.remove();
		}

		@Override
		public void set(E e) {
			throw new UnsupportedOperationException();
			
		}

		@Override
		public void add(E e) {
			throw new UnsupportedOperationException();
		}
	}

	final private Set<E> base;

	public SetBasedList(Collection<E> collection) {
		base = new HashSet<>(collection);
	}
	
	public SetBasedList() {
		base = new HashSet<>();
	}

	@Override
	public int size() {
		return base.size();
	}

	@Override
	public boolean isEmpty() {
		return base.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return base.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return base.iterator();
	}

	@Override
	public Object[] toArray() {
		return base.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return (T[]) base.toArray();
	}

	@Override
	public boolean add(E e) {
		return base.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return base.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return base.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return base.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException("Access to specified positions is not supported.");
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return base.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return base.removeAll(c);
	}

	@Override
	public void clear() {
		base.clear();
	}

	@Override
	public E get(int index) {
		throw new UnsupportedOperationException("Access to specified positions is not supported.");
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException("Access to specified positions is not supported.");
	}

	@Override
	public void add(int index, E element) {
		throw new UnsupportedOperationException("Access to specified positions is not supported.");
	}

	@Override
	public E remove(int index) {
		throw new UnsupportedOperationException("Access to specified positions is not supported.");
	}

	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException("Access to specified positions is not supported.");
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException("Access to specified positions is not supported.");
	}

	@Override
	public ListIterator<E> listIterator() {
		return new SetBasedListIterator(base.iterator());
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int hashCode() {
		return Objects.hash(base);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetBasedList other = (SetBasedList) obj;
		return Objects.equals(base, other.base);
	}

	


}
