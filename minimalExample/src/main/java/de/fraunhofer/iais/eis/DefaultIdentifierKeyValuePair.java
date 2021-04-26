package de.fraunhofer.iais.eis;

import java.util.Objects;
import java.io.Serializable;

/**
 * Default implementation of
 * {@link de.fraunhofer.iais.eis.IdentifierKeyValuePair}"
 */
public class DefaultIdentifierKeyValuePair implements Serializable, IdentifierKeyValuePair {

    protected Reference semanticId;

    protected Reference externalSubjectId;

    protected String key;

    protected String value;

    protected DefaultIdentifierKeyValuePair() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.key, this.value, this.externalSubjectId});
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
            DefaultIdentifierKeyValuePair other = (DefaultIdentifierKeyValuePair) obj;
            return super.equals(other) && Objects.equals(this.key, other.key) && Objects.equals(this.value, other.value) && Objects.equals(this.externalSubjectId, other.externalSubjectId);
        }
    }

    @Override
    final public String getKey() {
        return key;
    }

    @Override
    final public void setKey(String key) {
        this.key = key;
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
    final public Reference getExternalSubjectId() {
        return externalSubjectId;
    }

    @Override
    final public void setExternalSubjectId(Reference externalSubjectId) {
        this.externalSubjectId = externalSubjectId;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference value) {
        this.semanticId = semanticId;
    }

    public static class Builder extends IdentifierKeyValuePair.AbstractBuilder<DefaultIdentifierKeyValuePair, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultIdentifierKeyValuePair newBuildingInstance() {
            return new DefaultIdentifierKeyValuePair();
        }
    }
}
