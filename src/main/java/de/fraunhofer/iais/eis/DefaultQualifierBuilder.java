package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultQualifierBuilder extends AbstractBuilder<DefaultQualifier> {

    public DefaultQualifierBuilder() {
        super();
    }

    public DefaultQualifierBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for types
     * 
     * @param types desired value to be set
     * @return Builder object with new value for types
     */
    public DefaultQualifierBuilder types(List<String> types) {
        this.map.put("types", types);
        return this;
    }

    /**
     * This function allows setting a value for valueTypes
     * 
     * @param valueTypes desired value to be set
     * @return Builder object with new value for valueTypes
     */
    public DefaultQualifierBuilder valueTypes(List<String> valueTypes) {
        this.map.put("valueTypes", valueTypes);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultQualifierBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for valueIds
     * 
     * @param valueIds desired value to be set
     * @return Builder object with new value for valueIds
     */
    public DefaultQualifierBuilder valueIds(List<Reference> valueIds) {
        this.map.put("valueIds", valueIds);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultQualifierBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultQualifier build() {
        DefaultQualifier defaultQualifier = Util.fillInstanceFromMap(new DefaultQualifier(), this.map);
        return defaultQualifier;
    }
}
