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

public class PropertyBuilder {

	private DefaultProperty defaultProperty;

	public PropertyBuilder() {
		defaultProperty = new DefaultProperty();
	}

	public PropertyBuilder(URI id) {
		this();
		defaultProperty.id = id;
	}

	/**
	* This function allows setting a value for value
	* @param value desired value to be set
	* @return Builder object with new value for value
	*/
	final public PropertyBuilder value(TypedLiteral value) {
		this.defaultProperty.value = value;
		return this;
	}


	/**
	* This function allows setting a value for valueId
	* @param valueId desired value to be set
	* @return Builder object with new value for valueId
	*/
	final public PropertyBuilder valueId(Reference valueId) {
		this.defaultProperty.valueId = valueId;
		return this;
	}




	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public PropertyBuilder referableCategory(List<String> referableCategory) {
		this.defaultProperty.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public PropertyBuilder description(List<TypedLiteral> description) {
		this.defaultProperty.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public PropertyBuilder displayName(TypedLiteral displayName) {
		this.defaultProperty.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public PropertyBuilder idShort(String idShort) {
		this.defaultProperty.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public PropertyBuilder parent(URI parent) {
		this.defaultProperty.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifier
	* @param qualifier desired value to be set
	* @return Builder object with new value for qualifier
	*/
	final public PropertyBuilder qualifier(List<Constraint> qualifier) {
		this.defaultProperty.qualifier = qualifier;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public PropertyBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultProperty.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public PropertyBuilder kind(ModelingKind kind) {
		this.defaultProperty.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public PropertyBuilder semanticId(Reference semanticId) {
		this.defaultProperty.semanticId = semanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Property build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultProperty);
		return defaultProperty;
	}
}
