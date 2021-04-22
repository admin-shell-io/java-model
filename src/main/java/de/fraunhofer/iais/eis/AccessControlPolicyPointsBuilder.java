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

public class AccessControlPolicyPointsBuilder {

	private DefaultAccessControlPolicyPoints defaultAccessControlPolicyPoints;

	public AccessControlPolicyPointsBuilder() {
		defaultAccessControlPolicyPoints = new DefaultAccessControlPolicyPoints();
	}

	public AccessControlPolicyPointsBuilder(URI id) {
		this();
		defaultAccessControlPolicyPoints.id = id;
	}

	/**
	* This function allows setting a value for accessControlPolicyPointsPolicyAdministrationPoint
	* @param accessControlPolicyPointsPolicyAdministrationPoint desired value to be set
	* @return Builder object with new value for accessControlPolicyPointsPolicyAdministrationPoint
	*/
	final public AccessControlPolicyPointsBuilder accessControlPolicyPointsPolicyAdministrationPoint(PolicyAdministrationPoint accessControlPolicyPointsPolicyAdministrationPoint) {
		this.defaultAccessControlPolicyPoints.accessControlPolicyPointsPolicyAdministrationPoint = accessControlPolicyPointsPolicyAdministrationPoint;
		return this;
	}


	/**
	* This function allows setting a value for accessControlPolicyPointsPolicyDecisionPoint
	* @param accessControlPolicyPointsPolicyDecisionPoint desired value to be set
	* @return Builder object with new value for accessControlPolicyPointsPolicyDecisionPoint
	*/
	final public AccessControlPolicyPointsBuilder accessControlPolicyPointsPolicyDecisionPoint(PolicyDecisionPoint accessControlPolicyPointsPolicyDecisionPoint) {
		this.defaultAccessControlPolicyPoints.accessControlPolicyPointsPolicyDecisionPoint = accessControlPolicyPointsPolicyDecisionPoint;
		return this;
	}


	/**
	* This function allows setting a value for accessControlPolicyPointsPolicyEnforcementPoint
	* @param accessControlPolicyPointsPolicyEnforcementPoint desired value to be set
	* @return Builder object with new value for accessControlPolicyPointsPolicyEnforcementPoint
	*/
	final public AccessControlPolicyPointsBuilder accessControlPolicyPointsPolicyEnforcementPoint(PolicyEnforcementPoints accessControlPolicyPointsPolicyEnforcementPoint) {
		this.defaultAccessControlPolicyPoints.accessControlPolicyPointsPolicyEnforcementPoint = accessControlPolicyPointsPolicyEnforcementPoint;
		return this;
	}


	/**
	* This function allows setting a value for accessControlPolicyPointsPolicyInformationPoints
	* @param accessControlPolicyPointsPolicyInformationPoints desired value to be set
	* @return Builder object with new value for accessControlPolicyPointsPolicyInformationPoints
	*/
	final public AccessControlPolicyPointsBuilder accessControlPolicyPointsPolicyInformationPoints(PolicyInformationPoints accessControlPolicyPointsPolicyInformationPoints) {
		this.defaultAccessControlPolicyPoints.accessControlPolicyPointsPolicyInformationPoints = accessControlPolicyPointsPolicyInformationPoints;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AccessControlPolicyPoints build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAccessControlPolicyPoints);
		return defaultAccessControlPolicyPoints;
	}
}
