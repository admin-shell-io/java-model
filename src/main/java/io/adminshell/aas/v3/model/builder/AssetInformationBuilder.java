package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AssetInformationBuilder<T extends AssetInformation, B extends AssetInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetKind
     * 
     * @param assetKind desired value to be set
     * @return Builder object with new value for assetKind
     */
    public B assetKind(AssetKind assetKind) {
        getBuildingInstance().setAssetKind(assetKind);
        return getSelf();
    }

    /**
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public B globalAssetId(Reference globalAssetId) {
        getBuildingInstance().setGlobalAssetId(globalAssetId);
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
     * This function allows setting a value for billOfMaterials
     * 
     * @param billOfMaterials desired value to be set
     * @return Builder object with new value for billOfMaterials
     */
    public B billOfMaterials(List<Reference> billOfMaterials) {
        getBuildingInstance().setBillOfMaterials(billOfMaterials);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List billOfMaterials
     * 
     * @param billOfMaterial desired value to be added
     * @return Builder object with new value for billOfMaterials
     */
    public B billOfMaterial(Reference billOfMaterial) {
        getBuildingInstance().getBillOfMaterials().add(billOfMaterial);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultThumbnail
     * 
     * @param defaultThumbnail desired value to be set
     * @return Builder object with new value for defaultThumbnail
     */
    public B defaultThumbnail(File defaultThumbnail) {
        getBuildingInstance().setDefaultThumbnail(defaultThumbnail);
        return getSelf();
    }
}
