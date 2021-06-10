package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Asset Administration Shell Environment" "A graph of Asset Administration Shells."@en
 */

public class DefaultAssetAdministrationShellEnvironment implements AssetAdministrationShellEnvironment {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has Asset Administration Shells" "Points to the differents Administration Shells in one
     * AssetAdministrationShellEnvironment graph."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
    protected List<AssetAdministrationShell> assetAdministrationShells = new ArrayList<>();

    /**
     * "has Assets" "Points to the differents Assets in one AssetAdministrationShellEnvironment
     * graph."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
    protected List<Asset> assets = new ArrayList<>();

    /**
     * "has Concept Descriptions" "Points to the differents Concept Descriptions in one
     * AssetAdministrationShellEnvironment graph."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
    protected List<ConceptDescription> conceptDescriptions = new ArrayList<>();

    /**
     * "has submodels" "Points to the differents Submodels in one AssetAdministrationShellEnvironment
     * graph."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
    protected List<Submodel> submodels = new ArrayList<>();

    public DefaultAssetAdministrationShellEnvironment() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.assetAdministrationShells,
            this.assets,
            this.conceptDescriptions,
            this.submodels});
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
            DefaultAssetAdministrationShellEnvironment other = (DefaultAssetAdministrationShellEnvironment) obj;
            return Objects.equals(this.assetAdministrationShells, other.assetAdministrationShells) &&
                Objects.equals(this.assets, other.assets) &&
                Objects.equals(this.conceptDescriptions, other.conceptDescriptions) &&
                Objects.equals(this.submodels, other.submodels);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
    final public List<AssetAdministrationShell> getAssetAdministrationShells() {
        return assetAdministrationShells;
    }

    final public void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells) {
        this.assetAdministrationShells = assetAdministrationShells;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
    final public List<Asset> getAssets() {
        return assets;
    }

    final public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
    final public List<ConceptDescription> getConceptDescriptions() {
        return conceptDescriptions;
    }

    final public void setConceptDescriptions(List<ConceptDescription> conceptDescriptions) {
        this.conceptDescriptions = conceptDescriptions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
    final public List<Submodel> getSubmodels() {
        return submodels;
    }

    final public void setSubmodels(List<Submodel> submodels) {
        this.submodels = submodels;
    }

    public static class Builder
        extends DefaultAssetAdministrationShellEnvironmentBuilder<DefaultAssetAdministrationShellEnvironment, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShellEnvironment newBuildingInstance() {
            return new DefaultAssetAdministrationShellEnvironment();
        }
    }
}
