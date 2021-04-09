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
* "Qualifier"
* "A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element."@en
* "Constraint AASd-063: The semanticId of a Qualifier shall only reference a ConceptDescription with the category QUALIFIER."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = QualifierImpl.class)
})
public interface IQualifier extends IConstraint, IHasSemantics {

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
	* "The qualifier type describes the type of the qualifier that is applied to the element."@en
	* @return Returns the String for the property qualifierType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/type
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
	public String getQualifierType();

	/**
	* "The qualifier value is the value of the qualifier."@en
	* "Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId."@en
	* "Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
	* @return Returns the TypedLiteral for the property qualifierValue.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
	public TypedLiteral getQualifierValue();

	/**
	* "Reference to the global unqiue id of a coded value."@en
	* @return Returns the IReference for the property qualifierValueId.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
	public IReference getQualifierValueId();

}
