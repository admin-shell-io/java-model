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
 * A File is a data element that represents a file via its path description.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFile.class)
})
public interface File extends DataElement, SubmodelElement {

    /**
     * Mime type of the content of the File.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/mimeType
     *
     * @return Returns the String for the property mimeType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/mimeType")
    String getMimeType();

    /**
     * Mime type of the content of the File.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/mimeType
     *
     * @param mimeType desired value for the property mimeType.
     */
    void setMimeType(String mimeType);

    /**
     * Path and name of the referenced file (with file extension). The path can be absolute or relative.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/value")
    String getValue();

    /**
     * Path and name of the referenced file (with file extension). The path can be absolute or relative.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

}
