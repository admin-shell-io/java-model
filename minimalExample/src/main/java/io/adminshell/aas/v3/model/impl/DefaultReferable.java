package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Referable
 * 
 * An element that is referable by its idShort. This id is not globally unique. This id is unique
 * within the name space of the element.
 */

public class DefaultReferable implements Referable {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected List<String> categories = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangStringSet> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangStringSet> displayNames = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected List<String> idShorts = new ArrayList<>();

    public DefaultReferable() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.categories,
            this.descriptions,
            this.displayNames,
            this.idShorts});
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
            DefaultReferable other = (DefaultReferable) obj;
            return Objects.equals(this.categories, other.categories) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShorts, other.idShorts);
        }
    }

    @Override
    public List<String> getCategories() {
        return categories;
    }

    @Override
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public List<LangStringSet> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangStringSet> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<LangStringSet> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangStringSet> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public List<String> getIdShorts() {
        return idShorts;
    }

    @Override
    public void setIdShorts(List<String> idShorts) {
        this.idShorts = idShorts;
    }

    /**
     * This builder class can be used to construct a DefaultReferable bean.
     */
    public static class Builder extends ReferableBuilder<DefaultReferable, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultReferable newBuildingInstance() {
            return new DefaultReferable();
        }
    }
}
