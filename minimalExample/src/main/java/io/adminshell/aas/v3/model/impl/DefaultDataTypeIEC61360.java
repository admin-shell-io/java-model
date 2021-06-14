package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * "Data Type IEC61360" "Enumeration of all IEC 61360 defined data types."@en
 */

public class DefaultDataTypeIEC61360 implements DataTypeIEC61360 {

    // instance fields as derived from the Asset Administration Shell ontology

    public DefaultDataTypeIEC61360() {}

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

    public static class Builder extends DataTypeIEC61360Builder<DefaultDataTypeIEC61360, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataTypeIEC61360 newBuildingInstance() {
            return new DefaultDataTypeIEC61360();
        }
    }
}
