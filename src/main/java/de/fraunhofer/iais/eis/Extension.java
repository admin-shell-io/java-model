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
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DefaultExtension.class)
})
public interface Extension extends HasSemantics {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	/**
	* This function returns a hash code value for the Extension for the benefit of e.g. hash tables.
	* @return a hash code value for the Extension
	*/
	public int hashCode();

	/**
	* This function indicates wheather some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Extension is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "An extension of the element."@en
	* @return Returns the String for the property name.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/name
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
	public String getName();

	/**
	* "Type of the value of the extension."@en
	* @return Returns the String for the property valueType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
	public String getValueType();

	/**
	* "Value of the extension."@en
	* @return Returns the String for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
	public String getValue();

	/**
	* "Reference to an element the extension refers to."@en
	* @return Returns the Reference for the property refersTo.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
	public Reference getRefersTo();

}
