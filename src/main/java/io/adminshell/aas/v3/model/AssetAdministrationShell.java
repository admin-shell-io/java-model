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
public interface AssetAdministrationShell extends HasDataSpecification, Identifiable {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Meta information about the asset the AAS is representing."@en
     * 
     * @return Returns the AssetInformation for the property assetInformation. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    public AssetInformation getAssetInformation();

    /**
     * "Meta information about the asset the AAS is representing."@en
     * 
     * @param assetInformation desired value for the property assetInformation. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     */
    public void setAssetInformation(AssetInformation assetInformation);

    /**
     * "This relation connects instances of AAS with their respective types. Refer to Asset Kind for
     * further information of instance and type kinds."@en
     * 
     * @return Returns the Reference for the property derivedFrom. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    public Reference getDerivedFrom();

    /**
     * "This relation connects instances of AAS with their respective types. Refer to Asset Kind for
     * further information of instance and type kinds."@en
     * 
     * @param derivedFrom desired value for the property derivedFrom. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
     */
    public void setDerivedFrom(Reference derivedFrom);

    /**
     * "Definition of the security relevant aspects of the AAS."@en
     * 
     * @return Returns the Security for the property security. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    public Security getSecurity();

    /**
     * "Definition of the security relevant aspects of the AAS."@en
     * 
     * @param security desired value for the property security. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
     */
    public void setSecurity(Security security);

    /**
     * "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
     * 
     * @return Returns the List of References for the property submodels. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    public List<Reference> getSubmodels();

    /**
     * "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
     * 
     * @param submodels desired value for the property submodels. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     */
    public void setSubmodels(List<Reference> submodels);

    /**
     * "Points to the differents views associated to the Administration Shell via the Submodels."@en
     * 
     * @return Returns the List of Views for the property views. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    public List<View> getViews();

    /**
     * "Points to the differents views associated to the Administration Shell via the Submodels."@en
     * 
     * @param views desired value for the property views. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
     */
    public void setViews(List<View> views);

}
