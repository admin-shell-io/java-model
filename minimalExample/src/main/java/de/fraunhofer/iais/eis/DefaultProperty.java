package de.fraunhofer.iais.eis;

import java.util.Objects;

/**
 * Default implementation of {@link de.fraunhofer.iais.eis.Property}"
 */
public class DefaultProperty implements Property {

    protected String value;

    protected Reference valueId;

    protected DefaultProperty() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.value, this.valueId});
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
            DefaultProperty other = (DefaultProperty) obj;
            return super.equals(other) && Objects.equals(this.value, other.value) && Objects.equals(this.valueId, other.valueId);
        }
    }

    @Override
    final public String getValue() {
        return value;
    }

    @Override
    final public void setValue(String value) {
        this.value = value;
    }

    @Override
    final public Reference getValueId() {
        return valueId;
    }

    @Override
    final public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }

    public static class Builder extends Property.AbstractBuilder<DefaultProperty, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultProperty newBuildingInstance() {
            return new DefaultProperty();
        }
    }
}
