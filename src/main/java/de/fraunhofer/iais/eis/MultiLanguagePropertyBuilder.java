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
	* This function allows setting a value for values
	* @param values desired value to be set
	* @return Builder object with new value for values
	*/
	final public MultiLanguagePropertyBuilder values(List<TypedLiteral> values) {
		this.defaultMultiLanguageProperty.values = values;
		return this;
	}


	/**
	* This function allows setting a value for valueIds
	* @param valueIds desired value to be set
	* @return Builder object with new value for valueIds
	*/
	final public MultiLanguagePropertyBuilder valueIds(List<Reference> valueIds) {
		this.defaultMultiLanguageProperty.valueIds = valueIds;
		return this;
	}




	/**
	* This function allows setting a value for referableCategories
	* @param referableCategories desired value to be set
	* @return Builder object with new value for referableCategories
	*/
	final public MultiLanguagePropertyBuilder referableCategories(List<String> referableCategories) {
		this.defaultMultiLanguageProperty.referableCategories = referableCategories;
		return this;
	}


	/**
	* This function allows setting a value for descriptions
	* @param descriptions desired value to be set
	* @return Builder object with new value for descriptions
	*/
	final public MultiLanguagePropertyBuilder descriptions(List<TypedLiteral> descriptions) {
		this.defaultMultiLanguageProperty.descriptions = descriptions;
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
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	final public MultiLanguagePropertyBuilder qualifiers(List<Constraint> qualifiers) {
		this.defaultMultiLanguageProperty.qualifiers = qualifiers;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	final public MultiLanguagePropertyBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.defaultMultiLanguageProperty.dataSpecifications = dataSpecifications;
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
