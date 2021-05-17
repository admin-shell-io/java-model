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

public class QualifierBuilder {

	private Map<String, Object> map;

	public QualifierBuilder() {
		this.map = new HashMap<>();
	}

	public QualifierBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for type
	* @param type desired value to be set
	* @return Builder object with new value for type
	*/
	public QualifierBuilder type(String type) {
		this.map.put("type", type);
		return this;
	}


	/**
	* This function allows setting a value for valueType
	* @param valueType desired value to be set
	* @return Builder object with new value for valueType
	*/
	public QualifierBuilder valueType(String valueType) {
		this.map.put("valueType", valueType);
		return this;
	}


	/**
	* This function allows setting a value for value
	* @param value desired value to be set
	* @return Builder object with new value for value
	*/
	public QualifierBuilder value(TypedLiteral value) {
		this.map.put("value", value);
		return this;
	}


	/**
	* This function allows setting a value for valueId
	* @param valueId desired value to be set
	* @return Builder object with new value for valueId
	*/
	public QualifierBuilder valueId(Reference valueId) {
		this.map.put("valueId", valueId);
		return this;
	}



	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	public QualifierBuilder semanticId(Reference semanticId) {
		this.map.put("semanticId", semanticId);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public Qualifier build() throws ConstraintViolationException {
		DefaultQualifier defaultQualifier = Util.fillInstanceFromMap(new DefaultQualifier(), this.map);
		return defaultQualifier;
	}
}
