package io.adminshell.aas.v3.model.builder;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class PermissionBuilder<T extends Permission, B extends PermissionBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for kindOfPermission
     * 
     * @param kindOfPermission desired value to be set
     * @return Builder object with new value for kindOfPermission
     */
    public B kindOfPermission(PermissionKind kindOfPermission) {
        getBuildingInstance().setKindOfPermission(kindOfPermission);
        return getSelf();
    }

    /**
     * This function allows setting a value for permission
     * 
     * @param permission desired value to be set
     * @return Builder object with new value for permission
     */
    public B permission(Reference permission) {
        getBuildingInstance().setPermission(permission);
        return getSelf();
    }
}
