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
* "Submodel"
* "A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles."@en
* "Describe the different types of Data related to the I4.0 Asset"@en
* "Constraint AASd-062: The semanticId of a Submodel shall only reference a ConceptDescription with the category APPLICATION_CLASS."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Submodel")
public class SubmodelImpl implements Serializable, ISubmodel {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Submodel", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles.", "en"), new TypedLiteral("Describe the different types of Data related to the I4.0 Asset", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected ArrayList<? extends IReference> _hasDataSpecificationDataSpecification;


	/**
	* "has kind"
	* "ModelingKind of the element: either type or instance."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasKind/kind", "hasKindKind"})
	protected ModelingKind _hasKindKind;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected IReference _hasSemanticsSemanticId;


	/**
	* "has administration"
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/administration", "identifiableAdministration"})
	protected IAdministrativeInformation _identifiableAdministration;


	/**
	* "has identification"
	* "The globally unique identification of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/identification", "identifiableIdentification"})
	protected IIdentifier _identifiableIdentification;


	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifiableQualifier"})
	protected ArrayList<? extends IConstraint> _qualifiableQualifier;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	protected ArrayList<? extends TypedLiteral> _referableDescription;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	protected TypedLiteral _referableDisplayName;


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
	protected String _referableIdShort;


	/**
	* "has parent"
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	protected URI _referableParent;


	/**
	* "has category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	protected ArrayList<? extends String> _referableReferableCategory;


	/**
	* "has Submodel Element"
	* "A submodel consists of zero or more submodel elements."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement", "submodelSubmodelElement"})
	protected ArrayList<? extends ISubmodelElement> _submodelSubmodelElement;


	// no manual construction
	protected SubmodelImpl() {
		id = VocabUtil.getInstance().createRandomUrl("submodel");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
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
	* "A submodel consists of zero or more submodel elements."@en
	* @return Returns the List of ISubmodelElement for the property submodelSubmodelElement.
	* More information under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
	final public List<? extends ISubmodelElement> getSubmodelSubmodelElement() {
		return _submodelSubmodelElement;
	}

	
	/**
	* "A submodel consists of zero or more submodel elements."@en
	* @param _submodelSubmodelElement_ desired value for the property submodelSubmodelElement.
	* More information under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
	*/
	final public void setSubmodelSubmodelElement (ArrayList<? extends ISubmodelElement> _submodelSubmodelElement_) {
		this._submodelSubmodelElement = _submodelSubmodelElement_;
	}

	/**
	* "Additional qualification of a qualifiable element."@en
	* @return Returns the List of IConstraint for the property qualifiableQualifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<? extends IConstraint> getQualifiableQualifier() {
		return _qualifiableQualifier;
	}

	
	/**
	* "Additional qualification of a qualifiable element."@en
	* @param _qualifiableQualifier_ desired value for the property qualifiableQualifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
	*/
	final public void setQualifiableQualifier (ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this._qualifiableQualifier = _qualifiableQualifier_;
	}

	/**
	* "Global reference to the data specification template used by the element."@en
	* @return Returns the List of IReference for the property hasDataSpecificationDataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<? extends IReference> getHasDataSpecificationDataSpecification() {
		return _hasDataSpecificationDataSpecification;
	}

	
	/**
	* "Global reference to the data specification template used by the element."@en
	* @param _hasDataSpecificationDataSpecification_ desired value for the property hasDataSpecificationDataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	final public void setHasDataSpecificationDataSpecification (ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
	}

	/**
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	* @return Returns the IAdministrativeInformation for the property identifiableAdministration.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	final public IAdministrativeInformation getIdentifiableAdministration() {
		return _identifiableAdministration;
	}

	
	/**
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	* @param _identifiableAdministration_ desired value for the property identifiableAdministration.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
	*/
	final public void setIdentifiableAdministration (IAdministrativeInformation _identifiableAdministration_) {
		this._identifiableAdministration = _identifiableAdministration_;
	}

	/**
	* "The globally unique identification of the element."@en
	* @return Returns the IIdentifier for the property identifiableIdentification.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	final public IIdentifier getIdentifiableIdentification() {
		return _identifiableIdentification;
	}

	
	/**
	* "The globally unique identification of the element."@en
	* @param _identifiableIdentification_ desired value for the property identifiableIdentification.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
	*/
	final public void setIdentifiableIdentification (IIdentifier _identifiableIdentification_) {
		this._identifiableIdentification = _identifiableIdentification_;
	}

	/**
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	* @return Returns the List of String for the property referableReferableCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<? extends String> getReferableReferableCategory() {
		return _referableReferableCategory;
	}

	
	/**
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	* @param _referableReferableCategory_ desired value for the property referableReferableCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory
	*/
	final public void setReferableReferableCategory (ArrayList<? extends String> _referableReferableCategory_) {
		this._referableReferableCategory = _referableReferableCategory_;
	}

	/**
	* "Description or comments on the element. The description can be provided in several languages."@en
	* @return Returns the List of TypedLiteral for the property referableDescription.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<? extends TypedLiteral> getReferableDescription() {
		return _referableDescription;
	}

	
	/**
	* "Description or comments on the element. The description can be provided in several languages."@en
	* @param _referableDescription_ desired value for the property referableDescription.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
	*/
	final public void setReferableDescription (ArrayList<? extends TypedLiteral> _referableDescription_) {
		this._referableDescription = _referableDescription_;
	}

	/**
	* "Display name. Can be provided in several languages."@en
	* @return Returns the TypedLiteral for the property referableDisplayName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getReferableDisplayName() {
		return _referableDisplayName;
	}

	
	/**
	* "Display name. Can be provided in several languages."@en
	* @param _referableDisplayName_ desired value for the property referableDisplayName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
	*/
	final public void setReferableDisplayName (TypedLiteral _referableDisplayName_) {
		this._referableDisplayName = _referableDisplayName_;
	}

	/**
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	* @return Returns the String for the property referableIdShort.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getReferableIdShort() {
		return _referableIdShort;
	}

	
	/**
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	* @param _referableIdShort_ desired value for the property referableIdShort.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
	*/
	final public void setReferableIdShort (String _referableIdShort_) {
		this._referableIdShort = _referableIdShort_;
	}

	/**
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	* @return Returns the URI for the property referableParent.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/parent
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getReferableParent() {
		return _referableParent;
	}

	
	/**
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	* @param _referableParent_ desired value for the property referableParent.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/parent
	*/
	final public void setReferableParent (URI _referableParent_) {
		this._referableParent = _referableParent_;
	}

	/**
	* "ModelingKind of the element: either type or instance."@en
	* @return Returns the ModelingKind for the property hasKindKind.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getHasKindKind() {
		return _hasKindKind;
	}

	
	/**
	* "ModelingKind of the element: either type or instance."@en
	* @param _hasKindKind_ desired value for the property hasKindKind.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
	*/
	final public void setHasKindKind (ModelingKind _hasKindKind_) {
		this._hasKindKind = _hasKindKind_;
	}

	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @return Returns the IReference for the property hasSemanticsSemanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public IReference getHasSemanticsSemanticId() {
		return _hasSemanticsSemanticId;
	}

	
	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @param _hasSemanticsSemanticId_ desired value for the property hasSemanticsSemanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	final public void setHasSemanticsSemanticId (IReference _hasSemanticsSemanticId_) {
		this._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
	}
}
