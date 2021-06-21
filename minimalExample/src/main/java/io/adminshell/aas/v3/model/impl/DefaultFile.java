package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.File
 * 
 * A File is a data element that represents a file via its path description.
 */

public class DefaultFile implements File {

    @IRI("https://admin-shell.io/aas/3/0/RC01/File/mimeType")
    protected List<String> mimeTypes = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/File/value")
    protected List<String> values = new ArrayList<>();

    public DefaultFile() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.mimeTypes,
            this.values);
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
            return Objects.equals(this.mimeTypes, other.mimeTypes) &&
                Objects.equals(this.values, other.values);
        }
    }

    @Override
    public List<String> getMimeTypes() {
        return mimeTypes;
    }

    @Override
    public void setMimeTypes(List<String> mimeTypes) {
        this.mimeTypes = mimeTypes;
    }

    @Override
    public List<String> getValues() {
        return values;
    }

    @Override
    public void setValues(List<String> values) {
        this.values = values;
    }

    /**
     * This builder class can be used to construct a DefaultFile bean.
     */
    public static class Builder extends FileBuilder<DefaultFile, Builder> {

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
