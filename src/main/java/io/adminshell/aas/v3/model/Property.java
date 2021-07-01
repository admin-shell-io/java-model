/*
Copyright (c) 2021 Fraunhofer IOSB-INA Lemgo,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IOSB-ILT Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IAIS,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IESE,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IWU Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

This source code is licensed under the Apache License 2.0 (see LICENSE.txt).

This source code may use other Open Source software components (see LICENSE.txt).
*/

package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A property is a data element that has a single value. Constraint AASd-052a: If the semanticId of
 * a Property references a ConceptDescription then the ConceptDescription/category shall be one of
 * following values: VALUE, PROPERTY. Constraint AASd-065: If the semanticId of a Property or
 * MultiLanguageProperty references a ConceptDescription with the category VALUE then the value of
 * the property is identical to DataSpecificationIEC61360/value and the valueId of the property is
 * identical to DataSpecificationIEC61360/valueId. Constraint AASd-066: If the semanticId of a
 * Property or MultiLanguageProperty references a ConceptDescription with the category PROPERTY and
 * DataSpecificationIEC61360/valueList is defined the value and valueId of the property is identical
 * to one of the value reference pair types references in the value list, i.e.
 * ValueReferencePairType/value or ValueReferencePairType/valueId, resp.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultProperty.class)
})
public interface Property extends DataElement {

    /**
     * Data type pf the value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueType
     *
     * @return Returns the String for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueType")
    String getValueType();

    /**
     * Data type pf the value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(String valueType);

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/value")
    String getValue();

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to the global unique id of a coded value.
     *
     * Constraint AASd-007: if both, the value and the valueId are present then the value needs to be
     * identical to the value of the referenced coded value in valueId.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
    Reference getValueId();

    /**
     * Reference to the global unique id of a coded value.
     *
     * Constraint AASd-007: if both, the value and the valueId are present then the value needs to be
     * identical to the value of the referenced coded value in valueId.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

}
