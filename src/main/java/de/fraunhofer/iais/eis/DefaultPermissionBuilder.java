package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultPermissionBuilder extends AbstractBuilder<DefaultPermission> {

    public DefaultPermissionBuilder() {
        super();
    }

    public DefaultPermissionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for kindOfPermissions
     * 
     * @param kindOfPermissions desired value to be set
     * @return Builder object with new value for kindOfPermissions
     */
    public DefaultPermissionBuilder kindOfPermissions(List<PermissionKind> kindOfPermissions) {
        this.map.put("kindOfPermissions", kindOfPermissions);
        return this;
    }

    /**
     * This function allows setting a value for permissions
     * 
     * @param permissions desired value to be set
     * @return Builder object with new value for permissions
     */
    public DefaultPermissionBuilder permissions(List<Property> permissions) {
        this.map.put("permissions", permissions);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPermission build() {
        DefaultPermission defaultPermission = Util.fillInstanceFromMap(new DefaultPermission(), this.map);
        return defaultPermission;
    }
}
