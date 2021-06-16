package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An IdentifierKeyValuePair describes a generic identifier as key-value pair.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifierKeyValuePair.class)
})
public interface IdentifierKeyValuePair extends HasSemantics {

    /**
     * Key of the identifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     *
     * @return Returns the List of Strings for the property keys.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    public List<String> getKeys();

    /**
     * Key of the identifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     *
     * @param keys desired value for the property keys.
     */
    public void setKeys(List<String> keys);

    /**
     * The value of the identifier with the corresponding key.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     *
     * @return Returns the List of Strings for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    public List<String> getValues();

    /**
     * The value of the identifier with the corresponding key.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     *
     * @param values desired value for the property values.
     */
    public void setValues(List<String> values);

}
