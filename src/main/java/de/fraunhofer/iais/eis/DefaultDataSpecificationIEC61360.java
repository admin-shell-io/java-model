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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360")
public class DefaultDataSpecificationIEC61360 implements Serializable, DataSpecificationIEC61360 {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Data Specification IEC 61360", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Data Specification Template for defining Property Descriptions conformant to IEC 61360.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has datatype"
	* "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	* "Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is STRING by default."@en
	* "Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
	* "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType", "dataSpecificationIEC61360DataType"})
	protected List<DataTypeIEC61360> dataSpecificationIEC61360DataTypes;


	/**
	* "has definition"
	* "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition", "dataSpecificationIEC61360Definition"})
	protected List<TypedLiteral> dataSpecificationIEC61360Definitions;


	/**
	* "has level type"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType", "dataSpecificationIEC61360LevelType"})
	protected List<LevelType> dataSpecificationIEC61360LevelTypes;


	/**
	* "has preferred name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName", "dataSpecificationIEC61360PreferredName"})
	protected TypedLiteral dataSpecificationIEC61360PreferredName;


	/**
	* "has short name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName", "dataSpecificationIEC61360ShortName"})
	protected TypedLiteral dataSpecificationIEC61360ShortName;


	/**
	* "has source of definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition", "dataSpecificationIEC61360SourceOfDefinition"})
	protected String dataSpecificationIEC61360SourceOfDefinition;


	/**
	* "has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol", "dataSpecificationIEC61360Symbol"})
	protected String dataSpecificationIEC61360Symbol;


	/**
	* "has unit"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit", "dataSpecificationIEC61360Unit"})
	protected String dataSpecificationIEC61360Unit;


	/**
	* "has unit id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId", "dataSpecificationIEC61360UnitId"})
	protected Reference dataSpecificationIEC61360UnitId;


	/**
	* "has value"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value", "dataSpecificationIEC61360Value"})
	protected String dataSpecificationIEC61360Value;


	/**
	* "has value format"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat", "dataSpecificationIEC61360ValueFormat"})
	protected String dataSpecificationIEC61360ValueFormat;


	/**
	* "has value id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId", "dataSpecificationIEC61360ValueId"})
	protected Reference dataSpecificationIEC61360ValueId;


	/**
	* "has value list"
	* "The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList", "dataSpecificationIEC61360ValueList"})
	protected String dataSpecificationIEC61360ValueList;


	// no manual construction
	protected DefaultDataSpecificationIEC61360() {
		id = VocabUtil.getInstance().createRandomUrl("dataSpecificationIEC61360");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.dataSpecificationIEC61360DataTypes,
			this.dataSpecificationIEC61360Definitions,
			this.dataSpecificationIEC61360LevelTypes,
			this.dataSpecificationIEC61360PreferredName,
			this.dataSpecificationIEC61360ShortName,
			this.dataSpecificationIEC61360SourceOfDefinition,
			this.dataSpecificationIEC61360Symbol,
			this.dataSpecificationIEC61360Unit,
			this.dataSpecificationIEC61360UnitId,
			this.dataSpecificationIEC61360ValueFormat,
			this.dataSpecificationIEC61360Value,
			this.dataSpecificationIEC61360ValueList,
			this.dataSpecificationIEC61360ValueId});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultDataSpecificationIEC61360 other = (DefaultDataSpecificationIEC61360) obj;
			return Objects.equals(this.dataSpecificationIEC61360DataTypes, other.dataSpecificationIEC61360DataTypes) &&
				Objects.equals(this.dataSpecificationIEC61360Definitions, other.dataSpecificationIEC61360Definitions) &&
				Objects.equals(this.dataSpecificationIEC61360LevelTypes, other.dataSpecificationIEC61360LevelTypes) &&
				Objects.equals(this.dataSpecificationIEC61360PreferredName, other.dataSpecificationIEC61360PreferredName) &&
				Objects.equals(this.dataSpecificationIEC61360ShortName, other.dataSpecificationIEC61360ShortName) &&
				Objects.equals(this.dataSpecificationIEC61360SourceOfDefinition, other.dataSpecificationIEC61360SourceOfDefinition) &&
				Objects.equals(this.dataSpecificationIEC61360Symbol, other.dataSpecificationIEC61360Symbol) &&
				Objects.equals(this.dataSpecificationIEC61360Unit, other.dataSpecificationIEC61360Unit) &&
				Objects.equals(this.dataSpecificationIEC61360UnitId, other.dataSpecificationIEC61360UnitId) &&
				Objects.equals(this.dataSpecificationIEC61360ValueFormat, other.dataSpecificationIEC61360ValueFormat) &&
				Objects.equals(this.dataSpecificationIEC61360Value, other.dataSpecificationIEC61360Value) &&
				Objects.equals(this.dataSpecificationIEC61360ValueList, other.dataSpecificationIEC61360ValueList) &&
				Objects.equals(this.dataSpecificationIEC61360ValueId, other.dataSpecificationIEC61360ValueId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
	final public List<DataTypeIEC61360> getDataSpecificationIEC61360DataTypes() {
		return dataSpecificationIEC61360DataTypes;
	}
	
	final public void setDataSpecificationIEC61360DataTypes (List<DataTypeIEC61360> dataSpecificationIEC61360DataTypes) {
		this.dataSpecificationIEC61360DataTypes = dataSpecificationIEC61360DataTypes;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
	final public List<TypedLiteral> getDataSpecificationIEC61360Definitions() {
		return dataSpecificationIEC61360Definitions;
	}
	
	final public void setDataSpecificationIEC61360Definitions (List<TypedLiteral> dataSpecificationIEC61360Definitions) {
		this.dataSpecificationIEC61360Definitions = dataSpecificationIEC61360Definitions;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
	final public List<LevelType> getDataSpecificationIEC61360LevelTypes() {
		return dataSpecificationIEC61360LevelTypes;
	}
	
	final public void setDataSpecificationIEC61360LevelTypes (List<LevelType> dataSpecificationIEC61360LevelTypes) {
		this.dataSpecificationIEC61360LevelTypes = dataSpecificationIEC61360LevelTypes;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
	final public TypedLiteral getDataSpecificationIEC61360PreferredName() {
		return dataSpecificationIEC61360PreferredName;
	}
	
	final public void setDataSpecificationIEC61360PreferredName (TypedLiteral dataSpecificationIEC61360PreferredName) {
		this.dataSpecificationIEC61360PreferredName = dataSpecificationIEC61360PreferredName;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
	final public TypedLiteral getDataSpecificationIEC61360ShortName() {
		return dataSpecificationIEC61360ShortName;
	}
	
	final public void setDataSpecificationIEC61360ShortName (TypedLiteral dataSpecificationIEC61360ShortName) {
		this.dataSpecificationIEC61360ShortName = dataSpecificationIEC61360ShortName;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
	final public String getDataSpecificationIEC61360SourceOfDefinition() {
		return dataSpecificationIEC61360SourceOfDefinition;
	}
	
	final public void setDataSpecificationIEC61360SourceOfDefinition (String dataSpecificationIEC61360SourceOfDefinition) {
		this.dataSpecificationIEC61360SourceOfDefinition = dataSpecificationIEC61360SourceOfDefinition;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
	final public String getDataSpecificationIEC61360Symbol() {
		return dataSpecificationIEC61360Symbol;
	}
	
	final public void setDataSpecificationIEC61360Symbol (String dataSpecificationIEC61360Symbol) {
		this.dataSpecificationIEC61360Symbol = dataSpecificationIEC61360Symbol;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
	final public String getDataSpecificationIEC61360Unit() {
		return dataSpecificationIEC61360Unit;
	}
	
	final public void setDataSpecificationIEC61360Unit (String dataSpecificationIEC61360Unit) {
		this.dataSpecificationIEC61360Unit = dataSpecificationIEC61360Unit;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
	final public Reference getDataSpecificationIEC61360UnitId() {
		return dataSpecificationIEC61360UnitId;
	}
	
	final public void setDataSpecificationIEC61360UnitId (Reference dataSpecificationIEC61360UnitId) {
		this.dataSpecificationIEC61360UnitId = dataSpecificationIEC61360UnitId;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
	final public String getDataSpecificationIEC61360ValueFormat() {
		return dataSpecificationIEC61360ValueFormat;
	}
	
	final public void setDataSpecificationIEC61360ValueFormat (String dataSpecificationIEC61360ValueFormat) {
		this.dataSpecificationIEC61360ValueFormat = dataSpecificationIEC61360ValueFormat;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
	final public String getDataSpecificationIEC61360Value() {
		return dataSpecificationIEC61360Value;
	}
	
	final public void setDataSpecificationIEC61360Value (String dataSpecificationIEC61360Value) {
		this.dataSpecificationIEC61360Value = dataSpecificationIEC61360Value;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
	final public String getDataSpecificationIEC61360ValueList() {
		return dataSpecificationIEC61360ValueList;
	}
	
	final public void setDataSpecificationIEC61360ValueList (String dataSpecificationIEC61360ValueList) {
		this.dataSpecificationIEC61360ValueList = dataSpecificationIEC61360ValueList;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
	final public Reference getDataSpecificationIEC61360ValueId() {
		return dataSpecificationIEC61360ValueId;
	}
	
	final public void setDataSpecificationIEC61360ValueId (Reference dataSpecificationIEC61360ValueId) {
		this.dataSpecificationIEC61360ValueId = dataSpecificationIEC61360ValueId;
	}

}
