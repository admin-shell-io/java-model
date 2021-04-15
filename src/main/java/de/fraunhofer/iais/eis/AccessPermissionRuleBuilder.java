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

public class AccessPermissionRuleBuilder {

	private DefaultAccessPermissionRule defaultAccessPermissionRule;

	public AccessPermissionRuleBuilder() {
		defaultAccessPermissionRule = new DefaultAccessPermissionRule();
	}

	public AccessPermissionRuleBuilder(URI id) {
		this();
		defaultAccessPermissionRule.id = id;
	}

	/**
	* This function allows setting a value for permissionsPerObject
	* @param permissionsPerObject desired value to be set
	* @return Builder object with new value for permissionsPerObject
	*/
	final public AccessPermissionRuleBuilder permissionsPerObject(List<PermissionsPerObject> permissionsPerObject) {
		this.defaultAccessPermissionRule.permissionsPerObject = permissionsPerObject;
		return this;
	}


	/**
	* This function allows setting a value for targetSubjectAttributes
	* @param targetSubjectAttributes desired value to be set
	* @return Builder object with new value for targetSubjectAttributes
	*/
	final public AccessPermissionRuleBuilder targetSubjectAttributes(SubjectAttributes targetSubjectAttributes) {
		this.defaultAccessPermissionRule.targetSubjectAttributes = targetSubjectAttributes;
		return this;
	}


	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public AccessPermissionRuleBuilder referableCategory(List<String> referableCategory) {
		this.defaultAccessPermissionRule.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public AccessPermissionRuleBuilder description(List<TypedLiteral> description) {
		this.defaultAccessPermissionRule.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public AccessPermissionRuleBuilder displayName(TypedLiteral displayName) {
		this.defaultAccessPermissionRule.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public AccessPermissionRuleBuilder idShort(String idShort) {
		this.defaultAccessPermissionRule.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public AccessPermissionRuleBuilder parent(URI parent) {
		this.defaultAccessPermissionRule.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifier
	* @param qualifier desired value to be set
	* @return Builder object with new value for qualifier
	*/
	final public AccessPermissionRuleBuilder qualifier(List<Constraint> qualifier) {
		this.defaultAccessPermissionRule.qualifier = qualifier;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AccessPermissionRule build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAccessPermissionRule);
		return defaultAccessPermissionRule;
	}
}
