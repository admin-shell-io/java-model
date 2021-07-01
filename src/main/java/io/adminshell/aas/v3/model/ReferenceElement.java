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
 * A reference element is a data element that defines a logical reference to another element within
 * the same or another AAS or a reference to an external object or entity. Constraint AASd-054: The
 * semanticId of a ReferenceElement shall only reference a ConceptDescription with the category
 * REFERENCE.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReferenceElement.class)
})
public interface ReferenceElement extends DataElement {

    /**
     * Reference to any other referable element of the same of any other AAS or a reference to an
     * external object or entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value
     *
     * @return Returns the Reference for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value")
    Reference getValue();

    /**
     * Reference to any other referable element of the same of any other AAS or a reference to an
     * external object or entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value
     *
     * @param value desired value for the property value.
     */
    void setValue(Reference value);

}
