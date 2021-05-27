package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Value Reference Pair" "A value reference pair within a value list. Each value has a global
 * unique id defining its semantic."@en
 */

public class DefaultValueReferencePair implements ValueReferencePair {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "Value of value reference pair" "the value of the referenced concept definition of the value in
     * valueId."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    protected String value;

    /**
     * "Value id of value reference pair" "Global unique id of the value."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    protected Reference valueId;

    // no manual construction
    protected DefaultValueReferencePair() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.value,
            this.valueId});
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
            DefaultValueReferencePair other = (DefaultValueReferencePair) obj;
            return Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueId, other.valueId);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultValueReferencePair other = new DefaultValueReferencePair();
        other.value = (String) Util.clone(this.value);
        other.valueId = (Reference) Util.clone(this.valueId);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    final public String getValue() {
        return value;
    }

    final public void setValue(String value) {
        this.value = value;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    final public Reference getValueId() {
        return valueId;
    }

    final public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }
}
