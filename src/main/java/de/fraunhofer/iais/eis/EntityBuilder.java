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

public class EntityBuilder {

	private Map<String, Object> map;

	public EntityBuilder() {
		this.map = new HashMap<>();
	}

	public EntityBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for globalAssetId
	* @param globalAssetId desired value to be set
	* @return Builder object with new value for globalAssetId
	*/
	public EntityBuilder globalAssetId(Reference globalAssetId) {
		this.map.put("globalAssetId", globalAssetId);
		return this;
	}


	/**
	* This function allows setting a value for externalAssetId
	* @param externalAssetId desired value to be set
	* @return Builder object with new value for externalAssetId
	*/
	public EntityBuilder externalAssetId(IdentifierKeyValuePair externalAssetId) {
		this.map.put("externalAssetId", externalAssetId);
		return this;
	}


	/**
	* This function allows setting a value for entityType
	* @param entityType desired value to be set
	* @return Builder object with new value for entityType
	*/
	public EntityBuilder entityType(EntityType entityType) {
		this.map.put("entityType", entityType);
		return this;
	}


	/**
	* This function allows setting a value for statements
	* @param statements desired value to be set
	* @return Builder object with new value for statements
	*/
	public EntityBuilder statements(List<SubmodelElement> statements) {
		this.map.put("statements", statements);
		return this;
	}



	/**
	* This function allows setting a value for category
	* @param category desired value to be set
	* @return Builder object with new value for category
	*/
	public EntityBuilder category(String category) {
		this.map.put("category", category);
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	public EntityBuilder description(LangStringSet description) {
		this.map.put("description", description);
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	public EntityBuilder displayName(LangStringSet displayName) {
		this.map.put("displayName", displayName);
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	public EntityBuilder idShort(String idShort) {
		this.map.put("idShort", idShort);
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	public EntityBuilder qualifiers(List<Constraint> qualifiers) {
		this.map.put("qualifiers", qualifiers);
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	public EntityBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.map.put("dataSpecifications", dataSpecifications);
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	public EntityBuilder kind(ModelingKind kind) {
		this.map.put("kind", kind);
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	public EntityBuilder semanticId(Reference semanticId) {
		this.map.put("semanticId", semanticId);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public Entity build() throws ConstraintViolationException {
		DefaultEntity defaultEntity = Util.fillInstanceFromMap(new DefaultEntity(), this.map);
		return defaultEntity;
	}
}
