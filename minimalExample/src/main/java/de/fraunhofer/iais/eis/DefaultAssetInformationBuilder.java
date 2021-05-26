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
     * This function allows setting a value for assetKinds
     * 
     * @param assetKinds desired value to be set
     * @return Builder object with new value for assetKinds
     */
    public DefaultAssetInformationBuilder assetKinds(List<AssetKind> assetKinds) {
        this.map.put("assetKinds", assetKinds);
        return this;
    }

    /**
     * This function allows setting a value for globalAssetIds
     * 
     * @param globalAssetIds desired value to be set
     * @return Builder object with new value for globalAssetIds
     */
    public DefaultAssetInformationBuilder globalAssetIds(List<Reference> globalAssetIds) {
        this.map.put("globalAssetIds", globalAssetIds);
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
     * This function allows setting a value for defaultThumbnails
     * 
     * @param defaultThumbnails desired value to be set
     * @return Builder object with new value for defaultThumbnails
     */
    public DefaultAssetInformationBuilder defaultThumbnails(List<File> defaultThumbnails) {
        this.map.put("defaultThumbnails", defaultThumbnails);
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
