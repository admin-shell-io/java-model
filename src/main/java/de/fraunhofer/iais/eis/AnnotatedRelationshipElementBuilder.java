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

public class AnnotatedRelationshipElementBuilder {

	private Map<String, Object> map;

	public AnnotatedRelationshipElementBuilder() {
		this.map = new HashMap<>();
	}

	public AnnotatedRelationshipElementBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for annotations
	* @param annotations desired value to be set
	* @return Builder object with new value for annotations
	*/
	public AnnotatedRelationshipElementBuilder annotations(List<DataElement> annotations) {
		this.map.put("annotations", annotations);
		return this;
	}


	/**
	* This function allows setting a value for first
	* @param first desired value to be set
	* @return Builder object with new value for first
	*/
	public AnnotatedRelationshipElementBuilder first(Reference first) {
		this.map.put("first", first);
		return this;
	}


	/**
	* This function allows setting a value for second
	* @param second desired value to be set
	* @return Builder object with new value for second
	*/
	public AnnotatedRelationshipElementBuilder second(Reference second) {
		this.map.put("second", second);
		return this;
	}



	/**
	* This function allows setting a value for category
	* @param category desired value to be set
	* @return Builder object with new value for category
	*/
	public AnnotatedRelationshipElementBuilder category(String category) {
		this.map.put("category", category);
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	public AnnotatedRelationshipElementBuilder description(LangStringSet description) {
		this.map.put("description", description);
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	public AnnotatedRelationshipElementBuilder displayName(LangStringSet displayName) {
		this.map.put("displayName", displayName);
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	public AnnotatedRelationshipElementBuilder idShort(String idShort) {
		this.map.put("idShort", idShort);
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	public AnnotatedRelationshipElementBuilder qualifiers(List<Constraint> qualifiers) {
		this.map.put("qualifiers", qualifiers);
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	public AnnotatedRelationshipElementBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.map.put("dataSpecifications", dataSpecifications);
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	public AnnotatedRelationshipElementBuilder kind(ModelingKind kind) {
		this.map.put("kind", kind);
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	public AnnotatedRelationshipElementBuilder semanticId(Reference semanticId) {
		this.map.put("semanticId", semanticId);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public AnnotatedRelationshipElement build() throws ConstraintViolationException {
		DefaultAnnotatedRelationshipElement defaultAnnotatedRelationshipElement = Util.fillInstanceFromMap(new DefaultAnnotatedRelationshipElement(), this.map);
		return defaultAnnotatedRelationshipElement;
	}
}
