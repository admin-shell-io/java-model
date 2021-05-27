package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultPolicyAdministrationPointBuilder extends AbstractBuilder<DefaultPolicyAdministrationPoint> {

    public DefaultPolicyAdministrationPointBuilder() {
        super();
    }

    public DefaultPolicyAdministrationPointBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for localAccessControls
     * 
     * @param localAccessControls desired value to be set
     * @return Builder object with new value for localAccessControls
     */
    public DefaultPolicyAdministrationPointBuilder localAccessControls(List<AccessControl> localAccessControls) {
        this.map.put("localAccessControls", localAccessControls);
        return this;
    }

    /**
     * This function allows setting a value for externalAccessControls
     * 
     * @param externalAccessControls desired value to be set
     * @return Builder object with new value for externalAccessControls
     */
    public DefaultPolicyAdministrationPointBuilder externalAccessControls(List<Boolean> externalAccessControls) {
        this.map.put("externalAccessControls", externalAccessControls);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPolicyAdministrationPoint build() {
        DefaultPolicyAdministrationPoint defaultPolicyAdministrationPoint =
            Util.fillInstanceFromMap(new DefaultPolicyAdministrationPoint(), this.map);
        return defaultPolicyAdministrationPoint;
    }
}
