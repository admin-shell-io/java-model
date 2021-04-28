package de.fraunhofer.iais.eis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Default implementation of
 * {@link de.fraunhofer.iais.eis.AssetAdministrationShell}"
 */
public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

    // [explanation] do not use javadoc on internal implementations
    protected List<Submodel> submodel;

    protected DefaultAssetAdministrationShell() {
        this.submodel = new ArrayList<>();
    }

    // [explanation] do not use javadoc on overriden methods when documentation of overridden method is already sufficient
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.submodel});
    }

    // [explanation] do not use javadoc on overriden methods when documentation of overridden method is already sufficient
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
            return super.equals(other) && Objects.equals(this.submodel, other.submodel);
        }
    }

    // [explanation] do not use javadoc on overriden methods when documentation of overridden method is already sufficient
    @Override
    final public List<Submodel> getSubmodels() {
        return submodel;
    }

    // [explanation] do not use javadoc on overriden methods when documentation of overridden method is already sufficient
    @Override
    final public void setSubmodels(List<Submodel> submodel) {
        this.submodel = submodel;
    }

    public static class Builder extends AssetAdministrationShell.AbstractBuilder<DefaultAssetAdministrationShell, Builder> {

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
