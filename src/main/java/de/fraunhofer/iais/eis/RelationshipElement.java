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
	"Relationship Element"*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = RelationshipElementImpl.class),
@JsonSubTypes.Type(value = AnnotatedRelationshipElement.class),})
public interface RelationshipElement extends SubmodelElement {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"has first relationship"

	"First element in the relationship taking the role of the subject."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
	Referable getRelationshipElementFirst();
	/**
	"has second relationship"

	"Second element in the relationship taking the role of the object."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
	Referable getRelationshipElementSecond();
}
