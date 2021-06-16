package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PermissionsPerObject
 * 
 * Table that defines access permissions for a specified object. The object is any referable element
 * in the AAS. Additionally object attributes can be defined that further specify the kind of object
 * the permissions apply to.
 */

public class DefaultPermissionsPerObject implements PermissionsPerObject {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
    protected Referable object;

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    protected List<Permission> permissions = new ArrayList<>();

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

    @Override
    public Referable getObject() {
        return object;
    }

    @Override
    public void setObject(Referable object) {
        this.object = object;
    }

    @Override
    public List<Permission> getPermissions() {
        return permissions;
    }

    @Override
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public ObjectAttributes getTargetObjectAttributes() {
        return targetObjectAttributes;
    }

    @Override
    public void setTargetObjectAttributes(ObjectAttributes targetObjectAttributes) {
        this.targetObjectAttributes = targetObjectAttributes;
    }
}
