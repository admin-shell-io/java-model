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

public class SubmodelBuilder {

	private DefaultSubmodel defaultSubmodel;

	public SubmodelBuilder() {
		defaultSubmodel = new DefaultSubmodel();
	}

	public SubmodelBuilder(URI id) {
		this();
		defaultSubmodel.id = id;
	}

	/**
	* This function allows setting a value for submodelSubmodelElements
	* @param submodelSubmodelElements desired value to be set
	* @return Builder object with new value for submodelSubmodelElements
	*/
	final public SubmodelBuilder submodelSubmodelElements(List<SubmodelElement> submodelSubmodelElements) {
		this.defaultSubmodel.submodelSubmodelElements = submodelSubmodelElements;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public SubmodelBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultSubmodel.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public SubmodelBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultSubmodel.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for identifiableAdministration
	* @param identifiableAdministration desired value to be set
	* @return Builder object with new value for identifiableAdministration
	*/
	final public SubmodelBuilder identifiableAdministration(AdministrativeInformation identifiableAdministration) {
		this.defaultSubmodel.identifiableAdministration = identifiableAdministration;
		return this;
	}


	/**
	* This function allows setting a value for identifiableIdentification
	* @param identifiableIdentification desired value to be set
	* @return Builder object with new value for identifiableIdentification
	*/
	final public SubmodelBuilder identifiableIdentification(Identifier identifiableIdentification) {
		this.defaultSubmodel.identifiableIdentification = identifiableIdentification;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public SubmodelBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultSubmodel.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public SubmodelBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultSubmodel.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public SubmodelBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultSubmodel.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public SubmodelBuilder referableIdShort(String referableIdShort) {
		this.defaultSubmodel.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public SubmodelBuilder referableParent(URI referableParent) {
		this.defaultSubmodel.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public SubmodelBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultSubmodel.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public SubmodelBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultSubmodel.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Submodel build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultSubmodel);
		return defaultSubmodel;
	}
}
