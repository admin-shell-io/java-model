package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of different key value types within a key. Contains KeyElements, ReferableElements,
 * and IdentifiableElements.
 */
public enum KeyElements {

    /** 
    */
    ASSET,

    /** 
    */
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    CONCEPT_DESCRIPTION,

    /** 
    */
    SUBMODEL,

    /** 
    */
    FRAGMENT_REFERENCE,

    /**
     * reference to an element not belonging to an asset administration shell
     */
    GLOBAL_REFERENCE,

    /** 
    */
    ACCESS_PERMISSION_RULE,

    /** 
    */
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    BASIC_EVENT,

    /** 
    */
    BLOB,

    /** 
    */
    CAPABILITY,

    /** 
    */
    CONCEPT_DICTIONARY,

    /**
     * Data Element is abstract, i.e. if a key uses 'DataElement' the reference may be a Property, a
     * File etc.
     */
    DATA_ELEMENT,

    /** 
    */
    ENTITY,

    /**
     * Event is abstract
     */
    EVENT,

    /**
     * Property with a value that can be provided in multiple languages.
     */
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    OPERATION,

    /** 
    */
    PROPERTY,

    /** 
    */
    RANGE,

    /** 
    */
    REFERENCE_ELEMENT,

    /** 
    */
    RELATIONSHIPT_ELEMENT,

    /**
     * Submodel Element is abstract, i.e. if a key uses 'SubmodelElement' the reference may be a
     * Property, a SubmodelElementCollection, an Operation etc.
     */
    SUBMODEL_ELEMENT,

    /**
     * Collection of Submodel Elements
     */
    SUBMODEL_ELEMENT_COLLECTION,

    /** 
    */
    VIEW;

}
