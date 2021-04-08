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
* "identifier key value pair"
* "An IdentifierKeyValuePair describes a generic identifier as key-value pair."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:IdentifierKeyValuePair")
public class IdentifierKeyValuePairImpl implements Serializable, IIdentifierKeyValuePair {

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
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected IReference _hasSemanticsSemanticId;


	/**
	* "has IdentifierKeyValuePair.externalSubjectId"
	* "The (external) subject the key belongs to or has meaning to."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId", "identifierKeyValuePairExternalSubjectId"})
	protected IReference _identifierKeyValuePairExternalSubjectId;


	/**
	* "has IdentifierKeyValuePair.key"
	* "Key of the identifier."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key", "identifierKeyValuePairKey"})
	protected String _identifierKeyValuePairKey;


	/**
	* "has IdentifierKeyValuePair.value"
	* "The value of the identifier with the corresponding key."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value", "identifierKeyValuePairValue"})
	protected String _identifierKeyValuePairValue;


	// no manual construction
	protected IdentifierKeyValuePairImpl() {
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


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Key of the identifier."@en
	* @return Returns the String for the property identifierKeyValuePairKey.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
	final public String getIdentifierKeyValuePairKey() {
		return _identifierKeyValuePairKey;
	}

	
	/**
	* "Key of the identifier."@en
	* @param _identifierKeyValuePairKey_ desired value for the property identifierKeyValuePairKey.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
	*/
	final public void setIdentifierKeyValuePairKey (String _identifierKeyValuePairKey_) {
		this._identifierKeyValuePairKey = _identifierKeyValuePairKey_;
	}

	/**
	* "The value of the identifier with the corresponding key."@en
	* @return Returns the String for the property identifierKeyValuePairValue.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
	final public String getIdentifierKeyValuePairValue() {
		return _identifierKeyValuePairValue;
	}

	
	/**
	* "The value of the identifier with the corresponding key."@en
	* @param _identifierKeyValuePairValue_ desired value for the property identifierKeyValuePairValue.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
	*/
	final public void setIdentifierKeyValuePairValue (String _identifierKeyValuePairValue_) {
		this._identifierKeyValuePairValue = _identifierKeyValuePairValue_;
	}

	/**
	* "The (external) subject the key belongs to or has meaning to."@en
	* @return Returns the IReference for the property identifierKeyValuePairExternalSubjectId.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
	final public IReference getIdentifierKeyValuePairExternalSubjectId() {
		return _identifierKeyValuePairExternalSubjectId;
	}

	
	/**
	* "The (external) subject the key belongs to or has meaning to."@en
	* @param _identifierKeyValuePairExternalSubjectId_ desired value for the property identifierKeyValuePairExternalSubjectId.
	* More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
	*/
	final public void setIdentifierKeyValuePairExternalSubjectId (IReference _identifierKeyValuePairExternalSubjectId_) {
		this._identifierKeyValuePairExternalSubjectId = _identifierKeyValuePairExternalSubjectId_;
	}

	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @return Returns the IReference for the property hasSemanticsSemanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public IReference getHasSemanticsSemanticId() {
		return _hasSemanticsSemanticId;
	}

	
	/**
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	* @param _hasSemanticsSemanticId_ desired value for the property hasSemanticsSemanticId.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
	*/
	final public void setHasSemanticsSemanticId (IReference _hasSemanticsSemanticId_) {
		this._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
	}
}
