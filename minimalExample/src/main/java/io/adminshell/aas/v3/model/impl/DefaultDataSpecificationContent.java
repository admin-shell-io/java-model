package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * DataSpecificationContent contains the additional attributes to be added to the element instance
 * that references the data specification template and meta information about the template itself.
 */

public class DefaultDataSpecificationContent implements DataSpecificationContent {

    // instance fields as derived from the Asset Administration Shell ontology

    public DefaultDataSpecificationContent() {}

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

    public static class Builder extends DataSpecificationContentBuilder<DefaultDataSpecificationContent, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecificationContent newBuildingInstance() {
            return new DefaultDataSpecificationContent();
        }
    }
}
