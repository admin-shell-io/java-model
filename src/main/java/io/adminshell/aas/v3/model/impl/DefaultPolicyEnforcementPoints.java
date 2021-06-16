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

    @Override
    public boolean getExternalPolicyEnforcementPoint() {
        return externalPolicyEnforcementPoint;
    }

    @Override
    public void setExternalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint) {
        this.externalPolicyEnforcementPoint = externalPolicyEnforcementPoint;
    }
}
