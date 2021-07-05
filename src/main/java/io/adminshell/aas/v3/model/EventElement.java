package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Defines the necessary information for sending or receiving events.
 * non-normative, just only for discussion (as of November 2019).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEventElement.class)
})
public interface EventElement extends SubmodelElement {

}
