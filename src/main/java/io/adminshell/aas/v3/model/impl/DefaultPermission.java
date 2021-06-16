package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Permission
 * 
 * Description of a single permission.
 */

public class DefaultPermission implements Permission {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    protected PermissionKind kindOfPermission;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    protected Reference permission;

    public DefaultPermission() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.kindOfPermission,
            this.permission});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultPermission other = (DefaultPermission) obj;
            return Objects.equals(this.kindOfPermission, other.kindOfPermission) &&
                Objects.equals(this.permission, other.permission);
        }
    }

    @Override
    public PermissionKind getKindOfPermission() {
        return kindOfPermission;
    }

    @Override
    public void setKindOfPermission(PermissionKind kindOfPermission) {
        this.kindOfPermission = kindOfPermission;
    }

    @Override
    public Reference getPermission() {
        return permission;
    }

    @Override
    public void setPermission(Reference permission) {
        this.permission = permission;
    }
}
