package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultEntityBuilder extends AbstractBuilder<DefaultEntity> {

    public DefaultEntityBuilder() {
        super();
    }

    public DefaultEntityBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for globalAssetIds
     * 
     * @param globalAssetIds desired value to be set
     * @return Builder object with new value for globalAssetIds
     */
    public DefaultEntityBuilder globalAssetIds(List<Reference> globalAssetIds) {
        this.map.put("globalAssetIds", globalAssetIds);
        return this;
    }

    /**
     * This function allows setting a value for externalAssetIds
     * 
     * @param externalAssetIds desired value to be set
     * @return Builder object with new value for externalAssetIds
     */
    public DefaultEntityBuilder externalAssetIds(List<IdentifierKeyValuePair> externalAssetIds) {
        this.map.put("externalAssetIds", externalAssetIds);
        return this;
    }

    /**
     * This function allows setting a value for entityTypes
     * 
     * @param entityTypes desired value to be set
     * @return Builder object with new value for entityTypes
     */
    public DefaultEntityBuilder entityTypes(List<EntityType> entityTypes) {
        this.map.put("entityTypes", entityTypes);
        return this;
    }

    /**
     * This function allows setting a value for statements
     * 
     * @param statements desired value to be set
     * @return Builder object with new value for statements
     */
    public DefaultEntityBuilder statements(List<SubmodelElement> statements) {
        this.map.put("statements", statements);
        return this;
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultEntityBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultEntityBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultEntityBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultEntityBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultEntityBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultEntityBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kinds
     * 
     * @param kinds desired value to be set
     * @return Builder object with new value for kinds
     */
    public DefaultEntityBuilder kinds(List<ModelingKind> kinds) {
        this.map.put("kinds", kinds);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultEntityBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultEntity build() {
        DefaultEntity defaultEntity = Util.fillInstanceFromMap(new DefaultEntity(), this.map);
        return defaultEntity;
    }
}
