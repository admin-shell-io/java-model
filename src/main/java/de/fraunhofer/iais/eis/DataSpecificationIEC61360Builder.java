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
	* This function allows setting a value for dataSpecificationIEC61360DataTypes
	* @param dataSpecificationIEC61360DataTypes desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360DataTypes
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360DataTypes(List<DataTypeIEC61360> dataSpecificationIEC61360DataTypes) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360DataTypes = dataSpecificationIEC61360DataTypes;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Definitions
	* @param dataSpecificationIEC61360Definitions desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Definitions
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360Definitions(List<TypedLiteral> dataSpecificationIEC61360Definitions) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360Definitions = dataSpecificationIEC61360Definitions;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360LevelTypes
	* @param dataSpecificationIEC61360LevelTypes desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360LevelTypes
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360LevelTypes(List<LevelType> dataSpecificationIEC61360LevelTypes) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360LevelTypes = dataSpecificationIEC61360LevelTypes;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360PreferredName
	* @param dataSpecificationIEC61360PreferredName desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360PreferredName
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360PreferredName(TypedLiteral dataSpecificationIEC61360PreferredName) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360PreferredName = dataSpecificationIEC61360PreferredName;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ShortName
	* @param dataSpecificationIEC61360ShortName desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ShortName
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360ShortName(TypedLiteral dataSpecificationIEC61360ShortName) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360ShortName = dataSpecificationIEC61360ShortName;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360SourceOfDefinition
	* @param dataSpecificationIEC61360SourceOfDefinition desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360SourceOfDefinition
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360SourceOfDefinition(String dataSpecificationIEC61360SourceOfDefinition) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360SourceOfDefinition = dataSpecificationIEC61360SourceOfDefinition;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Symbol
	* @param dataSpecificationIEC61360Symbol desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Symbol
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360Symbol(String dataSpecificationIEC61360Symbol) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360Symbol = dataSpecificationIEC61360Symbol;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Unit
	* @param dataSpecificationIEC61360Unit desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Unit
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360Unit(String dataSpecificationIEC61360Unit) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360Unit = dataSpecificationIEC61360Unit;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360UnitId
	* @param dataSpecificationIEC61360UnitId desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360UnitId
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360UnitId(Reference dataSpecificationIEC61360UnitId) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360UnitId = dataSpecificationIEC61360UnitId;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ValueFormat
	* @param dataSpecificationIEC61360ValueFormat desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ValueFormat
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360ValueFormat(String dataSpecificationIEC61360ValueFormat) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360ValueFormat = dataSpecificationIEC61360ValueFormat;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Value
	* @param dataSpecificationIEC61360Value desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Value
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360Value(String dataSpecificationIEC61360Value) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360Value = dataSpecificationIEC61360Value;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ValueList
	* @param dataSpecificationIEC61360ValueList desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ValueList
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360ValueList(String dataSpecificationIEC61360ValueList) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360ValueList = dataSpecificationIEC61360ValueList;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ValueId
	* @param dataSpecificationIEC61360ValueId desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ValueId
	*/
	final public DataSpecificationIEC61360Builder dataSpecificationIEC61360ValueId(Reference dataSpecificationIEC61360ValueId) {
		this.defaultDataSpecificationIEC61360.dataSpecificationIEC61360ValueId = dataSpecificationIEC61360ValueId;
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
