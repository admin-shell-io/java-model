package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultQualifierBuilder extends AbstractBuilder<DefaultQualifier> {

    public DefaultQualifierBuilder() {
        super();
    }

    public DefaultQualifierBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for type
     * 
     * @param type desired value to be set
     * @return Builder object with new value for type
     */
    public DefaultQualifierBuilder type(String type) {
        this.map.put("type", type);
        return this;
    }

    /**
     * This function allows setting a value for valueType
     * 
     * @param valueType desired value to be set
     * @return Builder object with new value for valueType
     */
    public DefaultQualifierBuilder valueType(String valueType) {
        this.map.put("valueType", valueType);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DefaultQualifierBuilder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for valueId
     * 
     * @param valueId desired value to be set
     * @return Builder object with new value for valueId
     */
    public DefaultQualifierBuilder valueId(Reference valueId) {
        this.map.put("valueId", valueId);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public DefaultQualifierBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
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
