package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.builder.ExtendableBuilder;
import java.util.List;

/**
 * In AssetInformation identifying meta data of the asset that is represented by
 * an AAS is defined.
 *
 * The asset may either represent an asset type or an asset instance.
 *
 * The asset has a * globally unique identifier plus - if needed - additional
 * domain specific (proprietary) identifiers. However, to support the corner
 * case of very first phase of lifecycle where a stabilised/constant global
 * asset identifier does not already exist, the corresponding attribute
 * 'globalAssetId' is optional.
 */
public interface AssetInformation {

    /**
     * Denotes whether the Asset is of kind 'Type' or 'Instance'.
     *
     * @return Returns the List of AssetKind for the property assetKind.
     */
    public List<AssetKind> getAssetKinds();

    /**
     * Denotes whether the Asset of of kind 'Type' or 'Instance'.
     *
     * @param value The List of AssetKind for the property assetKinds.
     */
    public void setAssetKinds(List<AssetKind> value);

    /**
     * Reference to either an Asset object or a global reference to the asset
     * the AAS is representing. This attribute is required as soon as the AAS is
     * exchanged via partners in the life cycle of the asset. In a first phase
     * of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via
     * 'externalAssetId'.
     *
     * Constraint AASd-023: AssetInformation/globalAssetId either is a reference
     * to an Asset object or a global reference.
     *
     * @return Returns the Reference for the property globalAssetId.
     */
    public Reference getGlobalAssetId();

    public void setGlobalAssetId(Reference value);

    /**
     * Additional domain specific external, typically proprietary Identifier for
     * the asset like e.g. serial number etc.
     *
     * @return Returns the List of IdentifierKeyValuePair for the property
     * externalAssetId.
     */
    public List<IdentifierKeyValuePair> getExternalAssetIds();

    public void setExternalAssetIds(List<IdentifierKeyValuePair> value);

    /**
     * A reference to a Submodel that defines the bill of material of the asset
     * represented by the AAS. This submodel contains a set of entities
     * describing the material used to compose the composite I4.0 Component.
     *
     * @return Returns the List of Submodel for the property billOfMaterial.
     */
    public List<Submodel> getBillOfMaterials();

    public void setBillOfMaterials(List<Submodel> value);

    /**
     * Thumbnail of the asset represented by the asset administration shell.
     *
     * @return Returns the File for the property thumbnail.
     */
    public File getThumbnail();

    public void setThumbnail(File value);

    public static abstract class AbstractBuilder<T extends AssetInformation, B extends AbstractBuilder<T, B>> extends ExtendableBuilder<T, B> {

        public B assetKinds(List<AssetKind> value) {
            getBuildingInstance().setAssetKinds(value);
            return getSelf();
        }

        public B assetKind(AssetKind value) {
            getBuildingInstance().getAssetKinds().add(value);
            return getSelf();
        }

        public B billOfMaterials(List<Submodel> value) {
            getBuildingInstance().setBillOfMaterials(value);
            return getSelf();
        }

        public B billOfMaterials(Submodel value) {
            getBuildingInstance().getBillOfMaterials().add(value);
            return getSelf();
        }

        public B externalAssetIds(List<IdentifierKeyValuePair> value) {
            getBuildingInstance().setExternalAssetIds(value);
            return getSelf();
        }

        public B externalAssetId(IdentifierKeyValuePair value) {
            getBuildingInstance().getExternalAssetIds().add(value);
            return getSelf();
        }

        public B globalAssetId(Reference value) {
            getBuildingInstance().setGlobalAssetId(value);
            return getSelf();
        }

        public B thumbnail(File value) {
            getBuildingInstance().setThumbnail(value);
            return getSelf();
        }

    }
}
