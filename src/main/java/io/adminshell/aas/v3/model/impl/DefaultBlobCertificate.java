/*
Copyright (c) 2021 Fraunhofer IOSB-INA Lemgo,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IOSB-ILT Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IAIS,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IESE,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IWU Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

This source code is licensed under the Apache License 2.0 (see LICENSE.txt).

This source code may use other Open Source software components (see LICENSE.txt).
*/

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.BlobCertificate
 * 
 * Certificate provided as BLOB.
 */

public class DefaultBlobCertificate implements BlobCertificate {

    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
    protected Blob blobCertificate;

    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
    protected List<Reference> containedExtensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
    protected boolean lastCertificate;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
    protected PolicyAdministrationPoint policyAdministrationPoint;

    public DefaultBlobCertificate() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.blobCertificate,
            this.containedExtensions,
            this.lastCertificate,
            this.policyAdministrationPoint);
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
    public Blob getBlobCertificate() {
        return blobCertificate;
    }

    @Override
    public void setBlobCertificate(Blob blobCertificate) {
        this.blobCertificate = blobCertificate;
    }

    @Override
    public List<Reference> getContainedExtensions() {
        return containedExtensions;
    }

    @Override
    public void setContainedExtensions(List<Reference> containedExtensions) {
        this.containedExtensions = containedExtensions;
    }

    @Override
    public boolean getLastCertificate() {
        return lastCertificate;
    }

    @Override
    public void setLastCertificate(boolean lastCertificate) {
        this.lastCertificate = lastCertificate;
    }

    @Override
    public PolicyAdministrationPoint getPolicyAdministrationPoint() {
        return policyAdministrationPoint;
    }

    @Override
    public void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        this.policyAdministrationPoint = policyAdministrationPoint;
    }

    /**
     * This builder class can be used to construct a DefaultBlobCertificate bean.
     */
    public static class Builder extends BlobCertificateBuilder<DefaultBlobCertificate, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultBlobCertificate newBuildingInstance() {
            return new DefaultBlobCertificate();
        }
    }
}
