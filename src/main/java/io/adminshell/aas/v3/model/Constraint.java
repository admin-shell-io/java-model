package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Constraint" "A constraint is used to further qualify an element."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Formula.class),
    @KnownSubtypes.Type(value = Qualifier.class)
})
public interface Constraint {

    // standard methods

}
