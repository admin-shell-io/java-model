package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Data Specification" "Data specification template of the description of the concept."@en
 */

public class DefaultDataSpecification implements DataSpecification {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "Data Specification Content" "DataSpecificationContent contains the additional attributes to be
     * added to the element instance that references the data specification template and meta
     * information about the template itself."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    protected List<DataSpecificationContent> dataSpecificationContents = new ArrayList<>();

    public DefaultDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dataSpecificationContents});
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
            return Objects.equals(this.dataSpecificationContents, other.dataSpecificationContents);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    final public List<DataSpecificationContent> getDataSpecificationContents() {
        return dataSpecificationContents;
    }

    final public void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        this.dataSpecificationContents = dataSpecificationContents;
    }

    public static class Builder extends DefaultDataSpecificationBuilder<DefaultDataSpecification, Builder> {

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
