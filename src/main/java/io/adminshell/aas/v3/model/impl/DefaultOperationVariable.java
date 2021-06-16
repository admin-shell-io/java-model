package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.OperationVariable
 * 
 * An operation variable is a submodel element that is used as input or output variable of an
 * operation.
 */

public class DefaultOperationVariable implements OperationVariable {

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

    @Override
    public SubmodelElement getValue() {
        return value;
    }

    @Override
    public void setValue(SubmodelElement value) {
        this.value = value;
    }
}
