package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Certificate provided as BLOB.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBlobCertificate.class)
})
public interface BlobCertificate extends Certificate {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * Certificate as BLOB.
     * 
     * @return Returns the Blob for the property blobCertificate. More information under
     *         https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
    public Blob getBlobCertificate();

    /**
     * Certificate as BLOB.
     * 
     * @param blobCertificate desired value for the property blobCertificate. More information under
     *        https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     */
    public void setBlobCertificate(Blob blobCertificate);

    /**
     * Extensions contained in the certificate.
     * 
     * @return Returns the List of References for the property containedExtensions. More information
     *         under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
    public List<Reference> getContainedExtensions();

    /**
     * Extensions contained in the certificate.
     * 
     * @param containedExtensions desired value for the property containedExtensions. More information
     *        under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     */
    public void setContainedExtensions(List<Reference> containedExtensions);

    /**
     * Denotes whether this certificate is the certificated that fast added last.
     * 
     * @return Returns the boolean for the property lastCertificate. More information under
     *         https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
    public boolean getLastCertificate();

    /**
     * Denotes whether this certificate is the certificated that fast added last.
     * 
     * @param lastCertificate desired value for the property lastCertificate. More information under
     *        https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     */
    public void setLastCertificate(boolean lastCertificate);

}
