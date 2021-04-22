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
* "Submodel"
* "A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles."@en
* "Describe the different types of Data related to the I4.0 Asset"@en
* "Constraint AASd-062: The semanticId of a Submodel shall only reference a ConceptDescription with the category APPLICATION_CLASS."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Submodel")
public class DefaultSubmodel implements Serializable, Submodel {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Submodel", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles.", "en"), new TypedLiteral("Describe the different types of Data related to the I4.0 Asset", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "dataSpecification"})
	protected List<Reference> dataSpecifications;


	/**
	* "has kind"
	* "ModelingKind of the element: either type or instance."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasKind/kind", "kind"})
	protected ModelingKind kind;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "semanticId"})
	protected Reference semanticId;


	/**
	* "has administration"
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/administration", "administration"})
	protected AdministrativeInformation administration;


	/**
	* "has identification"
	* "The globally unique identification of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/identification", "identification"})
	protected Identifier identification;


	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifier"})
	protected List<Constraint> qualifiers;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "description"})
	protected List<TypedLiteral> descriptions;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "displayName"})
	protected TypedLiteral displayName;


	/**
	* "has short id"
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "idShort"})
	protected String idShort;


	/**
	* "has parent"
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "parent"})
	protected URI parent;


	/**
	* "has category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableCategory"})
	protected List<String> referableCategories;


	/**
	* "has Submodel Element"
	* "A submodel consists of zero or more submodel elements."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement", "submodelElement"})
	protected List<SubmodelElement> submodelElements;


	// no manual construction
	protected DefaultSubmodel() {
		id = VocabUtil.getInstance().createRandomUrl("submodel");
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
		return Objects.hash(new Object[]{this.submodelElements,
			this.qualifiers,
			this.dataSpecifications,
			this.administration,
			this.identification,
			this.referableCategories,
			this.descriptions,
			this.displayName,
			this.idShort,
			this.parent,
			this.kind,
			this.semanticId});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultSubmodel other = (DefaultSubmodel) obj;
			return Objects.equals(this.submodelElements, other.submodelElements) &&
				Objects.equals(this.qualifiers, other.qualifiers) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.administration, other.administration) &&
				Objects.equals(this.identification, other.identification) &&
				Objects.equals(this.referableCategories, other.referableCategories) &&
				Objects.equals(this.descriptions, other.descriptions) &&
				Objects.equals(this.displayName, other.displayName) &&
				Objects.equals(this.idShort, other.idShort) &&
				Objects.equals(this.parent, other.parent) &&
				Objects.equals(this.kind, other.kind) &&
				Objects.equals(this.semanticId, other.semanticId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
	final public List<SubmodelElement> getSubmodelElements() {
		return submodelElements;
	}
	
	final public void setSubmodelElements (List<SubmodelElement> submodelElements) {
		this.submodelElements = submodelElements;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<Constraint> getQualifiers() {
		return qualifiers;
	}
	
	final public void setQualifiers (List<Constraint> qualifiers) {
		this.qualifiers = qualifiers;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	final public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	final public AdministrativeInformation getAdministration() {
		return administration;
	}
	
	final public void setAdministration (AdministrativeInformation administration) {
		this.administration = administration;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	final public Identifier getIdentification() {
		return identification;
	}
	
	final public void setIdentification (Identifier identification) {
		this.identification = identification;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<String> getReferableCategories() {
		return referableCategories;
	}
	
	final public void setReferableCategories (List<String> referableCategories) {
		this.referableCategories = referableCategories;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<TypedLiteral> getDescriptions() {
		return descriptions;
	}
	
	final public void setDescriptions (List<TypedLiteral> descriptions) {
		this.descriptions = descriptions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getDisplayName() {
		return displayName;
	}
	
	final public void setDisplayName (TypedLiteral displayName) {
		this.displayName = displayName;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getIdShort() {
		return idShort;
	}
	
	final public void setIdShort (String idShort) {
		this.idShort = idShort;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getParent() {
		return parent;
	}
	
	final public void setParent (URI parent) {
		this.parent = parent;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getKind() {
		return kind;
	}
	
	final public void setKind (ModelingKind kind) {
		this.kind = kind;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}
	
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
