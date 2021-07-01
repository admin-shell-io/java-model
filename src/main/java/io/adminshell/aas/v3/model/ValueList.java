package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A set of value reference pairs.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultValueList.class)
})
public interface ValueList {

    /**
     * A pair of a value together with its global unique id..
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes
     *
     * @return Returns the List of ValueReferencePairs for the property valueReferencePairTypes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes")
    List<ValueReferencePair> getValueReferencePairTypes();

    /**
     * A pair of a value together with its global unique id..
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes
     *
     * @param valueReferencePairTypes desired value for the property valueReferencePairTypes.
     */
    void setValueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes);

}
