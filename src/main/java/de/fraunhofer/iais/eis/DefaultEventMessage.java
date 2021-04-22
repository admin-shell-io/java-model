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
* "Event Message"
* "Defines the necessary information of an event instance sent out or received."@en
* "non-normative, just only for discussion (as of November 2019)."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:EventMessage")
public class DefaultEventMessage implements Serializable, EventMessage {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Event Message", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Defines the necessary information of an event instance sent out or received.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected List<Reference> hasDataSpecificationDataSpecifications;


	/**
	* "has kind"
	* "ModelingKind of the element: either type or instance."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasKind/kind", "hasKindKind"})
	protected ModelingKind hasKindKind;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected Reference hasSemanticsSemanticId;


	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifiableQualifier"})
	protected List<Constraint> qualifiableQualifiers;


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
	protected DefaultEventMessage() {
		id = VocabUtil.getInstance().createRandomUrl("eventMessage");
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
		return Objects.hash(new Object[]{this.referableReferableCategories,
			this.referableDescriptions,
			this.referableDisplayName,
			this.referableIdShort,
			this.referableParent,
			this.qualifiableQualifiers,
			this.hasDataSpecificationDataSpecifications,
			this.hasKindKind,
			this.hasSemanticsSemanticId});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultEventMessage other = (DefaultEventMessage) obj;
			return Objects.equals(this.referableReferableCategories, other.referableReferableCategories) &&
				Objects.equals(this.referableDescriptions, other.referableDescriptions) &&
				Objects.equals(this.referableDisplayName, other.referableDisplayName) &&
				Objects.equals(this.referableIdShort, other.referableIdShort) &&
				Objects.equals(this.referableParent, other.referableParent) &&
				Objects.equals(this.qualifiableQualifiers, other.qualifiableQualifiers) &&
				Objects.equals(this.hasDataSpecificationDataSpecifications, other.hasDataSpecificationDataSpecifications) &&
				Objects.equals(this.hasKindKind, other.hasKindKind) &&
				Objects.equals(this.hasSemanticsSemanticId, other.hasSemanticsSemanticId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology




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

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<Constraint> getQualifiableQualifiers() {
		return qualifiableQualifiers;
	}
	
	final public void setQualifiableQualifiers (List<Constraint> qualifiableQualifiers) {
		this.qualifiableQualifiers = qualifiableQualifiers;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getHasDataSpecificationDataSpecifications() {
		return hasDataSpecificationDataSpecifications;
	}
	
	final public void setHasDataSpecificationDataSpecifications (List<Reference> hasDataSpecificationDataSpecifications) {
		this.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getHasKindKind() {
		return hasKindKind;
	}
	
	final public void setHasKindKind (ModelingKind hasKindKind) {
		this.hasKindKind = hasKindKind;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getHasSemanticsSemanticId() {
		return hasSemanticsSemanticId;
	}
	
	final public void setHasSemanticsSemanticId (Reference hasSemanticsSemanticId) {
		this.hasSemanticsSemanticId = hasSemanticsSemanticId;
	}
}
