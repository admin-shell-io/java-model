package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Permission Per Object" "Table that defines access permissions for a specified object. The object
 * is any referable element in the AAS. Additionally object attributes can be defined that further
 * specify the kind of object the permissions apply to."@en
 */

public class DefaultPermissionsPerObject implements PermissionsPerObject {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has object" "Element to which permission shall be assigned."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
    protected List<Referable> objects;

    /**
     * "has object permission" "Permissions assigned to the object. The permissions hold for all
     * subjects as specified in the access permission rule."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    protected List<Permission> permissions;

    /**
     * "has target object attributes" "Target object attributes that need to be fulfilled so that the
     * access permissions apply to the accessing subject."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
    protected List<ObjectAttributes> targetObjectAttributes;

    // no manual construction
    protected DefaultPermissionsPerObject() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.objects,
            this.permissions,
            this.targetObjectAttributes});
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
            DefaultPermissionsPerObject other = (DefaultPermissionsPerObject) obj;
            return Objects.equals(this.objects, other.objects) &&
                Objects.equals(this.permissions, other.permissions) &&
                Objects.equals(this.targetObjectAttributes, other.targetObjectAttributes);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultPermissionsPerObject other = new DefaultPermissionsPerObject();
        other.objects = (List<Referable>) Util.clone(this.objects);
        other.permissions = (List<Permission>) Util.clone(this.permissions);
        other.targetObjectAttributes = (List<ObjectAttributes>) Util.clone(this.targetObjectAttributes);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
    final public List<Referable> getObjects() {
        return objects;
    }

    final public void setObjects(List<Referable> objects) {
        this.objects = objects;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    final public List<Permission> getPermissions() {
        return permissions;
    }

    final public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
    final public List<ObjectAttributes> getTargetObjectAttributes() {
        return targetObjectAttributes;
    }

    final public void setTargetObjectAttributes(List<ObjectAttributes> targetObjectAttributes) {
        this.targetObjectAttributes = targetObjectAttributes;
    }
}
