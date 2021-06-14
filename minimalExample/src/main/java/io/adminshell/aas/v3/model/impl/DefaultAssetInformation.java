package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * "Asset Information" "The asset may either represent an asset type or an asset instance. The asset
 * has a globally unique identifier plus - if needed - additional domain specific (proprietary)
 * identifiers. However, to support the corner case of very first phase of lifecycle where a
 * stabilised/constant global asset identifier does not already exist, the corresponding attribute
 * \'globalAssetId\' is optional."@en
 */

public class DefaultAssetInformation implements AssetInformation {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has asset kind" "Denotes whether the Asset of kind \'Type\' or \'Instance\'."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    protected List<AssetKind> assetKinds = new ArrayList<>();

    /**
     * "has default Thumbnail" "Thumbnail of the asset represented by the asset administration
     * shell."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    protected List<File> defaultThumbnails = new ArrayList<>();

    /**
     * "has global asset id" "Reference to either an Asset object or a global reference to the asset the
     * AAS is representing. This attribute is required as soon as the AAS is exchanged via partners in
     * the life cycle of the asset. In a first phase of the life cycle the asset might not yet have a
     * global id but already an internal identifier. The internal identifier would be modelled via
     * \'externalAssetId\'."@en "Constraint AASd-023: AssetInformation/globalAssetId either is a
     * reference to an Asset object or a global reference."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    protected List<Reference> globalAssetIds = new ArrayList<>();

    /**
     * "has specific asset id" "Additional domain-specific, typically proprietary Identifier for the
     * asset like e.g. serial number etc."@en
     */
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

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    final public List<AssetKind> getAssetKinds() {
        return assetKinds;
    }

    final public void setAssetKinds(List<AssetKind> assetKinds) {
        this.assetKinds = assetKinds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    final public List<Reference> getGlobalAssetIds() {
        return globalAssetIds;
    }

    final public void setGlobalAssetIds(List<Reference> globalAssetIds) {
        this.globalAssetIds = globalAssetIds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    final public List<IdentifierKeyValuePair> getSpecificAssetIds() {
        return specificAssetIds;
    }

    final public void setSpecificAssetIds(List<IdentifierKeyValuePair> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    final public List<File> getDefaultThumbnails() {
        return defaultThumbnails;
    }

    final public void setDefaultThumbnails(List<File> defaultThumbnails) {
        this.defaultThumbnails = defaultThumbnails;
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
