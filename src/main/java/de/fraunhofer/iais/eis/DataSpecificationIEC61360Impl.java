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
	"Data Specification IEC 61360"

	"Data Specification Template for defining Property Descriptions conformant to IEC 61360."@en

	"Constraint AASd-075: For all ConceptDescriptions using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and Table 12.depending on its category are ignored and handled as undefined."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360")
public class DataSpecificationIEC61360Impl implements Serializable, IDataSpecificationIEC61360 {

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
	"has datatype"

	"Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en

	"Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is STRING by default."@en

	"Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en

	"Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType", "dataSpecificationIEC61360DataType"})
	protected ArrayList<? extends DataTypeIEC61360> _dataSpecificationIEC61360DataType;


	/**
	"has definition"

	"Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition", "dataSpecificationIEC61360Definition"})
	protected ArrayList<? extends TypedLiteral> _dataSpecificationIEC61360Definition;


	/**
	"has level type"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType", "dataSpecificationIEC61360LevelType"})
	protected ArrayList<? extends LevelType> _dataSpecificationIEC61360LevelType;


	/**
	"has preferred name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName", "dataSpecificationIEC61360PreferredName"})
	protected TypedLiteral _dataSpecificationIEC61360PreferredName;


	/**
	"has short name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName", "dataSpecificationIEC61360ShortName"})
	protected TypedLiteral _dataSpecificationIEC61360ShortName;


	/**
	"has source of definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition", "dataSpecificationIEC61360SourceOfDefinition"})
	protected String _dataSpecificationIEC61360SourceOfDefinition;


	/**
	"has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol", "dataSpecificationIEC61360Symbol"})
	protected String _dataSpecificationIEC61360Symbol;


	/**
	"has unit"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit", "dataSpecificationIEC61360Unit"})
	protected String _dataSpecificationIEC61360Unit;


	/**
	"has unit id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId", "dataSpecificationIEC61360UnitId"})
	protected IReference _dataSpecificationIEC61360UnitId;


	/**
	"has value"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value", "dataSpecificationIEC61360Value"})
	protected String _dataSpecificationIEC61360Value;


	/**
	"has value format"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat", "dataSpecificationIEC61360ValueFormat"})
	protected String _dataSpecificationIEC61360ValueFormat;


	/**
	"has value id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId", "dataSpecificationIEC61360ValueId"})
	protected IReference _dataSpecificationIEC61360ValueId;


	/**
	"has value list"

	"The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList", "dataSpecificationIEC61360ValueList"})
	protected String _dataSpecificationIEC61360ValueList;


	// no manual construction
	protected DataSpecificationIEC61360Impl() {
		id = VocabUtil.getInstance().createRandomUrl("dataSpecificationIEC61360");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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


	// accessor method implementations as derived from the Asset Administration Shell ontology

	/**
	"Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en

	"Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is STRING by default."@en

	"Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en

	"Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
	@return the List of dataSpecificationIEC61360DataType
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
	final public List<? extends DataTypeIEC61360> getDataSpecificationIEC61360DataType() {
		return _dataSpecificationIEC61360DataType;
	}

	final public void setDataSpecificationIEC61360DataType (ArrayList<? extends DataTypeIEC61360> _dataSpecificationIEC61360DataType_) {
		this._dataSpecificationIEC61360DataType = _dataSpecificationIEC61360DataType_;
	}

	/**
	"Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -  DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
	@return the List of dataSpecificationIEC61360Definition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
	final public List<? extends TypedLiteral> getDataSpecificationIEC61360Definition() {
		return _dataSpecificationIEC61360Definition;
	}

	final public void setDataSpecificationIEC61360Definition (ArrayList<? extends TypedLiteral> _dataSpecificationIEC61360Definition_) {
		this._dataSpecificationIEC61360Definition = _dataSpecificationIEC61360Definition_;
	}

	/**
	@return the List of dataSpecificationIEC61360LevelType
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
	final public List<? extends LevelType> getDataSpecificationIEC61360LevelType() {
		return _dataSpecificationIEC61360LevelType;
	}

	final public void setDataSpecificationIEC61360LevelType (ArrayList<? extends LevelType> _dataSpecificationIEC61360LevelType_) {
		this._dataSpecificationIEC61360LevelType = _dataSpecificationIEC61360LevelType_;
	}

	/**
	@return the TypedLiteral of dataSpecificationIEC61360PreferredName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
	final public TypedLiteral getDataSpecificationIEC61360PreferredName() {
		return _dataSpecificationIEC61360PreferredName;
	}

	final public void setDataSpecificationIEC61360PreferredName (TypedLiteral _dataSpecificationIEC61360PreferredName_) {
		this._dataSpecificationIEC61360PreferredName = _dataSpecificationIEC61360PreferredName_;
	}

	/**
	@return the TypedLiteral of dataSpecificationIEC61360ShortName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
	final public TypedLiteral getDataSpecificationIEC61360ShortName() {
		return _dataSpecificationIEC61360ShortName;
	}

	final public void setDataSpecificationIEC61360ShortName (TypedLiteral _dataSpecificationIEC61360ShortName_) {
		this._dataSpecificationIEC61360ShortName = _dataSpecificationIEC61360ShortName_;
	}

	/**
	@return the String of dataSpecificationIEC61360SourceOfDefinition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
	final public String getDataSpecificationIEC61360SourceOfDefinition() {
		return _dataSpecificationIEC61360SourceOfDefinition;
	}

	final public void setDataSpecificationIEC61360SourceOfDefinition (String _dataSpecificationIEC61360SourceOfDefinition_) {
		this._dataSpecificationIEC61360SourceOfDefinition = _dataSpecificationIEC61360SourceOfDefinition_;
	}

	/**
	@return the String of dataSpecificationIEC61360Symbol
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
	final public String getDataSpecificationIEC61360Symbol() {
		return _dataSpecificationIEC61360Symbol;
	}

	final public void setDataSpecificationIEC61360Symbol (String _dataSpecificationIEC61360Symbol_) {
		this._dataSpecificationIEC61360Symbol = _dataSpecificationIEC61360Symbol_;
	}

	/**
	@return the String of dataSpecificationIEC61360Unit
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
	final public String getDataSpecificationIEC61360Unit() {
		return _dataSpecificationIEC61360Unit;
	}

	final public void setDataSpecificationIEC61360Unit (String _dataSpecificationIEC61360Unit_) {
		this._dataSpecificationIEC61360Unit = _dataSpecificationIEC61360Unit_;
	}

	/**
	@return the IReference of dataSpecificationIEC61360UnitId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
	final public IReference getDataSpecificationIEC61360UnitId() {
		return _dataSpecificationIEC61360UnitId;
	}

	final public void setDataSpecificationIEC61360UnitId (IReference _dataSpecificationIEC61360UnitId_) {
		this._dataSpecificationIEC61360UnitId = _dataSpecificationIEC61360UnitId_;
	}

	/**
	@return the String of dataSpecificationIEC61360ValueFormat
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
	final public String getDataSpecificationIEC61360ValueFormat() {
		return _dataSpecificationIEC61360ValueFormat;
	}

	final public void setDataSpecificationIEC61360ValueFormat (String _dataSpecificationIEC61360ValueFormat_) {
		this._dataSpecificationIEC61360ValueFormat = _dataSpecificationIEC61360ValueFormat_;
	}

	/**
	@return the String of dataSpecificationIEC61360Value
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
	final public String getDataSpecificationIEC61360Value() {
		return _dataSpecificationIEC61360Value;
	}

	final public void setDataSpecificationIEC61360Value (String _dataSpecificationIEC61360Value_) {
		this._dataSpecificationIEC61360Value = _dataSpecificationIEC61360Value_;
	}

	/**
	"The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	@return the String of dataSpecificationIEC61360ValueList
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
	final public String getDataSpecificationIEC61360ValueList() {
		return _dataSpecificationIEC61360ValueList;
	}

	final public void setDataSpecificationIEC61360ValueList (String _dataSpecificationIEC61360ValueList_) {
		this._dataSpecificationIEC61360ValueList = _dataSpecificationIEC61360ValueList_;
	}

	/**
	@return the IReference of dataSpecificationIEC61360ValueId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
	final public IReference getDataSpecificationIEC61360ValueId() {
		return _dataSpecificationIEC61360ValueId;
	}

	final public void setDataSpecificationIEC61360ValueId (IReference _dataSpecificationIEC61360ValueId_) {
		this._dataSpecificationIEC61360ValueId = _dataSpecificationIEC61360ValueId_;
	}

}
