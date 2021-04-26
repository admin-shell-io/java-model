package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Default implementation of {@link de.fraunhofer.iais.eis.Submodel}"
 */
public class DefaultSubmodel implements Serializable, Submodel {

    protected List<SubmodelElement> submodelElements;

    protected DefaultSubmodel() {
        this.submodelElements = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.submodelElements});
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
            DefaultSubmodel other = (DefaultSubmodel) obj;
            return super.equals(other) && Objects.equals(this.submodelElements, other.submodelElements);
        }
    }

    @Override
    final public List<SubmodelElement> getSubmodelElements() {
        return submodelElements;
    }

    @Override
    final public void setSubmodelElements(List<SubmodelElement> submodelElements) {
        this.submodelElements = submodelElements;
    }

    public static class Builder extends Submodel.AbstractBuilder<DefaultSubmodel, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubmodel newBuildingInstance() {
            return new DefaultSubmodel();
        }
    }
}
