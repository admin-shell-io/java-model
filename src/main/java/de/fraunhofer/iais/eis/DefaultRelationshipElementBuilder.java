package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultRelationshipElementBuilder extends AbstractBuilder<DefaultRelationshipElement> {

    public DefaultRelationshipElementBuilder() {
        super();
    }

    public DefaultRelationshipElementBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for firsts
     * 
     * @param firsts desired value to be set
     * @return Builder object with new value for firsts
     */
    public DefaultRelationshipElementBuilder firsts(List<Referable> firsts) {
        this.map.put("firsts", firsts);
        return this;
    }

    /**
     * This function allows setting a value for seconds
     * 
     * @param seconds desired value to be set
     * @return Builder object with new value for seconds
     */
    public DefaultRelationshipElementBuilder seconds(List<Referable> seconds) {
        this.map.put("seconds", seconds);
        return this;
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultRelationshipElementBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultRelationshipElementBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultRelationshipElementBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultRelationshipElementBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultRelationshipElementBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultRelationshipElementBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kinds
     * 
     * @param kinds desired value to be set
     * @return Builder object with new value for kinds
     */
    public DefaultRelationshipElementBuilder kinds(List<ModelingKind> kinds) {
        this.map.put("kinds", kinds);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultRelationshipElementBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultRelationshipElement build() {
        DefaultRelationshipElement defaultRelationshipElement = Util.fillInstanceFromMap(new DefaultRelationshipElement(), this.map);
        return defaultRelationshipElement;
    }
}
