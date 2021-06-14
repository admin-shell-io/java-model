package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Has Kind" "An element with a kind is an element that can either represent a type or an instance.
 * Default for an element is that it is representing an instance."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface HasKind {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "ModelingKind of the element: either type or instance."@en
     * 
     * @return Returns the ModelingKind for the property kind. More information under
     *         https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    public ModelingKind getKind();

    /**
     * "ModelingKind of the element: either type or instance."@en
     * 
     * @param kind desired value for the property kind. More information under
     *        https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     */
    public void setKind(ModelingKind kind);

}
