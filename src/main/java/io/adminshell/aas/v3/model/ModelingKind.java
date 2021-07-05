package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration for denoting whether an element is a type or an instance.
 */
public enum ModelingKind {

    /**
     * Concrete, clearly identifiable component of a certain template. It
     * becomes an individual entity of a template, for example a device model,
     * by defining specific property values. In an object oriented view, an
     * instance denotes an object (of a template) (class).
     */
    INSTANCE,
    /**
     * Software element which specifies the common attributes shared by all
     * instances of the template.
     */
    TEMPLATE;

}
