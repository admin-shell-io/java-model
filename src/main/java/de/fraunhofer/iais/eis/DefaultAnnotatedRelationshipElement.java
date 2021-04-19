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
* "Annotated Relationship Element"
* "An annotated relationship element is an relationship element that can be annotated with additional data elements."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AnnotatedRelationshipElement")
public class DefaultAnnotatedRelationshipElement implements Serializable, AnnotatedRelationshipElement {

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
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation", "annotation"})
	protected List<DataElement> annotation;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "dataSpecification"})
	protected List<Reference> dataSpecification;


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
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifier"})
	protected List<Constraint> qualifier;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "description"})
	protected List<TypedLiteral> description;


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
	protected List<String> referableCategory;


	/**
	* "has first relationship"
	* "First element in the relationship taking the role of the subject."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first", "first"})
	protected Referable first;


	/**
	* "has second relationship"
	* "Second element in the relationship taking the role of the object."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second", "second"})
	protected Referable second;


	// no manual construction
	protected DefaultAnnotatedRelationshipElement() {
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

	/**
	* This function returns a hash code value for the AnnotatedRelationshipElement for the benefit of e.g. hash tables.
	* @return a hash code value for the AnnotatedRelationshipElement
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.annotation});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this AnnotatedRelationshipElement is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAnnotatedRelationshipElement other = (DefaultAnnotatedRelationshipElement) obj;
			return super.equals(other) && Objects.equals(this.annotation, other.annotation);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Annotations that hold for the relationships between the two elements."@en
	* @return Returns the List of DataElement for the property annotation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation")
	final public List<DataElement> getAnnotation() {
		return annotation;
	}

	
	/**
	* "Annotations that hold for the relationships between the two elements."@en
	* @param annotation desired value for the property annotation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation
	*/
	final public void setAnnotation (List<DataElement> annotation) {
		this.annotation = annotation;
	}

	/**
	* "First element in the relationship taking the role of the subject."@en
	* @return Returns the Referable for the property first.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
	final public Referable getFirst() {
		return first;
	}

	
	/**
	* "First element in the relationship taking the role of the subject."@en
	* @param first desired value for the property first.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
	*/
	final public void setFirst (Referable first) {
		this.first = first;
	}

	/**
	* "Second element in the relationship taking the role of the object."@en
	* @return Returns the Referable for the property second.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
	final public Referable getSecond() {
		return second;
	}

	
	/**
	* "Second element in the relationship taking the role of the object."@en
	* @param second desired value for the property second.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
	*/
	final public void setSecond (Referable second) {
		this.second = second;
	}


	/**
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	* @return Returns the List of String for the property referableCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<String> getReferableCategory() {
		return referableCategory;
	}

	
	/**
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	* @param referableCategory desired value for the property referableCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory
	*/
	final public void setReferableCategory (List<String> referableCategory) {
		this.referableCategory = referableCategory;
	}

	/**
	* "Description or comments on the element. The description can be provided in several languages."@en
	* @return Returns the List of TypedLiteral for the property description.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<TypedLiteral> getDescription() {
		return description;
	}

	
	/**
	* "Description or comments on the element. The description can be provided in several languages."@en
	* @param description desired value for the property description.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
	*/
	final public void setDescription (List<TypedLiteral> description) {
		this.description = description;
	}

	/**
	* "Display name. Can be provided in several languages."@en
	* @return Returns the TypedLiteral for the property displayName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getDisplayName() {
		return displayName;
	}

	
	/**
	* "Display name. Can be provided in several languages."@en
	* @param displayName desired value for the property displayName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
	*/
	final public void setDisplayName (TypedLiteral displayName) {
		this.displayName = displayName;
	}

	/**
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	* @return Returns the String for the property idShort.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getIdShort() {
		return idShort;
	}

	
	/**
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	* @param idShort desired value for the property idShort.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
	*/
	final public void setIdShort (String idShort) {
		this.idShort = idShort;
	}

	/**
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	* @return Returns the URI for the property parent.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/parent
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getParent() {
		return parent;
	}

	
	/**
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	* @param parent desired value for the property parent.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/parent
	*/
	final public void setParent (URI parent) {
		this.parent = parent;
	}

	/**
	* "Additional qualification of a qualifiable element."@en
	* @return Returns the List of Constraint for the property qualifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<Constraint> getQualifier() {
		return qualifier;
	}

	
	/**
	* "Additional qualification of a qualifiable element."@en
	* @param qualifier desired value for the property qualifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
	*/
	final public void setQualifier (List<Constraint> qualifier) {
		this.qualifier = qualifier;
	}

	/**
	* "Global reference to the data specification template used by the element."@en
	* @return Returns the List of Reference for the property dataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getDataSpecification() {
		return dataSpecification;
	}

	
	/**
	* "Global reference to the data specification template used by the element."@en
	* @param dataSpecification desired value for the property dataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	final public void setDataSpecification (List<Reference> dataSpecification) {
		this.dataSpecification = dataSpecification;
	}

	/**
	* "ModelingKind of the element: either type or instance."@en
	* @return Returns the ModelingKind for the property kind.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getKind() {
		return kind;
	}

	
	/**
	* "ModelingKind of the element: either type or instance."@en
	* @param kind desired value for the property kind.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
	*/
	final public void setKind (ModelingKind kind) {
		this.kind = kind;
	}

	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @return Returns the Reference for the property semanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}

	
	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @param semanticId desired value for the property semanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
