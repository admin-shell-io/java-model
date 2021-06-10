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
 * "Asset Administration Shell" "Describes the Administration Shell for Assets, Products,
 * Components, e.g. Machines"@en
 */

public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has assetInformation" "Meta information about the asset the AAS is representing."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    protected List<AssetInformation> assetInformations = new ArrayList<>();

    /**
     * "has Submodel" "Points from the Admin Shell to the Submodels that describe the Admin Shell of a
     * given Asset"@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    protected List<Submodel> submodels = new ArrayList<>();

    public DefaultAssetAdministrationShell() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.assetInformations,
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
            DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
            return Objects.equals(this.assetInformations, other.assetInformations) &&
                Objects.equals(this.submodels, other.submodels);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    final public List<AssetInformation> getAssetInformations() {
        return assetInformations;
    }

    final public void setAssetInformations(List<AssetInformation> assetInformations) {
        this.assetInformations = assetInformations;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    final public List<Submodel> getSubmodels() {
        return submodels;
    }

    final public void setSubmodels(List<Submodel> submodels) {
        this.submodels = submodels;
    }

    public static class Builder extends DefaultAssetAdministrationShellBuilder<DefaultAssetAdministrationShell, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShell newBuildingInstance() {
            return new DefaultAssetAdministrationShell();
        }
    }
}
