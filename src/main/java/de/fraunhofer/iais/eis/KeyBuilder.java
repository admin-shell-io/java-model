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

public class KeyBuilder {

	private DefaultKey defaultKey;

	public KeyBuilder() {
		defaultKey = new DefaultKey();
	}

	public KeyBuilder(URI id) {
		this();
		defaultKey.id = id;
	}

	/**
	* This function allows setting a value for keyIdType
	* @param keyIdType desired value to be set
	* @return Builder object with new value for keyIdType
	*/
	final public KeyBuilder keyIdType(KeyType keyIdType) {
		this.defaultKey.keyIdType = keyIdType;
		return this;
	}


	/**
	* This function allows setting a value for keyType
	* @param keyType desired value to be set
	* @return Builder object with new value for keyType
	*/
	final public KeyBuilder keyType(KeyElements keyType) {
		this.defaultKey.keyType = keyType;
		return this;
	}


	/**
	* This function allows setting a value for keyValue
	* @param keyValue desired value to be set
	* @return Builder object with new value for keyValue
	*/
	final public KeyBuilder keyValue(String keyValue) {
		this.defaultKey.keyValue = keyValue;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Key build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultKey);
		return defaultKey;
	}
}
