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
    protected List<AssetKind> assetKinds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    protected List<File> defaultThumbnails = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    protected List<Reference> globalAssetIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    protected List<IdentifierKeyValuePair> specificAssetIds = new ArrayList<>();

    public DefaultAssetInformation() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.assetKinds,
            this.globalAssetIds,
            this.specificAssetIds,
            this.defaultThumbnails});
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
                Objects.equals(this.globalAssetIds, other.globalAssetIds) &&
                Objects.equals(this.specificAssetIds, other.specificAssetIds) &&
                Objects.equals(this.defaultThumbnails, other.defaultThumbnails);
        }
    }

    @Override
    public List<AssetKind> getAssetKinds() {
        return assetKinds;
    }

    @Override
    public void setAssetKinds(List<AssetKind> assetKinds) {
        this.assetKinds = assetKinds;
    }

    @Override
    public List<Reference> getGlobalAssetIds() {
        return globalAssetIds;
    }

    @Override
    public void setGlobalAssetIds(List<Reference> globalAssetIds) {
        this.globalAssetIds = globalAssetIds;
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
    public List<File> getDefaultThumbnails() {
        return defaultThumbnails;
    }

    @Override
    public void setDefaultThumbnails(List<File> defaultThumbnails) {
        this.defaultThumbnails = defaultThumbnails;
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
