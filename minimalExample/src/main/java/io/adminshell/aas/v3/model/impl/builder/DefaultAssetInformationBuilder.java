package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultAssetInformationBuilder<T extends AssetInformation, B extends DefaultAssetInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetKinds
     * 
     * @param assetKinds desired value to be set
     * @return Builder object with new value for assetKinds
     */
    public B assetKinds(List<AssetKind> assetKinds) {
        getBuildingInstance().setAssetKinds(assetKinds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List assetKinds
     * 
     * @param assetKind desired value to be added
     * @return Builder object with new value for assetKinds
     */
    public B assetKind(AssetKind assetKind) {
        getBuildingInstance().getAssetKinds().add(assetKind);
        return getSelf();
    }

    /**
     * This function allows setting a value for globalAssetIds
     * 
     * @param globalAssetIds desired value to be set
     * @return Builder object with new value for globalAssetIds
     */
    public B globalAssetIds(List<Reference> globalAssetIds) {
        getBuildingInstance().setGlobalAssetIds(globalAssetIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List globalAssetIds
     * 
     * @param globalAssetId desired value to be added
     * @return Builder object with new value for globalAssetIds
     */
    public B globalAssetId(Reference globalAssetId) {
        getBuildingInstance().getGlobalAssetIds().add(globalAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for specificAssetIds
     * 
     * @param specificAssetIds desired value to be set
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetIds(List<IdentifierKeyValuePair> specificAssetIds) {
        getBuildingInstance().setSpecificAssetIds(specificAssetIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List specificAssetIds
     * 
     * @param specificAssetId desired value to be added
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetId(IdentifierKeyValuePair specificAssetId) {
        getBuildingInstance().getSpecificAssetIds().add(specificAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultThumbnails
     * 
     * @param defaultThumbnails desired value to be set
     * @return Builder object with new value for defaultThumbnails
     */
    public B defaultThumbnails(List<File> defaultThumbnails) {
        getBuildingInstance().setDefaultThumbnails(defaultThumbnails);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List defaultThumbnails
     * 
     * @param defaultThumbnail desired value to be added
     * @return Builder object with new value for defaultThumbnails
     */
    public B defaultThumbnail(File defaultThumbnail) {
        getBuildingInstance().getDefaultThumbnails().add(defaultThumbnail);
        return getSelf();
    }
}
