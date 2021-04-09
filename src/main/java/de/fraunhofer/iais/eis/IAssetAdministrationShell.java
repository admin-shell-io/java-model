package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "Asset Administration Shell"
* "Describes the Administration Shell for Assets, Products, Components, e.g. Machines"@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = AssetAdministrationShellImpl.class)
})
public interface IAssetAdministrationShell extends IHasDataSpecification, IIdentifiable {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Meta information about the asset the AAS is representing."@en
	* @return Returns the IAssetInformation for the property assetAdministrationShellAssetInformation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
	public IAssetInformation getAssetAdministrationShellAssetInformation();

	/**
	* "This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	* @return Returns the IReference for the property assetAdministrationShellDerivedFrom.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
	public IReference getAssetAdministrationShellDerivedFrom();

	/**
	* "Definition of the security relevant aspects of the AAS."@en
	* @return Returns the ISecurity for the property assetAdministrationShellSecurity.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
	public ISecurity getAssetAdministrationShellSecurity();

	/**
	* "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	* @return Returns the List of ISubmodel for the property assetAdministrationShellSubmodel.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
	public List<? extends ISubmodel> getAssetAdministrationShellSubmodel();

	/**
	* "Points to the differents views associated to the Administration Shell via the Submodels."@en
	* @return Returns the List of IView for the property assetAdministrationShellView.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
	public List<? extends IView> getAssetAdministrationShellView();

}
