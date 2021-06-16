package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.ValueList
 * 
 * A set of value reference pairs.
 */

public class DefaultValueList implements ValueList {

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

    @Override
    public List<ValueReferencePair> getValueReferencePairTypes() {
        return valueReferencePairTypes;
    }

    @Override
    public void setValueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes) {
        this.valueReferencePairTypes = valueReferencePairTypes;
    }

    /**
     * This builder class can be used to construct a DefaultValueList bean.
     */
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
