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
* "Concept Description"
* "The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template)."@en
* "Constraint AASd-051: A ConceptDescription shall have one of the following categories: VALUE, PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP, COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW. Default: PROPERTY."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:ConceptDescription")
public class DefaultConceptDescription implements Serializable, ConceptDescription {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Concept Description", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template).", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has content"
	* "Link from a ConceptDescription to its explaining DataSpecificationContent."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content", "conceptDescriptionContent"})
	protected List<DataSpecificationContent> conceptDescriptionContents;


	/**
	* "is case of"
	* "Reference to an external definition the concept is compatible to or was derived from."@en
	* "Compare to is-case-of relationship in ISO 13584-32 and IEC EN 61360."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf", "conceptDescriptionIsCaseOf"})
	protected List<Reference> conceptDescriptionIsCaseOfs;


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
	protected DefaultConceptDescription() {
		id = VocabUtil.getInstance().createRandomUrl("conceptDescription");
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

	public int hashCode() {
		return Objects.hash(new Object[]{this.conceptDescriptionContents,
			this.conceptDescriptionIsCaseOfs,
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
			DefaultConceptDescription other = (DefaultConceptDescription) obj;
			return Objects.equals(this.conceptDescriptionContents, other.conceptDescriptionContents) &&
				Objects.equals(this.conceptDescriptionIsCaseOfs, other.conceptDescriptionIsCaseOfs) &&
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


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content")
	final public List<DataSpecificationContent> getConceptDescriptionContents() {
		return conceptDescriptionContents;
	}
	
	final public void setConceptDescriptionContents (List<DataSpecificationContent> conceptDescriptionContents) {
		this.conceptDescriptionContents = conceptDescriptionContents;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
	final public List<Reference> getConceptDescriptionIsCaseOfs() {
		return conceptDescriptionIsCaseOfs;
	}
	
	final public void setConceptDescriptionIsCaseOfs (List<Reference> conceptDescriptionIsCaseOfs) {
		this.conceptDescriptionIsCaseOfs = conceptDescriptionIsCaseOfs;
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
