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

public class CapabilityBuilder {

	private DefaultCapability defaultCapability;

	public CapabilityBuilder() {
		defaultCapability = new DefaultCapability();
	}

	public CapabilityBuilder(URI id) {
		this();
		defaultCapability.id = id;
	}



	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public CapabilityBuilder referableCategory(List<String> referableCategory) {
		this.defaultCapability.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public CapabilityBuilder description(List<TypedLiteral> description) {
		this.defaultCapability.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public CapabilityBuilder displayName(TypedLiteral displayName) {
		this.defaultCapability.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public CapabilityBuilder idShort(String idShort) {
		this.defaultCapability.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public CapabilityBuilder parent(URI parent) {
		this.defaultCapability.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifier
	* @param qualifier desired value to be set
	* @return Builder object with new value for qualifier
	*/
	final public CapabilityBuilder qualifier(List<Constraint> qualifier) {
		this.defaultCapability.qualifier = qualifier;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public CapabilityBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultCapability.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public CapabilityBuilder kind(ModelingKind kind) {
		this.defaultCapability.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public CapabilityBuilder semanticId(Reference semanticId) {
		this.defaultCapability.semanticId = semanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Capability build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultCapability);
		return defaultCapability;
	}
}
