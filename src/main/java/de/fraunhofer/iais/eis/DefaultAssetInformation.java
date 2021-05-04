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
public class DefaultAssetInformation implements AssetInformation {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("has Asset Identification Model", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("In AssetInformation identifying meta data of the asset that is represented by an AAS is defined.", "en"), new TypedLiteral("The asset may either represent an asset type or an asset instance.", "en"), new TypedLiteral("The asset has a globally unique identifier plus - if needed - additional domain specific (proprietary) identifiers. However, to support the corner case of very first phase of lifecycle where a stabilised/constant global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is optional.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has assetKind"
	* "Denotes whether the Asset of kind \'Type\' or \'Instance\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind", "assetKind"})
	protected List<AssetKind> assetKinds;


	/**
	* "has Bill of Material"
	* "A reference to a Submodel that defines the bill of material of the asset represented by the AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial", "billOfMaterial"})
	protected List<Submodel> billOfMaterials;


	/**
	* "has external asset id"
	* "Additional domain specific external, typically proprietary Identifier for the asset like e.g. serial number etc."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId", "externalAssetId"})
	protected List<IdentifierKeyValuePair> externalAssetIds;


	/**
	* "has global asset id"
	* "Reference to either an Asset object or a global reference to the asset the AAS is representing."@en
	* "This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the asset. In a first phase of the life cycle the asset might not yet have a global id but already an internal identifier. The internal identifier would be modelled via \'externalAssetId\'."@en
	* "Constraint AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a global reference."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId", "globalAssetId"})
	protected Reference globalAssetId;


	/**
	* "has thumbnail"
	* "Thumbnail of the asset represented by the asset administration shell."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail", "thumbnail"})
	protected File thumbnail;


	// no manual construction
	protected DefaultAssetInformation() {
		id = VocabUtil.getInstance().createRandomUrl("assetInformation");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.assetKinds,
			this.globalAssetId,
			this.externalAssetIds,
			this.billOfMaterials,
			this.thumbnail});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAssetInformation other = (DefaultAssetInformation) obj;
			return Objects.equals(this.assetKinds, other.assetKinds) &&
				Objects.equals(this.globalAssetId, other.globalAssetId) &&
				Objects.equals(this.externalAssetIds, other.externalAssetIds) &&
				Objects.equals(this.billOfMaterials, other.billOfMaterials) &&
				Objects.equals(this.thumbnail, other.thumbnail);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
	final public List<AssetKind> getAssetKinds() {
		return assetKinds;
	}
	
	final public void setAssetKinds (List<AssetKind> assetKinds) {
		this.assetKinds = assetKinds;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
	final public Reference getGlobalAssetId() {
		return globalAssetId;
	}
	
	final public void setGlobalAssetId (Reference globalAssetId) {
		this.globalAssetId = globalAssetId;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId")
	final public List<IdentifierKeyValuePair> getExternalAssetIds() {
		return externalAssetIds;
	}
	
	final public void setExternalAssetIds (List<IdentifierKeyValuePair> externalAssetIds) {
		this.externalAssetIds = externalAssetIds;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
	final public List<Submodel> getBillOfMaterials() {
		return billOfMaterials;
	}
	
	final public void setBillOfMaterials (List<Submodel> billOfMaterials) {
		this.billOfMaterials = billOfMaterials;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail")
	final public File getThumbnail() {
		return thumbnail;
	}
	
	final public void setThumbnail (File thumbnail) {
		this.thumbnail = thumbnail;
	}
}
