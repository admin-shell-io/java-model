package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of different types of Identifiers for global identification
 */
public enum IdentifierType {

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
    IRI;

}
