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

public class AssetAdministrationShellEnvironmentBuilder {

	private Map<String, Object> map;

	public AssetAdministrationShellEnvironmentBuilder() {
		this.map = new HashMap<>();
	}

	public AssetAdministrationShellEnvironmentBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for assetAdministrationShells
	* @param assetAdministrationShells desired value to be set
	* @return Builder object with new value for assetAdministrationShells
	*/
	public AssetAdministrationShellEnvironmentBuilder assetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells) {
		this.map.put("assetAdministrationShells", assetAdministrationShells);
		return this;
	}


	/**
	* This function allows setting a value for assets
	* @param assets desired value to be set
	* @return Builder object with new value for assets
	*/
	public AssetAdministrationShellEnvironmentBuilder assets(List<Asset> assets) {
		this.map.put("assets", assets);
		return this;
	}


	/**
	* This function allows setting a value for conceptDescriptions
	* @param conceptDescriptions desired value to be set
	* @return Builder object with new value for conceptDescriptions
	*/
	public AssetAdministrationShellEnvironmentBuilder conceptDescriptions(List<ConceptDescription> conceptDescriptions) {
		this.map.put("conceptDescriptions", conceptDescriptions);
		return this;
	}


	/**
	* This function allows setting a value for submodels
	* @param submodels desired value to be set
	* @return Builder object with new value for submodels
	*/
	public AssetAdministrationShellEnvironmentBuilder submodels(List<Submodel> submodels) {
		this.map.put("submodels", submodels);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public AssetAdministrationShellEnvironment build() throws ConstraintViolationException {
		DefaultAssetAdministrationShellEnvironment defaultAssetAdministrationShellEnvironment = Util.fillInstanceFromMap(new DefaultAssetAdministrationShellEnvironment(), this.map);
		return defaultAssetAdministrationShellEnvironment;
	}
}
