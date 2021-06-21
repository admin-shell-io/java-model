package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Key
 * 
 * A key is a reference to an element by its id.
 */

public class DefaultKey implements Key {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    protected List<KeyType> idTypes = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    protected List<KeyElements> types = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    protected List<String> values = new ArrayList<>();

    public DefaultKey() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.idTypes,
            this.types,
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
            DefaultKey other = (DefaultKey) obj;
            return Objects.equals(this.idTypes, other.idTypes) &&
                Objects.equals(this.types, other.types) &&
                Objects.equals(this.values, other.values);
        }
    }

    @Override
    public List<KeyType> getIdTypes() {
        return idTypes;
    }

    @Override
    public void setIdTypes(List<KeyType> idTypes) {
        this.idTypes = idTypes;
    }

    @Override
    public List<KeyElements> getTypes() {
        return types;
    }

    @Override
    public void setTypes(List<KeyElements> types) {
        this.types = types;
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
     * This builder class can be used to construct a DefaultKey bean.
     */
    public static class Builder extends KeyBuilder<DefaultKey, Builder> {

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
