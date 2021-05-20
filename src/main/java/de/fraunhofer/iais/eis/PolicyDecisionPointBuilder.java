package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class PolicyDecisionPointBuilder {

    private Map<String, Object> map;

    public PolicyDecisionPointBuilder() {
        this.map = new HashMap<>();
    }

    public PolicyDecisionPointBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for externalPolicyDecisionPoints
     * 
     * @param externalPolicyDecisionPoints desired value to be set
     * @return Builder object with new value for externalPolicyDecisionPoints
     */
    public PolicyDecisionPointBuilder externalPolicyDecisionPoints(boolean externalPolicyDecisionPoints) {
        this.map.put("externalPolicyDecisionPoints", externalPolicyDecisionPoints);
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
    final public PolicyDecisionPoint build() throws ConstraintViolationException {
        DefaultPolicyDecisionPoint defaultPolicyDecisionPoint = Util.fillInstanceFromMap(new DefaultPolicyDecisionPoint(), this.map);
        return defaultPolicyDecisionPoint;
    }
}
