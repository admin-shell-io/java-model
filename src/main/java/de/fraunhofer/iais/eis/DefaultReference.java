package de.fraunhofer.iais.eis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Reference" "Reference to either a model element of the same or another AAs or to an external
 * entity. A reference is an ordered list of keys, each key referencing an element. The complete
 * list of keys may for example be concatenated to a path that then gives unique access to an
 * element or entity."@en
 */

public class DefaultReference implements Reference {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has key" "Unique reference in its name space."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
    protected List<Key> keys = new ArrayList<>();

    // no manual construction
    protected DefaultReference() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.keys});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultReference other = (DefaultReference) obj;
            return Objects.equals(this.keys, other.keys);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultReference other = new DefaultReference();
        other.keys = (List<Key>) Util.clone(this.keys);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
    final public List<Key> getKeys() {
        return keys;
    }

    final public void setKeys(List<Key> keys) {
        this.keys = keys;
    }
}
