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

	final public OperationBuilder _operationInputVariable_(ArrayList<? extends IOperationVariable> _operationInputVariable_) {
		this.operationImpl._operationInputVariable = _operationInputVariable_;
		return this;
	}


	final public OperationBuilder _operationInoutputVariable_(ArrayList<? extends IOperationVariable> _operationInoutputVariable_) {
		this.operationImpl._operationInoutputVariable = _operationInoutputVariable_;
		return this;
	}


	final public OperationBuilder _operationOutputVariable_(ArrayList<? extends IOperationVariable> _operationOutputVariable_) {
		this.operationImpl._operationOutputVariable = _operationOutputVariable_;
		return this;
	}



	final public OperationBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.operationImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public OperationBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.operationImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public OperationBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.operationImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public OperationBuilder _referableIdShort_(String _referableIdShort_) {
		this.operationImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public OperationBuilder _referableParent_(URI _referableParent_) {
		this.operationImpl._referableParent = _referableParent_;
		return this;
	}


	final public OperationBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.operationImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public OperationBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.operationImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public OperationBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.operationImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public OperationBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.operationImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IOperation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(operationImpl);
		return operationImpl;
	}
}
