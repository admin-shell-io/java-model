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

public class OperationBuilder {

	private DefaultOperation defaultOperation;

	public OperationBuilder() {
		defaultOperation = new DefaultOperation();
	}

	public OperationBuilder(URI id) {
		this();
		defaultOperation.id = id;
	}

	/**
	* This function allows setting a value for operationInputVariables
	* @param operationInputVariables desired value to be set
	* @return Builder object with new value for operationInputVariables
	*/
	final public OperationBuilder operationInputVariables(List<OperationVariable> operationInputVariables) {
		this.defaultOperation.operationInputVariables = operationInputVariables;
		return this;
	}


	/**
	* This function allows setting a value for operationInoutputVariables
	* @param operationInoutputVariables desired value to be set
	* @return Builder object with new value for operationInoutputVariables
	*/
	final public OperationBuilder operationInoutputVariables(List<OperationVariable> operationInoutputVariables) {
		this.defaultOperation.operationInoutputVariables = operationInoutputVariables;
		return this;
	}


	/**
	* This function allows setting a value for operationOutputVariables
	* @param operationOutputVariables desired value to be set
	* @return Builder object with new value for operationOutputVariables
	*/
	final public OperationBuilder operationOutputVariables(List<OperationVariable> operationOutputVariables) {
		this.defaultOperation.operationOutputVariables = operationOutputVariables;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public OperationBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultOperation.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public OperationBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultOperation.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public OperationBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultOperation.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public OperationBuilder referableIdShort(String referableIdShort) {
		this.defaultOperation.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public OperationBuilder referableParent(URI referableParent) {
		this.defaultOperation.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public OperationBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultOperation.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public OperationBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultOperation.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public OperationBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultOperation.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public OperationBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultOperation.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Operation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultOperation);
		return defaultOperation;
	}
}
