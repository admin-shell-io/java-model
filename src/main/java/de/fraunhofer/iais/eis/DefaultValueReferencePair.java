package de.fraunhofer.iais.eis;

import java.util.List;
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
    protected List<String> values;

    /**
     * "Value id of value reference pair" "Global unique id of the value."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    protected List<Reference> valueIds;

    // no manual construction
    protected DefaultValueReferencePair() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.values,
            this.valueIds});
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
            return Objects.equals(this.values, other.values) &&
                Objects.equals(this.valueIds, other.valueIds);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultValueReferencePair other = new DefaultValueReferencePair();
        other.values = (List<String>) Util.clone(this.values);
        other.valueIds = (List<Reference>) Util.clone(this.valueIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    final public List<String> getValues() {
        return values;
    }

    final public void setValues(List<String> values) {
        this.values = values;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    final public List<Reference> getValueIds() {
        return valueIds;
    }

    final public void setValueIds(List<Reference> valueIds) {
        this.valueIds = valueIds;
    }
}
