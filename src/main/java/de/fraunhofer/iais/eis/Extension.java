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

	"Single extension of an element."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ExtensionImpl.class),})
public interface Extension extends HasSemantics {

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
	"has extension name"

	"An extension of the element."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
	String getExtensionName();
	/**
	"has extension value type"

	"Type of the value of the extension."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
	String getExtensionValueType();
	/**
	"has extension value"

	"Value of the extension."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
	String getExtensionValue();
	/**
	"has extension reference to"

	"Reference to an element the extension refers to."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
	Reference getExtensionRefersTo();
}
