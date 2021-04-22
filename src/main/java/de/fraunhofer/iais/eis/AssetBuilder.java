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

public class AssetBuilder {

	private DefaultAsset defaultAsset;

	public AssetBuilder() {
		defaultAsset = new DefaultAsset();
	}

	public AssetBuilder(URI id) {
		this();
		defaultAsset.id = id;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public AssetBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultAsset.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for identifiableAdministration
	* @param identifiableAdministration desired value to be set
	* @return Builder object with new value for identifiableAdministration
	*/
	final public AssetBuilder identifiableAdministration(AdministrativeInformation identifiableAdministration) {
		this.defaultAsset.identifiableAdministration = identifiableAdministration;
		return this;
	}


	/**
	* This function allows setting a value for identifiableIdentification
	* @param identifiableIdentification desired value to be set
	* @return Builder object with new value for identifiableIdentification
	*/
	final public AssetBuilder identifiableIdentification(Identifier identifiableIdentification) {
		this.defaultAsset.identifiableIdentification = identifiableIdentification;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public AssetBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultAsset.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public AssetBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultAsset.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public AssetBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultAsset.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public AssetBuilder referableIdShort(String referableIdShort) {
		this.defaultAsset.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public AssetBuilder referableParent(URI referableParent) {
		this.defaultAsset.referableParent = referableParent;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Asset build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAsset);
		return defaultAsset;
	}
}
