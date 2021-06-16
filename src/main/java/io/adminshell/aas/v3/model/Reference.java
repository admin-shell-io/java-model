package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Reference to either a model element of the same or another AAs or to an external entity. A
 * reference is an ordered list of keys, each key referencing an element. The complete list of keys
 * may for example be concatenated to a path that then gives unique access to an element or entity.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReference.class)
})
public interface Reference {

    /**
     * Unique reference in its name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Reference/key
     *
     * @return Returns the List of Keys for the property keys.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
    List<Key> getKeys();

    /**
     * Unique reference in its name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Reference/key
     *
     * @param keys desired value for the property keys.
     */
    void setKeys(List<Key> keys);

}
