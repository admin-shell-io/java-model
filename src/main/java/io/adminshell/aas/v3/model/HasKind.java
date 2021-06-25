package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An element with a kind is an element that can either represent a type or an instance. Default for
 * an element is that it is representing an instance.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface HasKind {

    /**
     * ModelingKind of the element: either type or instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     *
     * @return Returns the ModelingKind for the property kind.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    ModelingKind getKind();

    /**
     * ModelingKind of the element: either type or instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     *
     * @param kind desired value for the property kind.
     */
    void setKind(ModelingKind kind);

}
