package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class DataSpecificationIEC61360Builder {

    private Map<String, Object> map;

    public DataSpecificationIEC61360Builder() {
        this.map = new HashMap<>();
    }

    public DataSpecificationIEC61360Builder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for dataTypes
     * 
     * @param dataTypes desired value to be set
     * @return Builder object with new value for dataTypes
     */
    public DataSpecificationIEC61360Builder dataTypes(List<DataTypeIEC61360> dataTypes) {
        this.map.put("dataTypes", dataTypes);
        return this;
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public DataSpecificationIEC61360Builder definitions(List<LangString> definitions) {
        this.map.put("definitions", definitions);
        return this;
    }

    /**
     * This function allows setting a value for levelTypes
     * 
     * @param levelTypes desired value to be set
     * @return Builder object with new value for levelTypes
     */
    public DataSpecificationIEC61360Builder levelTypes(List<LevelType> levelTypes) {
        this.map.put("levelTypes", levelTypes);
        return this;
    }

    /**
     * This function allows setting a value for preferredNames
     * 
     * @param preferredNames desired value to be set
     * @return Builder object with new value for preferredNames
     */
    public DataSpecificationIEC61360Builder preferredNames(List<LangString> preferredNames) {
        this.map.put("preferredNames", preferredNames);
        return this;
    }

    /**
     * This function allows setting a value for shortNames
     * 
     * @param shortNames desired value to be set
     * @return Builder object with new value for shortNames
     */
    public DataSpecificationIEC61360Builder shortNames(List<LangString> shortNames) {
        this.map.put("shortNames", shortNames);
        return this;
    }

    /**
     * This function allows setting a value for sourceOfDefinition
     * 
     * @param sourceOfDefinition desired value to be set
     * @return Builder object with new value for sourceOfDefinition
     */
    public DataSpecificationIEC61360Builder sourceOfDefinition(String sourceOfDefinition) {
        this.map.put("sourceOfDefinition", sourceOfDefinition);
        return this;
    }

    /**
     * This function allows setting a value for symbol
     * 
     * @param symbol desired value to be set
     * @return Builder object with new value for symbol
     */
    public DataSpecificationIEC61360Builder symbol(String symbol) {
        this.map.put("symbol", symbol);
        return this;
    }

    /**
     * This function allows setting a value for unit
     * 
     * @param unit desired value to be set
     * @return Builder object with new value for unit
     */
    public DataSpecificationIEC61360Builder unit(String unit) {
        this.map.put("unit", unit);
        return this;
    }

    /**
     * This function allows setting a value for unitId
     * 
     * @param unitId desired value to be set
     * @return Builder object with new value for unitId
     */
    public DataSpecificationIEC61360Builder unitId(Reference unitId) {
        this.map.put("unitId", unitId);
        return this;
    }

    /**
     * This function allows setting a value for valueFormat
     * 
     * @param valueFormat desired value to be set
     * @return Builder object with new value for valueFormat
     */
    public DataSpecificationIEC61360Builder valueFormat(String valueFormat) {
        this.map.put("valueFormat", valueFormat);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DataSpecificationIEC61360Builder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for valueList
     * 
     * @param valueList desired value to be set
     * @return Builder object with new value for valueList
     */
    public DataSpecificationIEC61360Builder valueList(String valueList) {
        this.map.put("valueList", valueList);
        return this;
    }

    /**
     * This function allows setting a value for valueId
     * 
     * @param valueId desired value to be set
     * @return Builder object with new value for valueId
     */
    public DataSpecificationIEC61360Builder valueId(Reference valueId) {
        this.map.put("valueId", valueId);
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
    final public DataSpecificationIEC61360 build() throws ConstraintViolationException {
        DefaultDataSpecificationIEC61360 defaultDataSpecificationIEC61360 =
            Util.fillInstanceFromMap(new DefaultDataSpecificationIEC61360(), this.map);
        return defaultDataSpecificationIEC61360;
    }
}
