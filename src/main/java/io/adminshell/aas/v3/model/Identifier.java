package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Identifier" "Used to uniquely identify an entity by using an identifier."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifier.class)
})
public interface Identifier {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
     * 
     * @return Returns the String for the property identifier. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    public String getIdentifier();

    /**
     * "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
     * 
     * @param identifier desired value for the property identifier. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     */
    public void setIdentifier(String identifier);

    /**
     * "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the
     * enumeration \'IdentifierType\'."@en
     * 
     * @return Returns the IdentifierType for the property idType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    public IdentifierType getIdType();

    /**
     * "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the
     * enumeration \'IdentifierType\'."@en
     * 
     * @param idType desired value for the property idType. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     */
    public void setIdType(IdentifierType idType);

}
