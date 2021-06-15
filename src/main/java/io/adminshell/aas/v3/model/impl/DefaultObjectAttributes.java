package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of ObjectAttributes
 * 
 * A set of data elements that describe object attributes. These attributes need to refer to a data
 * element within an existing submodel.
 */

public class DefaultObjectAttributes implements ObjectAttributes {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * A data elements that further classifies an object.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
    protected List<Reference> objectAttributes = new ArrayList<>();

    public DefaultObjectAttributes() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.objectAttributes});
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
            DefaultObjectAttributes other = (DefaultObjectAttributes) obj;
            return Objects.equals(this.objectAttributes, other.objectAttributes);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
    final public List<Reference> getObjectAttributes() {
        return objectAttributes;
    }

    final public void setObjectAttributes(List<Reference> objectAttributes) {
        this.objectAttributes = objectAttributes;
    }

    public static class Builder extends ObjectAttributesBuilder<DefaultObjectAttributes, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultObjectAttributes newBuildingInstance() {
            return new DefaultObjectAttributes();
        }
    }
}
