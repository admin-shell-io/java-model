package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"Concept Description"

	"The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template)."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:ConceptDescription")
public class ConceptDescriptionImpl implements Serializable, ConceptDescription {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Concept Description", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template).", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has content"

	"Link from a ConceptDescription to its explaining DataSpecificationContent."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content", "conceptDescriptionContent"})
	 java.util.ArrayList<? extends DataSpecificationContent> _conceptDescriptionContent;


	/**
	"is case of"

	"Reference to an external definition the concept is compatible to or was derived from."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf", "conceptDescriptionIsCaseOf"})
	 java.util.ArrayList<? extends Reference> _conceptDescriptionIsCaseOf;


	/**
	"has Data Specification"

	"Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	 java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification;


	/**
	"has administration"

	"Administrative information of an identifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/administration", "identifiableAdministration"})
	 AdministrativeInformation _identifiableAdministration;


	/**
	"has identification"

	"The globally unique identification of the element."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/identification", "identifiableIdentification"})
	 Identifier _identifiableIdentification;


	/**
	"has description"

	"Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription;


	/**
	"has display name"

	"Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	 de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName;


	/**
	"has short id"

	"Identifying string of the element within its name space."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "referableIdShort"})
	 String _referableIdShort;


	/**
	"has parent"

	"Reference to the next referable parent element of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	 URI _referableParent;


	/**
	"has category"

	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	 java.util.ArrayList<? extends String> _referableReferableCategory;


	// no manual construction
	ConceptDescriptionImpl() {
		id = VocabUtil.getInstance().createRandomUrl("conceptDescription");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content")
	java.util.ArrayList<? extends DataSpecificationContent> getConceptDescriptionContent() {
		return _conceptDescriptionContent;
	}

	final public void setConceptDescriptionContent (java.util.ArrayList<? extends DataSpecificationContent> _conceptDescriptionContent_) {
		this._conceptDescriptionContent = _conceptDescriptionContent_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
	java.util.ArrayList<? extends Reference> getConceptDescriptionIsCaseOf() {
		return _conceptDescriptionIsCaseOf;
	}

	final public void setConceptDescriptionIsCaseOf (java.util.ArrayList<? extends Reference> _conceptDescriptionIsCaseOf_) {
		this._conceptDescriptionIsCaseOf = _conceptDescriptionIsCaseOf_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	java.util.ArrayList<? extends Reference> getHasDataSpecificationDataSpecification() {
		return _hasDataSpecificationDataSpecification;
	}

	final public void setHasDataSpecificationDataSpecification (java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	AdministrativeInformation getIdentifiableAdministration() {
		return _identifiableAdministration;
	}

	final public void setIdentifiableAdministration (AdministrativeInformation _identifiableAdministration_) {
		this._identifiableAdministration = _identifiableAdministration_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	Identifier getIdentifiableIdentification() {
		return _identifiableIdentification;
	}

	final public void setIdentifiableIdentification (Identifier _identifiableIdentification_) {
		this._identifiableIdentification = _identifiableIdentification_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	java.util.ArrayList<? extends String> getReferableReferableCategory() {
		return _referableReferableCategory;
	}

	final public void setReferableReferableCategory (java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this._referableReferableCategory = _referableReferableCategory_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getReferableDescription() {
		return _referableDescription;
	}

	final public void setReferableDescription (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this._referableDescription = _referableDescription_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	de.fraunhofer.iais.eis.util.TypedLiteral getReferableDisplayName() {
		return _referableDisplayName;
	}

	final public void setReferableDisplayName (de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this._referableDisplayName = _referableDisplayName_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	String getReferableIdShort() {
		return _referableIdShort;
	}

	final public void setReferableIdShort (String _referableIdShort_) {
		this._referableIdShort = _referableIdShort_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	URI getReferableParent() {
		return _referableParent;
	}

	final public void setReferableParent (URI _referableParent_) {
		this._referableParent = _referableParent_;
	}
}
