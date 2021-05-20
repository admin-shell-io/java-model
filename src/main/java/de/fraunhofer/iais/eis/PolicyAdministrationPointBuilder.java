package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class PolicyAdministrationPointBuilder {

    private Map<String, Object> map;

    public PolicyAdministrationPointBuilder() {
        this.map = new HashMap<>();
    }

    public PolicyAdministrationPointBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for localAccessControl
     * 
     * @param localAccessControl desired value to be set
     * @return Builder object with new value for localAccessControl
     */
    public PolicyAdministrationPointBuilder localAccessControl(AccessControl localAccessControl) {
        this.map.put("localAccessControl", localAccessControl);
        return this;
    }

    /**
     * This function allows setting a value for externalAccessControl
     * 
     * @param externalAccessControl desired value to be set
     * @return Builder object with new value for externalAccessControl
     */
    public PolicyAdministrationPointBuilder externalAccessControl(boolean externalAccessControl) {
        this.map.put("externalAccessControl", externalAccessControl);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public PolicyAdministrationPoint build() throws ConstraintViolationException {
        DefaultPolicyAdministrationPoint defaultPolicyAdministrationPoint =
            Util.fillInstanceFromMap(new DefaultPolicyAdministrationPoint(), this.map);
        return defaultPolicyAdministrationPoint;
    }
}
