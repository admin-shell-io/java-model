package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Defines the necessary information of an event instance sent out or received. non-normative, just
 * only for discussion (as of November 2019).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEventMessage.class)
})
public interface EventMessage extends SubmodelElement {

}
