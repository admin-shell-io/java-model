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
* "Object Attributes"
* "A set of data elements that describe object attributes. These attributes need to refer to a data element within an existing submodel."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:ObjectAttributes")
public class DefaultObjectAttributes implements Serializable, ObjectAttributes {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Object Attributes", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A set of data elements that describe object attributes. These attributes need to refer to a data element within an existing submodel.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has object attribute"
	* "A data elements that further classifies an object."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute", "objectAttribute"})
	protected List<DataElement> objectAttribute;


	// no manual construction
	protected DefaultObjectAttributes() {
		id = VocabUtil.getInstance().createRandomUrl("objectAttributes");
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
	* This function returns a hash code value for the ObjectAttributes for the benefit of e.g. hash tables.
	* @return a hash code value for the ObjectAttributes
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.objectAttribute});
	}

	/**
	* This function indicates wheather some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this ObjectAttributes is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultObjectAttributes other = (DefaultObjectAttributes) obj;
			return super.equals(other) && Objects.equals(this.objectAttribute, other.objectAttribute);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "A data elements that further classifies an object."@en
	* @return Returns the List of DataElement for the property objectAttribute.
	* More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
	final public List<DataElement> getObjectAttribute() {
		return objectAttribute;
	}

	
	/**
	* "A data elements that further classifies an object."@en
	* @param objectAttribute desired value for the property objectAttribute.
	* More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
	*/
	final public void setObjectAttribute (List<DataElement> objectAttribute) {
		this.objectAttribute = objectAttribute;
	}
}
