package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AssetAdministrationShellEnvironmentBuilder<T extends AssetAdministrationShellEnvironment, B extends AssetAdministrationShellEnvironmentBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetAdministrationShells
     * 
     * @param assetAdministrationShells desired value to be set
     * @return Builder object with new value for assetAdministrationShells
     */
    public B assetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells) {
        getBuildingInstance().setAssetAdministrationShells(assetAdministrationShells);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List assetAdministrationShells
     * 
     * @param assetAdministrationShells desired value to be added
     * @return Builder object with new value for assetAdministrationShells
     */
    public B assetAdministrationShells(AssetAdministrationShell assetAdministrationShells) {
        getBuildingInstance().getAssetAdministrationShells().add(assetAdministrationShells);
        return getSelf();
    }

    /**
     * This function allows setting a value for assets
     * 
     * @param assets desired value to be set
     * @return Builder object with new value for assets
     */
    public B assets(List<Asset> assets) {
        getBuildingInstance().setAssets(assets);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List assets
     * 
     * @param assets desired value to be added
     * @return Builder object with new value for assets
     */
    public B assets(Asset assets) {
        getBuildingInstance().getAssets().add(assets);
        return getSelf();
    }

    /**
     * This function allows setting a value for conceptDescriptions
     * 
     * @param conceptDescriptions desired value to be set
     * @return Builder object with new value for conceptDescriptions
     */
    public B conceptDescriptions(List<ConceptDescription> conceptDescriptions) {
        getBuildingInstance().setConceptDescriptions(conceptDescriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List conceptDescriptions
     * 
     * @param conceptDescriptions desired value to be added
     * @return Builder object with new value for conceptDescriptions
     */
    public B conceptDescriptions(ConceptDescription conceptDescriptions) {
        getBuildingInstance().getConceptDescriptions().add(conceptDescriptions);
        return getSelf();
    }

    /**
     * This function allows setting a value for submodels
     * 
     * @param submodels desired value to be set
     * @return Builder object with new value for submodels
     */
    public B submodels(List<Submodel> submodels) {
        getBuildingInstance().setSubmodels(submodels);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List submodels
     * 
     * @param submodels desired value to be added
     * @return Builder object with new value for submodels
     */
    public B submodels(Submodel submodels) {
        getBuildingInstance().getSubmodels().add(submodels);
        return getSelf();
    }
}
