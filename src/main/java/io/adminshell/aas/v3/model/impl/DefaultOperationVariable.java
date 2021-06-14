package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * "Operation Variable" "An operation variable is a submodel element that is used as input or output
 * variable of an operation."@en
 */

public class DefaultOperationVariable implements OperationVariable {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "value" "Describes the needed argument for an operation via a submodel element of
     * kind=Template."@en "The submodel element value of an operation variable shall be of
     * kind=Template."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
    protected SubmodelElement value;

    public DefaultOperationVariable() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.value});
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
            DefaultOperationVariable other = (DefaultOperationVariable) obj;
            return Objects.equals(this.value, other.value);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
    final public SubmodelElement getValue() {
        return value;
    }

    final public void setValue(SubmodelElement value) {
        this.value = value;
    }

    public static class Builder extends OperationVariableBuilder<DefaultOperationVariable, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperationVariable newBuildingInstance() {
            return new DefaultOperationVariable();
        }
    }
}
