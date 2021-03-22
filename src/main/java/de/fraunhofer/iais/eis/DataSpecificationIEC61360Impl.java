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
	"Data Specification IEC 61360"

	"Data Specification Template for defining Property Descriptions conformant to IEC 61360."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360")
public class DataSpecificationIEC61360Impl implements Serializable, DataSpecificationIEC61360 {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Data Specification IEC 61360", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Data Specification Template for defining Property Descriptions conformant to IEC 61360.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has datatype"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType", "dataSpecificationIEC61360DataType"})
	 java.util.ArrayList<? extends DataTypeIEC61360> _dataSpecificationIEC61360DataType;


	/**
	"has definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition", "dataSpecificationIEC61360Definition"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _dataSpecificationIEC61360Definition;


	/**
	"has level type"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType", "dataSpecificationIEC61360LevelType"})
	 java.util.ArrayList<? extends LevelType> _dataSpecificationIEC61360LevelType;


	/**
	"has preferred name"
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName", "dataSpecificationIEC61360PreferredName"})
	 de.fraunhofer.iais.eis.util.TypedLiteral _dataSpecificationIEC61360PreferredName;


	/**
	"has short name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName", "dataSpecificationIEC61360ShortName"})
	 de.fraunhofer.iais.eis.util.TypedLiteral _dataSpecificationIEC61360ShortName;


	/**
	"has source of definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition", "dataSpecificationIEC61360SourceOfDefinition"})
	 String _dataSpecificationIEC61360SourceOfDefinition;


	/**
	"has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol", "dataSpecificationIEC61360Symbol"})
	 String _dataSpecificationIEC61360Symbol;


	/**
	"has unit"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit", "dataSpecificationIEC61360Unit"})
	 String _dataSpecificationIEC61360Unit;


	/**
	"has unit id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId", "dataSpecificationIEC61360UnitId"})
	 Reference _dataSpecificationIEC61360UnitId;


	/**
	"has value"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value", "dataSpecificationIEC61360Value"})
	 String _dataSpecificationIEC61360Value;


	/**
	"has value format"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat", "dataSpecificationIEC61360ValueFormat"})
	 String _dataSpecificationIEC61360ValueFormat;


	/**
	"has value id"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId", "dataSpecificationIEC61360ValueId"})
	 Reference _dataSpecificationIEC61360ValueId;


	/**
	"has value list"

	"The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList", "dataSpecificationIEC61360ValueList"})
	 String _dataSpecificationIEC61360ValueList;


	// no manual construction
	DataSpecificationIEC61360Impl() {
		id = VocabUtil.getInstance().createRandomUrl("dataSpecificationIEC61360");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
	java.util.ArrayList<? extends DataTypeIEC61360> getDataSpecificationIEC61360DataType() {
		return _dataSpecificationIEC61360DataType;
	}

	final public void setDataSpecificationIEC61360DataType (java.util.ArrayList<? extends DataTypeIEC61360> _dataSpecificationIEC61360DataType_) {
		this._dataSpecificationIEC61360DataType = _dataSpecificationIEC61360DataType_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getDataSpecificationIEC61360Definition() {
		return _dataSpecificationIEC61360Definition;
	}

	final public void setDataSpecificationIEC61360Definition (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _dataSpecificationIEC61360Definition_) {
		this._dataSpecificationIEC61360Definition = _dataSpecificationIEC61360Definition_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
	java.util.ArrayList<? extends LevelType> getDataSpecificationIEC61360LevelType() {
		return _dataSpecificationIEC61360LevelType;
	}

	final public void setDataSpecificationIEC61360LevelType (java.util.ArrayList<? extends LevelType> _dataSpecificationIEC61360LevelType_) {
		this._dataSpecificationIEC61360LevelType = _dataSpecificationIEC61360LevelType_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
	de.fraunhofer.iais.eis.util.TypedLiteral getDataSpecificationIEC61360PreferredName() {
		return _dataSpecificationIEC61360PreferredName;
	}

	final public void setDataSpecificationIEC61360PreferredName (de.fraunhofer.iais.eis.util.TypedLiteral _dataSpecificationIEC61360PreferredName_) {
		this._dataSpecificationIEC61360PreferredName = _dataSpecificationIEC61360PreferredName_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
	de.fraunhofer.iais.eis.util.TypedLiteral getDataSpecificationIEC61360ShortName() {
		return _dataSpecificationIEC61360ShortName;
	}

	final public void setDataSpecificationIEC61360ShortName (de.fraunhofer.iais.eis.util.TypedLiteral _dataSpecificationIEC61360ShortName_) {
		this._dataSpecificationIEC61360ShortName = _dataSpecificationIEC61360ShortName_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
	String getDataSpecificationIEC61360SourceOfDefinition() {
		return _dataSpecificationIEC61360SourceOfDefinition;
	}

	final public void setDataSpecificationIEC61360SourceOfDefinition (String _dataSpecificationIEC61360SourceOfDefinition_) {
		this._dataSpecificationIEC61360SourceOfDefinition = _dataSpecificationIEC61360SourceOfDefinition_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
	String getDataSpecificationIEC61360Symbol() {
		return _dataSpecificationIEC61360Symbol;
	}

	final public void setDataSpecificationIEC61360Symbol (String _dataSpecificationIEC61360Symbol_) {
		this._dataSpecificationIEC61360Symbol = _dataSpecificationIEC61360Symbol_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
	String getDataSpecificationIEC61360Unit() {
		return _dataSpecificationIEC61360Unit;
	}

	final public void setDataSpecificationIEC61360Unit (String _dataSpecificationIEC61360Unit_) {
		this._dataSpecificationIEC61360Unit = _dataSpecificationIEC61360Unit_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
	Reference getDataSpecificationIEC61360UnitId() {
		return _dataSpecificationIEC61360UnitId;
	}

	final public void setDataSpecificationIEC61360UnitId (Reference _dataSpecificationIEC61360UnitId_) {
		this._dataSpecificationIEC61360UnitId = _dataSpecificationIEC61360UnitId_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
	String getDataSpecificationIEC61360ValueFormat() {
		return _dataSpecificationIEC61360ValueFormat;
	}

	final public void setDataSpecificationIEC61360ValueFormat (String _dataSpecificationIEC61360ValueFormat_) {
		this._dataSpecificationIEC61360ValueFormat = _dataSpecificationIEC61360ValueFormat_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
	String getDataSpecificationIEC61360Value() {
		return _dataSpecificationIEC61360Value;
	}

	final public void setDataSpecificationIEC61360Value (String _dataSpecificationIEC61360Value_) {
		this._dataSpecificationIEC61360Value = _dataSpecificationIEC61360Value_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
	String getDataSpecificationIEC61360ValueList() {
		return _dataSpecificationIEC61360ValueList;
	}

	final public void setDataSpecificationIEC61360ValueList (String _dataSpecificationIEC61360ValueList_) {
		this._dataSpecificationIEC61360ValueList = _dataSpecificationIEC61360ValueList_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
	Reference getDataSpecificationIEC61360ValueId() {
		return _dataSpecificationIEC61360ValueId;
	}

	final public void setDataSpecificationIEC61360ValueId (Reference _dataSpecificationIEC61360ValueId_) {
		this._dataSpecificationIEC61360ValueId = _dataSpecificationIEC61360ValueId_;
	}

}
