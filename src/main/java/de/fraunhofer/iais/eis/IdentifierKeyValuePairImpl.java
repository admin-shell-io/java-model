package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"identifier key value pair"

	"An IdentifierKeyValuePair describes a generic identifier as key-value pair."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:IdentifierKeyValuePair")
public class IdentifierKeyValuePairImpl implements Serializable, IdentifierKeyValuePair {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("identifier key value pair", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("An IdentifierKeyValuePair describes a generic identifier as key-value pair.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has semantic ID"

	"Points to the Expression Semantic of the Submodels"@en

	"The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	 Reference _hasSemanticsSemanticId;


	/**
	"has IdentifierKeyValuePair.externalSubjectId"

	"The (external) subject the key belongs to or has meaning to."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId", "identifierKeyValuePairExternalSubjectId"})
	 Reference _identifierKeyValuePairExternalSubjectId;


	/**
	"has IdentifierKeyValuePair.key"

	"Key of the identifier."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key", "identifierKeyValuePairKey"})
	 String _identifierKeyValuePairKey;


	/**
	"has IdentifierKeyValuePair.value"

	"The value of the identifier with the corresponding key."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value", "identifierKeyValuePairValue"})
	 String _identifierKeyValuePairValue;


	// no manual construction
	IdentifierKeyValuePairImpl() {
		id = VocabUtil.getInstance().createRandomUrl("identifierKeyValuePair");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
	String getIdentifierKeyValuePairKey() {
		return _identifierKeyValuePairKey;
	}

	final public void setIdentifierKeyValuePairKey (String _identifierKeyValuePairKey_) {
		this._identifierKeyValuePairKey = _identifierKeyValuePairKey_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
	String getIdentifierKeyValuePairValue() {
		return _identifierKeyValuePairValue;
	}

	final public void setIdentifierKeyValuePairValue (String _identifierKeyValuePairValue_) {
		this._identifierKeyValuePairValue = _identifierKeyValuePairValue_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
	Reference getIdentifierKeyValuePairExternalSubjectId() {
		return _identifierKeyValuePairExternalSubjectId;
	}

	final public void setIdentifierKeyValuePairExternalSubjectId (Reference _identifierKeyValuePairExternalSubjectId_) {
		this._identifierKeyValuePairExternalSubjectId = _identifierKeyValuePairExternalSubjectId_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	Reference getHasSemanticsSemanticId() {
		return _hasSemanticsSemanticId;
	}

	final public void setHasSemanticsSemanticId (Reference _hasSemanticsSemanticId_) {
		this._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
	}
}
