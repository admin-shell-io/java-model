package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultHasDataSpecificationBuilder extends AbstractBuilder<DefaultHasDataSpecification> {

    public DefaultHasDataSpecificationBuilder() {
        super();
    }

    public DefaultHasDataSpecificationBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultHasDataSpecificationBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultHasDataSpecification build() {
        DefaultHasDataSpecification defaultHasDataSpecification = Util.fillInstanceFromMap(new DefaultHasDataSpecification(), this.map);
        return defaultHasDataSpecification;
    }
}
