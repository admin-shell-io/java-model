package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public List<DataSpecificationContent> getDataSpecificationContents() {
        return dataSpecificationContents;
    }

    @Override
    public void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        this.dataSpecificationContents = dataSpecificationContents;
    }
}
