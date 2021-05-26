package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultPermissionBuilder extends AbstractBuilder<DefaultPermission> {

    public DefaultPermissionBuilder() {
        super();
    }

    public DefaultPermissionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for kindOfPermission
     * 
     * @param kindOfPermission desired value to be set
     * @return Builder object with new value for kindOfPermission
     */
    public DefaultPermissionBuilder kindOfPermission(PermissionKind kindOfPermission) {
        this.map.put("kindOfPermission", kindOfPermission);
        return this;
    }

    /**
     * This function allows setting a value for permission
     * 
     * @param permission desired value to be set
     * @return Builder object with new value for permission
     */
    public DefaultPermissionBuilder permission(Reference permission) {
        this.map.put("permission", permission);
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
