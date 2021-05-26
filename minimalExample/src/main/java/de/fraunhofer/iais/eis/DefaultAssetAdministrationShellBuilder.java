package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultAssetAdministrationShellBuilder extends AbstractBuilder<DefaultAssetAdministrationShell> {

    public DefaultAssetAdministrationShellBuilder() {
        super();
    }

    public DefaultAssetAdministrationShellBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for assetInformations
     * 
     * @param assetInformations desired value to be set
     * @return Builder object with new value for assetInformations
     */
    public DefaultAssetAdministrationShellBuilder assetInformations(List<AssetInformation> assetInformations) {
        this.map.put("assetInformations", assetInformations);
        return this;
    }

    /**
     * This function allows setting a value for submodels
     * 
     * @param submodels desired value to be set
     * @return Builder object with new value for submodels
     */
    public DefaultAssetAdministrationShellBuilder submodels(List<Submodel> submodels) {
        this.map.put("submodels", submodels);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAssetAdministrationShell build() {
        DefaultAssetAdministrationShell defaultAssetAdministrationShell =
            Util.fillInstanceFromMap(new DefaultAssetAdministrationShell(), this.map);
        return defaultAssetAdministrationShell;
    }
}
