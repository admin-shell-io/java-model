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
	"Object Attributes"

	"A set of data elements that describe object attributes. These attributes need to refer to a data element within an existing submodel."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:ObjectAttributes")
public class ObjectAttributesImpl implements Serializable, IObjectAttributes {

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
	"has object attribute"

	"A data elements that further classifies an object."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute", "objectAttributesObjectAttribute"})
	protected ArrayList<? extends IDataElement> _objectAttributesObjectAttribute;


	// no manual construction
	protected ObjectAttributesImpl() {
		id = VocabUtil.getInstance().createRandomUrl("objectAttributes");
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
	"A data elements that further classifies an object."@en
	@return the List of objectAttributesObjectAttribute
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
	final public List<? extends IDataElement> getObjectAttributesObjectAttribute() {
		return _objectAttributesObjectAttribute;
	}

	final public void setObjectAttributesObjectAttribute (ArrayList<? extends IDataElement> _objectAttributesObjectAttribute_) {
		this._objectAttributesObjectAttribute = _objectAttributesObjectAttribute_;
	}
}
