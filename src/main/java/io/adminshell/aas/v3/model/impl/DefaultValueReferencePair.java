package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.ValueReferencePair
 * 
 * A value reference pair within a value list. Each value has a global unique id defining its
 * semantic.
 */

public class DefaultValueReferencePair implements ValueReferencePair {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * the value of the referenced concept definition of the value in valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    protected String value;

    /**
     * Global unique id of the value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    protected Reference valueId;

    public DefaultValueReferencePair() {}

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

    public static class Builder extends ValueReferencePairBuilder<DefaultValueReferencePair, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultValueReferencePair newBuildingInstance() {
            return new DefaultValueReferencePair();
        }
    }
}
