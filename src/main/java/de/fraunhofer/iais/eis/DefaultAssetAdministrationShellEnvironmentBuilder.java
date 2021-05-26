package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultAssetAdministrationShellEnvironmentBuilder extends AbstractBuilder<DefaultAssetAdministrationShellEnvironment> {

    public DefaultAssetAdministrationShellEnvironmentBuilder() {
        super();
    }

    public DefaultAssetAdministrationShellEnvironmentBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for assetAdministrationShells
     * 
     * @param assetAdministrationShells desired value to be set
     * @return Builder object with new value for assetAdministrationShells
     */
    public DefaultAssetAdministrationShellEnvironmentBuilder assetAdministrationShells(
        List<AssetAdministrationShell> assetAdministrationShells) {
        this.map.put("assetAdministrationShells", assetAdministrationShells);
        return this;
    }

    /**
     * This function allows setting a value for assets
     * 
     * @param assets desired value to be set
     * @return Builder object with new value for assets
     */
    public DefaultAssetAdministrationShellEnvironmentBuilder assets(List<Asset> assets) {
        this.map.put("assets", assets);
        return this;
    }

    /**
     * This function allows setting a value for conceptDescriptions
     * 
     * @param conceptDescriptions desired value to be set
     * @return Builder object with new value for conceptDescriptions
     */
    public DefaultAssetAdministrationShellEnvironmentBuilder conceptDescriptions(List<ConceptDescription> conceptDescriptions) {
        this.map.put("conceptDescriptions", conceptDescriptions);
        return this;
    }

    /**
     * This function allows setting a value for submodels
     * 
     * @param submodels desired value to be set
     * @return Builder object with new value for submodels
     */
    public DefaultAssetAdministrationShellEnvironmentBuilder submodels(List<Submodel> submodels) {
        this.map.put("submodels", submodels);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAssetAdministrationShellEnvironment build() {
        DefaultAssetAdministrationShellEnvironment defaultAssetAdministrationShellEnvironment =
            Util.fillInstanceFromMap(new DefaultAssetAdministrationShellEnvironment(), this.map);
        return defaultAssetAdministrationShellEnvironment;
    }
}
