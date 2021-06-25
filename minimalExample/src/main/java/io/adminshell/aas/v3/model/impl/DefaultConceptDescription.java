package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.ConceptDescription
 * 
 * The semantics of a property or other elements that may have a semantic description is defined by
 * a concept description. The description of the concept should follow a standardized schema
 * (realized as data specification template). Constraint AASd-051: A ConceptDescription shall have
 * one of the following categories: VALUE, PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP,
 * COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW. Default: PROPERTY.
 */

public class DefaultConceptDescription implements ConceptDescription {

    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification")
    protected List<DataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
    protected List<Reference> isCaseOfs = new ArrayList<>();

    public DefaultConceptDescription() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.isCaseOfs,
            this.embeddedDataSpecifications);
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
            DefaultConceptDescription other = (DefaultConceptDescription) obj;
            return Objects.equals(this.isCaseOfs, other.isCaseOfs) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications);
        }
    }

    @Override
    public List<Reference> getIsCaseOfs() {
        return isCaseOfs;
    }

    @Override
    public void setIsCaseOfs(List<Reference> isCaseOfs) {
        this.isCaseOfs = isCaseOfs;
    }

    @Override
    public List<DataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    /**
     * This builder class can be used to construct a DefaultConceptDescription bean.
     */
    public static class Builder extends ConceptDescriptionBuilder<DefaultConceptDescription, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultConceptDescription newBuildingInstance() {
            return new DefaultConceptDescription();
        }
    }
}
