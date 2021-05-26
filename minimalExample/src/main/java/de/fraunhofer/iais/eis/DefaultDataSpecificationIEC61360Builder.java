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
     * This function allows setting a value for dataTypes
     * 
     * @param dataTypes desired value to be set
     * @return Builder object with new value for dataTypes
     */
    public DefaultDataSpecificationIEC61360Builder dataTypes(List<DataTypeIEC61360> dataTypes) {
        this.map.put("dataTypes", dataTypes);
        return this;
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public DefaultDataSpecificationIEC61360Builder definitions(List<LangStringSet> definitions) {
        this.map.put("definitions", definitions);
        return this;
    }

    /**
     * This function allows setting a value for shortNames
     * 
     * @param shortNames desired value to be set
     * @return Builder object with new value for shortNames
     */
    public DefaultDataSpecificationIEC61360Builder shortNames(List<LangStringSet> shortNames) {
        this.map.put("shortNames", shortNames);
        return this;
    }

    /**
     * This function allows setting a value for preferredNames
     * 
     * @param preferredNames desired value to be set
     * @return Builder object with new value for preferredNames
     */
    public DefaultDataSpecificationIEC61360Builder preferredNames(List<LangStringSet> preferredNames) {
        this.map.put("preferredNames", preferredNames);
        return this;
    }

    /**
     * This function allows setting a value for sourceOfDefinitions
     * 
     * @param sourceOfDefinitions desired value to be set
     * @return Builder object with new value for sourceOfDefinitions
     */
    public DefaultDataSpecificationIEC61360Builder sourceOfDefinitions(List<String> sourceOfDefinitions) {
        this.map.put("sourceOfDefinitions", sourceOfDefinitions);
        return this;
    }

    /**
     * This function allows setting a value for units
     * 
     * @param units desired value to be set
     * @return Builder object with new value for units
     */
    public DefaultDataSpecificationIEC61360Builder units(List<String> units) {
        this.map.put("units", units);
        return this;
    }

    /**
     * This function allows setting a value for unitIds
     * 
     * @param unitIds desired value to be set
     * @return Builder object with new value for unitIds
     */
    public DefaultDataSpecificationIEC61360Builder unitIds(List<Reference> unitIds) {
        this.map.put("unitIds", unitIds);
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
