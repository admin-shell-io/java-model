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
	* This function allows setting a value for inputVariable
	* @param inputVariable desired value to be set
	* @return Builder object with new value for inputVariable
	*/
	final public OperationBuilder inputVariable(List<OperationVariable> inputVariable) {
		this.defaultOperation.inputVariable = inputVariable;
		return this;
	}


	/**
	* This function allows setting a value for inoutputVariable
	* @param inoutputVariable desired value to be set
	* @return Builder object with new value for inoutputVariable
	*/
	final public OperationBuilder inoutputVariable(List<OperationVariable> inoutputVariable) {
		this.defaultOperation.inoutputVariable = inoutputVariable;
		return this;
	}


	/**
	* This function allows setting a value for outputVariable
	* @param outputVariable desired value to be set
	* @return Builder object with new value for outputVariable
	*/
	final public OperationBuilder outputVariable(List<OperationVariable> outputVariable) {
		this.defaultOperation.outputVariable = outputVariable;
		return this;
	}



	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public OperationBuilder referableCategory(List<String> referableCategory) {
		this.defaultOperation.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public OperationBuilder description(List<TypedLiteral> description) {
		this.defaultOperation.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public OperationBuilder displayName(TypedLiteral displayName) {
		this.defaultOperation.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public OperationBuilder idShort(String idShort) {
		this.defaultOperation.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public OperationBuilder parent(URI parent) {
		this.defaultOperation.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifier
	* @param qualifier desired value to be set
	* @return Builder object with new value for qualifier
	*/
	final public OperationBuilder qualifier(List<Constraint> qualifier) {
		this.defaultOperation.qualifier = qualifier;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public OperationBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultOperation.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public OperationBuilder kind(ModelingKind kind) {
		this.defaultOperation.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public OperationBuilder semanticId(Reference semanticId) {
		this.defaultOperation.semanticId = semanticId;
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
