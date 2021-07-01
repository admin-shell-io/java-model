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
 * A qualifier is a type-value pair that makes additional statements w.r.t. the value of the
 * element. Constraint AASd-063: The semanticId of a Qualifier shall only reference a
 * ConceptDescription with the category QUALIFIER.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultQualifier.class)
})
public interface Qualifier extends Constraint, HasSemantics {

    /**
     * The qualifier type describes the type of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/type
     *
     * @return Returns the String for the property type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    String getType();

    /**
     * The qualifier type describes the type of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/type
     *
     * @param type desired value for the property type.
     */
    void setType(String type);

    /**
     * Data type of the qualifier value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType
     *
     * @return Returns the String for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    String getValueType();

    /**
     * Data type of the qualifier value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(String valueType);

    /**
     * The qualifier value is the value of the qualifier.
     *
     * Constraint AASd-006: if both, the value and the valueId are present then the value needs to be
     * identical to the short name of the referenced coded value in qualifierValueId.
     *
     * Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined
     * in Qualifier/valueType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    String getValue();

    /**
     * The qualifier value is the value of the qualifier.
     *
     * Constraint AASd-006: if both, the value and the valueId are present then the value needs to be
     * identical to the short name of the referenced coded value in qualifierValueId.
     *
     * Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined
     * in Qualifier/valueType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    Reference getValueId();

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

}
