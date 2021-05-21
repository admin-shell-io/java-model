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
     * This function allows setting a value for assetKinds
     * 
     * @param assetKinds desired value to be set
     * @return Builder object with new value for assetKinds
     */
    public AssetInformationBuilder assetKinds(List<AssetKind> assetKinds) {
        this.map.put("assetKinds", assetKinds);
        return this;
    }

    /**
     * This function allows setting a value for globalAssetIds
     * 
     * @param globalAssetIds desired value to be set
     * @return Builder object with new value for globalAssetIds
     */
    public AssetInformationBuilder globalAssetIds(List<Reference> globalAssetIds) {
        this.map.put("globalAssetIds", globalAssetIds);
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
     * This function allows setting a value for defaultThumbnails
     * 
     * @param defaultThumbnails desired value to be set
     * @return Builder object with new value for defaultThumbnails
     */
    public AssetInformationBuilder defaultThumbnails(List<File> defaultThumbnails) {
        this.map.put("defaultThumbnails", defaultThumbnails);
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
