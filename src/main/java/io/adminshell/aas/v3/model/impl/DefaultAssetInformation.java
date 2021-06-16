package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.AssetInformation
 * 
 * The asset may either represent an asset type or an asset instance. The asset has a globally
 * unique identifier plus - if needed - additional domain specific (proprietary) identifiers.
 * However, to support the corner case of very first phase of lifecycle where a stabilised/constant
 * global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is
 * optional.
 */

public class DefaultAssetInformation implements AssetInformation {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    protected AssetKind assetKind;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    protected List<Submodel> billOfMaterials = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    protected File defaultThumbnail;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    protected Reference globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    protected List<IdentifierKeyValuePair> specificAssetIds = new ArrayList<>();

    public DefaultAssetInformation() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.assetKind,
            this.globalAssetId,
            this.specificAssetIds,
            this.billOfMaterials,
            this.defaultThumbnail});
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
            return Objects.equals(this.assetKind, other.assetKind) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.specificAssetIds, other.specificAssetIds) &&
                Objects.equals(this.billOfMaterials, other.billOfMaterials) &&
                Objects.equals(this.defaultThumbnail, other.defaultThumbnail);
        }
    }

    @Override
    public AssetKind getAssetKind() {
        return assetKind;
    }

    @Override
    public void setAssetKind(AssetKind assetKind) {
        this.assetKind = assetKind;
    }

    @Override
    public Reference getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(Reference globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    public List<IdentifierKeyValuePair> getSpecificAssetIds() {
        return specificAssetIds;
    }

    @Override
    public void setSpecificAssetIds(List<IdentifierKeyValuePair> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
    }

    @Override
    public List<Submodel> getBillOfMaterials() {
        return billOfMaterials;
    }

    @Override
    public void setBillOfMaterials(List<Submodel> billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    @Override
    public File getDefaultThumbnail() {
        return defaultThumbnail;
    }

    @Override
    public void setDefaultThumbnail(File defaultThumbnail) {
        this.defaultThumbnail = defaultThumbnail;
    }

    /**
     * This builder class can be used to construct a DefaultAssetInformation bean.
     */
    public static class Builder extends AssetInformationBuilder<DefaultAssetInformation, Builder> {

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
