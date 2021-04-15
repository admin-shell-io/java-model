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

public class AssetAdministrationShellBuilder {

	private DefaultAssetAdministrationShell defaultAssetAdministrationShell;

	public AssetAdministrationShellBuilder() {
		defaultAssetAdministrationShell = new DefaultAssetAdministrationShell();
	}

	public AssetAdministrationShellBuilder(URI id) {
		this();
		defaultAssetAdministrationShell.id = id;
	}

	/**
	* This function allows setting a value for assetInformation
	* @param assetInformation desired value to be set
	* @return Builder object with new value for assetInformation
	*/
	final public AssetAdministrationShellBuilder assetInformation(AssetInformation assetInformation) {
		this.defaultAssetAdministrationShell.assetInformation = assetInformation;
		return this;
	}


	/**
	* This function allows setting a value for derivedFrom
	* @param derivedFrom desired value to be set
	* @return Builder object with new value for derivedFrom
	*/
	final public AssetAdministrationShellBuilder derivedFrom(Reference derivedFrom) {
		this.defaultAssetAdministrationShell.derivedFrom = derivedFrom;
		return this;
	}


	/**
	* This function allows setting a value for security
	* @param security desired value to be set
	* @return Builder object with new value for security
	*/
	final public AssetAdministrationShellBuilder security(Security security) {
		this.defaultAssetAdministrationShell.security = security;
		return this;
	}


	/**
	* This function allows setting a value for submodel
	* @param submodel desired value to be set
	* @return Builder object with new value for submodel
	*/
	final public AssetAdministrationShellBuilder submodel(List<Submodel> submodel) {
		this.defaultAssetAdministrationShell.submodel = submodel;
		return this;
	}


	/**
	* This function allows setting a value for view
	* @param view desired value to be set
	* @return Builder object with new value for view
	*/
	final public AssetAdministrationShellBuilder view(List<View> view) {
		this.defaultAssetAdministrationShell.view = view;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public AssetAdministrationShellBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultAssetAdministrationShell.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for administration
	* @param administration desired value to be set
	* @return Builder object with new value for administration
	*/
	final public AssetAdministrationShellBuilder administration(AdministrativeInformation administration) {
		this.defaultAssetAdministrationShell.administration = administration;
		return this;
	}


	/**
	* This function allows setting a value for identification
	* @param identification desired value to be set
	* @return Builder object with new value for identification
	*/
	final public AssetAdministrationShellBuilder identification(Identifier identification) {
		this.defaultAssetAdministrationShell.identification = identification;
		return this;
	}


	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public AssetAdministrationShellBuilder referableCategory(List<String> referableCategory) {
		this.defaultAssetAdministrationShell.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public AssetAdministrationShellBuilder description(List<TypedLiteral> description) {
		this.defaultAssetAdministrationShell.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public AssetAdministrationShellBuilder displayName(TypedLiteral displayName) {
		this.defaultAssetAdministrationShell.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public AssetAdministrationShellBuilder idShort(String idShort) {
		this.defaultAssetAdministrationShell.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public AssetAdministrationShellBuilder parent(URI parent) {
		this.defaultAssetAdministrationShell.parent = parent;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AssetAdministrationShell build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAssetAdministrationShell);
		return defaultAssetAdministrationShell;
	}
}
