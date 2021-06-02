package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Asset Kind" "Enumeration for denoting whether an element is a type or an instance."@en
 */
public enum AssetKind {

    /**
     * "Asset Instance" "Concrete, clearly identifiable component of a certain type."@en
     */
    INSTANCE,

    /**
     * "Asset Type" "hardware or software element which specifies the common attributes shared by all
     * instances of the type."@en
     */
    TYPE;

}
