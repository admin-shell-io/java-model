package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**  
*/

public class DefaultFormula implements Formula {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * A formula may depend on referable or even external global elements - assumed that can be
     * referenced and their value may be evaluated - that are used in the logical expression.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    protected List<Reference> dependsOns = new ArrayList<>();

    public DefaultFormula() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dependsOns});
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
            DefaultFormula other = (DefaultFormula) obj;
            return Objects.equals(this.dependsOns, other.dependsOns);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    final public List<Reference> getDependsOns() {
        return dependsOns;
    }

    final public void setDependsOns(List<Reference> dependsOns) {
        this.dependsOns = dependsOns;
    }

    public static class Builder extends FormulaBuilder<DefaultFormula, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultFormula newBuildingInstance() {
            return new DefaultFormula();
        }
    }
}
