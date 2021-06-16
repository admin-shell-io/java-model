package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Defines the necessary information for sending or receiving events. non-normative, just only for
 * discussion (as of November 2019).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEventElement.class)
})
public interface EventElement extends SubmodelElement {

}
