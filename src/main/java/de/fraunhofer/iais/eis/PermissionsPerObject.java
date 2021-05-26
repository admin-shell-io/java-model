package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Permission Per Object" "Table that defines access permissions for a specified object. The object
 * is any referable element in the AAS. Additionally object attributes can be defined that further
 * specify the kind of object the permissions apply to."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPermissionsPerObject.class)
})
public interface PermissionsPerObject extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Element to which permission shall be assigned."@en
     * 
     * @return Returns the Referable for the property object. More information under
     *         https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
    public Referable getObject();

    /**
     * "Element to which permission shall be assigned."@en
     * 
     * @param object desired value for the property object. More information under
     *        https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object
     */
    public void setObject(Referable object);

    /**
     * "Permissions assigned to the object. The permissions hold for all subjects as specified in the
     * access permission rule."@en
     * 
     * @return Returns the List of Permissions for the property permissions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    public List<Permission> getPermissions();

    /**
     * "Permissions assigned to the object. The permissions hold for all subjects as specified in the
     * access permission rule."@en
     * 
     * @param permissions desired value for the property permissions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission
     */
    public void setPermissions(List<Permission> permissions);

    /**
     * "Target object attributes that need to be fulfilled so that the access permissions apply to the
     * accessing subject."@en
     * 
     * @return Returns the ObjectAttributes for the property targetObjectAttributes. More information
     *         under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
    public ObjectAttributes getTargetObjectAttributes();

    /**
     * "Target object attributes that need to be fulfilled so that the access permissions apply to the
     * accessing subject."@en
     * 
     * @param targetObjectAttributes desired value for the property targetObjectAttributes. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes
     */
    public void setTargetObjectAttributes(ObjectAttributes targetObjectAttributes);

}
