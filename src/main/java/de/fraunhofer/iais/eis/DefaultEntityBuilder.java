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
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public DefaultEntityBuilder globalAssetId(Reference globalAssetId) {
        this.map.put("globalAssetId", globalAssetId);
        return this;
    }

    /**
     * This function allows setting a value for externalAssetId
     * 
     * @param externalAssetId desired value to be set
     * @return Builder object with new value for externalAssetId
     */
    public DefaultEntityBuilder externalAssetId(IdentifierKeyValuePair externalAssetId) {
        this.map.put("externalAssetId", externalAssetId);
        return this;
    }

    /**
     * This function allows setting a value for entityType
     * 
     * @param entityType desired value to be set
     * @return Builder object with new value for entityType
     */
    public DefaultEntityBuilder entityType(EntityType entityType) {
        this.map.put("entityType", entityType);
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
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public DefaultEntityBuilder category(String category) {
        this.map.put("category", category);
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
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public DefaultEntityBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
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
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public DefaultEntityBuilder kind(ModelingKind kind) {
        this.map.put("kind", kind);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public DefaultEntityBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
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
