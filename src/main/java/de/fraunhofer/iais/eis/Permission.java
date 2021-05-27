package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Permission" "Description of a single permission."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPermission.class)
})
public interface Permission extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Description of the kind of permission. Possible kind of permission also include the denial of
     * the permission."@en
     * 
     * @return Returns the List of PermissionKinds for the property kindOfPermissions. More information
     *         under https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
    public List<PermissionKind> getKindOfPermissions();

    /**
     * "Description of the kind of permission. Possible kind of permission also include the denial of
     * the permission."@en
     * 
     * @param kindOfPermissions desired value for the property kindOfPermissions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
     */
    public void setKindOfPermissions(List<PermissionKind> kindOfPermissions);

    /**
     * "Reference to a property that defines the semantics of the permission."@en "Constraint AASs-010:
     * The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
     * "Constraint AASs-011: The property referenced in Permission/permission shall be part of the
     * submodel that is referenced within the \'selectablePermissions\' attribute of
     * \'AccessControl\'."@en
     * 
     * @return Returns the List of Propertys for the property permissions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Permission/permission
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
    public List<Property> getPermissions();

    /**
     * "Reference to a property that defines the semantics of the permission."@en "Constraint AASs-010:
     * The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
     * "Constraint AASs-011: The property referenced in Permission/permission shall be part of the
     * submodel that is referenced within the \'selectablePermissions\' attribute of
     * \'AccessControl\'."@en
     * 
     * @param permissions desired value for the property permissions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Permission/permission
     */
    public void setPermissions(List<Property> permissions);

}
