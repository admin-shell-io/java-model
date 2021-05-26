package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultAdministrativeInformationBuilder extends AbstractBuilder<DefaultAdministrativeInformation> {

    public DefaultAdministrativeInformationBuilder() {
        super();
    }

    public DefaultAdministrativeInformationBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for version
     * 
     * @param version desired value to be set
     * @return Builder object with new value for version
     */
    public DefaultAdministrativeInformationBuilder version(String version) {
        this.map.put("version", version);
        return this;
    }

    /**
     * This function allows setting a value for revision
     * 
     * @param revision desired value to be set
     * @return Builder object with new value for revision
     */
    public DefaultAdministrativeInformationBuilder revision(String revision) {
        this.map.put("revision", revision);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultAdministrativeInformationBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAdministrativeInformation build() {
        DefaultAdministrativeInformation defaultAdministrativeInformation =
            Util.fillInstanceFromMap(new DefaultAdministrativeInformation(), this.map);
        return defaultAdministrativeInformation;
    }
}
