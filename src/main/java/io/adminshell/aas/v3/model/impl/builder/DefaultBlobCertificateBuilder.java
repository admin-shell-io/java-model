package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultBlobCertificateBuilder extends AbstractBuilder<DefaultBlobCertificate> {

    public DefaultBlobCertificateBuilder() {
        super();
    }

    public DefaultBlobCertificateBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for blobCertificate
     * 
     * @param blobCertificate desired value to be set
     * @return Builder object with new value for blobCertificate
     */
    public DefaultBlobCertificateBuilder blobCertificate(Blob blobCertificate) {
        this.map.put("blobCertificate", blobCertificate);
        return this;
    }

    /**
     * This function allows setting a value for containedExtensions
     * 
     * @param containedExtensions desired value to be set
     * @return Builder object with new value for containedExtensions
     */
    public DefaultBlobCertificateBuilder containedExtensions(List<Reference> containedExtensions) {
        this.map.put("containedExtensions", containedExtensions);
        return this;
    }

    /**
     * This function allows setting a value for lastCertificate
     * 
     * @param lastCertificate desired value to be set
     * @return Builder object with new value for lastCertificate
     */
    public DefaultBlobCertificateBuilder lastCertificate(boolean lastCertificate) {
        this.map.put("lastCertificate", lastCertificate);
        return this;
    }

    /**
     * This function allows setting a value for policyAdministrationPoint
     * 
     * @param policyAdministrationPoint desired value to be set
     * @return Builder object with new value for policyAdministrationPoint
     */
    public DefaultBlobCertificateBuilder policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        this.map.put("policyAdministrationPoint", policyAdministrationPoint);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultBlobCertificate build() {
        DefaultBlobCertificate defaultBlobCertificate = Util.fillInstanceFromMap(new DefaultBlobCertificate(), this.map);
        return defaultBlobCertificate;
    }
}
