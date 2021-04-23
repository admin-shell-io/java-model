package de.fraunhofer.iais.eis;

import java.util.List;

/**
 * Reference to either a model element of the same or another AAs or to an
 * external entity. A reference is an ordered list of keys, each key referencing
 * an element. The complete list of keys may for example be concatenated to a
 * path that then gives unique access to an element or entity.
 */
public interface Reference {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * Unique reference in its name space.
     *
     * @return Returns the List of Key for the property key.
     */
    public List<Key> getKeys();

}
