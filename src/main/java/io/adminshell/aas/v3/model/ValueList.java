package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Value list" "A set of value reference pairs."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultValueList.class)
})
public interface ValueList {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A pair of a value together with its global unique id.."@en
     * 
     * @return Returns the List of ValueReferencePairs for the property valueReferencePairTypes. More
     *         information under https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes")
    public List<ValueReferencePair> getValueReferencePairTypes();

    /**
     * "A pair of a value together with its global unique id.."@en
     * 
     * @param valueReferencePairTypes desired value for the property valueReferencePairTypes. More
     *        information under https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairTypes
     */
    public void setValueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes);

}
