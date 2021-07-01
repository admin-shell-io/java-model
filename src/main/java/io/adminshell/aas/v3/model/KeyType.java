package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of different key value types within a key. Contains IdentifierType and LocalKeyType.
 */
public enum KeyType {

    /**
     * Custom identifiers like GUIDs (globally unique Identifiers)
     */
    CUSTOM,

    /**
     * IRDI according to ISO29002-5 as an Identifier scheme for properties and classifications.
     */
    IRDI,

    /**
     * IRI. Should only be used if unicode symbols are used that are not allowed in URI.
     */
    IRI,

    /**
     * Identifier of a fragment within a file
     */
    FRAGMENT_ID,

    /**
     * idShort of a referable element
     */
    ID_SHORT;

}
