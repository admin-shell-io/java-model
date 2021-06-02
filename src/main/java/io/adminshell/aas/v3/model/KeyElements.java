package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Key Elements" "Enumeration of different key value types within a key. Contains KeyElements,
 * ReferableElements, and IdentifiableElements."@en
 */
public enum KeyElements {

    /**
     * "Asset"
     */
    ASSET,

    /**
     * "Asset Administration Shell"
     */
    ASSET_ADMINISTRATION_SHELL,

    /**
     * "Concept Description"
     */
    CONCEPT_DESCRIPTION,

    /**
     * "Submodel"
     */
    SUBMODEL,

    /**
     * "Fragement Reference"
     */
    FRAGMENT_REFERENCE,

    /**
     * "Gobal Reference" "reference to an element not belonging to an asset administration shell"@en
     */
    GLOBAL_REFERENCE,

    /**
     * "Access Permission Rule"
     */
    ACCESS_PERMISSION_RULE,

    /**
     * "Annotated relationship element"
     */
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /**
     * "Basic Event"
     */
    BASIC_EVENT,

    /**
     * "Blob"
     */
    BLOB,

    /**
     * "Capability"
     */
    CAPABILITY,

    /**
     * "Concept Dictionary"
     */
    CONCEPT_DICTIONARY,

    /**
     * "Data Element" "Data Element is abstract, i.e. if a key uses \'DataElement\' the reference may be
     * a Property, a File etc."@en
     */
    DATA_ELEMENT,

    /**
     * "Entity"
     */
    ENTITY,

    /**
     * "Event" "Event is abstract"@en
     */
    EVENT,

    /**
     * "Multi-language Property" "Property with a value that can be provided in multiple languages."@en
     */
    MULTI_LANGUAGE_PROPERTY,

    /**
     * "Operation"
     */
    OPERATION,

    /**
     * "Property"
     */
    PROPERTY,

    /**
     * "Range"
     */
    RANGE,

    /**
     * "Reference Element"
     */
    REFERENCE_ELEMENT,

    /**
     * "Relationship Element"
     */
    RELATIONSHIPT_ELEMENT,

    /**
     * "Submodel Element" "Submodel Element is abstract, i.e. if a key uses \'SubmodelElement\' the
     * reference may be a Property, a SubmodelElementCollection, an Operation etc."@en
     */
    SUBMODEL_ELEMENT,

    /**
     * "Submodel Element Collection" "Collection of Submodel Elements"@en
     */
    SUBMODEL_ELEMENT_COLLECTION,

    /**
     * "View"
     */
    VIEW;

}
