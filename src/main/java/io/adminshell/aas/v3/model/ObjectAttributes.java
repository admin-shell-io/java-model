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

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A set of data elements that describe object attributes. These attributes need to refer to a data
 * element within an existing submodel.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultObjectAttributes.class)
})
public interface ObjectAttributes {

    /**
     * A data elements that further classifies an object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     *
     * @return Returns the List of References for the property objectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
    List<Reference> getObjectAttributes();

    /**
     * A data elements that further classifies an object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     *
     * @param objectAttributes desired value for the property objectAttributes.
     */
    void setObjectAttributes(List<Reference> objectAttributes);

}
