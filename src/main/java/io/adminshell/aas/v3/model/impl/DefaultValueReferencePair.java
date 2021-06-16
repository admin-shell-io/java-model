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

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    protected String value;

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

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Reference getValueId() {
        return valueId;
    }

    @Override
    public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }

    /**
     * This builder class can be used to construct a DefaultValueReferencePair bean.
     */
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
