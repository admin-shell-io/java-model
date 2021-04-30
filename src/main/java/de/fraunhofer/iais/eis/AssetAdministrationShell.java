package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
	@JsonSubTypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell extends HasDataSpecification, Identifiable {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable labels about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable labels
	*/
	public List<TypedLiteral> getLabels();

	/**
	* This function retrieves a human readable explanatory comments about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comments
	*/
	public List<TypedLiteral> getComments();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Meta information about the asset the AAS is representing."@en
	* @return Returns the AssetInformation for the property assetInformation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
	public AssetInformation getAssetInformation();

	/**
	* "This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	* @return Returns the Reference for the property derivedFrom.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
	public Reference getDerivedFrom();

	/**
	* "Definition of the security relevant aspects of the AAS."@en
	* @return Returns the Security for the property security.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
	public Security getSecurity();

	/**
	* "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	* @return Returns the List of Submodels for the property submodels.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
	public List<Submodel> getSubmodels();

	/**
	* "Points to the differents views associated to the Administration Shell via the Submodels."@en
	* @return Returns the List of Views for the property views.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
	public List<View> getViews();

}
