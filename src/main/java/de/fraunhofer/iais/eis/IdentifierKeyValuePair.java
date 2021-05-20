package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "identifier key value pair" "An IdentifierKeyValuePair describes a generic identifier as
 * key-value pair."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifierKeyValuePair.class)
})
public interface IdentifierKeyValuePair extends ModelClass, HasSemantics {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Key of the identifier."@en
     * 
     * @return Returns the String for the property key. More information under
     *         https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    public String getKey();

    /**
     * "The value of the identifier with the corresponding key."@en
     * 
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    public String getValue();

    /**
     * "The (external) subject the key belongs to or has meaning to."@en
     * 
     * @return Returns the Reference for the property externalSubjectId. More information under
     *         https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
    public Reference getExternalSubjectId();

}
