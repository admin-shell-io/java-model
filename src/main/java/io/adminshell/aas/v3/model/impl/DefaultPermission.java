package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Description of a single permission.
 */

public class DefaultPermission implements Permission {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Description of the kind of permission. Possible kind of permission also include the denial of the
     * permission.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    protected PermissionKind kindOfPermission;

    /**
     * Reference to a property that defines the semantics of the permission. Constraint AASs-010: The
     * property referenced in Permission/permission shall have the category 'CONSTANT'. Constraint
     * AASs-011: The property referenced in Permission/permission shall be part of the submodel that is
     * referenced within the 'selectablePermissions' attribute of 'AccessControl'.
     */
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

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    final public PermissionKind getKindOfPermission() {
        return kindOfPermission;
    }

    final public void setKindOfPermission(PermissionKind kindOfPermission) {
        this.kindOfPermission = kindOfPermission;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    final public Reference getPermission() {
        return permission;
    }

    final public void setPermission(Reference permission) {
        this.permission = permission;
    }

    public static class Builder extends PermissionBuilder<DefaultPermission, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPermission newBuildingInstance() {
            return new DefaultPermission();
        }
    }
}
