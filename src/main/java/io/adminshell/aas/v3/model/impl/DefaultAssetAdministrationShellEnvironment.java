/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment
 * 
 * A graph of Asset Administration Shells.
 */

@IRI("aas:AssetAdministrationShellEnvironment")
public class DefaultAssetAdministrationShellEnvironment implements AssetAdministrationShellEnvironment {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assetAdministrationShells")
    protected List<AssetAdministrationShell> assetAdministrationShells = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/assets")
    protected List<Asset> assets = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/conceptDescriptions")
    protected List<ConceptDescription> conceptDescriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShellEnvironment/submodels")
    protected List<Submodel> submodels = new ArrayList<>();

    public DefaultAssetAdministrationShellEnvironment() {}

    @Override
    public int hashCode() {
        return Objects.hash(new HashSet<>(this.assetAdministrationShells),
            new HashSet<>(this.assets),
            new HashSet<>(this.conceptDescriptions),
            new HashSet<>(this.submodels));
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
            new HashSet<>(this.assetAdministrationShells);
            return Objects.equals(new HashSet<>(this.assetAdministrationShells), new HashSet<>(other.assetAdministrationShells)) &&
                Objects.equals(new HashSet<>(this.assets), new HashSet<>(other.assets)) &&
                Objects.equals(new HashSet<>(this.conceptDescriptions), new HashSet<>(other.conceptDescriptions)) &&
                Objects.equals(new HashSet<>(this.submodels), new HashSet<>(other.submodels));
        }
    }

    @Override
    public List<AssetAdministrationShell> getAssetAdministrationShells() {
        return assetAdministrationShells;
    }

    @Override
    public void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells) {
        this.assetAdministrationShells = assetAdministrationShells;
    }

    @Override
    public List<Asset> getAssets() {
        return assets;
    }

    @Override
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    @Override
    public List<ConceptDescription> getConceptDescriptions() {
        return conceptDescriptions;
    }

    @Override
    public void setConceptDescriptions(List<ConceptDescription> conceptDescriptions) {
        this.conceptDescriptions = conceptDescriptions;
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
     * This builder class can be used to construct a DefaultAssetAdministrationShellEnvironment bean.
     */
    public static class Builder extends AssetAdministrationShellEnvironmentBuilder<DefaultAssetAdministrationShellEnvironment, Builder> {

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
