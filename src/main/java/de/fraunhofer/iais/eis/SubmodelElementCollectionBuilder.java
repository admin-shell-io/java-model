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

public class SubmodelElementCollectionBuilder {

	private Map<String, Object> map;

	public SubmodelElementCollectionBuilder() {
		this.map = new HashMap<>();
	}

	public SubmodelElementCollectionBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for allowDuplicates
	* @param allowDuplicates desired value to be set
	* @return Builder object with new value for allowDuplicates
	*/
	public SubmodelElementCollectionBuilder allowDuplicates(boolean allowDuplicates) {
		this.map.put("allowDuplicates", allowDuplicates);
		return this;
	}


	/**
	* This function allows setting a value for ordered
	* @param ordered desired value to be set
	* @return Builder object with new value for ordered
	*/
	public SubmodelElementCollectionBuilder ordered(boolean ordered) {
		this.map.put("ordered", ordered);
		return this;
	}


	/**
	* This function allows setting a value for values
	* @param values desired value to be set
	* @return Builder object with new value for values
	*/
	public SubmodelElementCollectionBuilder values(List<SubmodelElement> values) {
		this.map.put("values", values);
		return this;
	}



	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	public SubmodelElementCollectionBuilder referableCategory(String referableCategory) {
		this.map.put("referableCategory", referableCategory);
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	public SubmodelElementCollectionBuilder description(LangStringSet description) {
		this.map.put("description", description);
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	public SubmodelElementCollectionBuilder displayName(LangStringSet displayName) {
		this.map.put("displayName", displayName);
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	public SubmodelElementCollectionBuilder idShort(String idShort) {
		this.map.put("idShort", idShort);
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	public SubmodelElementCollectionBuilder qualifiers(List<Constraint> qualifiers) {
		this.map.put("qualifiers", qualifiers);
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	public SubmodelElementCollectionBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.map.put("dataSpecifications", dataSpecifications);
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	public SubmodelElementCollectionBuilder kind(ModelingKind kind) {
		this.map.put("kind", kind);
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	public SubmodelElementCollectionBuilder semanticId(Reference semanticId) {
		this.map.put("semanticId", semanticId);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public SubmodelElementCollection build() throws ConstraintViolationException {
		DefaultSubmodelElementCollection defaultSubmodelElementCollection = Util.fillInstanceFromMap(new DefaultSubmodelElementCollection(), this.map);
		return defaultSubmodelElementCollection;
	}
}
