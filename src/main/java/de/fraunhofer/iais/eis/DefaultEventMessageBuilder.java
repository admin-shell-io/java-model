package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultEventMessageBuilder extends AbstractBuilder<DefaultEventMessage> {

    public DefaultEventMessageBuilder() {
        super();
    }

    public DefaultEventMessageBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultEventMessageBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultEventMessageBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultEventMessageBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultEventMessageBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultEventMessageBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultEventMessageBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kinds
     * 
     * @param kinds desired value to be set
     * @return Builder object with new value for kinds
     */
    public DefaultEventMessageBuilder kinds(List<ModelingKind> kinds) {
        this.map.put("kinds", kinds);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultEventMessageBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultEventMessage build() {
        DefaultEventMessage defaultEventMessage = Util.fillInstanceFromMap(new DefaultEventMessage(), this.map);
        return defaultEventMessage;
    }
}
