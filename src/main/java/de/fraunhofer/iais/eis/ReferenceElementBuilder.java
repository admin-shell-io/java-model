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

public class ReferenceElementBuilder {

	private DefaultReferenceElement defaultReferenceElement;

	public ReferenceElementBuilder() {
		defaultReferenceElement = new DefaultReferenceElement();
	}

	public ReferenceElementBuilder(URI id) {
		this();
		defaultReferenceElement.id = id;
	}

	/**
	* This function allows setting a value for referenceElementValue
	* @param referenceElementValue desired value to be set
	* @return Builder object with new value for referenceElementValue
	*/
	final public ReferenceElementBuilder referenceElementValue(Reference referenceElementValue) {
		this.defaultReferenceElement.referenceElementValue = referenceElementValue;
		return this;
	}




	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public ReferenceElementBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultReferenceElement.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public ReferenceElementBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultReferenceElement.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public ReferenceElementBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultReferenceElement.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public ReferenceElementBuilder referableIdShort(String referableIdShort) {
		this.defaultReferenceElement.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public ReferenceElementBuilder referableParent(URI referableParent) {
		this.defaultReferenceElement.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public ReferenceElementBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultReferenceElement.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public ReferenceElementBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultReferenceElement.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public ReferenceElementBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultReferenceElement.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public ReferenceElementBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultReferenceElement.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ReferenceElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultReferenceElement);
		return defaultReferenceElement;
	}
}
