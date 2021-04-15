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
* "Extensions"
* "Single extension of an element."@en
* "Constraint AASd-077: The name of an extension within HasExtensions needs to be unique."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Extension")
public class DefaultExtension implements Serializable, Extension {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Extensions", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Single extension of an element.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has extension name"
	* "An extension of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/name", "name"})
	protected String name;


	/**
	* "has extension reference to"
	* "Reference to an element the extension refers to."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/refersTo", "refersTo"})
	protected Reference refersTo;


	/**
	* "has extension value"
	* "Value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/value", "value"})
	protected String value;


	/**
	* "has extension value type"
	* "Type of the value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/valueType", "valueType"})
	protected String valueType;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "semanticId"})
	protected Reference semanticId;


	// no manual construction
	protected DefaultExtension() {
		id = VocabUtil.getInstance().createRandomUrl("extension");
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
	* This function returns a hash code value for the Extension for the benefit of e.g. hash tables.
	* @return a hash code value for the Extension
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.name, this.valueType, this.value, this.refersTo});
	}

	/**
	* This function indicates wheather some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Extension is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultExtension other = (DefaultExtension) obj;
			return super.equals(other) && Objects.equals(this.name, other.name) && Objects.equals(this.valueType, other.valueType) && Objects.equals(this.value, other.value) && Objects.equals(this.refersTo, other.refersTo);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "An extension of the element."@en
	* @return Returns the String for the property name.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/name
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
	final public String getName() {
		return name;
	}

	
	/**
	* "An extension of the element."@en
	* @param name desired value for the property name.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/name
	*/
	final public void setName (String name) {
		this.name = name;
	}

	/**
	* "Type of the value of the extension."@en
	* @return Returns the String for the property valueType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
	final public String getValueType() {
		return valueType;
	}

	
	/**
	* "Type of the value of the extension."@en
	* @param valueType desired value for the property valueType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
	*/
	final public void setValueType (String valueType) {
		this.valueType = valueType;
	}

	/**
	* "Value of the extension."@en
	* @return Returns the String for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
	final public String getValue() {
		return value;
	}

	
	/**
	* "Value of the extension."@en
	* @param value desired value for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
	*/
	final public void setValue (String value) {
		this.value = value;
	}

	/**
	* "Reference to an element the extension refers to."@en
	* @return Returns the Reference for the property refersTo.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
	final public Reference getRefersTo() {
		return refersTo;
	}

	
	/**
	* "Reference to an element the extension refers to."@en
	* @param refersTo desired value for the property refersTo.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
	*/
	final public void setRefersTo (Reference refersTo) {
		this.refersTo = refersTo;
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
