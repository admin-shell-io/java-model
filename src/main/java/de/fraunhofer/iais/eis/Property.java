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
	"Property"

	"A property is a data element that has a single value."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = PropertyImpl.class),})
public interface Property extends DataElement {

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
	"has property category"

	"The following categories are defined for properties and multi-language properties: CONSTANT, PARAMETER, and VARIABLE."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Property/propertyCategory")
	java.util.ArrayList<? extends Category> getPropertyPropertyCategory();
	/**
	"has property value"

	"The value of the property instance."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Property/value")
	de.fraunhofer.iais.eis.util.TypedLiteral getPropertyValue();
	/**
	"has property value id"

	"Reference to the global unique id of a coded value."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
	Reference getPropertyValueId();
}
