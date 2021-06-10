package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultAssetAdministrationShellBuilder<T extends AssetAdministrationShell, B extends DefaultAssetAdministrationShellBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetInformations
     * 
     * @param assetInformations desired value to be set
     * @return Builder object with new value for assetInformations
     */
    public B assetInformations(List<AssetInformation> assetInformations) {
        getBuildingInstance().setAssetInformations(assetInformations);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List assetInformations
     * 
     * @param assetInformation desired value to be added
     * @return Builder object with new value for assetInformations
     */
    public B assetInformation(AssetInformation assetInformation) {
        getBuildingInstance().getAssetInformations().add(assetInformation);
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
     * @param submodel desired value to be added
     * @return Builder object with new value for submodels
     */
    public B submodel(Submodel submodel) {
        getBuildingInstance().getSubmodels().add(submodel);
        return getSelf();
    }
}
