package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.List;

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
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     *
     * @return Returns the Blob for the property blobCertificate.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
    Blob getBlobCertificate();

    /**
     * Certificate as BLOB.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     *
     * @param blobCertificate desired value for the property blobCertificate.
     */
    void setBlobCertificate(Blob blobCertificate);

    /**
     * Extensions contained in the certificate.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     *
     * @return Returns the List of References for the property
     * containedExtensions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
    List<Reference> getContainedExtensions();

    /**
     * Extensions contained in the certificate.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     *
     * @param containedExtensions desired value for the property
     * containedExtensions.
     */
    void setContainedExtensions(List<Reference> containedExtensions);

    /**
     * Denotes whether this certificate is the certificated that fast added
     * last.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     *
     * @return Returns the boolean for the property lastCertificate.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
    boolean getLastCertificate();

    /**
     * Denotes whether this certificate is the certificated that fast added
     * last.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     *
     * @param lastCertificate desired value for the property lastCertificate.
     */
    void setLastCertificate(boolean lastCertificate);

}
