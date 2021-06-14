package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Asset Administration Shell Environment" "A graph of Asset Administration Shells."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShellEnvironment.class)
})
public interface AssetAdministrationShellEnvironment {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Points to the differents Administration Shells in one AssetAdministrationShellEnvironment
     * graph."@en
     * 
     * @return Returns the List of AssetAdministrationShells for the property assetAdministrationShells.
     *         More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
    public List<AssetAdministrationShell> getAssetAdministrationShells();

    /**
     * "Points to the differents Administration Shells in one AssetAdministrationShellEnvironment
     * graph."@en
     * 
     * @param assetAdministrationShells desired value for the property assetAdministrationShells. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells
     */
    public void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells);

    /**
     * "Points to the differents Assets in one AssetAdministrationShellEnvironment graph."@en
     * 
     * @return Returns the List of Assets for the property assets. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
    public List<Asset> getAssets();

    /**
     * "Points to the differents Assets in one AssetAdministrationShellEnvironment graph."@en
     * 
     * @param assets desired value for the property assets. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets
     */
    public void setAssets(List<Asset> assets);

    /**
     * "Points to the differents Concept Descriptions in one AssetAdministrationShellEnvironment
     * graph."@en
     * 
     * @return Returns the List of ConceptDescriptions for the property conceptDescriptions. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
    public List<ConceptDescription> getConceptDescriptions();

    /**
     * "Points to the differents Concept Descriptions in one AssetAdministrationShellEnvironment
     * graph."@en
     * 
     * @param conceptDescriptions desired value for the property conceptDescriptions. More information
     *        under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions
     */
    public void setConceptDescriptions(List<ConceptDescription> conceptDescriptions);

    /**
     * "Points to the differents Submodels in one AssetAdministrationShellEnvironment graph."@en
     * 
     * @return Returns the List of Submodels for the property submodels. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
    public List<Submodel> getSubmodels();

    /**
     * "Points to the differents Submodels in one AssetAdministrationShellEnvironment graph."@en
     * 
     * @param submodels desired value for the property submodels. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels
     */
    public void setSubmodels(List<Submodel> submodels);

}
