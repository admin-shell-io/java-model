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
* "Data Specification IEC 61360"
* "Data Specification Template for defining Property Descriptions conformant to IEC 61360."@en
* "Constraint AASd-075: For all ConceptDescriptions using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and Table 12.depending on its category are ignored and handled as undefined."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360")
public class DefaultDataSpecificationIEC61360 implements Serializable, DataSpecificationIEC61360 {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Data Specification IEC 61360", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Data Specification Template for defining Property Descriptions conformant to IEC 61360.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has datatype"
	* "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* "Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is STRING by default."@en
	* "Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
	* "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType", "dataType"})
	protected List<DataTypeIEC61360> dataType;


	/**
	* "has definition"
	* "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition", "definition"})
	protected List<TypedLiteral> definition;


	/**
	* "has level type"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType", "levelType"})
	protected List<LevelType> levelType;


	/**
	* "has preferred name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName", "preferredName"})
	protected TypedLiteral preferredName;


	/**
	* "has short name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName", "shortName"})
	protected TypedLiteral shortName;


	/**
	* "has source of definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition", "sourceOfDefinition"})
	protected String sourceOfDefinition;


	/**
	* "has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol", "symbol"})
	protected String symbol;


	/**
	* "has unit"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit", "unit"})
	protected String unit;


	/**
	* "has unit id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId", "unitId"})
	protected Reference unitId;


	/**
	* "has value"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value", "value"})
	protected String value;


	/**
	* "has value format"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat", "valueFormat"})
	protected String valueFormat;


	/**
	* "has value id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId", "valueId"})
	protected Reference valueId;


	/**
	* "has value list"
	* "The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList", "valueList"})
	protected String valueList;


	// no manual construction
	protected DefaultDataSpecificationIEC61360() {
		id = VocabUtil.getInstance().createRandomUrl("dataSpecificationIEC61360");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	/**
	* This function returns a hash code value for the DataSpecificationIEC61360 for the benefit of e.g. hash tables.
	* @return a hash code value for the DataSpecificationIEC61360
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.dataType, this.definition, this.levelType, this.preferredName, this.shortName, this.sourceOfDefinition, this.symbol, this.unit, this.unitId, this.valueFormat, this.value, this.valueList, this.valueId});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this DataSpecificationIEC61360 is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultDataSpecificationIEC61360 other = (DefaultDataSpecificationIEC61360) obj;
			return super.equals(other) && Objects.equals(this.dataType, other.dataType) && Objects.equals(this.definition, other.definition) && Objects.equals(this.levelType, other.levelType) && Objects.equals(this.preferredName, other.preferredName) && Objects.equals(this.shortName, other.shortName) && Objects.equals(this.sourceOfDefinition, other.sourceOfDefinition) && Objects.equals(this.symbol, other.symbol) && Objects.equals(this.unit, other.unit) && Objects.equals(this.unitId, other.unitId) && Objects.equals(this.valueFormat, other.valueFormat) && Objects.equals(this.value, other.value) && Objects.equals(this.valueList, other.valueList) && Objects.equals(this.valueId, other.valueId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* "Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is STRING by default."@en
	* "Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
	* "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* @return Returns the List of DataTypeIEC61360 for the property dataType.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
	final public List<DataTypeIEC61360> getDataType() {
		return dataType;
	}

	
	/**
	* "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* "Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is STRING by default."@en
	* "Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
	* "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* @param dataType desired value for the property dataType.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
	*/
	final public void setDataType (List<DataTypeIEC61360> dataType) {
		this.dataType = dataType;
	}

	/**
	* "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
	* @return Returns the List of TypedLiteral for the property definition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
	final public List<TypedLiteral> getDefinition() {
		return definition;
	}

	
	/**
	* "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
	* @param definition desired value for the property definition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
	*/
	final public void setDefinition (List<TypedLiteral> definition) {
		this.definition = definition;
	}

	/**
	* @return Returns the List of LevelType for the property levelType.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
	final public List<LevelType> getLevelType() {
		return levelType;
	}

	
	/**
	* @param levelType desired value for the property levelType.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType
	*/
	final public void setLevelType (List<LevelType> levelType) {
		this.levelType = levelType;
	}

	/**
	* @return Returns the TypedLiteral for the property preferredName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
	final public TypedLiteral getPreferredName() {
		return preferredName;
	}

	
	/**
	* @param preferredName desired value for the property preferredName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
	*/
	final public void setPreferredName (TypedLiteral preferredName) {
		this.preferredName = preferredName;
	}

	/**
	* @return Returns the TypedLiteral for the property shortName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
	final public TypedLiteral getShortName() {
		return shortName;
	}

	
	/**
	* @param shortName desired value for the property shortName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
	*/
	final public void setShortName (TypedLiteral shortName) {
		this.shortName = shortName;
	}

	/**
	* @return Returns the String for the property sourceOfDefinition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
	final public String getSourceOfDefinition() {
		return sourceOfDefinition;
	}

	
	/**
	* @param sourceOfDefinition desired value for the property sourceOfDefinition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
	*/
	final public void setSourceOfDefinition (String sourceOfDefinition) {
		this.sourceOfDefinition = sourceOfDefinition;
	}

	/**
	* @return Returns the String for the property symbol.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
	final public String getSymbol() {
		return symbol;
	}

	
	/**
	* @param symbol desired value for the property symbol.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol
	*/
	final public void setSymbol (String symbol) {
		this.symbol = symbol;
	}

	/**
	* @return Returns the String for the property unit.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
	final public String getUnit() {
		return unit;
	}

	
	/**
	* @param unit desired value for the property unit.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
	*/
	final public void setUnit (String unit) {
		this.unit = unit;
	}

	/**
	* @return Returns the Reference for the property unitId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
	final public Reference getUnitId() {
		return unitId;
	}

	
	/**
	* @param unitId desired value for the property unitId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
	*/
	final public void setUnitId (Reference unitId) {
		this.unitId = unitId;
	}

	/**
	* @return Returns the String for the property valueFormat.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
	final public String getValueFormat() {
		return valueFormat;
	}

	
	/**
	* @param valueFormat desired value for the property valueFormat.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat
	*/
	final public void setValueFormat (String valueFormat) {
		this.valueFormat = valueFormat;
	}

	/**
	* @return Returns the String for the property value.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
	final public String getValue() {
		return value;
	}

	
	/**
	* @param value desired value for the property value.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value
	*/
	final public void setValue (String value) {
		this.value = value;
	}

	/**
	* "The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	* @return Returns the String for the property valueList.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
	final public String getValueList() {
		return valueList;
	}

	
	/**
	* "The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	* @param valueList desired value for the property valueList.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList
	*/
	final public void setValueList (String valueList) {
		this.valueList = valueList;
	}

	/**
	* @return Returns the Reference for the property valueId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
	final public Reference getValueId() {
		return valueId;
	}

	
	/**
	* @param valueId desired value for the property valueId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId
	*/
	final public void setValueId (Reference valueId) {
		this.valueId = valueId;
	}

}
