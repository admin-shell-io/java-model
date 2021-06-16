package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.IdentifierKeyValuePair
 * 
 * An IdentifierKeyValuePair describes a generic identifier as key-value pair.
 */

public class DefaultIdentifierKeyValuePair implements IdentifierKeyValuePair {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected List<Reference> semanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    protected List<String> keys = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    protected List<String> values = new ArrayList<>();

    public DefaultIdentifierKeyValuePair() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.keys,
            this.values,
            this.semanticIds});
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
            return Objects.equals(this.keys, other.keys) &&
                Objects.equals(this.values, other.values) &&
                Objects.equals(this.semanticIds, other.semanticIds);
        }
    }

    @Override
    public List<String> getKeys() {
        return keys;
    }

    @Override
    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    @Override
    public List<String> getValues() {
        return values;
    }

    @Override
    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    @Override
    public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }

    /**
     * This builder class can be used to construct a DefaultIdentifierKeyValuePair bean.
     */
    public static class Builder extends IdentifierKeyValuePairBuilder<DefaultIdentifierKeyValuePair, Builder> {

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
