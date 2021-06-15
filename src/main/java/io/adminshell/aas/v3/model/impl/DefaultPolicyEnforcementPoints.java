package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PolicyEnforcementPoints
 * 
 * Defines the security policy enforcement points (PEP).
 */

public class DefaultPolicyEnforcementPoints implements PolicyEnforcementPoints {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * If externalPolicyEnforcementPoint True then an Endpoint to external available enforcement point
     * taking needs to be configured for the AAS.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint")
    protected boolean externalPolicyEnforcementPoint;

    public DefaultPolicyEnforcementPoints() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.externalPolicyEnforcementPoint});
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
            DefaultPolicyEnforcementPoints other = (DefaultPolicyEnforcementPoints) obj;
            return Objects.equals(this.externalPolicyEnforcementPoint, other.externalPolicyEnforcementPoint);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint")
    final public boolean getExternalPolicyEnforcementPoint() {
        return externalPolicyEnforcementPoint;
    }

    final public void setExternalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint) {
        this.externalPolicyEnforcementPoint = externalPolicyEnforcementPoint;
    }

    public static class Builder extends PolicyEnforcementPointsBuilder<DefaultPolicyEnforcementPoints, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyEnforcementPoints newBuildingInstance() {
            return new DefaultPolicyEnforcementPoints();
        }
    }
}
