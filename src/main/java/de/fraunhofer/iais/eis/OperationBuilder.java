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

public class OperationBuilder {

	private Map<String, Object> map;

	public OperationBuilder() {
		this.map = new HashMap<>();
	}

	public OperationBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for inputVariables
	* @param inputVariables desired value to be set
	* @return Builder object with new value for inputVariables
	*/
	public OperationBuilder inputVariables(List<OperationVariable> inputVariables) {
		this.map.put("inputVariables", inputVariables);
		return this;
	}


	/**
	* This function allows setting a value for inoutputVariables
	* @param inoutputVariables desired value to be set
	* @return Builder object with new value for inoutputVariables
	*/
	public OperationBuilder inoutputVariables(List<OperationVariable> inoutputVariables) {
		this.map.put("inoutputVariables", inoutputVariables);
		return this;
	}


	/**
	* This function allows setting a value for outputVariables
	* @param outputVariables desired value to be set
	* @return Builder object with new value for outputVariables
	*/
	public OperationBuilder outputVariables(List<OperationVariable> outputVariables) {
		this.map.put("outputVariables", outputVariables);
		return this;
	}



	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	public OperationBuilder referableCategory(String referableCategory) {
		this.map.put("referableCategory", referableCategory);
		return this;
	}


	/**
	* This function allows setting a value for descriptions
	* @param descriptions desired value to be set
	* @return Builder object with new value for descriptions
	*/
	public OperationBuilder descriptions(List<LangStringSet> descriptions) {
		this.map.put("descriptions", descriptions);
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	public OperationBuilder displayName(LangStringSet displayName) {
		this.map.put("displayName", displayName);
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	public OperationBuilder idShort(String idShort) {
		this.map.put("idShort", idShort);
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	public OperationBuilder qualifiers(List<Constraint> qualifiers) {
		this.map.put("qualifiers", qualifiers);
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	public OperationBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.map.put("dataSpecifications", dataSpecifications);
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	public OperationBuilder kind(ModelingKind kind) {
		this.map.put("kind", kind);
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	public OperationBuilder semanticId(Reference semanticId) {
		this.map.put("semanticId", semanticId);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public Operation build() throws ConstraintViolationException {
		DefaultOperation defaultOperation = Util.fillInstanceFromMap(new DefaultOperation(), this.map);
		return defaultOperation;
	}
}
