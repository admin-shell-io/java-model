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
	"Qualifier"

	"A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = QualifierImpl.class),})
public interface Qualifier extends Constraint
, HasSemantics {

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
	"has qualifier type"

	"The qualifier type describes the type of the qualifier that is applied to the element."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
	String getQualifierType();
	/**
	"The qualifier value is the value of the qualifier."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
	de.fraunhofer.iais.eis.util.TypedLiteral getQualifierValue();
	/**
	"Reference to the global unqiue id of a coded value."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
	Reference getQualifierValueId();
}
