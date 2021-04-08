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

/** 
* "has Asset Identification Model"
* "In AssetInformation identifying meta data of the asset that is represented by an AAS is defined."@en
* "The asset may either represent an asset type or an asset instance."@en
* "The asset has a globally unique identifier plus - if needed - additional domain specific (proprietary) identifiers. However, to support the corner case of very first phase of lifecycle where a stabilised/constant global asset identifier does not already exist, the corresponding attribute \'globalAssetId\' is optional."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AssetInformation")
public class AssetInformationImpl implements Serializable, IAssetInformation {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("has Asset Identification Model", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("In AssetInformation identifying meta data of the asset that is represented by an AAS is defined.", "en"), new TypedLiteral("The asset may either represent an asset type or an asset instance.", "en"), new TypedLiteral("The asset has a globally unique identifier plus - if needed - additional domain specific (proprietary) identifiers. However, to support the corner case of very first phase of lifecycle where a stabilised/constant global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is optional.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has assetKind"
	* "Denotes whether the Asset of of kind \'Type\' or \'Instance\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind", "assetInformationAssetKind"})
	protected ArrayList<? extends AssetKind> _assetInformationAssetKind;


	/**
	* "has Bill of Material"
	* "A reference to a Submodel that defines the bill of material of the asset represented by the AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial", "assetInformationBillOfMaterial"})
	protected ArrayList<? extends ISubmodel> _assetInformationBillOfMaterial;


	/**
	* "has external asset id"
	* "Additional domain specific external, typically proprietary Identifier for the asset like e.g. serial number etc."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId", "assetInformationExternalAssetId"})
	protected ArrayList<? extends IIdentifierKeyValuePair> _assetInformationExternalAssetId;


	/**
	* "has global asset id"
	* "Reference to either an Asset object or a global reference to the asset the AAS is representing."@en
	* "This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the asset. In a first phase of the life cycle the asset might not yet have a global id but already an internal identifier. The internal identifier would be modelled via \'externalAssetId\'."@en
	* "Constraint AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a global reference."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId", "assetInformationGlobalAssetId"})
	protected IReference _assetInformationGlobalAssetId;


	/**
	* "has thumbnail"
	* "Thumbnail of the asset represented by the asset administration shell."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail", "assetInformationThumbnail"})
	protected IFile _assetInformationThumbnail;


	// no manual construction
	protected AssetInformationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("assetInformation");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
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
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Denotes whether the Asset of of kind \'Type\' or \'Instance\'."@en
	* @return Returns the List of AssetKind for the property assetInformationAssetKind.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
	final public List<? extends AssetKind> getAssetInformationAssetKind() {
		return _assetInformationAssetKind;
	}

	final public void setAssetInformationAssetKind (ArrayList<? extends AssetKind> _assetInformationAssetKind_) {
		this._assetInformationAssetKind = _assetInformationAssetKind_;
	}

	/**
	* "Reference to either an Asset object or a global reference to the asset the AAS is representing."@en
	* "This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the asset. In a first phase of the life cycle the asset might not yet have a global id but already an internal identifier. The internal identifier would be modelled via \'externalAssetId\'."@en
	* "Constraint AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a global reference."@en
	* @return Returns the IReference for the property assetInformationGlobalAssetId.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
	final public IReference getAssetInformationGlobalAssetId() {
		return _assetInformationGlobalAssetId;
	}

	final public void setAssetInformationGlobalAssetId (IReference _assetInformationGlobalAssetId_) {
		this._assetInformationGlobalAssetId = _assetInformationGlobalAssetId_;
	}

	/**
	* "Additional domain specific external, typically proprietary Identifier for the asset like e.g. serial number etc."@en
	* @return Returns the List of IIdentifierKeyValuePair for the property assetInformationExternalAssetId.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId")
	final public List<? extends IIdentifierKeyValuePair> getAssetInformationExternalAssetId() {
		return _assetInformationExternalAssetId;
	}

	final public void setAssetInformationExternalAssetId (ArrayList<? extends IIdentifierKeyValuePair> _assetInformationExternalAssetId_) {
		this._assetInformationExternalAssetId = _assetInformationExternalAssetId_;
	}

	/**
	* "A reference to a Submodel that defines the bill of material of the asset represented by the AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component."@en
	* @return Returns the List of ISubmodel for the property assetInformationBillOfMaterial.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
	final public List<? extends ISubmodel> getAssetInformationBillOfMaterial() {
		return _assetInformationBillOfMaterial;
	}

	final public void setAssetInformationBillOfMaterial (ArrayList<? extends ISubmodel> _assetInformationBillOfMaterial_) {
		this._assetInformationBillOfMaterial = _assetInformationBillOfMaterial_;
	}

	/**
	* "Thumbnail of the asset represented by the asset administration shell."@en
	* @return Returns the IFile for the property assetInformationThumbnail.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail")
	final public IFile getAssetInformationThumbnail() {
		return _assetInformationThumbnail;
	}

	final public void setAssetInformationThumbnail (IFile _assetInformationThumbnail_) {
		this._assetInformationThumbnail = _assetInformationThumbnail_;
	}
}
