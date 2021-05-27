package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Value list" "A set of value reference pairs."@en
 */

public class DefaultVakueList implements VakueList {

    // instance fields as derived from the Asset Administration Shell ontology

    // no manual construction
    protected DefaultVakueList() {}

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
        DefaultVakueList other = new DefaultVakueList();

        return other;
    }

}
