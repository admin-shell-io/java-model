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
 * A key is a reference to an element by its id.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultKey.class)
})
public interface Key {

    /**
     * Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort.
     *
     * Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType
     * (IdShort, FragmentId).
     *
     * Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any
     * LocalKeyType (IdShort, FragmentId).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/idType
     *
     * @return Returns the KeyType for the property idType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    KeyType getIdType();

    /**
     * Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort.
     *
     * Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType
     * (IdShort, FragmentId).
     *
     * Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any
     * LocalKeyType (IdShort, FragmentId).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/idType
     *
     * @param idType desired value for the property idType.
     */
    void setIdType(KeyType idType);

    /**
     * Denote which kind of entity is referenced. In case type = GlobalReference then the element is a
     * global unique id. In all other cases the key references a model element of the same or of another
     * AAS. The name of the model element is explicitly listed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/type
     *
     * @return Returns the KeyElements for the property type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    KeyElements getType();

    /**
     * Denote which kind of entity is referenced. In case type = GlobalReference then the element is a
     * global unique id. In all other cases the key references a model element of the same or of another
     * AAS. The name of the model element is explicitly listed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/type
     *
     * @param type desired value for the property type.
     */
    void setType(KeyElements type);

    /**
     * The key value, for example an IRDI if the idType=Irdi.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    String getValue();

    /**
     * The key value, for example an IRDI if the idType=Irdi.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Key/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

}
