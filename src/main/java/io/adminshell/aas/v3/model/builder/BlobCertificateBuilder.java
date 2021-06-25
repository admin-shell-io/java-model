package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class BlobCertificateBuilder<T extends BlobCertificate, B extends BlobCertificateBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for blobCertificate
     * 
     * @param blobCertificate desired value to be set
     * @return Builder object with new value for blobCertificate
     */
    public B blobCertificate(Blob blobCertificate) {
        getBuildingInstance().setBlobCertificate(blobCertificate);
        return getSelf();
    }

    /**
     * This function allows setting a value for containedExtensions
     * 
     * @param containedExtensions desired value to be set
     * @return Builder object with new value for containedExtensions
     */
    public B containedExtensions(List<Reference> containedExtensions) {
        getBuildingInstance().setContainedExtensions(containedExtensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List containedExtensions
     * 
     * @param containedExtension desired value to be added
     * @return Builder object with new value for containedExtensions
     */
    public B containedExtension(Reference containedExtension) {
        getBuildingInstance().getContainedExtensions().add(containedExtension);
        return getSelf();
    }

    /**
     * This function allows setting a value for lastCertificate
     * 
     * @param lastCertificate desired value to be set
     * @return Builder object with new value for lastCertificate
     */
    public B lastCertificate(boolean lastCertificate) {
        getBuildingInstance().setLastCertificate(lastCertificate);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyAdministrationPoint
     * 
     * @param policyAdministrationPoint desired value to be set
     * @return Builder object with new value for policyAdministrationPoint
     */
    public B policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        getBuildingInstance().setPolicyAdministrationPoint(policyAdministrationPoint);
        return getSelf();
    }
}
