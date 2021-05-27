package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Value Reference Pair" "A value reference pair within a value list. Each value has a global
 * unique id defining its semantic."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultValueReferencePair.class)
})
public interface ValueReferencePair extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "the value of the referenced concept definition of the value in valueId."@en
     * 
     * @return Returns the List of Strings for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    public List<String> getValues();

    /**
     * "the value of the referenced concept definition of the value in valueId."@en
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value
     */
    public void setValues(List<String> values);

    /**
     * "Global unique id of the value."@en
     * 
     * @return Returns the List of References for the property valueIds. More information under
     *         https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    public List<Reference> getValueIds();

    /**
     * "Global unique id of the value."@en
     * 
     * @param valueIds desired value for the property valueIds. More information under
     *        https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId
     */
    public void setValueIds(List<Reference> valueIds);

}
