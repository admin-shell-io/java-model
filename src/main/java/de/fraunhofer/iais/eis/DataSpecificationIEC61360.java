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
* "Data Specification IEC 61360"
* "Data Specification Template for defining Property Descriptions conformant to IEC 61360."@en
* "Constraint AASd-075: For all ConceptDescriptions using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and Table 12.depending on its category are ignored and handled as undefined."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DefaultDataSpecificationIEC61360.class)
})
public interface DataSpecificationIEC61360 extends DataSpecificationContent {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable labels about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable labels
	*/
	public List<TypedLiteral> getLabels();

	/**
	* This function retrieves a human readable explanatory comments about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comments
	*/
	public List<TypedLiteral> getComments();

	/**
	* This function returns a hash code value for the DataSpecificationIEC61360 for the benefit of e.g. hash tables.
	* @return a hash code value for the DataSpecificationIEC61360
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this DataSpecificationIEC61360 is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* "Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is STRING by default."@en
	* "Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
	* "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* @return Returns the List of DataTypeIEC61360s for the property dataSpecificationIEC61360DataTypes.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
	public List<DataTypeIEC61360> getDataSpecificationIEC61360DataTypes();

	/**
	* "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
	* @return Returns the List of TypedLiterals for the property dataSpecificationIEC61360Definitions.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
	public List<TypedLiteral> getDataSpecificationIEC61360Definitions();

	/**
	* @return Returns the List of LevelTypes for the property dataSpecificationIEC61360LevelTypes.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
	public List<LevelType> getDataSpecificationIEC61360LevelTypes();

	/**
	* @return Returns the TypedLiteral for the property dataSpecificationIEC61360PreferredName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
	public TypedLiteral getDataSpecificationIEC61360PreferredName();

	/**
	* @return Returns the TypedLiteral for the property dataSpecificationIEC61360ShortName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
	public TypedLiteral getDataSpecificationIEC61360ShortName();

	/**
	* @return Returns the String for the property dataSpecificationIEC61360SourceOfDefinition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
	public String getDataSpecificationIEC61360SourceOfDefinition();

	/**
	* @return Returns the String for the property dataSpecificationIEC61360Symbol.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
	public String getDataSpecificationIEC61360Symbol();

	/**
	* @return Returns the String for the property dataSpecificationIEC61360Unit.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
	public String getDataSpecificationIEC61360Unit();

	/**
	* @return Returns the Reference for the property dataSpecificationIEC61360UnitId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
	public Reference getDataSpecificationIEC61360UnitId();

	/**
	* @return Returns the String for the property dataSpecificationIEC61360ValueFormat.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
	public String getDataSpecificationIEC61360ValueFormat();

	/**
	* @return Returns the String for the property dataSpecificationIEC61360Value.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
	public String getDataSpecificationIEC61360Value();

	/**
	* "The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	* @return Returns the String for the property dataSpecificationIEC61360ValueList.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
	public String getDataSpecificationIEC61360ValueList();

	/**
	* @return Returns the Reference for the property dataSpecificationIEC61360ValueId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
	public Reference getDataSpecificationIEC61360ValueId();

}
