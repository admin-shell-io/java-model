package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "identifier key value pair" "An IdentifierKeyValuePair describes a generic identifier as
 * key-value pair."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifierKeyValuePair.class)
})
public interface IdentifierKeyValuePair extends HasSemantics {

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
     * "Key of the identifier."@en
     * 
     * @param key desired value for the property key. More information under
     *        https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     */
    public void setKey(String key);

    /**
     * "The value of the identifier with the corresponding key."@en
     * 
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    public String getValue();

    /**
     * "The value of the identifier with the corresponding key."@en
     * 
     * @param value desired value for the property value. More information under
     *        https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     */
    public void setValue(String value);

    /**
     * "The (external) subject the key belongs to or has meaning to."@en
     * 
     * @return Returns the Reference for the property externalSubjectId. More information under
     *         https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
    public Reference getExternalSubjectId();

    /**
     * "The (external) subject the key belongs to or has meaning to."@en
     * 
     * @param externalSubjectId desired value for the property externalSubjectId. More information under
     *        https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
     */
    public void setExternalSubjectId(Reference externalSubjectId);

}
