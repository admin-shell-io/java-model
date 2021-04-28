package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

/**
 * Default implementation of {@link de.fraunhofer.iais.eis.AssetInformation}"
 */
public class DefaultAssetInformation implements AssetInformation {

    protected List<AssetKind> assetKind;

    protected List<Submodel> billOfMaterial;

    protected List<IdentifierKeyValuePair> externalAssetId;

    protected Reference globalAssetId;

    protected File thumbnail;

    protected DefaultAssetInformation() {
        this.assetKind = new ArrayList<>();
        this.billOfMaterial = new ArrayList<>();
        this.externalAssetId = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.assetKind, this.globalAssetId, this.externalAssetId, this.billOfMaterial, this.thumbnail});
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
            return super.equals(other) && Objects.equals(this.assetKind, other.assetKind) && Objects.equals(this.globalAssetId, other.globalAssetId) && Objects.equals(this.externalAssetId, other.externalAssetId) && Objects.equals(this.billOfMaterial, other.billOfMaterial) && Objects.equals(this.thumbnail, other.thumbnail);
        }
    }

    @Override
    final public List<AssetKind> getAssetKinds() {
        return assetKind;
    }

    @Override
    final public void setAssetKinds(List<AssetKind> assetKind) {
        this.assetKind = assetKind;
    }

    @Override
    final public Reference getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    final public void setGlobalAssetId(Reference globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    final public List<IdentifierKeyValuePair> getExternalAssetIds() {
        return externalAssetId;
    }

    @Override
    final public void setExternalAssetIds(List<IdentifierKeyValuePair> externalAssetId) {
        this.externalAssetId = externalAssetId;
    }

    @Override
    final public List<Submodel> getBillOfMaterials() {
        return billOfMaterial;
    }

    @Override
    final public void setBillOfMaterials(List<Submodel> billOfMaterial) {
        this.billOfMaterial = billOfMaterial;
    }

    @Override
    final public File getThumbnail() {
        return thumbnail;
    }

    @Override
    final public void setThumbnail(File thumbnail) {
        this.thumbnail = thumbnail;
    }

    public static class Builder extends AssetInformation.AbstractBuilder<DefaultAssetInformation, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetInformation newBuildingInstance() {
            return new DefaultAssetInformation();
        }
    }
}
