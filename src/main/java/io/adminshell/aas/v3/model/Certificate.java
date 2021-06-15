package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
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

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * The access control administration policy point of the AAS.
     * 
     * @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
    public PolicyAdministrationPoint getPolicyAdministrationPoint();

    /**
     * The access control administration policy point of the AAS.
     * 
     * @param policyAdministrationPoint desired value for the property policyAdministrationPoint. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
     */
    public void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint);

}
