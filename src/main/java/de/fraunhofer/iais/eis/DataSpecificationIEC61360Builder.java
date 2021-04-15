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

public class DataSpecificationIEC61360Builder {

	private DefaultDataSpecificationIEC61360 defaultDataSpecificationIEC61360;

	public DataSpecificationIEC61360Builder() {
		defaultDataSpecificationIEC61360 = new DefaultDataSpecificationIEC61360();
	}

	public DataSpecificationIEC61360Builder(URI id) {
		this();
		defaultDataSpecificationIEC61360.id = id;
	}

	/**
	* This function allows setting a value for dataType
	* @param dataType desired value to be set
	* @return Builder object with new value for dataType
	*/
	final public DataSpecificationIEC61360Builder dataType(List<DataTypeIEC61360> dataType) {
		this.defaultDataSpecificationIEC61360.dataType = dataType;
		return this;
	}


	/**
	* This function allows setting a value for definition
	* @param definition desired value to be set
	* @return Builder object with new value for definition
	*/
	final public DataSpecificationIEC61360Builder definition(List<TypedLiteral> definition) {
		this.defaultDataSpecificationIEC61360.definition = definition;
		return this;
	}


	/**
	* This function allows setting a value for levelType
	* @param levelType desired value to be set
	* @return Builder object with new value for levelType
	*/
	final public DataSpecificationIEC61360Builder levelType(List<LevelType> levelType) {
		this.defaultDataSpecificationIEC61360.levelType = levelType;
		return this;
	}


	/**
	* This function allows setting a value for preferredName
	* @param preferredName desired value to be set
	* @return Builder object with new value for preferredName
	*/
	final public DataSpecificationIEC61360Builder preferredName(TypedLiteral preferredName) {
		this.defaultDataSpecificationIEC61360.preferredName = preferredName;
		return this;
	}


	/**
	* This function allows setting a value for shortName
	* @param shortName desired value to be set
	* @return Builder object with new value for shortName
	*/
	final public DataSpecificationIEC61360Builder shortName(TypedLiteral shortName) {
		this.defaultDataSpecificationIEC61360.shortName = shortName;
		return this;
	}


	/**
	* This function allows setting a value for sourceOfDefinition
	* @param sourceOfDefinition desired value to be set
	* @return Builder object with new value for sourceOfDefinition
	*/
	final public DataSpecificationIEC61360Builder sourceOfDefinition(String sourceOfDefinition) {
		this.defaultDataSpecificationIEC61360.sourceOfDefinition = sourceOfDefinition;
		return this;
	}


	/**
	* This function allows setting a value for symbol
	* @param symbol desired value to be set
	* @return Builder object with new value for symbol
	*/
	final public DataSpecificationIEC61360Builder symbol(String symbol) {
		this.defaultDataSpecificationIEC61360.symbol = symbol;
		return this;
	}


	/**
	* This function allows setting a value for unit
	* @param unit desired value to be set
	* @return Builder object with new value for unit
	*/
	final public DataSpecificationIEC61360Builder unit(String unit) {
		this.defaultDataSpecificationIEC61360.unit = unit;
		return this;
	}


	/**
	* This function allows setting a value for unitId
	* @param unitId desired value to be set
	* @return Builder object with new value for unitId
	*/
	final public DataSpecificationIEC61360Builder unitId(Reference unitId) {
		this.defaultDataSpecificationIEC61360.unitId = unitId;
		return this;
	}


	/**
	* This function allows setting a value for valueFormat
	* @param valueFormat desired value to be set
	* @return Builder object with new value for valueFormat
	*/
	final public DataSpecificationIEC61360Builder valueFormat(String valueFormat) {
		this.defaultDataSpecificationIEC61360.valueFormat = valueFormat;
		return this;
	}


	/**
	* This function allows setting a value for value
	* @param value desired value to be set
	* @return Builder object with new value for value
	*/
	final public DataSpecificationIEC61360Builder value(String value) {
		this.defaultDataSpecificationIEC61360.value = value;
		return this;
	}


	/**
	* This function allows setting a value for valueList
	* @param valueList desired value to be set
	* @return Builder object with new value for valueList
	*/
	final public DataSpecificationIEC61360Builder valueList(String valueList) {
		this.defaultDataSpecificationIEC61360.valueList = valueList;
		return this;
	}


	/**
	* This function allows setting a value for valueId
	* @param valueId desired value to be set
	* @return Builder object with new value for valueId
	*/
	final public DataSpecificationIEC61360Builder valueId(Reference valueId) {
		this.defaultDataSpecificationIEC61360.valueId = valueId;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public DataSpecificationIEC61360 build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultDataSpecificationIEC61360);
		return defaultDataSpecificationIEC61360;
	}
}
