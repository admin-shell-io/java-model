package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Permission Kind" "Enumeration of the kind of permissions that is given to the assignment of a
 * permission to a subject."@en
 */
public enum PermissionKind {

    /**
     * "allow" "Allow the permission given to the subject."@en
     */
    ALLOW,

    /**
     * "deny" "Explicitly deny the permission given to the subject."@en
     */
    DENY,

    /**
     * "not applicable" "The permission is not applicable to the subject."@en
     */
    NOT_APPLICABLE,

    /**
     * "undefined" "It is undefined whether the permission is allowed, not applicable or denied to the
     * subject."@en
     */
    UNDEFINED;

}
