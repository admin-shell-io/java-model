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
* "Annotated Relationship Element"
* "An annotated relationship element is an relationship element that can be annotated with additional data elements."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AnnotatedRelationshipElement")
public class AnnotatedRelationshipElementImpl implements Serializable, IAnnotatedRelationshipElement {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Annotated Relationship Element", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("An annotated relationship element is an relationship element that can be annotated with additional data elements.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has annotation"
	* "Annotations that hold for the relationships between the two elements."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation", "annotatedRelationshipElementAnnotation"})
	protected ArrayList<? extends IDataElement> _annotatedRelationshipElementAnnotation;


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
	* "has first relationship"
	* "First element in the relationship taking the role of the subject."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first", "relationshipElementFirst"})
	protected IReferable _relationshipElementFirst;


	/**
	* "has second relationship"
	* "Second element in the relationship taking the role of the object."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second", "relationshipElementSecond"})
	protected IReferable _relationshipElementSecond;


	// no manual construction
	protected AnnotatedRelationshipElementImpl() {
		id = VocabUtil.getInstance().createRandomUrl("annotatedRelationshipElement");
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
	* "Annotations that hold for the relationships between the two elements."@en
	* @return Returns the List of IDataElement for the property annotatedRelationshipElementAnnotation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation")
	final public List<? extends IDataElement> getAnnotatedRelationshipElementAnnotation() {
		return _annotatedRelationshipElementAnnotation;
	}

	
	/**
	* "Annotations that hold for the relationships between the two elements."@en
	* @param _annotatedRelationshipElementAnnotation_ desired value for the property annotatedRelationshipElementAnnotation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation
	*/
	final public void setAnnotatedRelationshipElementAnnotation (ArrayList<? extends IDataElement> _annotatedRelationshipElementAnnotation_) {
		this._annotatedRelationshipElementAnnotation = _annotatedRelationshipElementAnnotation_;
	}

	/**
	* "First element in the relationship taking the role of the subject."@en
	* @return Returns the IReferable for the property relationshipElementFirst.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
	final public IReferable getRelationshipElementFirst() {
		return _relationshipElementFirst;
	}

	
	/**
	* "First element in the relationship taking the role of the subject."@en
	* @param _relationshipElementFirst_ desired value for the property relationshipElementFirst.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
	*/
	final public void setRelationshipElementFirst (IReferable _relationshipElementFirst_) {
		this._relationshipElementFirst = _relationshipElementFirst_;
	}

	/**
	* "Second element in the relationship taking the role of the object."@en
	* @return Returns the IReferable for the property relationshipElementSecond.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
	final public IReferable getRelationshipElementSecond() {
		return _relationshipElementSecond;
	}

	
	/**
	* "Second element in the relationship taking the role of the object."@en
	* @param _relationshipElementSecond_ desired value for the property relationshipElementSecond.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
	*/
	final public void setRelationshipElementSecond (IReferable _relationshipElementSecond_) {
		this._relationshipElementSecond = _relationshipElementSecond_;
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
