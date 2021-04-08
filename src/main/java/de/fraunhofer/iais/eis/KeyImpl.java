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
* "Key"
* "A key is a reference to an element by its id."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Key")
public class KeyImpl implements Serializable, IKey {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Key", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A key is a reference to an element by its id.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has key type"
	* "Type of the key value. In case of idType = idShort local shall be true. In case type=GlobalReference idType shall not be IdShort."@en
	* "Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en
	* "Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any  LocalKeyType (IdShort, FragmentId)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Key/idType", "keyIdType"})
	protected KeyType _keyIdType;


	/**
	* "has type"
	* "Denote which kind of entity is referenced. In case type = GlobalReference then the element is a global unique id. In all other cases the key references a model element of the same or of another AAS. The name of the model element is explicitly listed."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Key/type", "keyType"})
	protected KeyElements _keyType;


	/**
	* "has value"
	* "The key value, for example an IRDI if the idType=IRDI."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Key/value", "keyValue"})
	protected String _keyValue;


	// no manual construction
	protected KeyImpl() {
		id = VocabUtil.getInstance().createRandomUrl("key");
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
	* "Type of the key value. In case of idType = idShort local shall be true. In case type=GlobalReference idType shall not be IdShort."@en
	* "Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en
	* "Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any  LocalKeyType (IdShort, FragmentId)."@en
	* @return Returns the KeyType for the property keyIdType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Key/idType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/idType")
	final public KeyType getKeyIdType() {
		return _keyIdType;
	}

	
	/**
	* "Type of the key value. In case of idType = idShort local shall be true. In case type=GlobalReference idType shall not be IdShort."@en
	* "Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en
	* "Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any  LocalKeyType (IdShort, FragmentId)."@en
	* @param _keyIdType_ desired value for the property keyIdType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Key/idType
	*/
	final public void setKeyIdType (KeyType _keyIdType_) {
		this._keyIdType = _keyIdType_;
	}

	/**
	* "Denote which kind of entity is referenced. In case type = GlobalReference then the element is a global unique id. In all other cases the key references a model element of the same or of another AAS. The name of the model element is explicitly listed."@en
	* @return Returns the KeyElements for the property keyType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Key/type
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/type")
	final public KeyElements getKeyType() {
		return _keyType;
	}

	
	/**
	* "Denote which kind of entity is referenced. In case type = GlobalReference then the element is a global unique id. In all other cases the key references a model element of the same or of another AAS. The name of the model element is explicitly listed."@en
	* @param _keyType_ desired value for the property keyType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Key/type
	*/
	final public void setKeyType (KeyElements _keyType_) {
		this._keyType = _keyType_;
	}

	/**
	* "The key value, for example an IRDI if the idType=IRDI."@en
	* @return Returns the String for the property keyValue.
	* More information under https://admin-shell.io/aas/3/0/RC01/Key/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/value")
	final public String getKeyValue() {
		return _keyValue;
	}

	
	/**
	* "The key value, for example an IRDI if the idType=IRDI."@en
	* @param _keyValue_ desired value for the property keyValue.
	* More information under https://admin-shell.io/aas/3/0/RC01/Key/value
	*/
	final public void setKeyValue (String _keyValue_) {
		this._keyValue = _keyValue_;
	}
}
