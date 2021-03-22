package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class OperationBuilder {

	private OperationImpl operationImpl;

	public OperationBuilder() {
		operationImpl = new OperationImpl();
	}

	public OperationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		operationImpl.id = id;
	}

	final public OperationBuilder _operationInputVariable_(java.util.ArrayList<? extends OperationVariable> _operationInputVariable_) {
		this.operationImpl._operationInputVariable = _operationInputVariable_;
		return this;
	}


	final public OperationBuilder _operationInoutputVariable_(java.util.ArrayList<? extends OperationVariable> _operationInoutputVariable_) {
		this.operationImpl._operationInoutputVariable = _operationInoutputVariable_;
		return this;
	}


	final public OperationBuilder _operationOutputVariable_(java.util.ArrayList<? extends OperationVariable> _operationOutputVariable_) {
		this.operationImpl._operationOutputVariable = _operationOutputVariable_;
		return this;
	}



	final public OperationBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.operationImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public OperationBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.operationImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public OperationBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
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


	final public OperationBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.operationImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public OperationBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.operationImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public OperationBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.operationImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public OperationBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.operationImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Operation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(operationImpl);
		return operationImpl;
	}
}
