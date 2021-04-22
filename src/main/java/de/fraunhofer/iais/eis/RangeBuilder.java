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

public class RangeBuilder {

	private DefaultRange defaultRange;

	public RangeBuilder() {
		defaultRange = new DefaultRange();
	}

	public RangeBuilder(URI id) {
		this();
		defaultRange.id = id;
	}

	/**
	* This function allows setting a value for rangeMaxs
	* @param rangeMaxs desired value to be set
	* @return Builder object with new value for rangeMaxs
	*/
	final public RangeBuilder rangeMaxs(List<TypedLiteral> rangeMaxs) {
		this.defaultRange.rangeMaxs = rangeMaxs;
		return this;
	}


	/**
	* This function allows setting a value for rangeMins
	* @param rangeMins desired value to be set
	* @return Builder object with new value for rangeMins
	*/
	final public RangeBuilder rangeMins(List<TypedLiteral> rangeMins) {
		this.defaultRange.rangeMins = rangeMins;
		return this;
	}




	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public RangeBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultRange.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public RangeBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultRange.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public RangeBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultRange.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public RangeBuilder referableIdShort(String referableIdShort) {
		this.defaultRange.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public RangeBuilder referableParent(URI referableParent) {
		this.defaultRange.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public RangeBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultRange.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public RangeBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultRange.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public RangeBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultRange.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public RangeBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultRange.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Range build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultRange);
		return defaultRange;
	}
}
