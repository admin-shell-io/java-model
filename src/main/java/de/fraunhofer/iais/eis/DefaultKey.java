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
* "Key"
* "A key is a reference to an element by its id."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Key")
public class DefaultKey implements Serializable, Key {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Key", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("A key is a reference to an element by its id.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has key type"
	* "Type of the key value. In case of idType = idShort local shall be true. In case type=GlobalReference idType shall not be IdShort."@en
	* "Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en
	* "Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any  LocalKeyType (IdShort, FragmentId)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Key/idType", "keyIdType"})
	protected KeyType keyIdType;


	/**
	* "has type"
	* "Denote which kind of entity is referenced. In case type = GlobalReference then the element is a global unique id. In all other cases the key references a model element of the same or of another AAS. The name of the model element is explicitly listed."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Key/type", "keyType"})
	protected KeyElements keyType;


	/**
	* "has value"
	* "The key value, for example an IRDI if the idType=IRDI."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Key/value", "keyValue"})
	protected String keyValue;


	// no manual construction
	protected DefaultKey() {
		id = VocabUtil.getInstance().createRandomUrl("key");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.keyIdType,
			this.keyType,
			this.keyValue});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultKey other = (DefaultKey) obj;
			return Objects.equals(this.keyIdType, other.keyIdType) &&
				Objects.equals(this.keyType, other.keyType) &&
				Objects.equals(this.keyValue, other.keyValue);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/idType")
	final public KeyType getKeyIdType() {
		return keyIdType;
	}
	
	final public void setKeyIdType (KeyType keyIdType) {
		this.keyIdType = keyIdType;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/type")
	final public KeyElements getKeyType() {
		return keyType;
	}
	
	final public void setKeyType (KeyElements keyType) {
		this.keyType = keyType;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/value")
	final public String getKeyValue() {
		return keyValue;
	}
	
	final public void setKeyValue (String keyValue) {
		this.keyValue = keyValue;
	}
}
