package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An event. Constraint AASd-061: The semanticId of a Event submodel element
 * shall only reference a ConceptDescription with the category EVENT.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = BasicEvent.class)
})
public interface Event extends SubmodelElement {

}
