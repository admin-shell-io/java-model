package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Asset Administration Shell" "Describes the Administration Shell for Assets, Products,
 * Components, e.g. Machines"@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Meta information about the asset the AAS is representing."@en
     * 
     * @return Returns the List of AssetInformations for the property assetInformations. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    public List<AssetInformation> getAssetInformations();

    /**
     * "Meta information about the asset the AAS is representing."@en
     * 
     * @param assetInformations desired value for the property assetInformations. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     */
    public void setAssetInformations(List<AssetInformation> assetInformations);

    /**
     * "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
     * 
     * @return Returns the List of Submodels for the property submodels. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    public List<Submodel> getSubmodels();

    /**
     * "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
     * 
     * @param submodels desired value for the property submodels. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     */
    public void setSubmodels(List<Submodel> submodels);

}
