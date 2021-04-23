package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
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
* "Identifier"
* "Used to uniquely identify an entity by using an identifier."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Identifier")
public class DefaultIdentifier implements Serializable, Identifier {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Identifier", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Used to uniquely identify an entity by using an identifier.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has idType"
	* "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the enumeration \'IdentifierType\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifier/idType", "identifierIdType"})
	protected IdentifierType identifierIdType;


	/**
	* "has identification"
	* "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifier/identifier", "identifierIdentifier"})
	protected List<TypedLiteral> identifierIdentifiers;


	// no manual construction
	protected DefaultIdentifier() {
		id = VocabUtil.getInstance().createRandomUrl("identifier");
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
		return Objects.hash(new Object[]{this.identifierIdentifiers,
			this.identifierIdType});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultIdentifier other = (DefaultIdentifier) obj;
			return Objects.equals(this.identifierIdentifiers, other.identifierIdentifiers) &&
				Objects.equals(this.identifierIdType, other.identifierIdType);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
	final public List<TypedLiteral> getIdentifierIdentifiers() {
		return identifierIdentifiers;
	}
	
	final public void setIdentifierIdentifiers (List<TypedLiteral> identifierIdentifiers) {
		this.identifierIdentifiers = identifierIdentifiers;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
	final public IdentifierType getIdentifierIdType() {
		return identifierIdType;
	}
	
	final public void setIdentifierIdType (IdentifierType identifierIdType) {
		this.identifierIdType = identifierIdType;
	}
}
