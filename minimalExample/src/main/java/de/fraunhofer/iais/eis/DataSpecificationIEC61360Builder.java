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
    public DataSpecificationIEC61360Builder definitions(List<LangStringSet> definitions) {
        this.map.put("definitions", definitions);
        return this;
    }

    /**
     * This function allows setting a value for shortNames
     * 
     * @param shortNames desired value to be set
     * @return Builder object with new value for shortNames
     */
    public DataSpecificationIEC61360Builder shortNames(List<LangStringSet> shortNames) {
        this.map.put("shortNames", shortNames);
        return this;
    }

    /**
     * This function allows setting a value for preferredNames
     * 
     * @param preferredNames desired value to be set
     * @return Builder object with new value for preferredNames
     */
    public DataSpecificationIEC61360Builder preferredNames(List<LangStringSet> preferredNames) {
        this.map.put("preferredNames", preferredNames);
        return this;
    }

    /**
     * This function allows setting a value for sourceOfDefinitions
     * 
     * @param sourceOfDefinitions desired value to be set
     * @return Builder object with new value for sourceOfDefinitions
     */
    public DataSpecificationIEC61360Builder sourceOfDefinitions(List<String> sourceOfDefinitions) {
        this.map.put("sourceOfDefinitions", sourceOfDefinitions);
        return this;
    }

    /**
     * This function allows setting a value for units
     * 
     * @param units desired value to be set
     * @return Builder object with new value for units
     */
    public DataSpecificationIEC61360Builder units(List<String> units) {
        this.map.put("units", units);
        return this;
    }

    /**
     * This function allows setting a value for unitIds
     * 
     * @param unitIds desired value to be set
     * @return Builder object with new value for unitIds
     */
    public DataSpecificationIEC61360Builder unitIds(List<Reference> unitIds) {
        this.map.put("unitIds", unitIds);
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
