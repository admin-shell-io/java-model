package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

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

    public DefaultValueList() {}

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

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes")
    final public List<ValueReferencePair> getValueReferencePairTypes() {
        return valueReferencePairTypes;
    }

    final public void setValueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes) {
        this.valueReferencePairTypes = valueReferencePairTypes;
    }

    public static class Builder extends ValueListBuilder<DefaultValueList, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultValueList newBuildingInstance() {
            return new DefaultValueList();
        }
    }
}
