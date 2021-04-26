package de.fraunhofer.iais.eis;

import java.util.Objects;

/**
 * Default implementation of {@link de.fraunhofer.iais.eis.Key}"
 */
public class DefaultKey implements Key {

    protected KeyType idType;
    protected KeyElements type;
    protected String value;

    protected DefaultKey() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.idType, this, type, this.value});
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
            DefaultKey other = (DefaultKey) obj;
            return super.equals(other)
                    && Objects.equals(this.idType, other.idType)
                    && Objects.equals(this.type, other.type)
                    && Objects.equals(this.value, other.value);
        }
    }

    @Override
    public KeyType getIdType() {
        return idType;
    }

    @Override
    public void setIdType(KeyType value) {
        this.idType = value;
    }

    @Override
    public KeyElements getType() {
        return type;
    }

    @Override
    public void setType(KeyElements value) {
        this.type = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder extends Key.AbstractBuilder<DefaultKey, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultKey newBuildingInstance() {
            return new DefaultKey();
        }
    }

}
