package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Table that defines access permissions for a specified object. The object is any referable element
 * in the AAS. Additionally object attributes can be defined that further specify the kind of object
 * the permissions apply to.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPermissionsPerObject.class)
})
public interface PermissionsPerObject {

    /**
     * Element to which permission shall be assigned.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object
     *
     * @return Returns the Referable for the property object.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
    public Referable getObject();

    /**
     * Element to which permission shall be assigned.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object
     *
     * @param object desired value for the property object.
     */
    public void setObject(Referable object);

    /**
     * Permissions assigned to the object. The permissions hold for all subjects as specified in the
     * access permission rule.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission
     *
     * @return Returns the List of Permissions for the property permissions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    public List<Permission> getPermissions();

    /**
     * Permissions assigned to the object. The permissions hold for all subjects as specified in the
     * access permission rule.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission
     *
     * @param permissions desired value for the property permissions.
     */
    public void setPermissions(List<Permission> permissions);

    /**
     * Target object attributes that need to be fulfilled so that the access permissions apply to the
     * accessing subject.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes
     *
     * @return Returns the ObjectAttributes for the property targetObjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
    public ObjectAttributes getTargetObjectAttributes();

    /**
     * Target object attributes that need to be fulfilled so that the access permissions apply to the
     * accessing subject.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes
     *
     * @param targetObjectAttributes desired value for the property targetObjectAttributes.
     */
    public void setTargetObjectAttributes(ObjectAttributes targetObjectAttributes);

}
