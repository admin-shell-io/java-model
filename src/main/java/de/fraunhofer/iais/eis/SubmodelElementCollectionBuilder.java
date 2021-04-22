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

public class SubmodelElementCollectionBuilder {

	private DefaultSubmodelElementCollection defaultSubmodelElementCollection;

	public SubmodelElementCollectionBuilder() {
		defaultSubmodelElementCollection = new DefaultSubmodelElementCollection();
	}

	public SubmodelElementCollectionBuilder(URI id) {
		this();
		defaultSubmodelElementCollection.id = id;
	}

	/**
	* This function allows setting a value for submodelElementCollectionAllowDuplicates
	* @param submodelElementCollectionAllowDuplicates desired value to be set
	* @return Builder object with new value for submodelElementCollectionAllowDuplicates
	*/
	final public SubmodelElementCollectionBuilder submodelElementCollectionAllowDuplicates(boolean submodelElementCollectionAllowDuplicates) {
		this.defaultSubmodelElementCollection.submodelElementCollectionAllowDuplicates = submodelElementCollectionAllowDuplicates;
		return this;
	}


	/**
	* This function allows setting a value for submodelElementCollectionOrdered
	* @param submodelElementCollectionOrdered desired value to be set
	* @return Builder object with new value for submodelElementCollectionOrdered
	*/
	final public SubmodelElementCollectionBuilder submodelElementCollectionOrdered(boolean submodelElementCollectionOrdered) {
		this.defaultSubmodelElementCollection.submodelElementCollectionOrdered = submodelElementCollectionOrdered;
		return this;
	}


	/**
	* This function allows setting a value for submodelElementCollectionValues
	* @param submodelElementCollectionValues desired value to be set
	* @return Builder object with new value for submodelElementCollectionValues
	*/
	final public SubmodelElementCollectionBuilder submodelElementCollectionValues(List<SubmodelElement> submodelElementCollectionValues) {
		this.defaultSubmodelElementCollection.submodelElementCollectionValues = submodelElementCollectionValues;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public SubmodelElementCollectionBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultSubmodelElementCollection.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public SubmodelElementCollectionBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultSubmodelElementCollection.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public SubmodelElementCollectionBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultSubmodelElementCollection.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public SubmodelElementCollectionBuilder referableIdShort(String referableIdShort) {
		this.defaultSubmodelElementCollection.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public SubmodelElementCollectionBuilder referableParent(URI referableParent) {
		this.defaultSubmodelElementCollection.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public SubmodelElementCollectionBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultSubmodelElementCollection.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public SubmodelElementCollectionBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultSubmodelElementCollection.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public SubmodelElementCollectionBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultSubmodelElementCollection.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public SubmodelElementCollectionBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultSubmodelElementCollection.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public SubmodelElementCollection build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultSubmodelElementCollection);
		return defaultSubmodelElementCollection;
	}
}
