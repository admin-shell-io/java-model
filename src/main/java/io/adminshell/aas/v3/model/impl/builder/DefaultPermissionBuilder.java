package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultPermissionBuilder<T extends Permission, B extends DefaultPermissionBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

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
