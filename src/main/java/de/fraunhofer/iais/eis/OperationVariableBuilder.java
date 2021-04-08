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

public class OperationVariableBuilder {

	private OperationVariableImpl operationVariableImpl;

	public OperationVariableBuilder() {
		operationVariableImpl = new OperationVariableImpl();
	}

	public OperationVariableBuilder(URI id) {
		this();
		operationVariableImpl.id = id;
	}

	/**
	* This function allows setting a value for operationVariableValue
	* @param _operationVariableValue_ desired value to be set
	* @return Builder object with new value for operationVariableValue
	*/
	final public OperationVariableBuilder _operationVariableValue_(ISubmodelElement _operationVariableValue_) {
		this.operationVariableImpl._operationVariableValue = _operationVariableValue_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IOperationVariable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(operationVariableImpl);
		return operationVariableImpl;
	}
}
