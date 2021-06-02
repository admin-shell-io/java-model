package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Blob Certificate" "Certificate provided as BLOB."@en
 */

public class DefaultBlobCertificate implements BlobCertificate {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "Blob Certificate" "Certificate as BLOB."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
    protected Blob blobCertificate;

    /**
     * "contains extension" "Extensions contained in the certificate."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
    protected List<Reference> containedExtensions = new ArrayList<>();

    /**
     * "is last certificate" "Denotes whether this certificate is the certificated that fast added
     * last."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
    protected boolean lastCertificate;

    /**
     * "has policy administration point" "The access control administration policy point of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
    protected PolicyAdministrationPoint policyAdministrationPoint;

    public DefaultBlobCertificate() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.blobCertificate,
            this.containedExtensions,
            this.lastCertificate,
            this.policyAdministrationPoint});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultBlobCertificate other = (DefaultBlobCertificate) obj;
            return Objects.equals(this.blobCertificate, other.blobCertificate) &&
                Objects.equals(this.containedExtensions, other.containedExtensions) &&
                Objects.equals(this.lastCertificate, other.lastCertificate) &&
                Objects.equals(this.policyAdministrationPoint, other.policyAdministrationPoint);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultBlobCertificate other = new DefaultBlobCertificate();
        other.blobCertificate = (Blob) Util.clone(this.blobCertificate);
        other.containedExtensions = (List<Reference>) Util.clone(this.containedExtensions);
        other.lastCertificate = (boolean) Util.clone(this.lastCertificate);
        other.policyAdministrationPoint = (PolicyAdministrationPoint) Util.clone(this.policyAdministrationPoint);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
    final public Blob getBlobCertificate() {
        return blobCertificate;
    }

    final public void setBlobCertificate(Blob blobCertificate) {
        this.blobCertificate = blobCertificate;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
    final public List<Reference> getContainedExtensions() {
        return containedExtensions;
    }

    final public void setContainedExtensions(List<Reference> containedExtensions) {
        this.containedExtensions = containedExtensions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
    final public boolean getLastCertificate() {
        return lastCertificate;
    }

    final public void setLastCertificate(boolean lastCertificate) {
        this.lastCertificate = lastCertificate;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
    final public PolicyAdministrationPoint getPolicyAdministrationPoint() {
        return policyAdministrationPoint;
    }

    final public void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        this.policyAdministrationPoint = policyAdministrationPoint;
    }
}
