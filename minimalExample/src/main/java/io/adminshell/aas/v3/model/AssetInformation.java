package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * The asset may either represent an asset type or an asset instance. The asset has a globally
 * unique identifier plus - if needed - additional domain specific (proprietary) identifiers.
 * However, to support the corner case of very first phase of lifecycle where a stabilised/constant
 * global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is
 * optional.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetInformation.class)
})
public interface AssetInformation {

    /**
     * Denotes whether the Asset of kind 'Type' or 'Instance'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind
     *
     * @return Returns the List of AssetKinds for the property assetKinds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    public List<AssetKind> getAssetKinds();

    /**
     * Denotes whether the Asset of kind 'Type' or 'Instance'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind
     *
     * @param assetKinds desired value for the property assetKinds.
     */
    public void setAssetKinds(List<AssetKind> assetKinds);

    /**
     * Reference to either an Asset object or a global reference to the asset the AAS is representing.
     * This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the
     * asset. In a first phase of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via 'externalAssetId'. Constraint
     * AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a global
     * reference.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId
     *
     * @return Returns the List of References for the property globalAssetIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    public List<Reference> getGlobalAssetIds();

    /**
     * Reference to either an Asset object or a global reference to the asset the AAS is representing.
     * This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the
     * asset. In a first phase of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via 'externalAssetId'. Constraint
     * AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a global
     * reference.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId
     *
     * @param globalAssetIds desired value for the property globalAssetIds.
     */
    public void setGlobalAssetIds(List<Reference> globalAssetIds);

    /**
     * Additional domain-specific, typically proprietary Identifier for the asset like e.g. serial
     * number etc.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId
     *
     * @return Returns the List of IdentifierKeyValuePairs for the property specificAssetIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    public List<IdentifierKeyValuePair> getSpecificAssetIds();

    /**
     * Additional domain-specific, typically proprietary Identifier for the asset like e.g. serial
     * number etc.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId
     *
     * @param specificAssetIds desired value for the property specificAssetIds.
     */
    public void setSpecificAssetIds(List<IdentifierKeyValuePair> specificAssetIds);

    /**
     * Thumbnail of the asset represented by the asset administration shell.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail
     *
     * @return Returns the List of Files for the property defaultThumbnails.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    public List<File> getDefaultThumbnails();

    /**
     * Thumbnail of the asset represented by the asset administration shell.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail
     *
     * @param defaultThumbnails desired value for the property defaultThumbnails.
     */
    public void setDefaultThumbnails(List<File> defaultThumbnails);

}
