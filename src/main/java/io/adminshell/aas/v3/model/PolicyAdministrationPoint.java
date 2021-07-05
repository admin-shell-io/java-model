package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Definition of a security administration point (PDP).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyAdministrationPoint.class)
})
public interface PolicyAdministrationPoint {

    /**
     * The policy administration point of access control as realized by the AAS
     * itself.
     *
     * Constraint AASd-009: Either there is an external policy administration
     * point endpoint defined or the AAS has its own access control.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     *
     * @return Returns the AccessControl for the property localAccessControl.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    AccessControl getLocalAccessControl();

    /**
     * The policy administration point of access control as realized by the AAS
     * itself.
     *
     * Constraint AASd-009: Either there is an external policy administration
     * point endpoint defined or the AAS has its own access control.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     *
     * @param localAccessControl desired value for the property
     * localAccessControl.
     */
    void setLocalAccessControl(AccessControl localAccessControl);

    /**
     * Endpoint to an external access control defining a policy administration
     * point to be used by the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     *
     * @return Returns the boolean for the property externalAccessControl.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    boolean getExternalAccessControl();

    /**
     * Endpoint to an external access control defining a policy administration
     * point to be used by the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     *
     * @param externalAccessControl desired value for the property
     * externalAccessControl.
     */
    void setExternalAccessControl(boolean externalAccessControl);

}
