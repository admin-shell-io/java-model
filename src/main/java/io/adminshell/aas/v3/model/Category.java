package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A enumeration for data elements except for files and blobs.
 */
public enum Category {

    /**
     * A constant property is a property with a value that does not change over
     * time. In eCl@ss this kind of category has the category 'Coded Value'.
     */
    CONSTANT,
    /**
     * A parameter property is a property that is once set and then typically
     * does not change over time. This is for example the case for configuration
     * parameters.
     */
    PARAMETER,
    /**
     * A variable property is a property that is calculated during runtime, i.e.
     * its value is a runtime value.
     */
    VARIABLE;

}
