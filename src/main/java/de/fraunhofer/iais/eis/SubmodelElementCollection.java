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
	"Submodel Element Collection"

	"A submodel element collection is a set or list of submodel elements."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = SubmodelElementCollectionImpl.class),})
public interface SubmodelElementCollection extends SubmodelElement {

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
	"allow duplicates"

	"If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false"@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
	boolean getSubmodelElementCollectionAllowDuplicates();
	/**
	"ordered"

	"If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false"@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
	boolean getSubmodelElementCollectionOrdered();
	/**
	"has value"

	"Submodel element contained in the collection."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
	java.util.ArrayList<? extends SubmodelElement> getSubmodelElementCollectionValue();
}
