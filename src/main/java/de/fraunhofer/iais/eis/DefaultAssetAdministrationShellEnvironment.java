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

public class DefaultAssetAdministrationShellEnvironment implements AssetAdministrationShellEnvironment {

	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Asset Administration Shell Environment", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("A graph of Asset Administration Shells.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Asset Administration Shells"
	* "Points to the differents Administration Shells in one AssetAdministrationShellEnvironment graph."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
	protected List<AssetAdministrationShell> assetAdministrationShells;


	/**
	* "has Assets"
	* "Points to the differents Assets in one AssetAdministrationShellEnvironment graph."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
	protected List<Asset> assets;


	/**
	* "has Concept Descriptions"
	* "Points to the differents Concept Descriptions in one AssetAdministrationShellEnvironment graph."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
	protected List<ConceptDescription> conceptDescriptions;


	/**
	* "has submodels"
	* "Points to the differents Submodels in one AssetAdministrationShellEnvironment graph."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
	protected List<Submodel> submodels;


	// no manual construction
	protected DefaultAssetAdministrationShellEnvironment() {
		id = VocabUtil.getInstance().createRandomUrl("assetAdministrationShellEnvironment");
	}

	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.assetAdministrationShells,
			this.assets,
			this.conceptDescriptions,
			this.submodels});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAssetAdministrationShellEnvironment other = (DefaultAssetAdministrationShellEnvironment) obj;
			return Objects.equals(this.assetAdministrationShells, other.assetAdministrationShells) &&
				Objects.equals(this.assets, other.assets) &&
				Objects.equals(this.conceptDescriptions, other.conceptDescriptions) &&
				Objects.equals(this.submodels, other.submodels);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
	final public List<AssetAdministrationShell> getAssetAdministrationShells() {
		return assetAdministrationShells;
	}
	
	final public void setAssetAdministrationShells (List<AssetAdministrationShell> assetAdministrationShells) {
		this.assetAdministrationShells = assetAdministrationShells;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
	final public List<Asset> getAssets() {
		return assets;
	}
	
	final public void setAssets (List<Asset> assets) {
		this.assets = assets;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
	final public List<ConceptDescription> getConceptDescriptions() {
		return conceptDescriptions;
	}
	
	final public void setConceptDescriptions (List<ConceptDescription> conceptDescriptions) {
		this.conceptDescriptions = conceptDescriptions;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
	final public List<Submodel> getSubmodels() {
		return submodels;
	}
	
	final public void setSubmodels (List<Submodel> submodels) {
		this.submodels = submodels;
	}
}
