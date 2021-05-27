package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultPolicyEnforcementPointsBuilder extends AbstractBuilder<DefaultPolicyEnforcementPoints> {

    public DefaultPolicyEnforcementPointsBuilder() {
        super();
    }

    public DefaultPolicyEnforcementPointsBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for externalPolicyEnforcementPoints
     * 
     * @param externalPolicyEnforcementPoints desired value to be set
     * @return Builder object with new value for externalPolicyEnforcementPoints
     */
    public DefaultPolicyEnforcementPointsBuilder externalPolicyEnforcementPoints(List<Boolean> externalPolicyEnforcementPoints) {
        this.map.put("externalPolicyEnforcementPoints", externalPolicyEnforcementPoints);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPolicyEnforcementPoints build() {
        DefaultPolicyEnforcementPoints defaultPolicyEnforcementPoints =
            Util.fillInstanceFromMap(new DefaultPolicyEnforcementPoints(), this.map);
        return defaultPolicyEnforcementPoints;
    }
}
