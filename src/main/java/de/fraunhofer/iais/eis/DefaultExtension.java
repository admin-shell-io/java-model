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
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Extensions", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Single extension of an element.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has extension name"
	* "An extension of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/name", "extensionName"})
	protected String extensionName;


	/**
	* "has extension reference to"
	* "Reference to an element the extension refers to."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/refersTo", "extensionRefersTo"})
	protected Reference extensionRefersTo;


	/**
	* "has extension value"
	* "Value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/value", "extensionValue"})
	protected String extensionValue;


	/**
	* "has extension value type"
	* "Type of the value of the extension."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Extension/valueType", "extensionValueType"})
	protected String extensionValueType;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected Reference hasSemanticsSemanticId;


	// no manual construction
	protected DefaultExtension() {
		id = VocabUtil.getInstance().createRandomUrl("extension");
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
		return Objects.hash(new Object[]{this.extensionName,
			this.extensionValueType,
			this.extensionValue,
			this.extensionRefersTo,
			this.hasSemanticsSemanticId});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultExtension other = (DefaultExtension) obj;
			return Objects.equals(this.extensionName, other.extensionName) &&
				Objects.equals(this.extensionValueType, other.extensionValueType) &&
				Objects.equals(this.extensionValue, other.extensionValue) &&
				Objects.equals(this.extensionRefersTo, other.extensionRefersTo) &&
				Objects.equals(this.hasSemanticsSemanticId, other.hasSemanticsSemanticId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
	final public String getExtensionName() {
		return extensionName;
	}
	
	final public void setExtensionName (String extensionName) {
		this.extensionName = extensionName;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
	final public String getExtensionValueType() {
		return extensionValueType;
	}
	
	final public void setExtensionValueType (String extensionValueType) {
		this.extensionValueType = extensionValueType;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
	final public String getExtensionValue() {
		return extensionValue;
	}
	
	final public void setExtensionValue (String extensionValue) {
		this.extensionValue = extensionValue;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
	final public Reference getExtensionRefersTo() {
		return extensionRefersTo;
	}
	
	final public void setExtensionRefersTo (Reference extensionRefersTo) {
		this.extensionRefersTo = extensionRefersTo;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getHasSemanticsSemanticId() {
		return hasSemanticsSemanticId;
	}
	
	final public void setHasSemanticsSemanticId (Reference hasSemanticsSemanticId) {
		this.hasSemanticsSemanticId = hasSemanticsSemanticId;
	}
}
