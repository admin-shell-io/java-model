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

	"Data Specification Template for defining Property Descriptions conformant to IEC 61360."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = DataSpecificationIEC61360Impl.class),})
public interface DataSpecificationIEC61360 extends DataSpecificationContent {

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
	"has datatype"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
	java.util.ArrayList<? extends DataTypeIEC61360> getDataSpecificationIEC61360DataType();
	/**
	"has definition"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getDataSpecificationIEC61360Definition();
	/**
	"has level type"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
	java.util.ArrayList<? extends LevelType> getDataSpecificationIEC61360LevelType();
	/**
	"has preferred name"
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
	de.fraunhofer.iais.eis.util.TypedLiteral getDataSpecificationIEC61360PreferredName();
	/**
	"has short name"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
	de.fraunhofer.iais.eis.util.TypedLiteral getDataSpecificationIEC61360ShortName();
	/**
	"has source of definition"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
	String getDataSpecificationIEC61360SourceOfDefinition();
	/**
	"has symbol"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
	String getDataSpecificationIEC61360Symbol();
	/**
	"has unit"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
	String getDataSpecificationIEC61360Unit();
	/**
	"has unit id"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
	Reference getDataSpecificationIEC61360UnitId();
	/**
	"has value format"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
	String getDataSpecificationIEC61360ValueFormat();
	/**
	"has value"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
	String getDataSpecificationIEC61360Value();
	/**
	"has value list"

	"The Type \'ValueList\' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
	String getDataSpecificationIEC61360ValueList();
	/**
	"has value id"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
	Reference getDataSpecificationIEC61360ValueId();
}
