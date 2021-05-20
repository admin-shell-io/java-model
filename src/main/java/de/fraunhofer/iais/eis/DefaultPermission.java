package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Permission" "Description of a single permission."@en
 */

public class DefaultPermission implements Permission {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has kind of permission" "Description of the kind of permission. Possible kind of permission also
     * include the denial of the permission."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    protected PermissionKind kindOfPermission;

    /**
     * "has permission" "Reference to a property that defines the semantics of the permission."@en
     * "Constraint AASs-010: The property referenced in Permission/permission shall have the category
     * \'CONSTANT\'."@en "Constraint AASs-011: The property referenced in Permission/permission shall be
     * part of the submodel that is referenced within the \'selectablePermissions\' attribute of
     * \'AccessControl\'."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    protected Reference permission;

    // no manual construction
    protected DefaultPermission() {}

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
    public Object deepCopy() {
        DefaultPermission other = new DefaultPermission();
        other.kindOfPermission = (PermissionKind) Util.clone(this.kindOfPermission);
        other.permission = (Reference) Util.clone(this.permission);
        return other;
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
}
