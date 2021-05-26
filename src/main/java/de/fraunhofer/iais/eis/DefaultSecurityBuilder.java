package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultSecurityBuilder extends AbstractBuilder<DefaultSecurity> {

    public DefaultSecurityBuilder() {
        super();
    }

    public DefaultSecurityBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for accessControlPolicyPoints
     * 
     * @param accessControlPolicyPoints desired value to be set
     * @return Builder object with new value for accessControlPolicyPoints
     */
    public DefaultSecurityBuilder accessControlPolicyPoints(AccessControlPolicyPoints accessControlPolicyPoints) {
        this.map.put("accessControlPolicyPoints", accessControlPolicyPoints);
        return this;
    }

    /**
     * This function allows setting a value for certificates
     * 
     * @param certificates desired value to be set
     * @return Builder object with new value for certificates
     */
    public DefaultSecurityBuilder certificates(List<Certificate> certificates) {
        this.map.put("certificates", certificates);
        return this;
    }

    /**
     * This function allows setting a value for requiredCertificateExtensions
     * 
     * @param requiredCertificateExtensions desired value to be set
     * @return Builder object with new value for requiredCertificateExtensions
     */
    public DefaultSecurityBuilder requiredCertificateExtensions(List<Reference> requiredCertificateExtensions) {
        this.map.put("requiredCertificateExtensions", requiredCertificateExtensions);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultSecurity build() {
        DefaultSecurity defaultSecurity = Util.fillInstanceFromMap(new DefaultSecurity(), this.map);
        return defaultSecurity;
    }
}
