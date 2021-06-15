package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * The asset may either represent an asset type or an asset instance. The asset has a globally
 * unique identifier plus - if needed - additional domain specific (proprietary) identifiers.
 * However, to support the corner case of very first phase of lifecycle where a stabilised/constant
 * global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is
 * optional.
 */

public class DefaultAssetInformation implements AssetInformation {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Denotes whether the Asset of kind 'Type' or 'Instance'.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    protected AssetKind assetKind;

    /**
     * A reference to a Submodel that defines the bill of material of the asset represented by the AAS.
     * This submodel contains a set of entities describing the material used to compose the composite
     * I4.0 Component.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    protected List<Submodel> billOfMaterials = new ArrayList<>();

    /**
     * Thumbnail of the asset represented by the asset administration shell.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    protected File defaultThumbnail;

    /**
     * Reference to either an Asset object or a global reference to the asset the AAS is representing.
     * This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the
     * asset. In a first phase of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via 'externalAssetId'. Constraint
     * AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a global
     * reference.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    protected Reference globalAssetId;

    /**
     * Additional domain-specific, typically proprietary Identifier for the asset like e.g. serial
     * number etc.
     */
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

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    final public AssetKind getAssetKind() {
        return assetKind;
    }

    final public void setAssetKind(AssetKind assetKind) {
        this.assetKind = assetKind;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    final public Reference getGlobalAssetId() {
        return globalAssetId;
    }

    final public void setGlobalAssetId(Reference globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    final public List<IdentifierKeyValuePair> getSpecificAssetIds() {
        return specificAssetIds;
    }

    final public void setSpecificAssetIds(List<IdentifierKeyValuePair> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    final public List<Submodel> getBillOfMaterials() {
        return billOfMaterials;
    }

    final public void setBillOfMaterials(List<Submodel> billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    final public File getDefaultThumbnail() {
        return defaultThumbnail;
    }

    final public void setDefaultThumbnail(File defaultThumbnail) {
        this.defaultThumbnail = defaultThumbnail;
    }

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
