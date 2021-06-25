package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class PermissionsPerObjectBuilder<T extends PermissionsPerObject, B extends PermissionsPerObjectBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for object
     * 
     * @param object desired value to be set
     * @return Builder object with new value for object
     */
    public B object(Referable object) {
        getBuildingInstance().setObject(object);
        return getSelf();
    }

    /**
     * This function allows setting a value for permissions
     * 
     * @param permissions desired value to be set
     * @return Builder object with new value for permissions
     */
    public B permissions(List<Permission> permissions) {
        getBuildingInstance().setPermissions(permissions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List permissions
     * 
     * @param permission desired value to be added
     * @return Builder object with new value for permissions
     */
    public B permission(Permission permission) {
        getBuildingInstance().getPermissions().add(permission);
        return getSelf();
    }

    /**
     * This function allows setting a value for targetObjectAttributes
     * 
     * @param targetObjectAttributes desired value to be set
     * @return Builder object with new value for targetObjectAttributes
     */
    public B targetObjectAttributes(ObjectAttributes targetObjectAttributes) {
        getBuildingInstance().setTargetObjectAttributes(targetObjectAttributes);
        return getSelf();
    }
}
