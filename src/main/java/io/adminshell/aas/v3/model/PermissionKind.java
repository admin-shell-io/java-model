package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of the kind of permissions that is given to the assignment of a permission to a
 * subject.
 */
public enum PermissionKind {

    /**
     * Allow the permission given to the subject.
     */
    ALLOW,

    /**
     * Explicitly deny the permission given to the subject.
     */
    DENY,

    /**
     * The permission is not applicable to the subject.
     */
    NOT_APPLICABLE,

    /**
     * It is undefined whether the permission is allowed, not applicable or denied to the subject.
     */
    UNDEFINED;

}
