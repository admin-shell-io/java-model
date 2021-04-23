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
	* This function allows setting a value for multiLanguagePropertyValues
	* @param multiLanguagePropertyValues desired value to be set
	* @return Builder object with new value for multiLanguagePropertyValues
	*/
	final public MultiLanguagePropertyBuilder multiLanguagePropertyValues(List<TypedLiteral> multiLanguagePropertyValues) {
		this.defaultMultiLanguageProperty.multiLanguagePropertyValues = multiLanguagePropertyValues;
		return this;
	}


	/**
	* This function allows setting a value for multiLanguagePropertyValueIds
	* @param multiLanguagePropertyValueIds desired value to be set
	* @return Builder object with new value for multiLanguagePropertyValueIds
	*/
	final public MultiLanguagePropertyBuilder multiLanguagePropertyValueIds(List<Reference> multiLanguagePropertyValueIds) {
		this.defaultMultiLanguageProperty.multiLanguagePropertyValueIds = multiLanguagePropertyValueIds;
		return this;
	}




	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public MultiLanguagePropertyBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultMultiLanguageProperty.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public MultiLanguagePropertyBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultMultiLanguageProperty.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public MultiLanguagePropertyBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultMultiLanguageProperty.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public MultiLanguagePropertyBuilder referableIdShort(String referableIdShort) {
		this.defaultMultiLanguageProperty.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public MultiLanguagePropertyBuilder referableParent(URI referableParent) {
		this.defaultMultiLanguageProperty.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public MultiLanguagePropertyBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultMultiLanguageProperty.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public MultiLanguagePropertyBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultMultiLanguageProperty.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public MultiLanguagePropertyBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultMultiLanguageProperty.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public MultiLanguagePropertyBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultMultiLanguageProperty.hasSemanticsSemanticId = hasSemanticsSemanticId;
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
