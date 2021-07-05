package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.List;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A graph of Asset Administration Shells.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShellEnvironment.class)
})
public interface AssetAdministrationShellEnvironment {

    /**
     * Points to the differents Administration Shells in one
     * AssetAdministrationShellEnvironment graph.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells
     *
     * @return Returns the List of AssetAdministrationShells for the property
     * assetAdministrationShells.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
    List<AssetAdministrationShell> getAssetAdministrationShells();

    /**
     * Points to the differents Administration Shells in one
     * AssetAdministrationShellEnvironment graph.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells
     *
     * @param assetAdministrationShells desired value for the property
     * assetAdministrationShells.
     */
    void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells);

    /**
     * Points to the differents Concept Descriptions in one
     * AssetAdministrationShellEnvironment graph.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions
     *
     * @return Returns the List of ConceptDescriptions for the property
     * conceptDescriptions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
    List<ConceptDescription> getConceptDescriptions();

    /**
     * Points to the differents Concept Descriptions in one
     * AssetAdministrationShellEnvironment graph.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions
     *
     * @param conceptDescriptions desired value for the property
     * conceptDescriptions.
     */
    void setConceptDescriptions(List<ConceptDescription> conceptDescriptions);

    /**
     * Points to the differents Submodels in one
     * AssetAdministrationShellEnvironment graph.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels
     *
     * @return Returns the List of Submodels for the property submodels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
    List<Submodel> getSubmodels();

    /**
     * Points to the differents Submodels in one
     * AssetAdministrationShellEnvironment graph.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels
     *
     * @param submodels desired value for the property submodels.
     */
    void setSubmodels(List<Submodel> submodels);

}