package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"has Asset Identification Model"

	"In AssetInformation identifying meta data of the asset that is represented by an AAS is defined."@en

	"The asset may either represent an asset type or an asset instance."@en

	"The asset has a globally unique identifier plus - if needed - additional domain specific (proprietary) identifiers. However, to support the corner case of very first phase of lifecycle where a stabilised/constant global asset identifier does not already exist, the corresponding attribute \'globalAssetId\' is optional."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AssetInformation")
public class AssetInformationImpl implements Serializable, AssetInformation {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("has Asset Identification Model", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("In AssetInformation identifying meta data of the asset that is represented by an AAS is defined.", "en"),
new TypedLiteral("The asset may either represent an asset type or an asset instance.", "en"),
new TypedLiteral("The asset has a globally unique identifier plus - if needed - additional domain specific (proprietary) identifiers. However, to support the corner case of very first phase of lifecycle where a stabilised/constant global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is optional.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has assetKind"

	"Denotes whether the Asset of of kind \'Type\' or \'Instance\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind", "assetInformationAssetKind"})
	 java.util.ArrayList<? extends AssetKind> _assetInformationAssetKind;


	/**
	"has Bill of Material"

	"A reference to a Submodel that defines the bill of material of the asset represented by the AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial", "assetInformationBillOfMaterial"})
	 java.util.ArrayList<? extends Submodel> _assetInformationBillOfMaterial;


	/**
	"has external asset id"

	"Additional domain specific external, typically proprietary Identifier for the asset like e.g. serial number etc."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId", "assetInformationExternalAssetId"})
	 java.util.ArrayList<? extends IdentifierKeyValuePair> _assetInformationExternalAssetId;


	/**
	"has global asset id"

	"Reference to either an Asset object or a global reference to the asset the AAS is representing."@en

	"This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the asset. In a first phase of the life cycle the asset might not yet have a global id but already an internal identifier. The internal identifier would be modelled via \'externalAssetId\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId", "assetInformationGlobalAssetId"})
	 Reference _assetInformationGlobalAssetId;


	/**
	"has thumbnail"

	"Thumbnail of the asset represented by the asset administration shell."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail", "assetInformationThumbnail"})
	 File _assetInformationThumbnail;


	// no manual construction
	AssetInformationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("assetInformation");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
	java.util.ArrayList<? extends AssetKind> getAssetInformationAssetKind() {
		return _assetInformationAssetKind;
	}

	final public void setAssetInformationAssetKind (java.util.ArrayList<? extends AssetKind> _assetInformationAssetKind_) {
		this._assetInformationAssetKind = _assetInformationAssetKind_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
	Reference getAssetInformationGlobalAssetId() {
		return _assetInformationGlobalAssetId;
	}

	final public void setAssetInformationGlobalAssetId (Reference _assetInformationGlobalAssetId_) {
		this._assetInformationGlobalAssetId = _assetInformationGlobalAssetId_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId")
	java.util.ArrayList<? extends IdentifierKeyValuePair> getAssetInformationExternalAssetId() {
		return _assetInformationExternalAssetId;
	}

	final public void setAssetInformationExternalAssetId (java.util.ArrayList<? extends IdentifierKeyValuePair> _assetInformationExternalAssetId_) {
		this._assetInformationExternalAssetId = _assetInformationExternalAssetId_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
	java.util.ArrayList<? extends Submodel> getAssetInformationBillOfMaterial() {
		return _assetInformationBillOfMaterial;
	}

	final public void setAssetInformationBillOfMaterial (java.util.ArrayList<? extends Submodel> _assetInformationBillOfMaterial_) {
		this._assetInformationBillOfMaterial = _assetInformationBillOfMaterial_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail")
	File getAssetInformationThumbnail() {
		return _assetInformationThumbnail;
	}

	final public void setAssetInformationThumbnail (File _assetInformationThumbnail_) {
		this._assetInformationThumbnail = _assetInformationThumbnail_;
	}
}
