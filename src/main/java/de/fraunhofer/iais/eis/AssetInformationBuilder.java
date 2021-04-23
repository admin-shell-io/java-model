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
	* This function allows setting a value for assetInformationAssetKinds
	* @param assetInformationAssetKinds desired value to be set
	* @return Builder object with new value for assetInformationAssetKinds
	*/
	final public AssetInformationBuilder assetInformationAssetKinds(List<AssetKind> assetInformationAssetKinds) {
		this.defaultAssetInformation.assetInformationAssetKinds = assetInformationAssetKinds;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationGlobalAssetId
	* @param assetInformationGlobalAssetId desired value to be set
	* @return Builder object with new value for assetInformationGlobalAssetId
	*/
	final public AssetInformationBuilder assetInformationGlobalAssetId(Reference assetInformationGlobalAssetId) {
		this.defaultAssetInformation.assetInformationGlobalAssetId = assetInformationGlobalAssetId;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationExternalAssetIds
	* @param assetInformationExternalAssetIds desired value to be set
	* @return Builder object with new value for assetInformationExternalAssetIds
	*/
	final public AssetInformationBuilder assetInformationExternalAssetIds(List<IdentifierKeyValuePair> assetInformationExternalAssetIds) {
		this.defaultAssetInformation.assetInformationExternalAssetIds = assetInformationExternalAssetIds;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationBillOfMaterials
	* @param assetInformationBillOfMaterials desired value to be set
	* @return Builder object with new value for assetInformationBillOfMaterials
	*/
	final public AssetInformationBuilder assetInformationBillOfMaterials(List<Submodel> assetInformationBillOfMaterials) {
		this.defaultAssetInformation.assetInformationBillOfMaterials = assetInformationBillOfMaterials;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationThumbnail
	* @param assetInformationThumbnail desired value to be set
	* @return Builder object with new value for assetInformationThumbnail
	*/
	final public AssetInformationBuilder assetInformationThumbnail(File assetInformationThumbnail) {
		this.defaultAssetInformation.assetInformationThumbnail = assetInformationThumbnail;
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
