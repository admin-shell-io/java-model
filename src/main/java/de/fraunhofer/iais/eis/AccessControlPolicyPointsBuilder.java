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

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AccessControlPolicyPointsBuilder {

	private Map<String, Object> map;

	public AccessControlPolicyPointsBuilder() {
		this.map = new HashMap<>();
	}

	public AccessControlPolicyPointsBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for policyAdministrationPoint
	* @param policyAdministrationPoint desired value to be set
	* @return Builder object with new value for policyAdministrationPoint
	*/
	public AccessControlPolicyPointsBuilder policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
		this.map.put("policyAdministrationPoint", policyAdministrationPoint);
		return this;
	}


	/**
	* This function allows setting a value for policyDecisionPoint
	* @param policyDecisionPoint desired value to be set
	* @return Builder object with new value for policyDecisionPoint
	*/
	public AccessControlPolicyPointsBuilder policyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
		this.map.put("policyDecisionPoint", policyDecisionPoint);
		return this;
	}


	/**
	* This function allows setting a value for policyEnforcementPoint
	* @param policyEnforcementPoint desired value to be set
	* @return Builder object with new value for policyEnforcementPoint
	*/
	public AccessControlPolicyPointsBuilder policyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint) {
		this.map.put("policyEnforcementPoint", policyEnforcementPoint);
		return this;
	}


	/**
	* This function allows setting a value for policyInformationPoints
	* @param policyInformationPoints desired value to be set
	* @return Builder object with new value for policyInformationPoints
	*/
	public AccessControlPolicyPointsBuilder policyInformationPoints(PolicyInformationPoints policyInformationPoints) {
		this.map.put("policyInformationPoints", policyInformationPoints);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public AccessControlPolicyPoints build() throws ConstraintViolationException {
		DefaultAccessControlPolicyPoints defaultAccessControlPolicyPoints = Util.fillInstanceFromMap(new DefaultAccessControlPolicyPoints(), this.map);
		return defaultAccessControlPolicyPoints;
	}
}
