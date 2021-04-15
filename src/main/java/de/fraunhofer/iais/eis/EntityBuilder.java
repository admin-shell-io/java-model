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
	* This function allows setting a value for globalAssetId
	* @param globalAssetId desired value to be set
	* @return Builder object with new value for globalAssetId
	*/
	final public EntityBuilder globalAssetId(Reference globalAssetId) {
		this.defaultEntity.globalAssetId = globalAssetId;
		return this;
	}


	/**
	* This function allows setting a value for externalAssetId
	* @param externalAssetId desired value to be set
	* @return Builder object with new value for externalAssetId
	*/
	final public EntityBuilder externalAssetId(IdentifierKeyValuePair externalAssetId) {
		this.defaultEntity.externalAssetId = externalAssetId;
		return this;
	}


	/**
	* This function allows setting a value for entityType
	* @param entityType desired value to be set
	* @return Builder object with new value for entityType
	*/
	final public EntityBuilder entityType(EntityType entityType) {
		this.defaultEntity.entityType = entityType;
		return this;
	}


	/**
	* This function allows setting a value for statement
	* @param statement desired value to be set
	* @return Builder object with new value for statement
	*/
	final public EntityBuilder statement(List<SubmodelElement> statement) {
		this.defaultEntity.statement = statement;
		return this;
	}



	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public EntityBuilder referableCategory(List<String> referableCategory) {
		this.defaultEntity.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public EntityBuilder description(List<TypedLiteral> description) {
		this.defaultEntity.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public EntityBuilder displayName(TypedLiteral displayName) {
		this.defaultEntity.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public EntityBuilder idShort(String idShort) {
		this.defaultEntity.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public EntityBuilder parent(URI parent) {
		this.defaultEntity.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifier
	* @param qualifier desired value to be set
	* @return Builder object with new value for qualifier
	*/
	final public EntityBuilder qualifier(List<Constraint> qualifier) {
		this.defaultEntity.qualifier = qualifier;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public EntityBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultEntity.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public EntityBuilder kind(ModelingKind kind) {
		this.defaultEntity.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public EntityBuilder semanticId(Reference semanticId) {
		this.defaultEntity.semanticId = semanticId;
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
