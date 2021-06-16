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

    /**
     * Certificate as BLOB.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     *
     * @return Returns the Blob for the property blobCertificate.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
    public Blob getBlobCertificate();

    /**
     * Certificate as BLOB.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     *
     * @param blobCertificate desired value for the property blobCertificate.
     */
    public void setBlobCertificate(Blob blobCertificate);

    /**
     * Extensions contained in the certificate.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     *
     * @return Returns the List of References for the property containedExtensions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
    public List<Reference> getContainedExtensions();

    /**
     * Extensions contained in the certificate.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     *
     * @param containedExtensions desired value for the property containedExtensions.
     */
    public void setContainedExtensions(List<Reference> containedExtensions);

    /**
     * Denotes whether this certificate is the certificated that fast added last.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     *
     * @return Returns the boolean for the property lastCertificate.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
    public boolean getLastCertificate();

    /**
     * Denotes whether this certificate is the certificated that fast added last.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     *
     * @param lastCertificate desired value for the property lastCertificate.
     */
    public void setLastCertificate(boolean lastCertificate);

}
