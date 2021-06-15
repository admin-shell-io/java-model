package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.SubmodelElement
 * 
 * A submodel element is an element suitable for the description and differentiation of assets. The
 * concept of type and instance applies to submodel elements. Properties are special submodel
 * elements. The property types are defined in dictionaries (like the IEC Common Data Dictionary or
 * eCl@ss), they do not have a value. The property type (kind=Type) is also called data element type
 * in some standards. The property instances (kind=Instance) typically have a value. A property
 * instance is also called property-value pair in certain standards.
 */

public class DefaultSubmodelElement implements SubmodelElement {

    // instance fields as derived from the Asset Administration Shell ontology

    public DefaultSubmodelElement() {}

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

    public static class Builder extends SubmodelElementBuilder<DefaultSubmodelElement, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubmodelElement newBuildingInstance() {
            return new DefaultSubmodelElement();
        }
    }
}
