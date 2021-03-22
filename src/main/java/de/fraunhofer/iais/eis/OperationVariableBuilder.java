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

public class OperationVariableBuilder {

	private OperationVariableImpl operationVariableImpl;

	public OperationVariableBuilder() {
		operationVariableImpl = new OperationVariableImpl();
	}

	public OperationVariableBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		operationVariableImpl.id = id;
	}

	final public OperationVariableBuilder _operationVariableValue_(SubmodelElement _operationVariableValue_) {
		this.operationVariableImpl._operationVariableValue = _operationVariableValue_;
		return this;
	}

	public final OperationVariable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(operationVariableImpl);
		return operationVariableImpl;
	}
}
