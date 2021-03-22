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

	"The asset has a globally unique identifier plus – if needed – additional domain specific (proprietary) identifiers. However, to support the corner case of very first phase of lifecycle where a stabilised/constant global asset identifier does not already exist, the corresponding attribute “globalAssetId�? is optional."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AssetInformationImpl.class),})
public interface AssetInformation {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"has assetKind"

	"Denotes whether the Asset of of kind \'Type\' or \'Instance\'."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
	java.util.ArrayList<? extends AssetKind> getAssetInformationAssetKind();
	/**
	"has global asset id"

	"Reference to either an Asset object or a global reference to the asset the AAS is representing."@en

	"This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the asset. In a first phase of the life cycle the asset might not yet have a global id but already an internal identifier. The internal identifier would be modelled via “externalAssetId�?."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
	Reference getAssetInformationGlobalAssetId();
	/**
	"has external asset id"

	"Additional domain specific external, typically proprietary Identifier for the asset like e.g. serial number etc."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId")
	java.util.ArrayList<? extends IdentifierKeyValuePair> getAssetInformationExternalAssetId();
	/**
	"has Bill of Material"

	"A reference to a Submodel that defines the bill of material of the asset represented by the AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
	java.util.ArrayList<? extends Submodel> getAssetInformationBillOfMaterial();
	/**
	"has thumbnail"

	"Thumbnail of the asset represented by the asset administration shell."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail")
	File getAssetInformationThumbnail();
}
