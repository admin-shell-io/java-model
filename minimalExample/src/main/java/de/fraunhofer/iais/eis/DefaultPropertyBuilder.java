package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultPropertyBuilder extends AbstractBuilder<DefaultProperty> {

    public DefaultPropertyBuilder() {
        super();
    }

    public DefaultPropertyBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for valueTypes
     * 
     * @param valueTypes desired value to be set
     * @return Builder object with new value for valueTypes
     */
    public DefaultPropertyBuilder valueTypes(List<String> valueTypes) {
        this.map.put("valueTypes", valueTypes);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultPropertyBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for valueIds
     * 
     * @param valueIds desired value to be set
     * @return Builder object with new value for valueIds
     */
    public DefaultPropertyBuilder valueIds(List<Reference> valueIds) {
        this.map.put("valueIds", valueIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultProperty build() {
        DefaultProperty defaultProperty = Util.fillInstanceFromMap(new DefaultProperty(), this.map);
        return defaultProperty;
    }
}
