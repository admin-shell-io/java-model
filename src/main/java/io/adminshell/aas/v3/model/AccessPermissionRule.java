package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Access Permission Rule" "Table that defines access permissions per authenticated subject for a
 * set of objects (referable elements)."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessPermissionRule.class)
})
public interface AccessPermissionRule extends Referable, Qualifiable {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Set of object-permission pairs that define the permissions per object within the access
     * permission rule."@en
     * 
     * @return Returns the List of PermissionsPerObjects for the property permissionsPerObjects. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
    public List<PermissionsPerObject> getPermissionsPerObjects();

    /**
     * "Set of object-permission pairs that define the permissions per object within the access
     * permission rule."@en
     * 
     * @param permissionsPerObjects desired value for the property permissionsPerObjects. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
     */
    public void setPermissionsPerObjects(List<PermissionsPerObject> permissionsPerObjects);

    /**
     * "Target subject attributes that need to be fulfilled by the accessing subject to get the
     * permissions defined by this rule."@en
     * 
     * @return Returns the SubjectAttributes for the property targetSubjectAttributes. More information
     *         under https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
    public SubjectAttributes getTargetSubjectAttributes();

    /**
     * "Target subject attributes that need to be fulfilled by the accessing subject to get the
     * permissions defined by this rule."@en
     * 
     * @param targetSubjectAttributes desired value for the property targetSubjectAttributes. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
     */
    public void setTargetSubjectAttributes(SubjectAttributes targetSubjectAttributes);

}
