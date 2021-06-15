package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of IdentifierKeyValuePair
 * 
 * An IdentifierKeyValuePair describes a generic identifier as key-value pair.
 */

public class DefaultIdentifierKeyValuePair implements IdentifierKeyValuePair {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Points to the Expression Semantic of the Submodels The semantic id might refer to an external
     * information source, which explains the formulation of the submodel (for example an PDF if a
     * standard).
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    /**
     * The (external) subject the key belongs to or has meaning to.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
    protected Reference externalSubjectId;

    /**
     * Key of the identifier.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    protected String key;

    /**
     * The value of the identifier with the corresponding key.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    protected String value;

    public DefaultIdentifierKeyValuePair() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.key,
            this.value,
            this.externalSubjectId,
            this.semanticId});
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
            return Objects.equals(this.key, other.key) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.externalSubjectId, other.externalSubjectId) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    final public String getKey() {
        return key;
    }

    final public void setKey(String key) {
        this.key = key;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    final public String getValue() {
        return value;
    }

    final public void setValue(String value) {
        this.value = value;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
    final public Reference getExternalSubjectId() {
        return externalSubjectId;
    }

    final public void setExternalSubjectId(Reference externalSubjectId) {
        this.externalSubjectId = externalSubjectId;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public Reference getSemanticId() {
        return semanticId;
    }

    final public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

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
