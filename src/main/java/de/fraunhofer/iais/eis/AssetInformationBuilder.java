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

public class AssetInformationBuilder {

	private DefaultAssetInformation defaultAssetInformation;

	public AssetInformationBuilder() {
		defaultAssetInformation = new DefaultAssetInformation();
	}

	public AssetInformationBuilder(URI id) {
		this();
		defaultAssetInformation.id = id;
	}

	/**
	* This function allows setting a value for assetKinds
	* @param assetKinds desired value to be set
	* @return Builder object with new value for assetKinds
	*/
	final public AssetInformationBuilder assetKinds(List<AssetKind> assetKinds) {
		this.defaultAssetInformation.assetKinds = assetKinds;
		return this;
	}


	/**
	* This function allows setting a value for globalAssetId
	* @param globalAssetId desired value to be set
	* @return Builder object with new value for globalAssetId
	*/
	final public AssetInformationBuilder globalAssetId(Reference globalAssetId) {
		this.defaultAssetInformation.globalAssetId = globalAssetId;
		return this;
	}


	/**
	* This function allows setting a value for externalAssetIds
	* @param externalAssetIds desired value to be set
	* @return Builder object with new value for externalAssetIds
	*/
	final public AssetInformationBuilder externalAssetIds(List<IdentifierKeyValuePair> externalAssetIds) {
		this.defaultAssetInformation.externalAssetIds = externalAssetIds;
		return this;
	}


	/**
	* This function allows setting a value for billOfMaterials
	* @param billOfMaterials desired value to be set
	* @return Builder object with new value for billOfMaterials
	*/
	final public AssetInformationBuilder billOfMaterials(List<Submodel> billOfMaterials) {
		this.defaultAssetInformation.billOfMaterials = billOfMaterials;
		return this;
	}


	/**
	* This function allows setting a value for thumbnail
	* @param thumbnail desired value to be set
	* @return Builder object with new value for thumbnail
	*/
	final public AssetInformationBuilder thumbnail(File thumbnail) {
		this.defaultAssetInformation.thumbnail = thumbnail;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AssetInformation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAssetInformation);
		return defaultAssetInformation;
	}
}
