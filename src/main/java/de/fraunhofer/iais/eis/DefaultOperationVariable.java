package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

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
    protected List<SubmodelElement> values;

    // no manual construction
    protected DefaultOperationVariable() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.values});
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
            return Objects.equals(this.values, other.values);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultOperationVariable other = new DefaultOperationVariable();
        other.values = (List<SubmodelElement>) Util.clone(this.values);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
    final public List<SubmodelElement> getValues() {
        return values;
    }

    final public void setValues(List<SubmodelElement> values) {
        this.values = values;
    }
}
