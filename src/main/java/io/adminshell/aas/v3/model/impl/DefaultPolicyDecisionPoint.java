package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PolicyDecisionPoint
 * 
 * Defines a security policy decision point (PDP).
 */

public class DefaultPolicyDecisionPoint implements PolicyDecisionPoint {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    protected boolean externalPolicyDecisionPoints;

    public DefaultPolicyDecisionPoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.externalPolicyDecisionPoints});
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
            DefaultPolicyDecisionPoint other = (DefaultPolicyDecisionPoint) obj;
            return Objects.equals(this.externalPolicyDecisionPoints, other.externalPolicyDecisionPoints);
        }
    }

    @Override
    public boolean getExternalPolicyDecisionPoints() {
        return externalPolicyDecisionPoints;
    }

    @Override
    public void setExternalPolicyDecisionPoints(boolean externalPolicyDecisionPoints) {
        this.externalPolicyDecisionPoints = externalPolicyDecisionPoints;
    }
}
