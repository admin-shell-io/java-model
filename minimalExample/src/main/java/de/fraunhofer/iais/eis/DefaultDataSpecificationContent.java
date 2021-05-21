package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Specification Content" "DataSpecificationContent contains the additional attributes to be
 * added to the element instance that references the data specification template and meta
 * information about the template itself."@en
 */

public class DefaultDataSpecificationContent implements DataSpecificationContent {

    // instance fields as derived from the Asset Administration Shell ontology

    // no manual construction
    protected DefaultDataSpecificationContent() {}

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
        DefaultDataSpecificationContent other = new DefaultDataSpecificationContent();

        return other;
    }

}
