package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Constraint" "A constraint is used to further qualify an element."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Formula.class),
    @KnownSubtypes.Type(value = Qualifier.class)
})
public interface Constraint extends ModelClass {

    // standard methods

}
