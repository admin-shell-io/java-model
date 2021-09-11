package io.adminshell.aas.v3.model.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**Wraps a list but uses a HashSet to evaluate equal() and hashCode().
 * 
 * @author br
 *
 * @param <E> the type of elements in this list
 */
public class SetEqualListWrapper<E> implements List<E> {

	private List<E> wrappedList;

	public SetEqualListWrapper(List<E> wrappedList) {
		this.wrappedList = wrappedList;
	}

	public int hashCode() {
		return new HashSet<>(wrappedList).hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetEqualListWrapper other = (SetEqualListWrapper) obj;
		return Objects.equals(new HashSet<>(wrappedList), new HashSet<>(other.wrappedList));
	}

	public void forEach(Consumer<? super E> action) {
		wrappedList.forEach(action);
	}

	public int size() {
		return wrappedList.size();
	}

	public boolean isEmpty() {
		return wrappedList.isEmpty();
	}

	public boolean contains(Object o) {
		return wrappedList.contains(o);
	}

	public Iterator<E> iterator() {
		return wrappedList.iterator();
	}

	public Object[] toArray() {
		return wrappedList.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return wrappedList.toArray(a);
	}

	public boolean add(E e) {
		return wrappedList.add(e);
	}

	public boolean remove(Object o) {
		return wrappedList.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return wrappedList.containsAll(c);
	}

	public boolean addAll(Collection<? extends E> c) {
		return wrappedList.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		return wrappedList.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return wrappedList.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return wrappedList.retainAll(c);
	}

	public void replaceAll(UnaryOperator<E> operator) {
		wrappedList.replaceAll(operator);
	}

	public <T> T[] toArray(IntFunction<T[]> generator) {
		return wrappedList.toArray(generator);
	}

	public void sort(Comparator<? super E> c) {
		wrappedList.sort(c);
	}

	public void clear() {
		wrappedList.clear();
	}

	public E get(int index) {
		return wrappedList.get(index);
	}

	public E set(int index, E element) {
		return wrappedList.set(index, element);
	}

	public void add(int index, E element) {
		wrappedList.add(index, element);
	}

	public boolean removeIf(Predicate<? super E> filter) {
		return wrappedList.removeIf(filter);
	}

	public E remove(int index) {
		return wrappedList.remove(index);
	}

	public int indexOf(Object o) {
		return wrappedList.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return wrappedList.lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		return wrappedList.listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		return wrappedList.listIterator(index);
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return wrappedList.subList(fromIndex, toIndex);
	}

	public Spliterator<E> spliterator() {
		return wrappedList.spliterator();
	}

	public Stream<E> stream() {
		return wrappedList.stream();
	}

	public Stream<E> parallelStream() {
		return wrappedList.parallelStream();
	}

}
