package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration for denoting whether an element is a type or an instance.
 */
public enum AssetKind {

    /**
     * Concrete, clearly identifiable component of a certain type.
     */
    INSTANCE,

    /**
     * hardware or software element which specifies the common attributes shared by all instances of the
     * type.
     */
    TYPE;

}
