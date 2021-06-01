package de.fraunhofer.iais.eis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Value list" "A set of value reference pairs."@en
 */

public class DefaultValueList implements ValueList {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "Value reference pair types" "A pair of a value together with its global unique id.."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes")
    protected List<ValueReferencePair> valueReferencePairTypes = new ArrayList<>();

    // no manual construction
    protected DefaultValueList() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.valueReferencePairTypes});
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
            DefaultValueList other = (DefaultValueList) obj;
            return Objects.equals(this.valueReferencePairTypes, other.valueReferencePairTypes);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultValueList other = new DefaultValueList();
        other.valueReferencePairTypes = (List<ValueReferencePair>) Util.clone(this.valueReferencePairTypes);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes")
    final public List<ValueReferencePair> getValueReferencePairTypes() {
        return valueReferencePairTypes;
    }

    final public void setValueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes) {
        this.valueReferencePairTypes = valueReferencePairTypes;
    }
}
