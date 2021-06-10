package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Event Message" "Defines the necessary information of an event instance sent out or received."@en
 * "non-normative, just only for discussion (as of November 2019)."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEventMessage.class)
})
public interface EventMessage extends SubmodelElement {

    // standard methods

}
