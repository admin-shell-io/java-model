package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Has Kind" "An element with a kind is an element that can either represent a type or an instance.
 * Default for an element is that it is representing an instance."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultHasKind.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface HasKind extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "ModelingKind of the element: either type or instance."@en
     * 
     * @return Returns the List of ModelingKinds for the property kinds. More information under
     *         https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    public List<ModelingKind> getKinds();

    /**
     * "ModelingKind of the element: either type or instance."@en
     * 
     * @param kinds desired value for the property kinds. More information under
     *        https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     */
    public void setKinds(List<ModelingKind> kinds);

}
