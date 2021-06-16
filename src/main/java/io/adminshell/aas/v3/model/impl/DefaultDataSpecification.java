package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.DataSpecification
 * 
 * Data specification template of the description of the concept.
 */

public class DefaultDataSpecification implements DataSpecification {

    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    protected DataSpecificationContent dataSpecificationContent;

    public DefaultDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dataSpecificationContent});
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
            DefaultDataSpecification other = (DefaultDataSpecification) obj;
            return Objects.equals(this.dataSpecificationContent, other.dataSpecificationContent);
        }
    }

    @Override
    public DataSpecificationContent getDataSpecificationContent() {
        return dataSpecificationContent;
    }

    @Override
    public void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        this.dataSpecificationContent = dataSpecificationContent;
    }

    /**
     * This builder class can be used to construct a DefaultDataSpecification bean.
     */
    public static class Builder extends DataSpecificationBuilder<DefaultDataSpecification, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecification newBuildingInstance() {
            return new DefaultDataSpecification();
        }
    }
}
