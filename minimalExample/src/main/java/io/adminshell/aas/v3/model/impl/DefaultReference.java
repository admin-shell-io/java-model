package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * "Reference" "Reference to either a model element of the same or another AAs or to an external
 * entity. A reference is an ordered list of keys, each key referencing an element. The complete
 * list of keys may for example be concatenated to a path that then gives unique access to an
 * element or entity."@en
 */

public class DefaultReference implements Reference {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has key" "Unique reference in its name space."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
    protected List<Key> keys = new ArrayList<>();

    public DefaultReference() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.keys});
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
            return Objects.equals(this.keys, other.keys);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
    final public List<Key> getKeys() {
        return keys;
    }

    final public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public static class Builder extends ReferenceBuilder<DefaultReference, Builder> {

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
