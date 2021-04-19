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
* "identifier key value pair"
* "An IdentifierKeyValuePair describes a generic identifier as key-value pair."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:IdentifierKeyValuePair")
public class DefaultIdentifierKeyValuePair implements Serializable, IdentifierKeyValuePair {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("identifier key value pair", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("An IdentifierKeyValuePair describes a generic identifier as key-value pair.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "semanticId"})
	protected Reference semanticId;


	/**
	* "has IdentifierKeyValuePair.externalSubjectId"
	* "The (external) subject the key belongs to or has meaning to."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId", "externalSubjectId"})
	protected Reference externalSubjectId;


	/**
	* "has IdentifierKeyValuePair.key"
	* "Key of the identifier."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key", "key"})
	protected String key;


	/**
	* "has IdentifierKeyValuePair.value"
	* "The value of the identifier with the corresponding key."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value", "value"})
	protected String value;


	// no manual construction
	protected DefaultIdentifierKeyValuePair() {
		id = VocabUtil.getInstance().createRandomUrl("identifierKeyValuePair");
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
	* This function returns a hash code value for the IdentifierKeyValuePair for the benefit of e.g. hash tables.
	* @return a hash code value for the IdentifierKeyValuePair
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.key, this.value, this.externalSubjectId});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this IdentifierKeyValuePair is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultIdentifierKeyValuePair other = (DefaultIdentifierKeyValuePair) obj;
			return super.equals(other) && Objects.equals(this.key, other.key) && Objects.equals(this.value, other.value) && Objects.equals(this.externalSubjectId, other.externalSubjectId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Key of the identifier."@en
	* @return Returns the String for the property key.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
	final public String getKey() {
		return key;
	}

	
	/**
	* "Key of the identifier."@en
	* @param key desired value for the property key.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
	*/
	final public void setKey (String key) {
		this.key = key;
	}

	/**
	* "The value of the identifier with the corresponding key."@en
	* @return Returns the String for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
	final public String getValue() {
		return value;
	}

	
	/**
	* "The value of the identifier with the corresponding key."@en
	* @param value desired value for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
	*/
	final public void setValue (String value) {
		this.value = value;
	}

	/**
	* "The (external) subject the key belongs to or has meaning to."@en
	* @return Returns the Reference for the property externalSubjectId.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
	final public Reference getExternalSubjectId() {
		return externalSubjectId;
	}

	
	/**
	* "The (external) subject the key belongs to or has meaning to."@en
	* @param externalSubjectId desired value for the property externalSubjectId.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
	*/
	final public void setExternalSubjectId (Reference externalSubjectId) {
		this.externalSubjectId = externalSubjectId;
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
