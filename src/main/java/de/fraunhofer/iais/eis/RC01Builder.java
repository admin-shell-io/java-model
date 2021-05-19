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

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RC01Builder {

	private Map<String, Object> map;

	public RC01Builder() {
		this.map = new HashMap<>();
	}

	public RC01Builder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for conversionFactors
	* @param conversionFactors desired value to be set
	* @return Builder object with new value for conversionFactors
	*/
	public RC01Builder conversionFactors(List<String> conversionFactors) {
		this.map.put("conversionFactors", conversionFactors);
		return this;
	}


	/**
	* This function allows setting a value for definitions
	* @param definitions desired value to be set
	* @return Builder object with new value for definitions
	*/
	public RC01Builder definitions(List<LangString> definitions) {
		this.map.put("definitions", definitions);
		return this;
	}


	/**
	* This function allows setting a value for dinNotations
	* @param dinNotations desired value to be set
	* @return Builder object with new value for dinNotations
	*/
	public RC01Builder dinNotations(List<String> dinNotations) {
		this.map.put("dinNotations", dinNotations);
		return this;
	}


	/**
	* This function allows setting a value for eceCodes
	* @param eceCodes desired value to be set
	* @return Builder object with new value for eceCodes
	*/
	public RC01Builder eceCodes(List<String> eceCodes) {
		this.map.put("eceCodes", eceCodes);
		return this;
	}


	/**
	* This function allows setting a value for eceNames
	* @param eceNames desired value to be set
	* @return Builder object with new value for eceNames
	*/
	public RC01Builder eceNames(List<String> eceNames) {
		this.map.put("eceNames", eceNames);
		return this;
	}


	/**
	* This function allows setting a value for nistNames
	* @param nistNames desired value to be set
	* @return Builder object with new value for nistNames
	*/
	public RC01Builder nistNames(List<String> nistNames) {
		this.map.put("nistNames", nistNames);
		return this;
	}


	/**
	* This function allows setting a value for siNames
	* @param siNames desired value to be set
	* @return Builder object with new value for siNames
	*/
	public RC01Builder siNames(List<String> siNames) {
		this.map.put("siNames", siNames);
		return this;
	}


	/**
	* This function allows setting a value for siNotations
	* @param siNotations desired value to be set
	* @return Builder object with new value for siNotations
	*/
	public RC01Builder siNotations(List<String> siNotations) {
		this.map.put("siNotations", siNotations);
		return this;
	}


	/**
	* This function allows setting a value for registrationAuthorityIds
	* @param registrationAuthorityIds desired value to be set
	* @return Builder object with new value for registrationAuthorityIds
	*/
	public RC01Builder registrationAuthorityIds(List<String> registrationAuthorityIds) {
		this.map.put("registrationAuthorityIds", registrationAuthorityIds);
		return this;
	}


	/**
	* This function allows setting a value for suppliers
	* @param suppliers desired value to be set
	* @return Builder object with new value for suppliers
	*/
	public RC01Builder suppliers(List<String> suppliers) {
		this.map.put("suppliers", suppliers);
		return this;
	}


	/**
	* This function allows setting a value for unitNames
	* @param unitNames desired value to be set
	* @return Builder object with new value for unitNames
	*/
	public RC01Builder unitNames(List<String> unitNames) {
		this.map.put("unitNames", unitNames);
		return this;
	}


	/**
	* This function allows setting a value for unitSymbols
	* @param unitSymbols desired value to be set
	* @return Builder object with new value for unitSymbols
	*/
	public RC01Builder unitSymbols(List<String> unitSymbols) {
		this.map.put("unitSymbols", unitSymbols);
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public RC01 build() throws ConstraintViolationException {
		DefaultRC01 defaultRC01 = Util.fillInstanceFromMap(new DefaultRC01(), this.map);
		return defaultRC01;
	}
}
