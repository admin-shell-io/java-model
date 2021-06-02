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
 * "Security" "Container for security relevant information of the AAS."@en
 */

public class DefaultSecurity implements Security {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has access control policy points" "Access control policy points of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
    protected AccessControlPolicyPoints accessControlPolicyPoints;

    /**
     * "has certificate" "Certificates of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
    protected List<Certificate> certificates = new ArrayList<>();

    /**
     * "has required certificate extension" "Certificate extensions as required by the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
    protected List<Reference> requiredCertificateExtensions = new ArrayList<>();

    public DefaultSecurity() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.accessControlPolicyPoints,
            this.certificates,
            this.requiredCertificateExtensions});
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
            DefaultSecurity other = (DefaultSecurity) obj;
            return Objects.equals(this.accessControlPolicyPoints, other.accessControlPolicyPoints) &&
                Objects.equals(this.certificates, other.certificates) &&
                Objects.equals(this.requiredCertificateExtensions, other.requiredCertificateExtensions);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultSecurity other = new DefaultSecurity();
        other.accessControlPolicyPoints = (AccessControlPolicyPoints) Util.clone(this.accessControlPolicyPoints);
        other.certificates = (List<Certificate>) Util.clone(this.certificates);
        other.requiredCertificateExtensions = (List<Reference>) Util.clone(this.requiredCertificateExtensions);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
    final public AccessControlPolicyPoints getAccessControlPolicyPoints() {
        return accessControlPolicyPoints;
    }

    final public void setAccessControlPolicyPoints(AccessControlPolicyPoints accessControlPolicyPoints) {
        this.accessControlPolicyPoints = accessControlPolicyPoints;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
    final public List<Certificate> getCertificates() {
        return certificates;
    }

    final public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
    final public List<Reference> getRequiredCertificateExtensions() {
        return requiredCertificateExtensions;
    }

    final public void setRequiredCertificateExtensions(List<Reference> requiredCertificateExtensions) {
        this.requiredCertificateExtensions = requiredCertificateExtensions;
    }
}
