package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Policy Enforcement Point" "Defines the security policy enforcement points (PEP)."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyEnforcementPoints.class)
})
public interface PolicyEnforcementPoints extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "If externalPolicyEnforcementPoint True then an Endpoint to external available enforcement point
     * taking needs to be configured for the AAS."@en
     * 
     * @return Returns the boolean for the property externalPolicyEnforcementPoint. More information
     *         under
     *         https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint")
    public boolean getExternalPolicyEnforcementPoint();

    /**
     * "If externalPolicyEnforcementPoint True then an Endpoint to external available enforcement point
     * taking needs to be configured for the AAS."@en
     * 
     * @param externalPolicyEnforcementPoint desired value for the property
     *        externalPolicyEnforcementPoint. More information under
     *        https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint
     */
    public void setExternalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint);

}
