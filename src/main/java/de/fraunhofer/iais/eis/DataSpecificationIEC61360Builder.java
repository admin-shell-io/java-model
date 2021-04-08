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

public class DataSpecificationIEC61360Builder {

	private DataSpecificationIEC61360Impl dataSpecificationIEC61360Impl;

	public DataSpecificationIEC61360Builder() {
		dataSpecificationIEC61360Impl = new DataSpecificationIEC61360Impl();
	}

	public DataSpecificationIEC61360Builder(URI id) {
		this();
		dataSpecificationIEC61360Impl.id = id;
	}

	/**
	* This function allows setting a value for dataSpecificationIEC61360DataType
	* @param _dataSpecificationIEC61360DataType_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360DataType
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360DataType_(ArrayList<? extends DataTypeIEC61360> _dataSpecificationIEC61360DataType_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360DataType = _dataSpecificationIEC61360DataType_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Definition
	* @param _dataSpecificationIEC61360Definition_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Definition
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360Definition_(ArrayList<? extends TypedLiteral> _dataSpecificationIEC61360Definition_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360Definition = _dataSpecificationIEC61360Definition_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360LevelType
	* @param _dataSpecificationIEC61360LevelType_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360LevelType
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360LevelType_(ArrayList<? extends LevelType> _dataSpecificationIEC61360LevelType_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360LevelType = _dataSpecificationIEC61360LevelType_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360PreferredName
	* @param _dataSpecificationIEC61360PreferredName_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360PreferredName
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360PreferredName_(TypedLiteral _dataSpecificationIEC61360PreferredName_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360PreferredName = _dataSpecificationIEC61360PreferredName_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ShortName
	* @param _dataSpecificationIEC61360ShortName_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ShortName
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360ShortName_(TypedLiteral _dataSpecificationIEC61360ShortName_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360ShortName = _dataSpecificationIEC61360ShortName_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360SourceOfDefinition
	* @param _dataSpecificationIEC61360SourceOfDefinition_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360SourceOfDefinition
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360SourceOfDefinition_(String _dataSpecificationIEC61360SourceOfDefinition_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360SourceOfDefinition = _dataSpecificationIEC61360SourceOfDefinition_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Symbol
	* @param _dataSpecificationIEC61360Symbol_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Symbol
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360Symbol_(String _dataSpecificationIEC61360Symbol_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360Symbol = _dataSpecificationIEC61360Symbol_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Unit
	* @param _dataSpecificationIEC61360Unit_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Unit
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360Unit_(String _dataSpecificationIEC61360Unit_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360Unit = _dataSpecificationIEC61360Unit_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360UnitId
	* @param _dataSpecificationIEC61360UnitId_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360UnitId
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360UnitId_(IReference _dataSpecificationIEC61360UnitId_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360UnitId = _dataSpecificationIEC61360UnitId_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ValueFormat
	* @param _dataSpecificationIEC61360ValueFormat_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ValueFormat
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360ValueFormat_(String _dataSpecificationIEC61360ValueFormat_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360ValueFormat = _dataSpecificationIEC61360ValueFormat_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360Value
	* @param _dataSpecificationIEC61360Value_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360Value
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360Value_(String _dataSpecificationIEC61360Value_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360Value = _dataSpecificationIEC61360Value_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ValueList
	* @param _dataSpecificationIEC61360ValueList_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ValueList
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360ValueList_(String _dataSpecificationIEC61360ValueList_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360ValueList = _dataSpecificationIEC61360ValueList_;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecificationIEC61360ValueId
	* @param _dataSpecificationIEC61360ValueId_ desired value to be set
	* @return Builder object with new value for dataSpecificationIEC61360ValueId
	*/
	final public DataSpecificationIEC61360Builder _dataSpecificationIEC61360ValueId_(IReference _dataSpecificationIEC61360ValueId_) {
		this.dataSpecificationIEC61360Impl._dataSpecificationIEC61360ValueId = _dataSpecificationIEC61360ValueId_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IDataSpecificationIEC61360 build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dataSpecificationIEC61360Impl);
		return dataSpecificationIEC61360Impl;
	}
}
