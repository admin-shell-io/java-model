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
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("identifier key value pair", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("An IdentifierKeyValuePair describes a generic identifier as key-value pair.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected Reference hasSemanticsSemanticId;


	/**
	* "has IdentifierKeyValuePair.externalSubjectId"
	* "The (external) subject the key belongs to or has meaning to."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId", "identifierKeyValuePairExternalSubjectId"})
	protected Reference identifierKeyValuePairExternalSubjectId;


	/**
	* "has IdentifierKeyValuePair.key"
	* "Key of the identifier."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key", "identifierKeyValuePairKey"})
	protected String identifierKeyValuePairKey;


	/**
	* "has IdentifierKeyValuePair.value"
	* "The value of the identifier with the corresponding key."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value", "identifierKeyValuePairValue"})
	protected String identifierKeyValuePairValue;


	// no manual construction
	protected DefaultIdentifierKeyValuePair() {
		id = VocabUtil.getInstance().createRandomUrl("identifierKeyValuePair");
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
		return Objects.hash(new Object[]{this.identifierKeyValuePairKey,
			this.identifierKeyValuePairValue,
			this.identifierKeyValuePairExternalSubjectId,
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
			DefaultIdentifierKeyValuePair other = (DefaultIdentifierKeyValuePair) obj;
			return Objects.equals(this.identifierKeyValuePairKey, other.identifierKeyValuePairKey) &&
				Objects.equals(this.identifierKeyValuePairValue, other.identifierKeyValuePairValue) &&
				Objects.equals(this.identifierKeyValuePairExternalSubjectId, other.identifierKeyValuePairExternalSubjectId) &&
				Objects.equals(this.hasSemanticsSemanticId, other.hasSemanticsSemanticId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
	final public String getIdentifierKeyValuePairKey() {
		return identifierKeyValuePairKey;
	}
	
	final public void setIdentifierKeyValuePairKey (String identifierKeyValuePairKey) {
		this.identifierKeyValuePairKey = identifierKeyValuePairKey;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
	final public String getIdentifierKeyValuePairValue() {
		return identifierKeyValuePairValue;
	}
	
	final public void setIdentifierKeyValuePairValue (String identifierKeyValuePairValue) {
		this.identifierKeyValuePairValue = identifierKeyValuePairValue;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
	final public Reference getIdentifierKeyValuePairExternalSubjectId() {
		return identifierKeyValuePairExternalSubjectId;
	}
	
	final public void setIdentifierKeyValuePairExternalSubjectId (Reference identifierKeyValuePairExternalSubjectId) {
		this.identifierKeyValuePairExternalSubjectId = identifierKeyValuePairExternalSubjectId;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getHasSemanticsSemanticId() {
		return hasSemanticsSemanticId;
	}
	
	final public void setHasSemanticsSemanticId (Reference hasSemanticsSemanticId) {
		this.hasSemanticsSemanticId = hasSemanticsSemanticId;
	}
}
