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

public class AccessControlBuilder {

	private Map<String, Object> map;

	public AccessControlBuilder() {
		this.map = new HashMap<>();
	}

	public AccessControlBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for accessPermissionRules
	* @param accessPermissionRules desired value to be set
	* @return Builder object with new value for accessPermissionRules
	*/
	public AccessControlBuilder accessPermissionRules(List<AccessPermissionRule> accessPermissionRules) {
		this.map.put("accessPermissionRules", accessPermissionRules);
		return this;
	}


	/**
	* This function allows setting a value for selectableSubjectAttributes
	* @param selectableSubjectAttributes desired value to be set
	* @return Builder object with new value for selectableSubjectAttributes
	*/
	public AccessControlBuilder selectableSubjectAttributes(Reference selectableSubjectAttributes) {
		this.map.put("selectableSubjectAttributes", selectableSubjectAttributes);
		return this;
	}


	/**
	* This function allows setting a value for defaultSubjectAttributes
	* @param defaultSubjectAttributes desired value to be set
	* @return Builder object with new value for defaultSubjectAttributes
	*/
	public AccessControlBuilder defaultSubjectAttributes(Reference defaultSubjectAttributes) {
		this.map.put("defaultSubjectAttributes", defaultSubjectAttributes);
		return this;
	}


	/**
	* This function allows setting a value for selectablePermissions
	* @param selectablePermissions desired value to be set
	* @return Builder object with new value for selectablePermissions
	*/
	public AccessControlBuilder selectablePermissions(Reference selectablePermissions) {
		this.map.put("selectablePermissions", selectablePermissions);
		return this;
	}


	/**
	* This function allows setting a value for defaultPermissions
	* @param defaultPermissions desired value to be set
	* @return Builder object with new value for defaultPermissions
	*/
	public AccessControlBuilder defaultPermissions(Reference defaultPermissions) {
		this.map.put("defaultPermissions", defaultPermissions);
		return this;
	}


	/**
	* This function allows setting a value for selectableEnvironmentAttributes
	* @param selectableEnvironmentAttributes desired value to be set
	* @return Builder object with new value for selectableEnvironmentAttributes
	*/
	public AccessControlBuilder selectableEnvironmentAttributes(Reference selectableEnvironmentAttributes) {
		this.map.put("selectableEnvironmentAttributes", selectableEnvironmentAttributes);
		return this;
	}


	/**
	* This function allows setting a value for defaultEnvironmentAttributes
	* @param defaultEnvironmentAttributes desired value to be set
	* @return Builder object with new value for defaultEnvironmentAttributes
	*/
	public AccessControlBuilder defaultEnvironmentAttributes(Reference defaultEnvironmentAttributes) {
		this.map.put("defaultEnvironmentAttributes", defaultEnvironmentAttributes);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public AccessControl build() throws ConstraintViolationException {
		DefaultAccessControl defaultAccessControl = Util.fillInstanceFromMap(new DefaultAccessControl(), this.map);
		return defaultAccessControl;
	}
}
