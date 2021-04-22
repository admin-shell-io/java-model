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
	* This function allows setting a value for propertyValue
	* @param propertyValue desired value to be set
	* @return Builder object with new value for propertyValue
	*/
	final public PropertyBuilder propertyValue(TypedLiteral propertyValue) {
		this.defaultProperty.propertyValue = propertyValue;
		return this;
	}


	/**
	* This function allows setting a value for propertyValueId
	* @param propertyValueId desired value to be set
	* @return Builder object with new value for propertyValueId
	*/
	final public PropertyBuilder propertyValueId(Reference propertyValueId) {
		this.defaultProperty.propertyValueId = propertyValueId;
		return this;
	}




	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public PropertyBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultProperty.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public PropertyBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultProperty.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public PropertyBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultProperty.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public PropertyBuilder referableIdShort(String referableIdShort) {
		this.defaultProperty.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public PropertyBuilder referableParent(URI referableParent) {
		this.defaultProperty.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public PropertyBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultProperty.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public PropertyBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultProperty.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public PropertyBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultProperty.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public PropertyBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultProperty.hasSemanticsSemanticId = hasSemanticsSemanticId;
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
