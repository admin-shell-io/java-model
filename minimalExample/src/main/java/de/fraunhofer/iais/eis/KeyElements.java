package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Key Elements" "Enumeration of different key value types within a key. Contains KeyElements,
 * ReferableElements, and IdentifiableElements."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultKeyElements.class)
})
public interface KeyElements extends ModelClass {

    // standard methods

}
