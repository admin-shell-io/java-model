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
 * An IdentifierKeyValuePair describes a generic identifier as key-value pair.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifierKeyValuePair.class)
})
public interface IdentifierKeyValuePair extends HasSemantics {

    /**
     * Key of the identifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     *
     * @return Returns the String for the property key.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    String getKey();

    /**
     * Key of the identifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     *
     * @param key desired value for the property key.
     */
    void setKey(String key);

    /**
     * The value of the identifier with the corresponding key.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    String getValue();

    /**
     * The value of the identifier with the corresponding key.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
     *
     * @return Returns the Reference for the property externalSubjectId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
    Reference getExternalSubjectId();

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
     *
     * @param externalSubjectId desired value for the property externalSubjectId.
     */
    void setExternalSubjectId(Reference externalSubjectId);

}
