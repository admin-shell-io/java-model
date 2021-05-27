package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultMultiLanguagePropertyBuilder extends AbstractBuilder<DefaultMultiLanguageProperty> {

    public DefaultMultiLanguagePropertyBuilder() {
        super();
    }

    public DefaultMultiLanguagePropertyBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultMultiLanguagePropertyBuilder values(List<LangString> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for valueIds
     * 
     * @param valueIds desired value to be set
     * @return Builder object with new value for valueIds
     */
    public DefaultMultiLanguagePropertyBuilder valueIds(List<Reference> valueIds) {
        this.map.put("valueIds", valueIds);
        return this;
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultMultiLanguagePropertyBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultMultiLanguagePropertyBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultMultiLanguagePropertyBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultMultiLanguagePropertyBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultMultiLanguagePropertyBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultMultiLanguagePropertyBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kinds
     * 
     * @param kinds desired value to be set
     * @return Builder object with new value for kinds
     */
    public DefaultMultiLanguagePropertyBuilder kinds(List<ModelingKind> kinds) {
        this.map.put("kinds", kinds);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultMultiLanguagePropertyBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultMultiLanguageProperty build() {
        DefaultMultiLanguageProperty defaultMultiLanguageProperty = Util.fillInstanceFromMap(new DefaultMultiLanguageProperty(), this.map);
        return defaultMultiLanguageProperty;
    }
}
