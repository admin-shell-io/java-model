package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Key Elements" "Enumeration of different key value types within a key. Contains KeyElements,
 * ReferableElements, and IdentifiableElements."@en
 */

public class DefaultKeyElements implements KeyElements {

    // instance fields as derived from the Asset Administration Shell ontology

    // no manual construction
    protected DefaultKeyElements() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {super.hashCode()});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public Object deepCopy() {
        DefaultKeyElements other = new DefaultKeyElements();

        return other;
    }

}
