package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.SubmodelElementCollection
 * 
 * A submodel element collection is a set or list of submodel elements. Constraint AASd-059: If the
 * semanticId of a SubmodelElementCollection references a ConceptDescription then the category of
 * the ConceptDescription shall be COLLECTION or ENTITY. Constraint AASd-092: If the semanticId of a
 * SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == false references a
 * ConceptDescription then the ConceptDescription/category shall be ENTITY. Constraint AASd-093: If
 * the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates ==
 * true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION.
 */

public class DefaultSubmodelElementCollection implements SubmodelElementCollection {

    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
    protected List<Boolean> allowDuplicates = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
    protected List<Boolean> ordereds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
    protected Collection<SubmodelElement> values = new ArrayList<>();

    public DefaultSubmodelElementCollection() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.allowDuplicates,
            this.ordereds,
            this.values);
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
            DefaultSubmodelElementCollection other = (DefaultSubmodelElementCollection) obj;
            return Objects.equals(this.allowDuplicates, other.allowDuplicates) &&
                Objects.equals(this.ordereds, other.ordereds) &&
                Objects.equals(this.values, other.values);
        }
    }

    @Override
    public List<Boolean> getAllowDuplicates() {
        return allowDuplicates;
    }

    @Override
    public void setAllowDuplicates(List<Boolean> allowDuplicates) {
        this.allowDuplicates = allowDuplicates;
    }

    @Override
    public List<Boolean> getOrdereds() {
        return ordereds;
    }

    @Override
    public void setOrdereds(List<Boolean> ordereds) {
        this.ordereds = ordereds;
    }

    @Override
    public Collection<SubmodelElement> getValues() {
        return values;
    }

    @Override
    public void setValues(Collection<SubmodelElement> values) {
        this.values = values;
    }

    /**
     * This builder class can be used to construct a DefaultSubmodelElementCollection bean.
     */
    public static class Builder extends SubmodelElementCollectionBuilder<DefaultSubmodelElementCollection, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubmodelElementCollection newBuildingInstance() {
            return new DefaultSubmodelElementCollection();
        }
    }
}
