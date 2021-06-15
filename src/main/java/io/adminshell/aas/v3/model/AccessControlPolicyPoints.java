package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Container for access control policy points.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControlPolicyPoints.class)
})
public interface AccessControlPolicyPoints {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * The access control administration policy point of the AAS.
     * 
     * @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    public PolicyAdministrationPoint getPolicyAdministrationPoint();

    /**
     * The access control administration policy point of the AAS.
     * 
     * @param policyAdministrationPoint desired value for the property policyAdministrationPoint. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
     */
    public void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint);

    /**
     * The access control policy decision point of the AAS.
     * 
     * @return Returns the PolicyDecisionPoint for the property policyDecisionPoint. More information
     *         under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    public PolicyDecisionPoint getPolicyDecisionPoint();

    /**
     * The access control policy decision point of the AAS.
     * 
     * @param policyDecisionPoint desired value for the property policyDecisionPoint. More information
     *        under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
     */
    public void setPolicyDecisionPoint(PolicyDecisionPoint policyDecisionPoint);

    /**
     * The access control policy enforcement point of the AAS.
     * 
     * @return Returns the PolicyEnforcementPoints for the property policyEnforcementPoint. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    public PolicyEnforcementPoints getPolicyEnforcementPoint();

    /**
     * The access control policy enforcement point of the AAS.
     * 
     * @param policyEnforcementPoint desired value for the property policyEnforcementPoint. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
     */
    public void setPolicyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint);

    /**
     * The access control policy information points of the AAS.
     * 
     * @return Returns the PolicyInformationPoints for the property policyInformationPoints. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    public PolicyInformationPoints getPolicyInformationPoints();

    /**
     * The access control policy information points of the AAS.
     * 
     * @param policyInformationPoints desired value for the property policyInformationPoints. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
     */
    public void setPolicyInformationPoints(PolicyInformationPoints policyInformationPoints);

}
