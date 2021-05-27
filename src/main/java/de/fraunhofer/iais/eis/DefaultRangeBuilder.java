package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultRangeBuilder extends AbstractBuilder<DefaultRange> {

    public DefaultRangeBuilder() {
        super();
    }

    public DefaultRangeBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for valueTypes
     * 
     * @param valueTypes desired value to be set
     * @return Builder object with new value for valueTypes
     */
    public DefaultRangeBuilder valueTypes(List<String> valueTypes) {
        this.map.put("valueTypes", valueTypes);
        return this;
    }

    /**
     * This function allows setting a value for maxs
     * 
     * @param maxs desired value to be set
     * @return Builder object with new value for maxs
     */
    public DefaultRangeBuilder maxs(List<String> maxs) {
        this.map.put("maxs", maxs);
        return this;
    }

    /**
     * This function allows setting a value for mins
     * 
     * @param mins desired value to be set
     * @return Builder object with new value for mins
     */
    public DefaultRangeBuilder mins(List<String> mins) {
        this.map.put("mins", mins);
        return this;
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultRangeBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultRangeBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultRangeBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultRangeBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultRangeBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultRangeBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kinds
     * 
     * @param kinds desired value to be set
     * @return Builder object with new value for kinds
     */
    public DefaultRangeBuilder kinds(List<ModelingKind> kinds) {
        this.map.put("kinds", kinds);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultRangeBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultRange build() {
        DefaultRange defaultRange = Util.fillInstanceFromMap(new DefaultRange(), this.map);
        return defaultRange;
    }
}
