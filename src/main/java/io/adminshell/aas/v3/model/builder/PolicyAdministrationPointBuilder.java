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

package io.adminshell.aas.v3.model.builder;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class PolicyAdministrationPointBuilder<T extends PolicyAdministrationPoint, B extends PolicyAdministrationPointBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for localAccessControl
     * 
     * @param localAccessControl desired value to be set
     * @return Builder object with new value for localAccessControl
     */
    public B localAccessControl(AccessControl localAccessControl) {
        getBuildingInstance().setLocalAccessControl(localAccessControl);
        return getSelf();
    }

    /**
     * This function allows setting a value for externalAccessControl
     * 
     * @param externalAccessControl desired value to be set
     * @return Builder object with new value for externalAccessControl
     */
    public B externalAccessControl(boolean externalAccessControl) {
        getBuildingInstance().setExternalAccessControl(externalAccessControl);
        return getSelf();
    }
}
