package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Event Message" "Defines the necessary information of an event instance sent out or received."@en
 * "non-normative, just only for discussion (as of November 2019)."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEventMessage.class)
})
public interface EventMessage extends ModelClass, SubmodelElement {

    // standard methods

}
