package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Category" "A enumeration for data elements except for files and blobs."@en
 */
public enum Category {

    /**
     * "Constant" "A constant property is a property with a value that does not change over time. In
     * eCl@ss this kind of category has the category \'Coded Value\'."@en
     */
    CONSTANT,

    /**
     * "Parameter" "A parameter property is a property that is once set and then typically does not
     * change over time. This is for example the case for configuration parameters."@en
     */
    PARAMETER,

    /**
     * "Variable" "A variable property is a property that is calculated during runtime, i.e. its value
     * is a runtime value."@en
     */
    VARIABLE;

}
