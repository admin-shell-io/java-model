package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultAssetInformationBuilder extends AbstractBuilder<DefaultAssetInformation> {

    public DefaultAssetInformationBuilder() {
        super();
    }

    public DefaultAssetInformationBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for assetKind
     * 
     * @param assetKind desired value to be set
     * @return Builder object with new value for assetKind
     */
    public DefaultAssetInformationBuilder assetKind(AssetKind assetKind) {
        this.map.put("assetKind", assetKind);
        return this;
    }

    /**
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public DefaultAssetInformationBuilder globalAssetId(Reference globalAssetId) {
        this.map.put("globalAssetId", globalAssetId);
        return this;
    }

    /**
     * This function allows setting a value for specificAssetIds
     * 
     * @param specificAssetIds desired value to be set
     * @return Builder object with new value for specificAssetIds
     */
    public DefaultAssetInformationBuilder specificAssetIds(List<IdentifierKeyValuePair> specificAssetIds) {
        this.map.put("specificAssetIds", specificAssetIds);
        return this;
    }

    /**
     * This function allows setting a value for billOfMaterials
     * 
     * @param billOfMaterials desired value to be set
     * @return Builder object with new value for billOfMaterials
     */
    public DefaultAssetInformationBuilder billOfMaterials(List<Submodel> billOfMaterials) {
        this.map.put("billOfMaterials", billOfMaterials);
        return this;
    }

    /**
     * This function allows setting a value for defaultThumbnail
     * 
     * @param defaultThumbnail desired value to be set
     * @return Builder object with new value for defaultThumbnail
     */
    public DefaultAssetInformationBuilder defaultThumbnail(File defaultThumbnail) {
        this.map.put("defaultThumbnail", defaultThumbnail);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAssetInformation build() {
        DefaultAssetInformation defaultAssetInformation = Util.fillInstanceFromMap(new DefaultAssetInformation(), this.map);
        return defaultAssetInformation;
    }
}
