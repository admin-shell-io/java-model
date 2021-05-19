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

public class AssetBuilder {

	private Map<String, Object> map;

	public AssetBuilder() {
		this.map = new HashMap<>();
	}

	public AssetBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}



	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	public AssetBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.map.put("dataSpecifications", dataSpecifications);
		return this;
	}


	/**
	* This function allows setting a value for administration
	* @param administration desired value to be set
	* @return Builder object with new value for administration
	*/
	public AssetBuilder administration(AdministrativeInformation administration) {
		this.map.put("administration", administration);
		return this;
	}


	/**
	* This function allows setting a value for identification
	* @param identification desired value to be set
	* @return Builder object with new value for identification
	*/
	public AssetBuilder identification(Identifier identification) {
		this.map.put("identification", identification);
		return this;
	}


	/**
	* This function allows setting a value for category
	* @param category desired value to be set
	* @return Builder object with new value for category
	*/
	public AssetBuilder category(String category) {
		this.map.put("category", category);
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	public AssetBuilder description(LangString description) {
		this.map.put("description", description);
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	public AssetBuilder displayName(LangString displayName) {
		this.map.put("displayName", displayName);
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	public AssetBuilder idShort(String idShort) {
		this.map.put("idShort", idShort);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public Asset build() throws ConstraintViolationException {
		DefaultAsset defaultAsset = Util.fillInstanceFromMap(new DefaultAsset(), this.map);
		return defaultAsset;
	}
}
