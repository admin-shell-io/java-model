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
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	final public AssetBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.defaultAsset.dataSpecifications = dataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for administration
	* @param administration desired value to be set
	* @return Builder object with new value for administration
	*/
	final public AssetBuilder administration(AdministrativeInformation administration) {
		this.defaultAsset.administration = administration;
		return this;
	}


	/**
	* This function allows setting a value for identification
	* @param identification desired value to be set
	* @return Builder object with new value for identification
	*/
	final public AssetBuilder identification(Identifier identification) {
		this.defaultAsset.identification = identification;
		return this;
	}


	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public AssetBuilder referableCategory(String referableCategory) {
		this.defaultAsset.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public AssetBuilder description(TypedLiteral description) {
		this.defaultAsset.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public AssetBuilder displayName(TypedLiteral displayName) {
		this.defaultAsset.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public AssetBuilder idShort(String idShort) {
		this.defaultAsset.idShort = idShort;
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
