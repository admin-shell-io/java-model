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

public class MultiLanguagePropertyBuilder {

	private DefaultMultiLanguageProperty defaultMultiLanguageProperty;

	public MultiLanguagePropertyBuilder() {
		defaultMultiLanguageProperty = new DefaultMultiLanguageProperty();
	}

	public MultiLanguagePropertyBuilder(URI id) {
		this();
		defaultMultiLanguageProperty.id = id;
	}

	/**
	* This function allows setting a value for value
	* @param value desired value to be set
	* @return Builder object with new value for value
	*/
	final public MultiLanguagePropertyBuilder value(List<TypedLiteral> value) {
		this.defaultMultiLanguageProperty.value = value;
		return this;
	}


	/**
	* This function allows setting a value for valueId
	* @param valueId desired value to be set
	* @return Builder object with new value for valueId
	*/
	final public MultiLanguagePropertyBuilder valueId(List<Reference> valueId) {
		this.defaultMultiLanguageProperty.valueId = valueId;
		return this;
	}




	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public MultiLanguagePropertyBuilder referableCategory(List<String> referableCategory) {
		this.defaultMultiLanguageProperty.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public MultiLanguagePropertyBuilder description(List<TypedLiteral> description) {
		this.defaultMultiLanguageProperty.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public MultiLanguagePropertyBuilder displayName(TypedLiteral displayName) {
		this.defaultMultiLanguageProperty.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public MultiLanguagePropertyBuilder idShort(String idShort) {
		this.defaultMultiLanguageProperty.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public MultiLanguagePropertyBuilder parent(URI parent) {
		this.defaultMultiLanguageProperty.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifier
	* @param qualifier desired value to be set
	* @return Builder object with new value for qualifier
	*/
	final public MultiLanguagePropertyBuilder qualifier(List<Constraint> qualifier) {
		this.defaultMultiLanguageProperty.qualifier = qualifier;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public MultiLanguagePropertyBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultMultiLanguageProperty.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public MultiLanguagePropertyBuilder kind(ModelingKind kind) {
		this.defaultMultiLanguageProperty.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public MultiLanguagePropertyBuilder semanticId(Reference semanticId) {
		this.defaultMultiLanguageProperty.semanticId = semanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public MultiLanguageProperty build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultMultiLanguageProperty);
		return defaultMultiLanguageProperty;
	}
}
