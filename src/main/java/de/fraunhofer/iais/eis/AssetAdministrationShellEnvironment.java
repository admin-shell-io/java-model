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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
* "Asset Administration Shell Environment"
* "A graph of Asset Administration Shells."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAssetAdministrationShellEnvironment.class)
})
public interface AssetAdministrationShellEnvironment extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Points to the differents Administration Shells in one AssetAdministrationShellEnvironment graph."@en
	* @return Returns the List of AssetAdministrationShells for the property assetAdministrationShells.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
	public List<AssetAdministrationShell> getAssetAdministrationShells();

	/**
	* "Points to the differents Assets in one AssetAdministrationShellEnvironment graph."@en
	* @return Returns the List of Assets for the property assets.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
	public List<Asset> getAssets();

	/**
	* "Points to the differents Concept Descriptions in one AssetAdministrationShellEnvironment graph."@en
	* @return Returns the List of ConceptDescriptions for the property conceptDescriptions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
	public List<ConceptDescription> getConceptDescriptions();

	/**
	* "Points to the differents Submodels in one AssetAdministrationShellEnvironment graph."@en
	* @return Returns the List of Submodels for the property submodels.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
	public List<Submodel> getSubmodels();

}
