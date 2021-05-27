package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultPolicyInformationPointsBuilder extends AbstractBuilder<DefaultPolicyInformationPoints> {

    public DefaultPolicyInformationPointsBuilder() {
        super();
    }

    public DefaultPolicyInformationPointsBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for externalInformationPoints
     * 
     * @param externalInformationPoints desired value to be set
     * @return Builder object with new value for externalInformationPoints
     */
    public DefaultPolicyInformationPointsBuilder externalInformationPoints(List<Boolean> externalInformationPoints) {
        this.map.put("externalInformationPoints", externalInformationPoints);
        return this;
    }

    /**
     * This function allows setting a value for internalInformationPoints
     * 
     * @param internalInformationPoints desired value to be set
     * @return Builder object with new value for internalInformationPoints
     */
    public DefaultPolicyInformationPointsBuilder internalInformationPoints(List<Submodel> internalInformationPoints) {
        this.map.put("internalInformationPoints", internalInformationPoints);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPolicyInformationPoints build() {
        DefaultPolicyInformationPoints defaultPolicyInformationPoints =
            Util.fillInstanceFromMap(new DefaultPolicyInformationPoints(), this.map);
        return defaultPolicyInformationPoints;
    }
}
