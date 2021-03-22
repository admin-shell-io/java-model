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
	"Annotated Relationship Element"

	"An annotated relationship element is an relationship element that can be annotated with additional data elements."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AnnotatedRelationshipElementImpl.class),})
public interface AnnotatedRelationshipElement extends RelationshipElement {

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
	"has annotation"

	"Annotations that hold for the relationships between the two elements."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation")
	java.util.ArrayList<? extends DataElement> getAnnotatedRelationshipElementAnnotation();
}
