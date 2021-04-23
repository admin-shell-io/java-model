package de.fraunhofer.iais.eis;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * "has Asset Identification Model" "In AssetInformation identifying meta data
 * of the asset that is represented by an AAS is defined."@en "The asset may
 * either represent an asset type or an asset instance."@en "The asset has a
 * globally unique identifier plus - if needed - additional domain specific
 * (proprietary) identifiers. However, to support the corner case of very first
 * phase of lifecycle where a stabilised/constant global asset identifier does
 * not already exist, the corresponding attribute \'globalAssetId\' is
 * optional."@en
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DefaultAssetInformation.class)
})
public interface AssetInformation {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * Denotes whether the Asset of of kind \'Type\' or \'Instance\'.
     *
     * @return Returns the List of AssetKind for the property assetKind.
     */
    public List<AssetKind> getAssetKinds();

    /**
     * Reference to either an Asset object or a global reference to the asset
     * the AAS is representing. This attribute is required as soon as the AAS is
     * exchanged via partners in the life cycle of the asset. In a first phase
     * of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via
     * \'externalAssetId\'. Constraint AASd-023: AssetInformation/globalAssetId
     * either is a reference to an Asset object or a global reference.
     *
     * @return Returns the Reference for the property globalAssetId.
     */
    public Reference getGlobalAssetId();

    /**
     * Additional domain specific external, typically proprietary Identifier for
     * the asset like e.g. serial number etc.
     *
     * @return Returns the List of IdentifierKeyValuePair for the property
     * externalAssetId.
     */
    public List<IdentifierKeyValuePair> getExternalAssetIds();

    /**
     * A reference to a Submodel that defines the bill of material of the asset
     * represented by the AAS. This submodel contains a set of entities
     * describing the material used to compose the composite I4.0 Component.
     *
     * @return Returns the List of Submodel for the property billOfMaterial.
     */
    public List<Submodel> getBillOfMaterials();

    /**
     * Thumbnail of the asset represented by the asset administration shell.
     *
     * @return Returns the File for the property thumbnail.
     */
    public File getThumbnail();

}
