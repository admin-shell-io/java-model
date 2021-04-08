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

public class QualifierBuilder {

	private QualifierImpl qualifierImpl;

	public QualifierBuilder() {
		qualifierImpl = new QualifierImpl();
	}

	public QualifierBuilder(URI id) {
		this();
		qualifierImpl.id = id;
	}

	/**
	* This function allows setting a value for qualifierType
	* @param _qualifierType_ desired value to be set
	* @return Builder object with new value for qualifierType
	*/
	final public QualifierBuilder _qualifierType_(String _qualifierType_) {
		this.qualifierImpl._qualifierType = _qualifierType_;
		return this;
	}


	/**
	* This function allows setting a value for qualifierValue
	* @param _qualifierValue_ desired value to be set
	* @return Builder object with new value for qualifierValue
	*/
	final public QualifierBuilder _qualifierValue_(TypedLiteral _qualifierValue_) {
		this.qualifierImpl._qualifierValue = _qualifierValue_;
		return this;
	}


	/**
	* This function allows setting a value for qualifierValueId
	* @param _qualifierValueId_ desired value to be set
	* @return Builder object with new value for qualifierValueId
	*/
	final public QualifierBuilder _qualifierValueId_(IReference _qualifierValueId_) {
		this.qualifierImpl._qualifierValueId = _qualifierValueId_;
		return this;
	}



	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param _hasSemanticsSemanticId_ desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public QualifierBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.qualifierImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IQualifier build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(qualifierImpl);
		return qualifierImpl;
	}
}
