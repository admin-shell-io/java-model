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

public class IdentifiableBuilder {

	private DefaultIdentifiable defaultIdentifiable;

	public IdentifiableBuilder() {
		defaultIdentifiable = new DefaultIdentifiable();
	}

	public IdentifiableBuilder(URI id) {
		this();
		defaultIdentifiable.id = id;
	}

	/**
	* This function allows setting a value for identifiableAdministration
	* @param identifiableAdministration desired value to be set
	* @return Builder object with new value for identifiableAdministration
	*/
	final public IdentifiableBuilder identifiableAdministration(AdministrativeInformation identifiableAdministration) {
		this.defaultIdentifiable.identifiableAdministration = identifiableAdministration;
		return this;
	}


	/**
	* This function allows setting a value for identifiableIdentification
	* @param identifiableIdentification desired value to be set
	* @return Builder object with new value for identifiableIdentification
	*/
	final public IdentifiableBuilder identifiableIdentification(Identifier identifiableIdentification) {
		this.defaultIdentifiable.identifiableIdentification = identifiableIdentification;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public IdentifiableBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultIdentifiable.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public IdentifiableBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultIdentifiable.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public IdentifiableBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultIdentifiable.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public IdentifiableBuilder referableIdShort(String referableIdShort) {
		this.defaultIdentifiable.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public IdentifiableBuilder referableParent(URI referableParent) {
		this.defaultIdentifiable.referableParent = referableParent;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Identifiable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultIdentifiable);
		return defaultIdentifiable;
	}
}
