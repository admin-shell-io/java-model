package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Access ControlPolicy Points" "Container for access control policy points."@en
 */

public class DefaultAccessControlPolicyPoints implements AccessControlPolicyPoints {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has policy administration point" "The access control administration policy point of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    protected PolicyAdministrationPoint policyAdministrationPoint;

    /**
     * "has policy decision point" "The access control policy decision point of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    protected PolicyDecisionPoint policyDecisionPoint;

    /**
     * "has policy enforcement point" "The access control policy enforcement point of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    protected PolicyEnforcementPoints policyEnforcementPoint;

    /**
     * "has policy information points" "The access control policy information points of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    protected PolicyInformationPoints policyInformationPoints;

    // no manual construction
    protected DefaultAccessControlPolicyPoints() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.policyAdministrationPoint,
            this.policyDecisionPoint,
            this.policyEnforcementPoint,
            this.policyInformationPoints});
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
            DefaultAccessControlPolicyPoints other = (DefaultAccessControlPolicyPoints) obj;
            return Objects.equals(this.policyAdministrationPoint, other.policyAdministrationPoint) &&
                Objects.equals(this.policyDecisionPoint, other.policyDecisionPoint) &&
                Objects.equals(this.policyEnforcementPoint, other.policyEnforcementPoint) &&
                Objects.equals(this.policyInformationPoints, other.policyInformationPoints);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultAccessControlPolicyPoints other = new DefaultAccessControlPolicyPoints();
        other.policyAdministrationPoint = (PolicyAdministrationPoint) Util.clone(this.policyAdministrationPoint);
        other.policyDecisionPoint = (PolicyDecisionPoint) Util.clone(this.policyDecisionPoint);
        other.policyEnforcementPoint = (PolicyEnforcementPoints) Util.clone(this.policyEnforcementPoint);
        other.policyInformationPoints = (PolicyInformationPoints) Util.clone(this.policyInformationPoints);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    final public PolicyAdministrationPoint getPolicyAdministrationPoint() {
        return policyAdministrationPoint;
    }

    final public void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        this.policyAdministrationPoint = policyAdministrationPoint;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    final public PolicyDecisionPoint getPolicyDecisionPoint() {
        return policyDecisionPoint;
    }

    final public void setPolicyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
        this.policyDecisionPoint = policyDecisionPoint;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    final public PolicyEnforcementPoints getPolicyEnforcementPoint() {
        return policyEnforcementPoint;
    }

    final public void setPolicyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint) {
        this.policyEnforcementPoint = policyEnforcementPoint;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    final public PolicyInformationPoints getPolicyInformationPoints() {
        return policyInformationPoints;
    }

    final public void setPolicyInformationPoints(PolicyInformationPoints policyInformationPoints) {
        this.policyInformationPoints = policyInformationPoints;
    }
}
