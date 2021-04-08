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

public class RC01Builder {

	private RC01Impl rC01Impl;

	public RC01Builder() {
		rC01Impl = new RC01Impl();
	}

	public RC01Builder(URI id) {
		this();
		rC01Impl.id = id;
	}

	/**
	* This function allows setting a value for rC01ConversionFactor
	* @param _rC01ConversionFactor_ desired value to be set
	* @return Builder object with new value for rC01ConversionFactor
	*/
	final public RC01Builder _rC01ConversionFactor_(ArrayList<? extends String> _rC01ConversionFactor_) {
		this.rC01Impl._rC01ConversionFactor = _rC01ConversionFactor_;
		return this;
	}


	/**
	* This function allows setting a value for rC01Definition
	* @param _rC01Definition_ desired value to be set
	* @return Builder object with new value for rC01Definition
	*/
	final public RC01Builder _rC01Definition_(ArrayList<? extends TypedLiteral> _rC01Definition_) {
		this.rC01Impl._rC01Definition = _rC01Definition_;
		return this;
	}


	/**
	* This function allows setting a value for rC01DinNotation
	* @param _rC01DinNotation_ desired value to be set
	* @return Builder object with new value for rC01DinNotation
	*/
	final public RC01Builder _rC01DinNotation_(ArrayList<? extends String> _rC01DinNotation_) {
		this.rC01Impl._rC01DinNotation = _rC01DinNotation_;
		return this;
	}


	/**
	* This function allows setting a value for rC01EceCode
	* @param _rC01EceCode_ desired value to be set
	* @return Builder object with new value for rC01EceCode
	*/
	final public RC01Builder _rC01EceCode_(ArrayList<? extends String> _rC01EceCode_) {
		this.rC01Impl._rC01EceCode = _rC01EceCode_;
		return this;
	}


	/**
	* This function allows setting a value for rC01EceName
	* @param _rC01EceName_ desired value to be set
	* @return Builder object with new value for rC01EceName
	*/
	final public RC01Builder _rC01EceName_(ArrayList<? extends String> _rC01EceName_) {
		this.rC01Impl._rC01EceName = _rC01EceName_;
		return this;
	}


	/**
	* This function allows setting a value for rC01NistName
	* @param _rC01NistName_ desired value to be set
	* @return Builder object with new value for rC01NistName
	*/
	final public RC01Builder _rC01NistName_(ArrayList<? extends String> _rC01NistName_) {
		this.rC01Impl._rC01NistName = _rC01NistName_;
		return this;
	}


	/**
	* This function allows setting a value for rC01SiName
	* @param _rC01SiName_ desired value to be set
	* @return Builder object with new value for rC01SiName
	*/
	final public RC01Builder _rC01SiName_(ArrayList<? extends String> _rC01SiName_) {
		this.rC01Impl._rC01SiName = _rC01SiName_;
		return this;
	}


	/**
	* This function allows setting a value for rC01SiNotation
	* @param _rC01SiNotation_ desired value to be set
	* @return Builder object with new value for rC01SiNotation
	*/
	final public RC01Builder _rC01SiNotation_(ArrayList<? extends String> _rC01SiNotation_) {
		this.rC01Impl._rC01SiNotation = _rC01SiNotation_;
		return this;
	}


	/**
	* This function allows setting a value for rC01RegistrationAuthorityId
	* @param _rC01RegistrationAuthorityId_ desired value to be set
	* @return Builder object with new value for rC01RegistrationAuthorityId
	*/
	final public RC01Builder _rC01RegistrationAuthorityId_(ArrayList<? extends String> _rC01RegistrationAuthorityId_) {
		this.rC01Impl._rC01RegistrationAuthorityId = _rC01RegistrationAuthorityId_;
		return this;
	}


	/**
	* This function allows setting a value for rC01Supplier
	* @param _rC01Supplier_ desired value to be set
	* @return Builder object with new value for rC01Supplier
	*/
	final public RC01Builder _rC01Supplier_(ArrayList<? extends String> _rC01Supplier_) {
		this.rC01Impl._rC01Supplier = _rC01Supplier_;
		return this;
	}


	/**
	* This function allows setting a value for rC01UnitName
	* @param _rC01UnitName_ desired value to be set
	* @return Builder object with new value for rC01UnitName
	*/
	final public RC01Builder _rC01UnitName_(ArrayList<? extends String> _rC01UnitName_) {
		this.rC01Impl._rC01UnitName = _rC01UnitName_;
		return this;
	}


	/**
	* This function allows setting a value for rC01UnitSymbol
	* @param _rC01UnitSymbol_ desired value to be set
	* @return Builder object with new value for rC01UnitSymbol
	*/
	final public RC01Builder _rC01UnitSymbol_(ArrayList<? extends String> _rC01UnitSymbol_) {
		this.rC01Impl._rC01UnitSymbol = _rC01UnitSymbol_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IRC01 build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rC01Impl);
		return rC01Impl;
	}
}
