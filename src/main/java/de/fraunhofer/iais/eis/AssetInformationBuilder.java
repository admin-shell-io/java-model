package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class AssetInformationBuilder {

    private Map<String, Object> map;

    public AssetInformationBuilder() {
        this.map = new HashMap<>();
    }

    public AssetInformationBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for assetKind
     * 
     * @param assetKind desired value to be set
     * @return Builder object with new value for assetKind
     */
    public AssetInformationBuilder assetKind(AssetKind assetKind) {
        this.map.put("assetKind", assetKind);
        return this;
    }

    /**
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public AssetInformationBuilder globalAssetId(Reference globalAssetId) {
        this.map.put("globalAssetId", globalAssetId);
        return this;
    }

    /**
     * This function allows setting a value for specificAssetIds
     * 
     * @param specificAssetIds desired value to be set
     * @return Builder object with new value for specificAssetIds
     */
    public AssetInformationBuilder specificAssetIds(List<IdentifierKeyValuePair> specificAssetIds) {
        this.map.put("specificAssetIds", specificAssetIds);
        return this;
    }

    /**
     * This function allows setting a value for billOfMaterials
     * 
     * @param billOfMaterials desired value to be set
     * @return Builder object with new value for billOfMaterials
     */
    public AssetInformationBuilder billOfMaterials(List<Submodel> billOfMaterials) {
        this.map.put("billOfMaterials", billOfMaterials);
        return this;
    }

    /**
     * This function allows setting a value for defaultThumbnail
     * 
     * @param defaultThumbnail desired value to be set
     * @return Builder object with new value for defaultThumbnail
     */
    public AssetInformationBuilder defaultThumbnail(File defaultThumbnail) {
        this.map.put("defaultThumbnail", defaultThumbnail);
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
    final public AssetInformation build() throws ConstraintViolationException {
        DefaultAssetInformation defaultAssetInformation = Util.fillInstanceFromMap(new DefaultAssetInformation(), this.map);
        return defaultAssetInformation;
    }
}
