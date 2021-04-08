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

	private AssetInformationImpl assetInformationImpl;

	public AssetInformationBuilder() {
		assetInformationImpl = new AssetInformationImpl();
	}

	public AssetInformationBuilder(URI id) {
		this();
		assetInformationImpl.id = id;
	}

	/**
	* This function allows setting a value for assetInformationAssetKind
	* @param _assetInformationAssetKind_ desired value to be set
	* @return Builder object with new value for assetInformationAssetKind
	*/
	final public AssetInformationBuilder _assetInformationAssetKind_(ArrayList<? extends AssetKind> _assetInformationAssetKind_) {
		this.assetInformationImpl._assetInformationAssetKind = _assetInformationAssetKind_;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationGlobalAssetId
	* @param _assetInformationGlobalAssetId_ desired value to be set
	* @return Builder object with new value for assetInformationGlobalAssetId
	*/
	final public AssetInformationBuilder _assetInformationGlobalAssetId_(IReference _assetInformationGlobalAssetId_) {
		this.assetInformationImpl._assetInformationGlobalAssetId = _assetInformationGlobalAssetId_;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationExternalAssetId
	* @param _assetInformationExternalAssetId_ desired value to be set
	* @return Builder object with new value for assetInformationExternalAssetId
	*/
	final public AssetInformationBuilder _assetInformationExternalAssetId_(ArrayList<? extends IIdentifierKeyValuePair> _assetInformationExternalAssetId_) {
		this.assetInformationImpl._assetInformationExternalAssetId = _assetInformationExternalAssetId_;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationBillOfMaterial
	* @param _assetInformationBillOfMaterial_ desired value to be set
	* @return Builder object with new value for assetInformationBillOfMaterial
	*/
	final public AssetInformationBuilder _assetInformationBillOfMaterial_(ArrayList<? extends ISubmodel> _assetInformationBillOfMaterial_) {
		this.assetInformationImpl._assetInformationBillOfMaterial = _assetInformationBillOfMaterial_;
		return this;
	}


	/**
	* This function allows setting a value for assetInformationThumbnail
	* @param _assetInformationThumbnail_ desired value to be set
	* @return Builder object with new value for assetInformationThumbnail
	*/
	final public AssetInformationBuilder _assetInformationThumbnail_(IFile _assetInformationThumbnail_) {
		this.assetInformationImpl._assetInformationThumbnail = _assetInformationThumbnail_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IAssetInformation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetInformationImpl);
		return assetInformationImpl;
	}
}
