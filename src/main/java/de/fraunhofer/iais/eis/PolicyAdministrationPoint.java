package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Policy Administration Point" "Definition of a security administration point (PDP)."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyAdministrationPoint.class)
})
public interface PolicyAdministrationPoint extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "The policy administration point of access control as realized by the AAS itself."@en "Constraint
     * AASd-009: Either there is an external policy administration point endpoint defined or the AAS has
     * its own access control."@en
     * 
     * @return Returns the List of AccessControls for the property localAccessControls. More information
     *         under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    public List<AccessControl> getLocalAccessControls();

    /**
     * "The policy administration point of access control as realized by the AAS itself."@en "Constraint
     * AASd-009: Either there is an external policy administration point endpoint defined or the AAS has
     * its own access control."@en
     * 
     * @param localAccessControls desired value for the property localAccessControls. More information
     *        under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     */
    public void setLocalAccessControls(List<AccessControl> localAccessControls);

    /**
     * "Endpoint to an external access control defining a policy administration point to be used by the
     * AAS."@en
     * 
     * @return Returns the List of Booleans for the property externalAccessControls. More information
     *         under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    public List<Boolean> getExternalAccessControls();

    /**
     * "Endpoint to an external access control defining a policy administration point to be used by the
     * AAS."@en
     * 
     * @param externalAccessControls desired value for the property externalAccessControls. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     */
    public void setExternalAccessControls(List<Boolean> externalAccessControls);

}
