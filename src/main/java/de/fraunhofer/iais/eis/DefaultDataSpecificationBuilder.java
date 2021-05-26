package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultDataSpecificationBuilder extends AbstractBuilder<DefaultDataSpecification> {

    public DefaultDataSpecificationBuilder() {
        super();
    }

    public DefaultDataSpecificationBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for dataSpecificationContent
     * 
     * @param dataSpecificationContent desired value to be set
     * @return Builder object with new value for dataSpecificationContent
     */
    public DefaultDataSpecificationBuilder dataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        this.map.put("dataSpecificationContent", dataSpecificationContent);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultDataSpecification build() {
        DefaultDataSpecification defaultDataSpecification = Util.fillInstanceFromMap(new DefaultDataSpecification(), this.map);
        return defaultDataSpecification;
    }
}
