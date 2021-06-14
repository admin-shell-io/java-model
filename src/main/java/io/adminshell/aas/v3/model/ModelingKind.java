package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Kind" "Enumeration for denoting whether an element is a type or an instance."@en
 */
public enum ModelingKind {

    /**
     * "Instance" "Concrete, clearly identifiable component of a certain template."@en "It becomes an
     * individual entity of a template, for example a device model, by defining specific property
     * values."@en "In an object oriented view, an instance denotes an object (of a template)
     * (class)."@en
     */
    INSTANCE,

    /**
     * "Template" "Software element which specifies the common attributes shared by all instances of the
     * template."@en
     */
    TEMPLATE;

}
