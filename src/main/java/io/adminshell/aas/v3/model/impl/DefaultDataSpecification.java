package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of DataSpecification
 * 
 * Data specification template of the description of the concept.
 */

public class DefaultDataSpecification implements DataSpecification {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template itself.
     */
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

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    final public DataSpecificationContent getDataSpecificationContent() {
        return dataSpecificationContent;
    }

    final public void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        this.dataSpecificationContent = dataSpecificationContent;
    }

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
