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
	* This function allows setting a value for conversionFactor
	* @param conversionFactor desired value to be set
	* @return Builder object with new value for conversionFactor
	*/
	final public RC01Builder conversionFactor(List<String> conversionFactor) {
		this.defaultRC01.conversionFactor = conversionFactor;
		return this;
	}


	/**
	* This function allows setting a value for definition
	* @param definition desired value to be set
	* @return Builder object with new value for definition
	*/
	final public RC01Builder definition(List<TypedLiteral> definition) {
		this.defaultRC01.definition = definition;
		return this;
	}


	/**
	* This function allows setting a value for dinNotation
	* @param dinNotation desired value to be set
	* @return Builder object with new value for dinNotation
	*/
	final public RC01Builder dinNotation(List<String> dinNotation) {
		this.defaultRC01.dinNotation = dinNotation;
		return this;
	}


	/**
	* This function allows setting a value for eceCode
	* @param eceCode desired value to be set
	* @return Builder object with new value for eceCode
	*/
	final public RC01Builder eceCode(List<String> eceCode) {
		this.defaultRC01.eceCode = eceCode;
		return this;
	}


	/**
	* This function allows setting a value for eceName
	* @param eceName desired value to be set
	* @return Builder object with new value for eceName
	*/
	final public RC01Builder eceName(List<String> eceName) {
		this.defaultRC01.eceName = eceName;
		return this;
	}


	/**
	* This function allows setting a value for nistName
	* @param nistName desired value to be set
	* @return Builder object with new value for nistName
	*/
	final public RC01Builder nistName(List<String> nistName) {
		this.defaultRC01.nistName = nistName;
		return this;
	}


	/**
	* This function allows setting a value for siName
	* @param siName desired value to be set
	* @return Builder object with new value for siName
	*/
	final public RC01Builder siName(List<String> siName) {
		this.defaultRC01.siName = siName;
		return this;
	}


	/**
	* This function allows setting a value for siNotation
	* @param siNotation desired value to be set
	* @return Builder object with new value for siNotation
	*/
	final public RC01Builder siNotation(List<String> siNotation) {
		this.defaultRC01.siNotation = siNotation;
		return this;
	}


	/**
	* This function allows setting a value for registrationAuthorityId
	* @param registrationAuthorityId desired value to be set
	* @return Builder object with new value for registrationAuthorityId
	*/
	final public RC01Builder registrationAuthorityId(List<String> registrationAuthorityId) {
		this.defaultRC01.registrationAuthorityId = registrationAuthorityId;
		return this;
	}


	/**
	* This function allows setting a value for supplier
	* @param supplier desired value to be set
	* @return Builder object with new value for supplier
	*/
	final public RC01Builder supplier(List<String> supplier) {
		this.defaultRC01.supplier = supplier;
		return this;
	}


	/**
	* This function allows setting a value for unitName
	* @param unitName desired value to be set
	* @return Builder object with new value for unitName
	*/
	final public RC01Builder unitName(List<String> unitName) {
		this.defaultRC01.unitName = unitName;
		return this;
	}


	/**
	* This function allows setting a value for unitSymbol
	* @param unitSymbol desired value to be set
	* @return Builder object with new value for unitSymbol
	*/
	final public RC01Builder unitSymbol(List<String> unitSymbol) {
		this.defaultRC01.unitSymbol = unitSymbol;
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
