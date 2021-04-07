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
	"Concept Description"

	"The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template)."@en

	"Constraint AASd-051: A ConceptDescription shall have one of the following categories: VALUE, PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP, COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW. Default: PROPERTY."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:ConceptDescription")
public class ConceptDescriptionImpl implements Serializable, IConceptDescription {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Concept Description", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template).", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	"has content"

	"Link from a ConceptDescription to its explaining DataSpecificationContent."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content", "conceptDescriptionContent"})
	protected ArrayList<? extends IDataSpecificationContent> _conceptDescriptionContent;


	/**
	"is case of"

	"Reference to an external definition the concept is compatible to or was derived from."@en

	"Compare to is-case-of relationship in ISO 13584-32 and IEC EN 61360."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf", "conceptDescriptionIsCaseOf"})
	protected ArrayList<? extends IReference> _conceptDescriptionIsCaseOf;


	/**
	"has Data Specification"

	"Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected ArrayList<? extends IReference> _hasDataSpecificationDataSpecification;


	/**
	"has administration"

	"Administrative information of an identifiable element."@en

	"Some of the administrative information like the version number might need to be part of the identification."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/administration", "identifiableAdministration"})
	protected IAdministrativeInformation _identifiableAdministration;


	/**
	"has identification"

	"The globally unique identification of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/identification", "identifiableIdentification"})
	protected IIdentifier _identifiableIdentification;


	/**
	"has description"

	"Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	protected ArrayList<? extends TypedLiteral> _referableDescription;


	/**
	"has display name"

	"Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	protected TypedLiteral _referableDisplayName;


	/**
	"has short id"

	"Identifying string of the element within its name space."@en

	"Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en

	"Constraint AASd-003: idShort shall be matched case-insensitive."@en

	"Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en

	"Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en

	"Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "referableIdShort"})
	protected String _referableIdShort;


	/**
	"has parent"

	"Reference to the next referable parent element of the element."@en

	"Constraint AASd-004: Add parent in case of non-identifiable elements."@en

	"This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	protected URI _referableParent;


	/**
	"has category"

	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	protected ArrayList<? extends String> _referableReferableCategory;


	// no manual construction
	protected ConceptDescriptionImpl() {
		id = VocabUtil.getInstance().createRandomUrl("conceptDescription");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	public List<TypedLiteral> getComment() {
		return this.comment;
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


	// accessor method implementations as derived from the Asset Administration Shell ontology

	/**
	"Link from a ConceptDescription to its explaining DataSpecificationContent."@en
	@return the List of conceptDescriptionContent
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content")
	final public List<? extends IDataSpecificationContent> getConceptDescriptionContent() {
		return _conceptDescriptionContent;
	}

	final public void setConceptDescriptionContent (ArrayList<? extends IDataSpecificationContent> _conceptDescriptionContent_) {
		this._conceptDescriptionContent = _conceptDescriptionContent_;
	}

	/**
	"Reference to an external definition the concept is compatible to or was derived from."@en

	"Compare to is-case-of relationship in ISO 13584-32 and IEC EN 61360."@en
	@return the List of conceptDescriptionIsCaseOf
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
	final public List<? extends IReference> getConceptDescriptionIsCaseOf() {
		return _conceptDescriptionIsCaseOf;
	}

	final public void setConceptDescriptionIsCaseOf (ArrayList<? extends IReference> _conceptDescriptionIsCaseOf_) {
		this._conceptDescriptionIsCaseOf = _conceptDescriptionIsCaseOf_;
	}

	/**
	"Global reference to the data specification template used by the element."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<? extends IReference> getHasDataSpecificationDataSpecification() {
		return _hasDataSpecificationDataSpecification;
	}

	final public void setHasDataSpecificationDataSpecification (ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
	}

	/**
	"Administrative information of an identifiable element."@en

	"Some of the administrative information like the version number might need to be part of the identification."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	final public IAdministrativeInformation getIdentifiableAdministration() {
		return _identifiableAdministration;
	}

	final public void setIdentifiableAdministration (IAdministrativeInformation _identifiableAdministration_) {
		this._identifiableAdministration = _identifiableAdministration_;
	}

	/**
	"The globally unique identification of the element."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	final public IIdentifier getIdentifiableIdentification() {
		return _identifiableIdentification;
	}

	final public void setIdentifiableIdentification (IIdentifier _identifiableIdentification_) {
		this._identifiableIdentification = _identifiableIdentification_;
	}

	/**
	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<? extends String> getReferableReferableCategory() {
		return _referableReferableCategory;
	}

	final public void setReferableReferableCategory (ArrayList<? extends String> _referableReferableCategory_) {
		this._referableReferableCategory = _referableReferableCategory_;
	}

	/**
	"Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<? extends TypedLiteral> getReferableDescription() {
		return _referableDescription;
	}

	final public void setReferableDescription (ArrayList<? extends TypedLiteral> _referableDescription_) {
		this._referableDescription = _referableDescription_;
	}

	/**
	"Display name. Can be provided in several languages."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getReferableDisplayName() {
		return _referableDisplayName;
	}

	final public void setReferableDisplayName (TypedLiteral _referableDisplayName_) {
		this._referableDisplayName = _referableDisplayName_;
	}

	/**
	"Identifying string of the element within its name space."@en

	"Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en

	"Constraint AASd-003: idShort shall be matched case-insensitive."@en

	"Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en

	"Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en

	"Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getReferableIdShort() {
		return _referableIdShort;
	}

	final public void setReferableIdShort (String _referableIdShort_) {
		this._referableIdShort = _referableIdShort_;
	}

	/**
	"Reference to the next referable parent element of the element."@en

	"Constraint AASd-004: Add parent in case of non-identifiable elements."@en

	"This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getReferableParent() {
		return _referableParent;
	}

	final public void setReferableParent (URI _referableParent_) {
		this._referableParent = _referableParent_;
	}
}
