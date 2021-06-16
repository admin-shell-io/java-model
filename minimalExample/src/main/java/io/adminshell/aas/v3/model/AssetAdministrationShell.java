package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Describes the Administration Shell for Assets, Products, Components, e.g. Machines
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell {

    /**
     * Meta information about the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     *
     * @return Returns the List of AssetInformations for the property assetInformations.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    public List<AssetInformation> getAssetInformations();

    /**
     * Meta information about the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     *
     * @param assetInformations desired value for the property assetInformations.
     */
    public void setAssetInformations(List<AssetInformation> assetInformations);

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     *
     * @return Returns the List of Submodels for the property submodels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    public List<Submodel> getSubmodels();

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     *
     * @param submodels desired value for the property submodels.
     */
    public void setSubmodels(List<Submodel> submodels);

}
