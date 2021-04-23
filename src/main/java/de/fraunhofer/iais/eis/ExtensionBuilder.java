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

public class ExtensionBuilder {

	private DefaultExtension defaultExtension;

	public ExtensionBuilder() {
		defaultExtension = new DefaultExtension();
	}

	public ExtensionBuilder(URI id) {
		this();
		defaultExtension.id = id;
	}

	/**
	* This function allows setting a value for extensionName
	* @param extensionName desired value to be set
	* @return Builder object with new value for extensionName
	*/
	final public ExtensionBuilder extensionName(String extensionName) {
		this.defaultExtension.extensionName = extensionName;
		return this;
	}


	/**
	* This function allows setting a value for extensionValueType
	* @param extensionValueType desired value to be set
	* @return Builder object with new value for extensionValueType
	*/
	final public ExtensionBuilder extensionValueType(String extensionValueType) {
		this.defaultExtension.extensionValueType = extensionValueType;
		return this;
	}


	/**
	* This function allows setting a value for extensionValue
	* @param extensionValue desired value to be set
	* @return Builder object with new value for extensionValue
	*/
	final public ExtensionBuilder extensionValue(String extensionValue) {
		this.defaultExtension.extensionValue = extensionValue;
		return this;
	}


	/**
	* This function allows setting a value for extensionRefersTo
	* @param extensionRefersTo desired value to be set
	* @return Builder object with new value for extensionRefersTo
	*/
	final public ExtensionBuilder extensionRefersTo(Reference extensionRefersTo) {
		this.defaultExtension.extensionRefersTo = extensionRefersTo;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public ExtensionBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultExtension.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Extension build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultExtension);
		return defaultExtension;
	}
}
