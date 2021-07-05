package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A value reference pair within a value list. Each value has a global unique id
 * defining its semantic.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultValueReferencePair.class)
})
public interface ValueReferencePair {

    /**
     * the value of the referenced concept definition of the value in valueId.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    String getValue();

    /**
     * the value of the referenced concept definition of the value in valueId.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Global unique id of the value.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    Reference getValueId();

    /**
     * Global unique id of the value.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

}
