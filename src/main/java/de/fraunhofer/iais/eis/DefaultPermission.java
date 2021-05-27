package de.fraunhofer.iais.eis;

import java.util.List;
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
    protected List<PermissionKind> kindOfPermissions;

    /**
     * "has permission" "Reference to a property that defines the semantics of the permission."@en
     * "Constraint AASs-010: The property referenced in Permission/permission shall have the category
     * \'CONSTANT\'."@en "Constraint AASs-011: The property referenced in Permission/permission shall be
     * part of the submodel that is referenced within the \'selectablePermissions\' attribute of
     * \'AccessControl\'."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    protected List<Property> permissions;

    // no manual construction
    protected DefaultPermission() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.kindOfPermissions,
            this.permissions});
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
            return Objects.equals(this.kindOfPermissions, other.kindOfPermissions) &&
                Objects.equals(this.permissions, other.permissions);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultPermission other = new DefaultPermission();
        other.kindOfPermissions = (List<PermissionKind>) Util.clone(this.kindOfPermissions);
        other.permissions = (List<Property>) Util.clone(this.permissions);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    final public List<PermissionKind> getKindOfPermissions() {
        return kindOfPermissions;
    }

    final public void setKindOfPermissions(List<PermissionKind> kindOfPermissions) {
        this.kindOfPermissions = kindOfPermissions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    final public List<Property> getPermissions() {
        return permissions;
    }

    final public void setPermissions(List<Property> permissions) {
        this.permissions = permissions;
    }
}
