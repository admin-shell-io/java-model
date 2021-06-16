package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.HasSemantics
 * 
 * Element that can have a semantic definition. Identifier of the semantic definition of the
 * element. It is called semantic id of the element. The semantic id may either reference an
 * external global id or it may reference a referable model element of kind=Type that defines the
 * semantics of the element. In many cases the idShort is identical to the English short name within
 * the semantic definition as referenced vi aits semantic id.
 */

public class DefaultHasSemantics implements HasSemantics {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected List<Reference> semanticIds = new ArrayList<>();

    public DefaultHasSemantics() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.semanticIds});
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
            DefaultHasSemantics other = (DefaultHasSemantics) obj;
            return Objects.equals(this.semanticIds, other.semanticIds);
        }
    }

    @Override
    public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    @Override
    public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }

    /**
     * This builder class can be used to construct a DefaultHasSemantics bean.
     */
    public static class Builder extends HasSemanticsBuilder<DefaultHasSemantics, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultHasSemantics newBuildingInstance() {
            return new DefaultHasSemantics();
        }
    }
}
