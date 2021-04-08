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

public class PolicyInformationPointsBuilder {

	private PolicyInformationPointsImpl policyInformationPointsImpl;

	public PolicyInformationPointsBuilder() {
		policyInformationPointsImpl = new PolicyInformationPointsImpl();
	}

	public PolicyInformationPointsBuilder(URI id) {
		this();
		policyInformationPointsImpl.id = id;
	}

	/**
	* This function allows setting a value for policyInformationPointsExternalInformationPoints
	* @param _policyInformationPointsExternalInformationPoints_ desired value to be set
	* @return Builder object with new value for policyInformationPointsExternalInformationPoints
	*/
	final public PolicyInformationPointsBuilder _policyInformationPointsExternalInformationPoints_(boolean _policyInformationPointsExternalInformationPoints_) {
		this.policyInformationPointsImpl._policyInformationPointsExternalInformationPoints = _policyInformationPointsExternalInformationPoints_;
		return this;
	}


	/**
	* This function allows setting a value for policyInformationPointsInternalInformationPoint
	* @param _policyInformationPointsInternalInformationPoint_ desired value to be set
	* @return Builder object with new value for policyInformationPointsInternalInformationPoint
	*/
	final public PolicyInformationPointsBuilder _policyInformationPointsInternalInformationPoint_(ArrayList<? extends ISubmodel> _policyInformationPointsInternalInformationPoint_) {
		this.policyInformationPointsImpl._policyInformationPointsInternalInformationPoint = _policyInformationPointsInternalInformationPoint_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IPolicyInformationPoints build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(policyInformationPointsImpl);
		return policyInformationPointsImpl;
	}
}
