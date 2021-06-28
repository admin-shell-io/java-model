package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of different level types within a DataSpecificationIEC61360. Contains Min, Max, Nom,
 * and Typ.
 */
public enum LevelType {

    /**
     * Max according to IEC 61360 as an Identifier scheme for maximal levels.
     */
    MAX,

    /**
     * Min according to IEC 61360 as an Identifier scheme for minimal levels.
     */
    MIN,

    /**
     * Nom according to IEC 61360 as an Identifier scheme for nominal levels.
     */
    NOM,

    /**
     * Typ according to IEC 61360 as an Identifier scheme for typical levels.
     */
    TYP;

}
