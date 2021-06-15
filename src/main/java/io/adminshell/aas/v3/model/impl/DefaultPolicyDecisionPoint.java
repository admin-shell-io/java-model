package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Defines a security policy decision point (PDP).
 */

public class DefaultPolicyDecisionPoint implements PolicyDecisionPoint {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * If externalPolicyDecisionPoints True then Endpoints to external available decision points taking
     * into consideration for access control for the AAS need to be configured.
     */
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

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    final public boolean getExternalPolicyDecisionPoints() {
        return externalPolicyDecisionPoints;
    }

    final public void setExternalPolicyDecisionPoints(boolean externalPolicyDecisionPoints) {
        this.externalPolicyDecisionPoints = externalPolicyDecisionPoints;
    }

    public static class Builder extends PolicyDecisionPointBuilder<DefaultPolicyDecisionPoint, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyDecisionPoint newBuildingInstance() {
            return new DefaultPolicyDecisionPoint();
        }
    }
}
