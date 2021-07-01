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

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AccessControlBuilder<T extends AccessControl, B extends AccessControlBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for accessPermissionRules
     * 
     * @param accessPermissionRules desired value to be set
     * @return Builder object with new value for accessPermissionRules
     */
    public B accessPermissionRules(List<AccessPermissionRule> accessPermissionRules) {
        getBuildingInstance().setAccessPermissionRules(accessPermissionRules);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List accessPermissionRules
     * 
     * @param accessPermissionRule desired value to be added
     * @return Builder object with new value for accessPermissionRules
     */
    public B accessPermissionRule(AccessPermissionRule accessPermissionRule) {
        getBuildingInstance().getAccessPermissionRules().add(accessPermissionRule);
        return getSelf();
    }

    /**
     * This function allows setting a value for selectableSubjectAttributes
     * 
     * @param selectableSubjectAttributes desired value to be set
     * @return Builder object with new value for selectableSubjectAttributes
     */
    public B selectableSubjectAttributes(Reference selectableSubjectAttributes) {
        getBuildingInstance().setSelectableSubjectAttributes(selectableSubjectAttributes);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultSubjectAttributes
     * 
     * @param defaultSubjectAttributes desired value to be set
     * @return Builder object with new value for defaultSubjectAttributes
     */
    public B defaultSubjectAttributes(Reference defaultSubjectAttributes) {
        getBuildingInstance().setDefaultSubjectAttributes(defaultSubjectAttributes);
        return getSelf();
    }

    /**
     * This function allows setting a value for selectablePermissions
     * 
     * @param selectablePermissions desired value to be set
     * @return Builder object with new value for selectablePermissions
     */
    public B selectablePermissions(Reference selectablePermissions) {
        getBuildingInstance().setSelectablePermissions(selectablePermissions);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultPermissions
     * 
     * @param defaultPermissions desired value to be set
     * @return Builder object with new value for defaultPermissions
     */
    public B defaultPermissions(Reference defaultPermissions) {
        getBuildingInstance().setDefaultPermissions(defaultPermissions);
        return getSelf();
    }

    /**
     * This function allows setting a value for selectableEnvironmentAttributes
     * 
     * @param selectableEnvironmentAttributes desired value to be set
     * @return Builder object with new value for selectableEnvironmentAttributes
     */
    public B selectableEnvironmentAttributes(Reference selectableEnvironmentAttributes) {
        getBuildingInstance().setSelectableEnvironmentAttributes(selectableEnvironmentAttributes);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultEnvironmentAttributes
     * 
     * @param defaultEnvironmentAttributes desired value to be set
     * @return Builder object with new value for defaultEnvironmentAttributes
     */
    public B defaultEnvironmentAttributes(Reference defaultEnvironmentAttributes) {
        getBuildingInstance().setDefaultEnvironmentAttributes(defaultEnvironmentAttributes);
        return getSelf();
    }
}
