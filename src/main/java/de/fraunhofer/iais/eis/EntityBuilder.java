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

public class EntityBuilder {

	private DefaultEntity defaultEntity;

	public EntityBuilder() {
		defaultEntity = new DefaultEntity();
	}

	public EntityBuilder(URI id) {
		this();
		defaultEntity.id = id;
	}

	/**
	* This function allows setting a value for entityGlobalAssetId
	* @param entityGlobalAssetId desired value to be set
	* @return Builder object with new value for entityGlobalAssetId
	*/
	final public EntityBuilder entityGlobalAssetId(Reference entityGlobalAssetId) {
		this.defaultEntity.entityGlobalAssetId = entityGlobalAssetId;
		return this;
	}


	/**
	* This function allows setting a value for entityExternalAssetId
	* @param entityExternalAssetId desired value to be set
	* @return Builder object with new value for entityExternalAssetId
	*/
	final public EntityBuilder entityExternalAssetId(IdentifierKeyValuePair entityExternalAssetId) {
		this.defaultEntity.entityExternalAssetId = entityExternalAssetId;
		return this;
	}


	/**
	* This function allows setting a value for entityEntityType
	* @param entityEntityType desired value to be set
	* @return Builder object with new value for entityEntityType
	*/
	final public EntityBuilder entityEntityType(EntityType entityEntityType) {
		this.defaultEntity.entityEntityType = entityEntityType;
		return this;
	}


	/**
	* This function allows setting a value for entityStatements
	* @param entityStatements desired value to be set
	* @return Builder object with new value for entityStatements
	*/
	final public EntityBuilder entityStatements(List<SubmodelElement> entityStatements) {
		this.defaultEntity.entityStatements = entityStatements;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public EntityBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultEntity.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public EntityBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultEntity.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public EntityBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultEntity.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public EntityBuilder referableIdShort(String referableIdShort) {
		this.defaultEntity.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public EntityBuilder referableParent(URI referableParent) {
		this.defaultEntity.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public EntityBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultEntity.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public EntityBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultEntity.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public EntityBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultEntity.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public EntityBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultEntity.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Entity build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultEntity);
		return defaultEntity;
	}
}
