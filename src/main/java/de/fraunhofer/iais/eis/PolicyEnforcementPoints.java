package de.fraunhofer.iais.eis;

import java.util.List;



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
     * @return Returns the List of Booleans for the property externalPolicyEnforcementPoints. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint")
    public List<Boolean> getExternalPolicyEnforcementPoints();

    /**
     * "If externalPolicyEnforcementPoint True then an Endpoint to external available enforcement point
     * taking needs to be configured for the AAS."@en
     * 
     * @param externalPolicyEnforcementPoints desired value for the property
     *        externalPolicyEnforcementPoints. More information under
     *        https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint
     */
    public void setExternalPolicyEnforcementPoints(List<Boolean> externalPolicyEnforcementPoints);

}
