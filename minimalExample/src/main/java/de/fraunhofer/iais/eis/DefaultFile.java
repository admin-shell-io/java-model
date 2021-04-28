package de.fraunhofer.iais.eis;

import java.util.Objects;

/**
 * Default implementation of {@link de.fraunhofer.iais.eis.File}"
 */
public class DefaultFile implements File {

    protected String mimeType;

    protected String value;

    protected DefaultFile() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.mimeType, this.value});
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
            DefaultFile other = (DefaultFile) obj;
            return super.equals(other) && Objects.equals(this.mimeType, other.mimeType) && Objects.equals(this.value, other.value);
        }
    }

    final public String getMimeType() {
        return mimeType;
    }

    final public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    final public String getValue() {
        return value;
    }

    final public void setValue(String value) {
        this.value = value;
    }

    public static class Builder extends File.AbstractBuilder<DefaultFile, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultFile newBuildingInstance() {
            return new DefaultFile();
        }
    }
}
