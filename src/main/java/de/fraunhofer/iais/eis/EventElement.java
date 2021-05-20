package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Event Element" "Defines the necessary information for sending or receiving events."@en
 * "non-normative, just only for discussion (as of November 2019)."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEventElement.class)
})
public interface EventElement extends ModelClass, SubmodelElement {

    // standard methods

}
