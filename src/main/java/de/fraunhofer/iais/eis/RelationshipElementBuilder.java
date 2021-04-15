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
	* This function allows setting a value for first
	* @param first desired value to be set
	* @return Builder object with new value for first
	*/
	final public RelationshipElementBuilder first(Referable first) {
		this.defaultRelationshipElement.first = first;
		return this;
	}


	/**
	* This function allows setting a value for second
	* @param second desired value to be set
	* @return Builder object with new value for second
	*/
	final public RelationshipElementBuilder second(Referable second) {
		this.defaultRelationshipElement.second = second;
		return this;
	}



	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public RelationshipElementBuilder referableCategory(List<String> referableCategory) {
		this.defaultRelationshipElement.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public RelationshipElementBuilder description(List<TypedLiteral> description) {
		this.defaultRelationshipElement.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public RelationshipElementBuilder displayName(TypedLiteral displayName) {
		this.defaultRelationshipElement.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public RelationshipElementBuilder idShort(String idShort) {
		this.defaultRelationshipElement.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public RelationshipElementBuilder parent(URI parent) {
		this.defaultRelationshipElement.parent = parent;
		return this;
	}


	/**
	* This function allows setting a value for qualifier
	* @param qualifier desired value to be set
	* @return Builder object with new value for qualifier
	*/
	final public RelationshipElementBuilder qualifier(List<Constraint> qualifier) {
		this.defaultRelationshipElement.qualifier = qualifier;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public RelationshipElementBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultRelationshipElement.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public RelationshipElementBuilder kind(ModelingKind kind) {
		this.defaultRelationshipElement.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public RelationshipElementBuilder semanticId(Reference semanticId) {
		this.defaultRelationshipElement.semanticId = semanticId;
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
