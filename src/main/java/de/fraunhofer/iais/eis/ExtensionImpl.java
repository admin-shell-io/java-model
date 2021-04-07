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
	"Extensions"

	"Single extension of an element."@en

	"Constraint AASd-077: The name of an extension within HasExtensions needs to be unique."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Extension")
public class ExtensionImpl implements Serializable, IExtension {

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
	"has extension name"

	"An extension of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/name", "extensionName"})
	protected String _extensionName;


	/**
	"has extension reference to"

	"Reference to an element the extension refers to."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/refersTo", "extensionRefersTo"})
	protected IReference _extensionRefersTo;


	/**
	"has extension value"

	"Value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/value", "extensionValue"})
	protected String _extensionValue;


	/**
	"has extension value type"

	"Type of the value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/valueType", "extensionValueType"})
	protected String _extensionValueType;


	/**
	"has semantic ID"

	"Points to the Expression Semantic of the Submodels"@en

	"The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected IReference _hasSemanticsSemanticId;


	// no manual construction
	protected ExtensionImpl() {
		id = VocabUtil.getInstance().createRandomUrl("extension");
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
	"An extension of the element."@en
	@return the String of extensionName
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
	final public String getExtensionName() {
		return _extensionName;
	}

	final public void setExtensionName (String _extensionName_) {
		this._extensionName = _extensionName_;
	}

	/**
	"Type of the value of the extension."@en
	@return the String of extensionValueType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
	final public String getExtensionValueType() {
		return _extensionValueType;
	}

	final public void setExtensionValueType (String _extensionValueType_) {
		this._extensionValueType = _extensionValueType_;
	}

	/**
	"Value of the extension."@en
	@return the String of extensionValue
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
	final public String getExtensionValue() {
		return _extensionValue;
	}

	final public void setExtensionValue (String _extensionValue_) {
		this._extensionValue = _extensionValue_;
	}

	/**
	"Reference to an element the extension refers to."@en
	@return the IReference of extensionRefersTo
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
	final public IReference getExtensionRefersTo() {
		return _extensionRefersTo;
	}

	final public void setExtensionRefersTo (IReference _extensionRefersTo_) {
		this._extensionRefersTo = _extensionRefersTo_;
	}

	/**
	"Points to the Expression Semantic of the Submodels"@en

	"The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public IReference getHasSemanticsSemanticId() {
		return _hasSemanticsSemanticId;
	}

	final public void setHasSemanticsSemanticId (IReference _hasSemanticsSemanticId_) {
		this._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
	}
}
