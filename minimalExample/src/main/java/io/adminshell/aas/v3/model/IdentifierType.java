package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

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
