package de.fraunhofer.iais.eis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "identifier key value pair" "An IdentifierKeyValuePair describes a generic identifier as
 * key-value pair."@en
 */

public class DefaultIdentifierKeyValuePair implements IdentifierKeyValuePair {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected List<Reference> semanticIds = new ArrayList<>();

    /**
     * "has IdentifierKeyValuePair.key" "Key of the identifier."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    protected List<String> keys = new ArrayList<>();

    /**
     * "has IdentifierKeyValuePair.value" "The value of the identifier with the corresponding key."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    protected List<String> values = new ArrayList<>();

    // no manual construction
    protected DefaultIdentifierKeyValuePair() {}

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
    public Object deepCopy() {
        DefaultIdentifierKeyValuePair other = new DefaultIdentifierKeyValuePair();
        other.keys = (List<String>) Util.clone(this.keys);
        other.values = (List<String>) Util.clone(this.values);
        other.semanticIds = (List<Reference>) Util.clone(this.semanticIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    final public List<String> getKeys() {
        return keys;
    }

    final public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    final public List<String> getValues() {
        return values;
    }

    final public void setValues(List<String> values) {
        this.values = values;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    final public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }
}
