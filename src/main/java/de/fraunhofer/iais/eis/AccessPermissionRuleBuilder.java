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
	* This function allows setting a value for accessPermissionRulePermissionsPerObjects
	* @param accessPermissionRulePermissionsPerObjects desired value to be set
	* @return Builder object with new value for accessPermissionRulePermissionsPerObjects
	*/
	final public AccessPermissionRuleBuilder accessPermissionRulePermissionsPerObjects(List<PermissionsPerObject> accessPermissionRulePermissionsPerObjects) {
		this.defaultAccessPermissionRule.accessPermissionRulePermissionsPerObjects = accessPermissionRulePermissionsPerObjects;
		return this;
	}


	/**
	* This function allows setting a value for accessPermissionRuleTargetSubjectAttributes
	* @param accessPermissionRuleTargetSubjectAttributes desired value to be set
	* @return Builder object with new value for accessPermissionRuleTargetSubjectAttributes
	*/
	final public AccessPermissionRuleBuilder accessPermissionRuleTargetSubjectAttributes(SubjectAttributes accessPermissionRuleTargetSubjectAttributes) {
		this.defaultAccessPermissionRule.accessPermissionRuleTargetSubjectAttributes = accessPermissionRuleTargetSubjectAttributes;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public AccessPermissionRuleBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultAccessPermissionRule.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public AccessPermissionRuleBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultAccessPermissionRule.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public AccessPermissionRuleBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultAccessPermissionRule.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public AccessPermissionRuleBuilder referableIdShort(String referableIdShort) {
		this.defaultAccessPermissionRule.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public AccessPermissionRuleBuilder referableParent(URI referableParent) {
		this.defaultAccessPermissionRule.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public AccessPermissionRuleBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultAccessPermissionRule.qualifiableQualifiers = qualifiableQualifiers;
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
