package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A constraint is used to further qualify an element.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Formula.class),
    @KnownSubtypes.Type(value = Qualifier.class)
})
public interface Constraint {

    // standard methods

}
