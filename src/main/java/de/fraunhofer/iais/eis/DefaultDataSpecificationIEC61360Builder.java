package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultDataSpecificationIEC61360Builder extends AbstractBuilder<DefaultDataSpecificationIEC61360> {

    public DefaultDataSpecificationIEC61360Builder() {
        super();
    }

    public DefaultDataSpecificationIEC61360Builder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for dataType
     * 
     * @param dataType desired value to be set
     * @return Builder object with new value for dataType
     */
    public DefaultDataSpecificationIEC61360Builder dataType(DataTypeIEC61360 dataType) {
        this.map.put("dataType", dataType);
        return this;
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public DefaultDataSpecificationIEC61360Builder definitions(List<LangString> definitions) {
        this.map.put("definitions", definitions);
        return this;
    }

    /**
     * This function allows setting a value for levelTypes
     * 
     * @param levelTypes desired value to be set
     * @return Builder object with new value for levelTypes
     */
    public DefaultDataSpecificationIEC61360Builder levelTypes(List<LevelType> levelTypes) {
        this.map.put("levelTypes", levelTypes);
        return this;
    }

    /**
     * This function allows setting a value for preferredNames
     * 
     * @param preferredNames desired value to be set
     * @return Builder object with new value for preferredNames
     */
    public DefaultDataSpecificationIEC61360Builder preferredNames(List<LangString> preferredNames) {
        this.map.put("preferredNames", preferredNames);
        return this;
    }

    /**
     * This function allows setting a value for shortNames
     * 
     * @param shortNames desired value to be set
     * @return Builder object with new value for shortNames
     */
    public DefaultDataSpecificationIEC61360Builder shortNames(List<LangString> shortNames) {
        this.map.put("shortNames", shortNames);
        return this;
    }

    /**
     * This function allows setting a value for sourceOfDefinition
     * 
     * @param sourceOfDefinition desired value to be set
     * @return Builder object with new value for sourceOfDefinition
     */
    public DefaultDataSpecificationIEC61360Builder sourceOfDefinition(String sourceOfDefinition) {
        this.map.put("sourceOfDefinition", sourceOfDefinition);
        return this;
    }

    /**
     * This function allows setting a value for symbol
     * 
     * @param symbol desired value to be set
     * @return Builder object with new value for symbol
     */
    public DefaultDataSpecificationIEC61360Builder symbol(String symbol) {
        this.map.put("symbol", symbol);
        return this;
    }

    /**
     * This function allows setting a value for unit
     * 
     * @param unit desired value to be set
     * @return Builder object with new value for unit
     */
    public DefaultDataSpecificationIEC61360Builder unit(String unit) {
        this.map.put("unit", unit);
        return this;
    }

    /**
     * This function allows setting a value for unitId
     * 
     * @param unitId desired value to be set
     * @return Builder object with new value for unitId
     */
    public DefaultDataSpecificationIEC61360Builder unitId(Reference unitId) {
        this.map.put("unitId", unitId);
        return this;
    }

    /**
     * This function allows setting a value for valueFormat
     * 
     * @param valueFormat desired value to be set
     * @return Builder object with new value for valueFormat
     */
    public DefaultDataSpecificationIEC61360Builder valueFormat(String valueFormat) {
        this.map.put("valueFormat", valueFormat);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DefaultDataSpecificationIEC61360Builder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for valueList
     * 
     * @param valueList desired value to be set
     * @return Builder object with new value for valueList
     */
    public DefaultDataSpecificationIEC61360Builder valueList(ValueList valueList) {
        this.map.put("valueList", valueList);
        return this;
    }

    /**
     * This function allows setting a value for valueId
     * 
     * @param valueId desired value to be set
     * @return Builder object with new value for valueId
     */
    public DefaultDataSpecificationIEC61360Builder valueId(Reference valueId) {
        this.map.put("valueId", valueId);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultDataSpecificationIEC61360 build() {
        DefaultDataSpecificationIEC61360 defaultDataSpecificationIEC61360 =
            Util.fillInstanceFromMap(new DefaultDataSpecificationIEC61360(), this.map);
        return defaultDataSpecificationIEC61360;
    }
}
