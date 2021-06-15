package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Definition of a security administration point (PDP).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyAdministrationPoint.class)
})
public interface PolicyAdministrationPoint {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * The policy administration point of access control as realized by the AAS itself. Constraint
     * AASd-009: Either there is an external policy administration point endpoint defined or the AAS has
     * its own access control.
     * 
     * @return Returns the AccessControl for the property localAccessControl. More information under
     *         https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    public AccessControl getLocalAccessControl();

    /**
     * The policy administration point of access control as realized by the AAS itself. Constraint
     * AASd-009: Either there is an external policy administration point endpoint defined or the AAS has
     * its own access control.
     * 
     * @param localAccessControl desired value for the property localAccessControl. More information
     *        under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     */
    public void setLocalAccessControl(AccessControl localAccessControl);

    /**
     * Endpoint to an external access control defining a policy administration point to be used by the
     * AAS.
     * 
     * @return Returns the boolean for the property externalAccessControl. More information under
     *         https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    public boolean getExternalAccessControl();

    /**
     * Endpoint to an external access control defining a policy administration point to be used by the
     * AAS.
     * 
     * @param externalAccessControl desired value for the property externalAccessControl. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     */
    public void setExternalAccessControl(boolean externalAccessControl);

}
