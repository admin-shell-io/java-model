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

public class ConceptDescriptionBuilder {

	private DefaultConceptDescription defaultConceptDescription;

	public ConceptDescriptionBuilder() {
		defaultConceptDescription = new DefaultConceptDescription();
	}

	public ConceptDescriptionBuilder(URI id) {
		this();
		defaultConceptDescription.id = id;
	}

	/**
	* This function allows setting a value for conceptDescriptionContents
	* @param conceptDescriptionContents desired value to be set
	* @return Builder object with new value for conceptDescriptionContents
	*/
	final public ConceptDescriptionBuilder conceptDescriptionContents(List<DataSpecificationContent> conceptDescriptionContents) {
		this.defaultConceptDescription.conceptDescriptionContents = conceptDescriptionContents;
		return this;
	}


	/**
	* This function allows setting a value for conceptDescriptionIsCaseOfs
	* @param conceptDescriptionIsCaseOfs desired value to be set
	* @return Builder object with new value for conceptDescriptionIsCaseOfs
	*/
	final public ConceptDescriptionBuilder conceptDescriptionIsCaseOfs(List<Reference> conceptDescriptionIsCaseOfs) {
		this.defaultConceptDescription.conceptDescriptionIsCaseOfs = conceptDescriptionIsCaseOfs;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public ConceptDescriptionBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultConceptDescription.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for identifiableAdministration
	* @param identifiableAdministration desired value to be set
	* @return Builder object with new value for identifiableAdministration
	*/
	final public ConceptDescriptionBuilder identifiableAdministration(AdministrativeInformation identifiableAdministration) {
		this.defaultConceptDescription.identifiableAdministration = identifiableAdministration;
		return this;
	}


	/**
	* This function allows setting a value for identifiableIdentification
	* @param identifiableIdentification desired value to be set
	* @return Builder object with new value for identifiableIdentification
	*/
	final public ConceptDescriptionBuilder identifiableIdentification(Identifier identifiableIdentification) {
		this.defaultConceptDescription.identifiableIdentification = identifiableIdentification;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public ConceptDescriptionBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultConceptDescription.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public ConceptDescriptionBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultConceptDescription.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public ConceptDescriptionBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultConceptDescription.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public ConceptDescriptionBuilder referableIdShort(String referableIdShort) {
		this.defaultConceptDescription.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public ConceptDescriptionBuilder referableParent(URI referableParent) {
		this.defaultConceptDescription.referableParent = referableParent;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ConceptDescription build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultConceptDescription);
		return defaultConceptDescription;
	}
}
