package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

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
    protected Referable object;

    /**
     * "has object permission" "Permissions assigned to the object. The permissions hold for all
     * subjects as specified in the access permission rule."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    protected List<Permission> permissions = new ArrayList<>();

    /**
     * "has target object attributes" "Target object attributes that need to be fulfilled so that the
     * access permissions apply to the accessing subject."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
    protected ObjectAttributes targetObjectAttributes;

    public DefaultPermissionsPerObject() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.object,
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
            return Objects.equals(this.object, other.object) &&
                Objects.equals(this.permissions, other.permissions) &&
                Objects.equals(this.targetObjectAttributes, other.targetObjectAttributes);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
    final public Referable getObject() {
        return object;
    }

    final public void setObject(Referable object) {
        this.object = object;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    final public List<Permission> getPermissions() {
        return permissions;
    }

    final public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
    final public ObjectAttributes getTargetObjectAttributes() {
        return targetObjectAttributes;
    }

    final public void setTargetObjectAttributes(ObjectAttributes targetObjectAttributes) {
        this.targetObjectAttributes = targetObjectAttributes;
    }

    public static class Builder extends DefaultPermissionsPerObjectBuilder<DefaultPermissionsPerObject, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPermissionsPerObject newBuildingInstance() {
            return new DefaultPermissionsPerObject();
        }
    }
}
