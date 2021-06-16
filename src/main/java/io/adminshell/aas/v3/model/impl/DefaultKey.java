package io.adminshell.aas.v3.model.impl;

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
    protected KeyType idType;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    protected KeyElements type;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    protected String value;

    public DefaultKey() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.idType,
            this.type,
            this.value});
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
            return Objects.equals(this.idType, other.idType) &&
                Objects.equals(this.type, other.type) &&
                Objects.equals(this.value, other.value);
        }
    }

    @Override
    public KeyType getIdType() {
        return idType;
    }

    @Override
    public void setIdType(KeyType idType) {
        this.idType = idType;
    }

    @Override
    public KeyElements getType() {
        return type;
    }

    @Override
    public void setType(KeyElements type) {
        this.type = type;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
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
