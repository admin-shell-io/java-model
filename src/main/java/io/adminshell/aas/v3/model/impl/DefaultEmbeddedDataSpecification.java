package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.EmbeddedDataSpecification
 * 
 * Link to the included description of the Data Specification.
 */

public class DefaultEmbeddedDataSpecification implements EmbeddedDataSpecification {

    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent")
    protected List<DataSpecificationContent> dataSpecificationContents = new ArrayList<>();

    public DefaultEmbeddedDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.dataSpecifications,
            this.dataSpecificationContents);
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
            DefaultEmbeddedDataSpecification other = (DefaultEmbeddedDataSpecification) obj;
            return Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.dataSpecificationContents, other.dataSpecificationContents);
        }
    }

    @Override
    public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    @Override
    public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @Override
    public List<DataSpecificationContent> getDataSpecificationContents() {
        return dataSpecificationContents;
    }

    @Override
    public void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        this.dataSpecificationContents = dataSpecificationContents;
    }

    /**
     * This builder class can be used to construct a DefaultEmbeddedDataSpecification bean.
     */
    public static class Builder extends EmbeddedDataSpecificationBuilder<DefaultEmbeddedDataSpecification, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEmbeddedDataSpecification newBuildingInstance() {
            return new DefaultEmbeddedDataSpecification();
        }
    }
}
