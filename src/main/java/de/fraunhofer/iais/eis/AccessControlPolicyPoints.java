package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Access ControlPolicy Points" "Container for access control policy points."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControlPolicyPoints.class)
})
public interface AccessControlPolicyPoints extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "The access control administration policy point of the AAS."@en
     * 
     * @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    public PolicyAdministrationPoint getPolicyAdministrationPoint();

    /**
     * "The access control policy decision point of the AAS."@en
     * 
     * @return Returns the PolicyDecisionPoint for the property policyDecisionPoint. More information
     *         under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    public PolicyDecisionPoint getPolicyDecisionPoint();

    /**
     * "The access control policy enforcement point of the AAS."@en
     * 
     * @return Returns the PolicyEnforcementPoints for the property policyEnforcementPoint. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    public PolicyEnforcementPoints getPolicyEnforcementPoint();

    /**
     * "The access control policy information points of the AAS."@en
     * 
     * @return Returns the PolicyInformationPoints for the property policyInformationPoints. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    public PolicyInformationPoints getPolicyInformationPoints();

}
