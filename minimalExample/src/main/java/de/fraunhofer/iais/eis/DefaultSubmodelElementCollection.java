package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

/**
 * Default implementation of
 * {@link de.fraunhofer.iais.eis.SubmodelElementCollection}"
 */
public class DefaultSubmodelElementCollection implements SubmodelElementCollection {

    protected boolean allowDuplicates;

    protected boolean ordered;

    protected List<SubmodelElement> values;

    protected DefaultSubmodelElementCollection() {
        this.allowDuplicates = false;
        this.ordered = false;
        this.values = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.allowDuplicates, this.ordered, this.values});
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
            DefaultSubmodelElementCollection other = (DefaultSubmodelElementCollection) obj;
            return super.equals(other) && Objects.equals(this.allowDuplicates, other.allowDuplicates) && Objects.equals(this.ordered, other.ordered) && Objects.equals(this.values, other.values);
        }
    }

    @Override
    final public boolean getAllowDuplicates() {
        return allowDuplicates;
    }

    @Override
    final public void setAllowDuplicates(boolean allowDuplicates) {
        this.allowDuplicates = allowDuplicates;
    }

    @Override
    final public boolean getOrdered() {
        return ordered;
    }

    @Override
    final public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    @Override
    final public List<SubmodelElement> getValues() {
        return values;
    }

    @Override
    final public void setValues(List<SubmodelElement> value) {
        this.values = value;
    }

    public static class Builder extends SubmodelElementCollection.AbstractBuilder<DefaultSubmodelElementCollection, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubmodelElementCollection newBuildingInstance() {
            return new DefaultSubmodelElementCollection();
        }
    }
}
