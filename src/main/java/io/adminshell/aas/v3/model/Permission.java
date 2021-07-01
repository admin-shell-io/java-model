package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Description of a single permission.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPermission.class)
})
public interface Permission {

    /**
     * Description of the kind of permission. Possible kind of permission also include the denial of the
     * permission.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
     *
     * @return Returns the PermissionKind for the property kindOfPermission.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    PermissionKind getKindOfPermission();

    /**
     * Description of the kind of permission. Possible kind of permission also include the denial of the
     * permission.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
     *
     * @param kindOfPermission desired value for the property kindOfPermission.
     */
    void setKindOfPermission(PermissionKind kindOfPermission);

    /**
     * Reference to a property that defines the semantics of the permission.
     *
     * Constraint AASs-010: The property referenced in Permission/permission shall have the category
     * 'CONSTANT'.
     *
     * Constraint AASs-011: The property referenced in Permission/permission shall be part of the
     * submodel that is referenced within the 'selectablePermissions' attribute of 'AccessControl'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Permission/permission
     *
     * @return Returns the Reference for the property permission.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    Reference getPermission();

    /**
     * Reference to a property that defines the semantics of the permission.
     *
     * Constraint AASs-010: The property referenced in Permission/permission shall have the category
     * 'CONSTANT'.
     *
     * Constraint AASs-011: The property referenced in Permission/permission shall be part of the
     * submodel that is referenced within the 'selectablePermissions' attribute of 'AccessControl'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Permission/permission
     *
     * @param permission desired value for the property permission.
     */
    void setPermission(Reference permission);

}
