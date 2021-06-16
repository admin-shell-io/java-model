package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Element that can have a semantic definition. Identifier of the semantic definition of the
 * element. It is called semantic id of the element. The semantic id may either reference an
 * external global id or it may reference a referable model element of kind=Type that defines the
 * semantics of the element. In many cases the idShort is identical to the English short name within
 * the semantic definition as referenced vi aits semantic id.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultHasSemantics.class),
    @KnownSubtypes.Type(value = IdentifierKeyValuePair.class)
})
public interface HasSemantics {

    /**
     * Points to the Expression Semantic of the Submodels The semantic id might refer to an external
     * information source, which explains the formulation of the submodel (for example an PDF if a
     * standard).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
     *
     * @return Returns the List of References for the property semanticIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    public List<Reference> getSemanticIds();

    /**
     * Points to the Expression Semantic of the Submodels The semantic id might refer to an external
     * information source, which explains the formulation of the submodel (for example an PDF if a
     * standard).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
     *
     * @param semanticIds desired value for the property semanticIds.
     */
    public void setSemanticIds(List<Reference> semanticIds);

}
