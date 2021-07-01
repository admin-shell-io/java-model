package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A technical certificate proofing the identity through cryptographic measures.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = BlobCertificate.class)
})
public interface Certificate {

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
     *
     * @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
    PolicyAdministrationPoint getPolicyAdministrationPoint();

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
     *
     * @param policyAdministrationPoint desired value for the property policyAdministrationPoint.
     */
    void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint);

}
