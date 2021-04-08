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
* "Data Specification IEC 61360"
* "Data Specification Template for defining Property Descriptions conformant to IEC 61360."@en
* "Constraint AASd-075: For all ConceptDescriptions using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and Table 12.depending on its category are ignored and handled as undefined."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DataSpecificationIEC61360Impl.class)
})
public interface IDataSpecificationIEC61360 extends IDataSpecificationContent {

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


	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
	public List<? extends DataTypeIEC61360> getDataSpecificationIEC61360DataType();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
	public List<? extends TypedLiteral> getDataSpecificationIEC61360Definition();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
	public List<? extends LevelType> getDataSpecificationIEC61360LevelType();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
	public TypedLiteral getDataSpecificationIEC61360PreferredName();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
	public TypedLiteral getDataSpecificationIEC61360ShortName();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
	public String getDataSpecificationIEC61360SourceOfDefinition();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
	public String getDataSpecificationIEC61360Symbol();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
	public String getDataSpecificationIEC61360Unit();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
	public IReference getDataSpecificationIEC61360UnitId();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
	public String getDataSpecificationIEC61360ValueFormat();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
	public String getDataSpecificationIEC61360Value();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
	public String getDataSpecificationIEC61360ValueList();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
	public IReference getDataSpecificationIEC61360ValueId();

}
