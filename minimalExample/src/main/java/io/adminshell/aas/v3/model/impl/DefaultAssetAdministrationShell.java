package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.AssetAdministrationShell
 * 
 * Describes the Administration Shell for Assets, Products, Components, e.g. Machines
 */

public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    protected List<AssetInformation> assetInformations = new ArrayList<>();

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

    @Override
    public List<AssetInformation> getAssetInformations() {
        return assetInformations;
    }

    @Override
    public void setAssetInformations(List<AssetInformation> assetInformations) {
        this.assetInformations = assetInformations;
    }

    @Override
    public List<Submodel> getSubmodels() {
        return submodels;
    }

    @Override
    public void setSubmodels(List<Submodel> submodels) {
        this.submodels = submodels;
    }

    /**
     * This builder class can be used to construct a DefaultAssetAdministrationShell bean.
     */
    public static class Builder extends AssetAdministrationShellBuilder<DefaultAssetAdministrationShell, Builder> {

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
