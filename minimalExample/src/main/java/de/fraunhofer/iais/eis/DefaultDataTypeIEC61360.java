package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Type IEC61360" "Enumeration of all IEC 61360 defined data types."@en
 */

public class DefaultDataTypeIEC61360 implements DataTypeIEC61360 {

    // instance fields as derived from the Asset Administration Shell ontology

    // no manual construction
    protected DefaultDataTypeIEC61360() {}

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
        DefaultDataTypeIEC61360 other = new DefaultDataTypeIEC61360();

        return other;
    }

}
