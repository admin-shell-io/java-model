package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

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
    protected List<AssetAdministrationShell> assetAdministrationShells;

    /**
     * "has Assets" "Points to the differents Assets in one AssetAdministrationShellEnvironment
     * graph."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
    protected List<Asset> assets;

    /**
     * "has Concept Descriptions" "Points to the differents Concept Descriptions in one
     * AssetAdministrationShellEnvironment graph."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
    protected List<ConceptDescription> conceptDescriptions;

    /**
     * "has submodels" "Points to the differents Submodels in one AssetAdministrationShellEnvironment
     * graph."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
    protected List<Submodel> submodels;

    // no manual construction
    protected DefaultAssetAdministrationShellEnvironment() {}

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

    @Override
    public Object deepCopy() {
        DefaultAssetAdministrationShellEnvironment other = new DefaultAssetAdministrationShellEnvironment();
        other.assetAdministrationShells = (List<AssetAdministrationShell>) Util.clone(this.assetAdministrationShells);
        other.assets = (List<Asset>) Util.clone(this.assets);
        other.conceptDescriptions = (List<ConceptDescription>) Util.clone(this.conceptDescriptions);
        other.submodels = (List<Submodel>) Util.clone(this.submodels);
        return other;
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
}
