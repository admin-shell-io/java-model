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
	"Extensions"

	"Single extension of an element."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Extension")
public class ExtensionImpl implements Serializable, Extension {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Extensions", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Single extension of an element.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has extension name"

	"An extension of the element."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/name", "extensionName"})
	 String _extensionName;


	/**
	"has extension reference to"

	"Reference to an element the extension refers to."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/refersTo", "extensionRefersTo"})
	 Reference _extensionRefersTo;


	/**
	"has extension value"

	"Value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/value", "extensionValue"})
	 String _extensionValue;


	/**
	"has extension value type"

	"Type of the value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/valueType", "extensionValueType"})
	 String _extensionValueType;


	/**
	"has semantic ID"

	"Points to the Expression Semantic of the Submodels"@en

	"The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	 Reference _hasSemanticsSemanticId;


	// no manual construction
	ExtensionImpl() {
		id = VocabUtil.getInstance().createRandomUrl("extension");
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
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
	String getExtensionName() {
		return _extensionName;
	}

	final public void setExtensionName (String _extensionName_) {
		this._extensionName = _extensionName_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
	String getExtensionValueType() {
		return _extensionValueType;
	}

	final public void setExtensionValueType (String _extensionValueType_) {
		this._extensionValueType = _extensionValueType_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
	String getExtensionValue() {
		return _extensionValue;
	}

	final public void setExtensionValue (String _extensionValue_) {
		this._extensionValue = _extensionValue_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
	Reference getExtensionRefersTo() {
		return _extensionRefersTo;
	}

	final public void setExtensionRefersTo (Reference _extensionRefersTo_) {
		this._extensionRefersTo = _extensionRefersTo_;
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
