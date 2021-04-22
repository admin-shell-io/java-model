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
	* This function allows setting a value for assetAdministrationShellAssetInformation
	* @param assetAdministrationShellAssetInformation desired value to be set
	* @return Builder object with new value for assetAdministrationShellAssetInformation
	*/
	final public AssetAdministrationShellBuilder assetAdministrationShellAssetInformation(AssetInformation assetAdministrationShellAssetInformation) {
		this.defaultAssetAdministrationShell.assetAdministrationShellAssetInformation = assetAdministrationShellAssetInformation;
		return this;
	}


	/**
	* This function allows setting a value for assetAdministrationShellDerivedFrom
	* @param assetAdministrationShellDerivedFrom desired value to be set
	* @return Builder object with new value for assetAdministrationShellDerivedFrom
	*/
	final public AssetAdministrationShellBuilder assetAdministrationShellDerivedFrom(Reference assetAdministrationShellDerivedFrom) {
		this.defaultAssetAdministrationShell.assetAdministrationShellDerivedFrom = assetAdministrationShellDerivedFrom;
		return this;
	}


	/**
	* This function allows setting a value for assetAdministrationShellSecurity
	* @param assetAdministrationShellSecurity desired value to be set
	* @return Builder object with new value for assetAdministrationShellSecurity
	*/
	final public AssetAdministrationShellBuilder assetAdministrationShellSecurity(Security assetAdministrationShellSecurity) {
		this.defaultAssetAdministrationShell.assetAdministrationShellSecurity = assetAdministrationShellSecurity;
		return this;
	}


	/**
	* This function allows setting a value for assetAdministrationShellSubmodels
	* @param assetAdministrationShellSubmodels desired value to be set
	* @return Builder object with new value for assetAdministrationShellSubmodels
	*/
	final public AssetAdministrationShellBuilder assetAdministrationShellSubmodels(List<Submodel> assetAdministrationShellSubmodels) {
		this.defaultAssetAdministrationShell.assetAdministrationShellSubmodels = assetAdministrationShellSubmodels;
		return this;
	}


	/**
	* This function allows setting a value for assetAdministrationShellViews
	* @param assetAdministrationShellViews desired value to be set
	* @return Builder object with new value for assetAdministrationShellViews
	*/
	final public AssetAdministrationShellBuilder assetAdministrationShellViews(List<View> assetAdministrationShellViews) {
		this.defaultAssetAdministrationShell.assetAdministrationShellViews = assetAdministrationShellViews;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public AssetAdministrationShellBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultAssetAdministrationShell.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for identifiableAdministration
	* @param identifiableAdministration desired value to be set
	* @return Builder object with new value for identifiableAdministration
	*/
	final public AssetAdministrationShellBuilder identifiableAdministration(AdministrativeInformation identifiableAdministration) {
		this.defaultAssetAdministrationShell.identifiableAdministration = identifiableAdministration;
		return this;
	}


	/**
	* This function allows setting a value for identifiableIdentification
	* @param identifiableIdentification desired value to be set
	* @return Builder object with new value for identifiableIdentification
	*/
	final public AssetAdministrationShellBuilder identifiableIdentification(Identifier identifiableIdentification) {
		this.defaultAssetAdministrationShell.identifiableIdentification = identifiableIdentification;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public AssetAdministrationShellBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultAssetAdministrationShell.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public AssetAdministrationShellBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultAssetAdministrationShell.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public AssetAdministrationShellBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultAssetAdministrationShell.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public AssetAdministrationShellBuilder referableIdShort(String referableIdShort) {
		this.defaultAssetAdministrationShell.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public AssetAdministrationShellBuilder referableParent(URI referableParent) {
		this.defaultAssetAdministrationShell.referableParent = referableParent;
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
