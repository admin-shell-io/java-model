package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class PolicyEnforcementPointsBuilder {

    private Map<String, Object> map;

    public PolicyEnforcementPointsBuilder() {
        this.map = new HashMap<>();
    }

    public PolicyEnforcementPointsBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for externalPolicyEnforcementPoint
     * 
     * @param externalPolicyEnforcementPoint desired value to be set
     * @return Builder object with new value for externalPolicyEnforcementPoint
     */
    public PolicyEnforcementPointsBuilder externalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint) {
        this.map.put("externalPolicyEnforcementPoint", externalPolicyEnforcementPoint);
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
    final public PolicyEnforcementPoints build() throws ConstraintViolationException {
        DefaultPolicyEnforcementPoints defaultPolicyEnforcementPoints =
            Util.fillInstanceFromMap(new DefaultPolicyEnforcementPoints(), this.map);
        return defaultPolicyEnforcementPoints;
    }
}
