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

public class EventMessageBuilder {

	private DefaultEventMessage defaultEventMessage;

	public EventMessageBuilder() {
		defaultEventMessage = new DefaultEventMessage();
	}

	public EventMessageBuilder(URI id) {
		this();
		defaultEventMessage.id = id;
	}



	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public EventMessageBuilder referableCategory(String referableCategory) {
		this.defaultEventMessage.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public EventMessageBuilder description(TypedLiteral description) {
		this.defaultEventMessage.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public EventMessageBuilder displayName(TypedLiteral displayName) {
		this.defaultEventMessage.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public EventMessageBuilder idShort(String idShort) {
		this.defaultEventMessage.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	final public EventMessageBuilder qualifiers(List<Constraint> qualifiers) {
		this.defaultEventMessage.qualifiers = qualifiers;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	final public EventMessageBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.defaultEventMessage.dataSpecifications = dataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public EventMessageBuilder kind(ModelingKind kind) {
		this.defaultEventMessage.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public EventMessageBuilder semanticId(Reference semanticId) {
		this.defaultEventMessage.semanticId = semanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public EventMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultEventMessage);
		return defaultEventMessage;
	}
}
