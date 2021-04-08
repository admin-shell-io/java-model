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
* "Extensions"
* "Single extension of an element."@en
* "Constraint AASd-077: The name of an extension within HasExtensions needs to be unique."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ExtensionImpl.class)
})
public interface IExtension extends IHasSemantics {

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

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "An extension of the element."@en
	* @return Returns the String for the property extensionName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/name
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
	public String getExtensionName();

	/**
	* "Type of the value of the extension."@en
	* @return Returns the String for the property extensionValueType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
	public String getExtensionValueType();

	/**
	* "Value of the extension."@en
	* @return Returns the String for the property extensionValue.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
	public String getExtensionValue();

	/**
	* "Reference to an element the extension refers to."@en
	* @return Returns the IReference for the property extensionRefersTo.
	* More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
	public IReference getExtensionRefersTo();

}
