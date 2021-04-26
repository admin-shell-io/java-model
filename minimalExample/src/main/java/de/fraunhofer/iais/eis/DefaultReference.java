package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Default implementation of {@link de.fraunhofer.iais.eis.Reference}"
 */
public class DefaultReference implements Serializable, Reference {

    protected List<Key> key;

    protected DefaultReference() {
        this.key = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.key});
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
            DefaultReference other = (DefaultReference) obj;
            return super.equals(other) && Objects.equals(this.key, other.key);
        }
    }

    @Override
    final public List<Key> getKeys() {
        return key;
    }

    @Override
    final public void setKeys(List<Key> key) {
        this.key = key;
    }

    public static class Builder extends Reference.AbstractBuilder<DefaultReference, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultReference newBuildingInstance() {
            return new DefaultReference();
        }
    }
}
