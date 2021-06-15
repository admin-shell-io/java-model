package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An event. Constraint AASd-061: The semanticId of a Event submodel element shall only reference a
 * ConceptDescription with the category EVENT.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = BasicEvent.class)
})
public interface Event extends SubmodelElement {

    // standard methods

}
