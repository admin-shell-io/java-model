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
import java.util.Objects;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AssetAdministrationShell")
public class DefaultAssetAdministrationShell implements Serializable, AssetAdministrationShell {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Asset Administration Shell", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Describes the Administration Shell for Assets, Products, Components, e.g. Machines", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has assetInformation"
	* "Meta information about the asset the AAS is representing."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation", "assetAdministrationShellAssetInformation"})
	protected AssetInformation assetAdministrationShellAssetInformation;


	/**
	* "was derived from"
	* "This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom", "assetAdministrationShellDerivedFrom"})
	protected Reference assetAdministrationShellDerivedFrom;


	/**
	* "has security"
	* "Definition of the security relevant aspects of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security", "assetAdministrationShellSecurity"})
	protected Security assetAdministrationShellSecurity;


	/**
	* "has Submodel"
	* "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel", "assetAdministrationShellSubmodel"})
	protected List<Submodel> assetAdministrationShellSubmodels;


	/**
	* "has View"
	* "Points to the differents views associated to the Administration Shell via the Submodels."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view", "assetAdministrationShellView"})
	protected List<View> assetAdministrationShellViews;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected List<Reference> hasDataSpecificationDataSpecifications;


	/**
	* "has administration"
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/administration", "identifiableAdministration"})
	protected AdministrativeInformation identifiableAdministration;


	/**
	* "has identification"
	* "The globally unique identification of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/identification", "identifiableIdentification"})
	protected Identifier identifiableIdentification;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	protected List<TypedLiteral> referableDescriptions;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	protected TypedLiteral referableDisplayName;


	/**
	* "has short id"
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "referableIdShort"})
	protected String referableIdShort;


	/**
	* "has parent"
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	protected URI referableParent;


	/**
	* "has category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	protected List<String> referableReferableCategories;


	// no manual construction
	protected DefaultAssetAdministrationShell() {
		id = VocabUtil.getInstance().createRandomUrl("assetAdministrationShell");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.assetAdministrationShellAssetInformation,
			this.assetAdministrationShellDerivedFrom,
			this.assetAdministrationShellSecurity,
			this.assetAdministrationShellSubmodels,
			this.assetAdministrationShellViews,
			this.hasDataSpecificationDataSpecifications,
			this.identifiableAdministration,
			this.identifiableIdentification,
			this.referableReferableCategories,
			this.referableDescriptions,
			this.referableDisplayName,
			this.referableIdShort,
			this.referableParent});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
			return Objects.equals(this.assetAdministrationShellAssetInformation, other.assetAdministrationShellAssetInformation) &&
				Objects.equals(this.assetAdministrationShellDerivedFrom, other.assetAdministrationShellDerivedFrom) &&
				Objects.equals(this.assetAdministrationShellSecurity, other.assetAdministrationShellSecurity) &&
				Objects.equals(this.assetAdministrationShellSubmodels, other.assetAdministrationShellSubmodels) &&
				Objects.equals(this.assetAdministrationShellViews, other.assetAdministrationShellViews) &&
				Objects.equals(this.hasDataSpecificationDataSpecifications, other.hasDataSpecificationDataSpecifications) &&
				Objects.equals(this.identifiableAdministration, other.identifiableAdministration) &&
				Objects.equals(this.identifiableIdentification, other.identifiableIdentification) &&
				Objects.equals(this.referableReferableCategories, other.referableReferableCategories) &&
				Objects.equals(this.referableDescriptions, other.referableDescriptions) &&
				Objects.equals(this.referableDisplayName, other.referableDisplayName) &&
				Objects.equals(this.referableIdShort, other.referableIdShort) &&
				Objects.equals(this.referableParent, other.referableParent);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
	final public AssetInformation getAssetAdministrationShellAssetInformation() {
		return assetAdministrationShellAssetInformation;
	}
	
	final public void setAssetAdministrationShellAssetInformation (AssetInformation assetAdministrationShellAssetInformation) {
		this.assetAdministrationShellAssetInformation = assetAdministrationShellAssetInformation;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
	final public Reference getAssetAdministrationShellDerivedFrom() {
		return assetAdministrationShellDerivedFrom;
	}
	
	final public void setAssetAdministrationShellDerivedFrom (Reference assetAdministrationShellDerivedFrom) {
		this.assetAdministrationShellDerivedFrom = assetAdministrationShellDerivedFrom;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
	final public Security getAssetAdministrationShellSecurity() {
		return assetAdministrationShellSecurity;
	}
	
	final public void setAssetAdministrationShellSecurity (Security assetAdministrationShellSecurity) {
		this.assetAdministrationShellSecurity = assetAdministrationShellSecurity;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
	final public List<Submodel> getAssetAdministrationShellSubmodels() {
		return assetAdministrationShellSubmodels;
	}
	
	final public void setAssetAdministrationShellSubmodels (List<Submodel> assetAdministrationShellSubmodels) {
		this.assetAdministrationShellSubmodels = assetAdministrationShellSubmodels;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
	final public List<View> getAssetAdministrationShellViews() {
		return assetAdministrationShellViews;
	}
	
	final public void setAssetAdministrationShellViews (List<View> assetAdministrationShellViews) {
		this.assetAdministrationShellViews = assetAdministrationShellViews;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getHasDataSpecificationDataSpecifications() {
		return hasDataSpecificationDataSpecifications;
	}
	
	final public void setHasDataSpecificationDataSpecifications (List<Reference> hasDataSpecificationDataSpecifications) {
		this.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	final public AdministrativeInformation getIdentifiableAdministration() {
		return identifiableAdministration;
	}
	
	final public void setIdentifiableAdministration (AdministrativeInformation identifiableAdministration) {
		this.identifiableAdministration = identifiableAdministration;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	final public Identifier getIdentifiableIdentification() {
		return identifiableIdentification;
	}
	
	final public void setIdentifiableIdentification (Identifier identifiableIdentification) {
		this.identifiableIdentification = identifiableIdentification;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<String> getReferableReferableCategories() {
		return referableReferableCategories;
	}
	
	final public void setReferableReferableCategories (List<String> referableReferableCategories) {
		this.referableReferableCategories = referableReferableCategories;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<TypedLiteral> getReferableDescriptions() {
		return referableDescriptions;
	}
	
	final public void setReferableDescriptions (List<TypedLiteral> referableDescriptions) {
		this.referableDescriptions = referableDescriptions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getReferableDisplayName() {
		return referableDisplayName;
	}
	
	final public void setReferableDisplayName (TypedLiteral referableDisplayName) {
		this.referableDisplayName = referableDisplayName;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getReferableIdShort() {
		return referableIdShort;
	}
	
	final public void setReferableIdShort (String referableIdShort) {
		this.referableIdShort = referableIdShort;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getReferableParent() {
		return referableParent;
	}
	
	final public void setReferableParent (URI referableParent) {
		this.referableParent = referableParent;
	}
}
