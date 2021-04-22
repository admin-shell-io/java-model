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

public class AccessControlBuilder {

	private DefaultAccessControl defaultAccessControl;

	public AccessControlBuilder() {
		defaultAccessControl = new DefaultAccessControl();
	}

	public AccessControlBuilder(URI id) {
		this();
		defaultAccessControl.id = id;
	}

	/**
	* This function allows setting a value for accessControlAccessPermissionRules
	* @param accessControlAccessPermissionRules desired value to be set
	* @return Builder object with new value for accessControlAccessPermissionRules
	*/
	final public AccessControlBuilder accessControlAccessPermissionRules(List<AccessPermissionRule> accessControlAccessPermissionRules) {
		this.defaultAccessControl.accessControlAccessPermissionRules = accessControlAccessPermissionRules;
		return this;
	}


	/**
	* This function allows setting a value for accessControlSelectableSubjectAttributes
	* @param accessControlSelectableSubjectAttributes desired value to be set
	* @return Builder object with new value for accessControlSelectableSubjectAttributes
	*/
	final public AccessControlBuilder accessControlSelectableSubjectAttributes(Submodel accessControlSelectableSubjectAttributes) {
		this.defaultAccessControl.accessControlSelectableSubjectAttributes = accessControlSelectableSubjectAttributes;
		return this;
	}


	/**
	* This function allows setting a value for accessControlDefaultSubjectAttributes
	* @param accessControlDefaultSubjectAttributes desired value to be set
	* @return Builder object with new value for accessControlDefaultSubjectAttributes
	*/
	final public AccessControlBuilder accessControlDefaultSubjectAttributes(Submodel accessControlDefaultSubjectAttributes) {
		this.defaultAccessControl.accessControlDefaultSubjectAttributes = accessControlDefaultSubjectAttributes;
		return this;
	}


	/**
	* This function allows setting a value for accessControlSelectablePermissions
	* @param accessControlSelectablePermissions desired value to be set
	* @return Builder object with new value for accessControlSelectablePermissions
	*/
	final public AccessControlBuilder accessControlSelectablePermissions(Submodel accessControlSelectablePermissions) {
		this.defaultAccessControl.accessControlSelectablePermissions = accessControlSelectablePermissions;
		return this;
	}


	/**
	* This function allows setting a value for accessControlDefaultPermissions
	* @param accessControlDefaultPermissions desired value to be set
	* @return Builder object with new value for accessControlDefaultPermissions
	*/
	final public AccessControlBuilder accessControlDefaultPermissions(Submodel accessControlDefaultPermissions) {
		this.defaultAccessControl.accessControlDefaultPermissions = accessControlDefaultPermissions;
		return this;
	}


	/**
	* This function allows setting a value for accessControlSelectableEnvironmentAttributes
	* @param accessControlSelectableEnvironmentAttributes desired value to be set
	* @return Builder object with new value for accessControlSelectableEnvironmentAttributes
	*/
	final public AccessControlBuilder accessControlSelectableEnvironmentAttributes(Submodel accessControlSelectableEnvironmentAttributes) {
		this.defaultAccessControl.accessControlSelectableEnvironmentAttributes = accessControlSelectableEnvironmentAttributes;
		return this;
	}


	/**
	* This function allows setting a value for accessControlDefaultEnvironmentAttributes
	* @param accessControlDefaultEnvironmentAttributes desired value to be set
	* @return Builder object with new value for accessControlDefaultEnvironmentAttributes
	*/
	final public AccessControlBuilder accessControlDefaultEnvironmentAttributes(Submodel accessControlDefaultEnvironmentAttributes) {
		this.defaultAccessControl.accessControlDefaultEnvironmentAttributes = accessControlDefaultEnvironmentAttributes;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AccessControl build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAccessControl);
		return defaultAccessControl;
	}
}
