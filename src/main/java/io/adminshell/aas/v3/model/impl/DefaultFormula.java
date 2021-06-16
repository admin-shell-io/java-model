package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Formula
 * 
 */

public class DefaultFormula implements Formula {

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

    @Override
    public List<Reference> getDependsOns() {
        return dependsOns;
    }

    @Override
    public void setDependsOns(List<Reference> dependsOns) {
        this.dependsOns = dependsOns;
    }

}
