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

public class RelationshipElementBuilder {

	private DefaultRelationshipElement defaultRelationshipElement;

	public RelationshipElementBuilder() {
		defaultRelationshipElement = new DefaultRelationshipElement();
	}

	public RelationshipElementBuilder(URI id) {
		this();
		defaultRelationshipElement.id = id;
	}

	/**
	* This function allows setting a value for relationshipElementFirst
	* @param relationshipElementFirst desired value to be set
	* @return Builder object with new value for relationshipElementFirst
	*/
	final public RelationshipElementBuilder relationshipElementFirst(Referable relationshipElementFirst) {
		this.defaultRelationshipElement.relationshipElementFirst = relationshipElementFirst;
		return this;
	}


	/**
	* This function allows setting a value for relationshipElementSecond
	* @param relationshipElementSecond desired value to be set
	* @return Builder object with new value for relationshipElementSecond
	*/
	final public RelationshipElementBuilder relationshipElementSecond(Referable relationshipElementSecond) {
		this.defaultRelationshipElement.relationshipElementSecond = relationshipElementSecond;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public RelationshipElementBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultRelationshipElement.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public RelationshipElementBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultRelationshipElement.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public RelationshipElementBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultRelationshipElement.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public RelationshipElementBuilder referableIdShort(String referableIdShort) {
		this.defaultRelationshipElement.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public RelationshipElementBuilder referableParent(URI referableParent) {
		this.defaultRelationshipElement.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public RelationshipElementBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultRelationshipElement.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public RelationshipElementBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultRelationshipElement.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public RelationshipElementBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultRelationshipElement.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public RelationshipElementBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultRelationshipElement.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public RelationshipElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultRelationshipElement);
		return defaultRelationshipElement;
	}
}
