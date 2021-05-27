package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultPolicyDecisionPointBuilder extends AbstractBuilder<DefaultPolicyDecisionPoint> {

    public DefaultPolicyDecisionPointBuilder() {
        super();
    }

    public DefaultPolicyDecisionPointBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for externalPolicyDecisionPoints
     * 
     * @param externalPolicyDecisionPoints desired value to be set
     * @return Builder object with new value for externalPolicyDecisionPoints
     */
    public DefaultPolicyDecisionPointBuilder externalPolicyDecisionPoints(List<Boolean> externalPolicyDecisionPoints) {
        this.map.put("externalPolicyDecisionPoints", externalPolicyDecisionPoints);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPolicyDecisionPoint build() {
        DefaultPolicyDecisionPoint defaultPolicyDecisionPoint = Util.fillInstanceFromMap(new DefaultPolicyDecisionPoint(), this.map);
        return defaultPolicyDecisionPoint;
    }
}
