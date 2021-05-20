package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Identifier Type" "Enumeration of different types of Identifiers for global identification"@en
 */
public enum IdentifierType {

    /**
     * "Custom" "Custom identifiers like GUIDs (globally unique Identifiers)"@en
     */
    CUSTOM,

    /**
     * "IRDI" "IRDI according to ISO29002-5 as an Identifier scheme for properties and
     * classifications."@en
     */
    IRDI,

    /**
     * "IRI" "IRI. Should only be used if unicode symbols are used that are not allowed in URI."@en
     */
    IRI;

}
