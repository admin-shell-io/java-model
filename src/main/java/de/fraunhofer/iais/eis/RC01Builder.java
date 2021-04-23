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

public class RC01Builder {

	private DefaultRC01 defaultRC01;

	public RC01Builder() {
		defaultRC01 = new DefaultRC01();
	}

	public RC01Builder(URI id) {
		this();
		defaultRC01.id = id;
	}

	/**
	* This function allows setting a value for rC01ConversionFactors
	* @param rC01ConversionFactors desired value to be set
	* @return Builder object with new value for rC01ConversionFactors
	*/
	final public RC01Builder rC01ConversionFactors(List<String> rC01ConversionFactors) {
		this.defaultRC01.rC01ConversionFactors = rC01ConversionFactors;
		return this;
	}


	/**
	* This function allows setting a value for rC01Definitions
	* @param rC01Definitions desired value to be set
	* @return Builder object with new value for rC01Definitions
	*/
	final public RC01Builder rC01Definitions(List<TypedLiteral> rC01Definitions) {
		this.defaultRC01.rC01Definitions = rC01Definitions;
		return this;
	}


	/**
	* This function allows setting a value for rC01DinNotations
	* @param rC01DinNotations desired value to be set
	* @return Builder object with new value for rC01DinNotations
	*/
	final public RC01Builder rC01DinNotations(List<String> rC01DinNotations) {
		this.defaultRC01.rC01DinNotations = rC01DinNotations;
		return this;
	}


	/**
	* This function allows setting a value for rC01EceCodes
	* @param rC01EceCodes desired value to be set
	* @return Builder object with new value for rC01EceCodes
	*/
	final public RC01Builder rC01EceCodes(List<String> rC01EceCodes) {
		this.defaultRC01.rC01EceCodes = rC01EceCodes;
		return this;
	}


	/**
	* This function allows setting a value for rC01EceNames
	* @param rC01EceNames desired value to be set
	* @return Builder object with new value for rC01EceNames
	*/
	final public RC01Builder rC01EceNames(List<String> rC01EceNames) {
		this.defaultRC01.rC01EceNames = rC01EceNames;
		return this;
	}


	/**
	* This function allows setting a value for rC01NistNames
	* @param rC01NistNames desired value to be set
	* @return Builder object with new value for rC01NistNames
	*/
	final public RC01Builder rC01NistNames(List<String> rC01NistNames) {
		this.defaultRC01.rC01NistNames = rC01NistNames;
		return this;
	}


	/**
	* This function allows setting a value for rC01SiNames
	* @param rC01SiNames desired value to be set
	* @return Builder object with new value for rC01SiNames
	*/
	final public RC01Builder rC01SiNames(List<String> rC01SiNames) {
		this.defaultRC01.rC01SiNames = rC01SiNames;
		return this;
	}


	/**
	* This function allows setting a value for rC01SiNotations
	* @param rC01SiNotations desired value to be set
	* @return Builder object with new value for rC01SiNotations
	*/
	final public RC01Builder rC01SiNotations(List<String> rC01SiNotations) {
		this.defaultRC01.rC01SiNotations = rC01SiNotations;
		return this;
	}


	/**
	* This function allows setting a value for rC01RegistrationAuthorityIds
	* @param rC01RegistrationAuthorityIds desired value to be set
	* @return Builder object with new value for rC01RegistrationAuthorityIds
	*/
	final public RC01Builder rC01RegistrationAuthorityIds(List<String> rC01RegistrationAuthorityIds) {
		this.defaultRC01.rC01RegistrationAuthorityIds = rC01RegistrationAuthorityIds;
		return this;
	}


	/**
	* This function allows setting a value for rC01Suppliers
	* @param rC01Suppliers desired value to be set
	* @return Builder object with new value for rC01Suppliers
	*/
	final public RC01Builder rC01Suppliers(List<String> rC01Suppliers) {
		this.defaultRC01.rC01Suppliers = rC01Suppliers;
		return this;
	}


	/**
	* This function allows setting a value for rC01UnitNames
	* @param rC01UnitNames desired value to be set
	* @return Builder object with new value for rC01UnitNames
	*/
	final public RC01Builder rC01UnitNames(List<String> rC01UnitNames) {
		this.defaultRC01.rC01UnitNames = rC01UnitNames;
		return this;
	}


	/**
	* This function allows setting a value for rC01UnitSymbols
	* @param rC01UnitSymbols desired value to be set
	* @return Builder object with new value for rC01UnitSymbols
	*/
	final public RC01Builder rC01UnitSymbols(List<String> rC01UnitSymbols) {
		this.defaultRC01.rC01UnitSymbols = rC01UnitSymbols;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public RC01 build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultRC01);
		return defaultRC01;
	}
}
