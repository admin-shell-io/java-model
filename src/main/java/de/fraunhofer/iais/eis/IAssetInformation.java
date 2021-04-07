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
	"has Asset Identification Model"

	"In AssetInformation identifying meta data of the asset that is represented by an AAS is defined."@en

	"The asset may either represent an asset type or an asset instance."@en

	"The asset has a globally unique identifier plus - if needed - additional domain specific (proprietary) identifiers. However, to support the corner case of very first phase of lifecycle where a stabilised/constant global asset identifier does not already exist, the corresponding attribute \'globalAssetId\' is optional."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AssetInformationImpl.class),})
public interface IAssetInformation {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Denotes whether the Asset of of kind \'Type\' or \'Instance\'."@en
	@return the List of assetInformationAssetKind
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
	public List<? extends AssetKind> getAssetInformationAssetKind();

	/**
	"Reference to either an Asset object or a global reference to the asset the AAS is representing."@en

	"This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the asset. In a first phase of the life cycle the asset might not yet have a global id but already an internal identifier. The internal identifier would be modelled via \'externalAssetId\'."@en

	"Constraint AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a global reference."@en
	@return the IReference of assetInformationGlobalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
	public IReference getAssetInformationGlobalAssetId();

	/**
	"Additional domain specific external, typically proprietary Identifier for the asset like e.g. serial number etc."@en
	@return the List of assetInformationExternalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId")
	public List<? extends IIdentifierKeyValuePair> getAssetInformationExternalAssetId();

	/**
	"A reference to a Submodel that defines the bill of material of the asset represented by the AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component."@en
	@return the List of assetInformationBillOfMaterial
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
	public List<? extends ISubmodel> getAssetInformationBillOfMaterial();

	/**
	"Thumbnail of the asset represented by the asset administration shell."@en
	@return the IFile of assetInformationThumbnail
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail")
	public IFile getAssetInformationThumbnail();
}
