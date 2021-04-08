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

	private OperationImpl operationImpl;

	public OperationBuilder() {
		operationImpl = new OperationImpl();
	}

	public OperationBuilder(URI id) {
		this();
		operationImpl.id = id;
	}

	/**
	* This function allows setting a value for operationInputVariable
	* @param _operationInputVariable_ desired value to be set
	* @return Builder object with new value for operationInputVariable
	*/
	final public OperationBuilder _operationInputVariable_(ArrayList<? extends IOperationVariable> _operationInputVariable_) {
		this.operationImpl._operationInputVariable = _operationInputVariable_;
		return this;
	}


	/**
	* This function allows setting a value for operationInoutputVariable
	* @param _operationInoutputVariable_ desired value to be set
	* @return Builder object with new value for operationInoutputVariable
	*/
	final public OperationBuilder _operationInoutputVariable_(ArrayList<? extends IOperationVariable> _operationInoutputVariable_) {
		this.operationImpl._operationInoutputVariable = _operationInoutputVariable_;
		return this;
	}


	/**
	* This function allows setting a value for operationOutputVariable
	* @param _operationOutputVariable_ desired value to be set
	* @return Builder object with new value for operationOutputVariable
	*/
	final public OperationBuilder _operationOutputVariable_(ArrayList<? extends IOperationVariable> _operationOutputVariable_) {
		this.operationImpl._operationOutputVariable = _operationOutputVariable_;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategory
	* @param _referableReferableCategory_ desired value to be set
	* @return Builder object with new value for referableReferableCategory
	*/
	final public OperationBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.operationImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	/**
	* This function allows setting a value for referableDescription
	* @param _referableDescription_ desired value to be set
	* @return Builder object with new value for referableDescription
	*/
	final public OperationBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.operationImpl._referableDescription = _referableDescription_;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param _referableDisplayName_ desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public OperationBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.operationImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param _referableIdShort_ desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public OperationBuilder _referableIdShort_(String _referableIdShort_) {
		this.operationImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param _referableParent_ desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public OperationBuilder _referableParent_(URI _referableParent_) {
		this.operationImpl._referableParent = _referableParent_;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifier
	* @param _qualifiableQualifier_ desired value to be set
	* @return Builder object with new value for qualifiableQualifier
	*/
	final public OperationBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.operationImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecification
	* @param _hasDataSpecificationDataSpecification_ desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecification
	*/
	final public OperationBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.operationImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param _hasKindKind_ desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public OperationBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.operationImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param _hasSemanticsSemanticId_ desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public OperationBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.operationImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IOperation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(operationImpl);
		return operationImpl;
	}
}
