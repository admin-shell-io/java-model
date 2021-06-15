package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Used to uniquely identify an entity by using an identifier.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifier.class)
})
public interface Identifier {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * A globally unique identifier which might not be a URI. Its type is defined in idType.
     * 
     * @return Returns the List of Strings for the property identifiers. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    public List<String> getIdentifiers();

    /**
     * A globally unique identifier which might not be a URI. Its type is defined in idType.
     * 
     * @param identifiers desired value for the property identifiers. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     */
    public void setIdentifiers(List<String> identifiers);

    /**
     * Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the
     * enumeration 'IdentifierType'.
     * 
     * @return Returns the List of IdentifierTypes for the property idTypes. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    public List<IdentifierType> getIdTypes();

    /**
     * Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the
     * enumeration 'IdentifierType'.
     * 
     * @param idTypes desired value for the property idTypes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     */
    public void setIdTypes(List<IdentifierType> idTypes);

}
