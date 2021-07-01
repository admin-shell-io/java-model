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
 * An operation variable is a submodel element that is used as input or output variable of an
 * operation.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperationVariable.class)
})
public interface OperationVariable {

    /**
     * Describes the needed argument for an operation via a submodel element of kind=Template.
     *
     * The submodel element value of an operation variable shall be of kind=Template.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     *
     * @return Returns the SubmodelElement for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
    SubmodelElement getValue();

    /**
     * Describes the needed argument for an operation via a submodel element of kind=Template.
     *
     * The submodel element value of an operation variable shall be of kind=Template.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     *
     * @param value desired value for the property value.
     */
    void setValue(SubmodelElement value);

}
