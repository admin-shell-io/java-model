package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Level Type" "Enumeration of different level types within a DataSpecificationIEC61360. Contains
 * Min, Max, Nom, and Typ."@en
 */
public enum LevelType {

    /**
     * "MAX" "MAX according to IEC 61360 as an Identifier scheme for maximal levels."@en
     */
    MAX,

    /**
     * "MIN" "MIN according to IEC 61360 as an Identifier scheme for minimal levels."@en
     */
    MIN,

    /**
     * "NOM" "NOM according to IEC 61360 as an Identifier scheme for nominal levels."@en
     */
    NOM,

    /**
     * "TYP" "TYP according to IEC 61360 as an Identifier scheme for typical levels."@en
     */
    TYP;

}
