package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Describes the Administration Shell for Assets, Products, Components, e.g. Machines
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell extends HasDataSpecification, Identifiable {

    /**
     * Meta information about the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     *
     * @return Returns the AssetInformation for the property assetInformation.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    AssetInformation getAssetInformation();

    /**
     * Meta information about the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     *
     * @param assetInformation desired value for the property assetInformation.
     */
    void setAssetInformation(AssetInformation assetInformation);

    /**
     * This relation connects instances of AAS with their respective types. Refer to Asset Kind for
     * further information of instance and type kinds.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
     *
     * @return Returns the Reference for the property derivedFrom.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    Reference getDerivedFrom();

    /**
     * This relation connects instances of AAS with their respective types. Refer to Asset Kind for
     * further information of instance and type kinds.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
     *
     * @param derivedFrom desired value for the property derivedFrom.
     */
    void setDerivedFrom(Reference derivedFrom);

    /**
     * Definition of the security relevant aspects of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
     *
     * @return Returns the Security for the property security.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    Security getSecurity();

    /**
     * Definition of the security relevant aspects of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
     *
     * @param security desired value for the property security.
     */
    void setSecurity(Security security);

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     *
     * @return Returns the List of References for the property submodels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    List<Reference> getSubmodels();

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     *
     * @param submodels desired value for the property submodels.
     */
    void setSubmodels(List<Reference> submodels);

    /**
     * Points to the differents views associated to the Administration Shell via the Submodels.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
     *
     * @return Returns the List of Views for the property views.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    List<View> getViews();

    /**
     * Points to the differents views associated to the Administration Shell via the Submodels.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
     *
     * @param views desired value for the property views.
     */
    void setViews(List<View> views);

}
