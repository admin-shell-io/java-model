package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Has Semantics" "Element that can have a semantic definition. Identifier of the semantic
 * definition of the element. It is called semantic id of the element. The semantic id may either
 * reference an external global id or it may reference a referable model element of kind=Type that
 * defines the semantics of the element."@en "In many cases the idShort is identical to the English
 * short name within the semantic definition as referenced vi aits semantic id."@en
 */

public class DefaultHasSemantics implements HasSemantics {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
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
    public Object deepCopy() {
        DefaultHasSemantics other = new DefaultHasSemantics();
        other.semanticIds = (List<Reference>) Util.clone(this.semanticIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    final public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }
}
