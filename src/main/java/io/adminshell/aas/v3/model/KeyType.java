package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Key Type" "Enumeration of different key value types within a key. Contains IdentifierType and
 * LocalKeyType."@en
 */
public enum KeyType {

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
    IRI,

    /**
     * "FragementId" "Identifier of a fragment within a file"@en
     */
    FRAGMENT_ID,

    /**
     * "IdShort" "idShort of a referable element"@en
     */
    IDSHORT;

}
