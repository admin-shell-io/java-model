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

    /**
     * A globally unique identifier which might not be a URI. Its type is defined in idType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     *
     * @return Returns the List of Strings for the property identifiers.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    List<String> getIdentifiers();

    /**
     * A globally unique identifier which might not be a URI. Its type is defined in idType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     *
     * @param identifiers desired value for the property identifiers.
     */
    void setIdentifiers(List<String> identifiers);

    /**
     * Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the
     * enumeration 'IdentifierType'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     *
     * @return Returns the List of IdentifierTypes for the property idTypes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    List<IdentifierType> getIdTypes();

    /**
     * Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the
     * enumeration 'IdentifierType'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     *
     * @param idTypes desired value for the property idTypes.
     */
    void setIdTypes(List<IdentifierType> idTypes);

}
