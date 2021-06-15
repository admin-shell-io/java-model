package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Access Control defines the local access control policy administration point. Access Control has
 * the major task to define the access permission rules.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControl.class)
})
public interface AccessControl {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * Access permission rules of the AAS describing the rights assigned to (already authenticated)
     * subjects to access elements of the AAS.
     * 
     * @return Returns the List of AccessPermissionRules for the property accessPermissionRules. More
     *         information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
    public List<AccessPermissionRule> getAccessPermissionRules();

    /**
     * Access permission rules of the AAS describing the rights assigned to (already authenticated)
     * subjects to access elements of the AAS.
     * 
     * @param accessPermissionRules desired value for the property accessPermissionRules. More
     *        information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
     */
    public void setAccessPermissionRules(List<AccessPermissionRule> accessPermissionRules);

    /**
     * Reference to a submodel defining the authenticated subjects that are configured for the AAS. They
     * are selectable by the access permission rules to assign permissions to the subjects. Default:
     * reference to the submodel referenced via defaultSubjectAttributes.
     * 
     * @return Returns the Reference for the property selectableSubjectAttributes. More information
     *         under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
    public Reference getSelectableSubjectAttributes();

    /**
     * Reference to a submodel defining the authenticated subjects that are configured for the AAS. They
     * are selectable by the access permission rules to assign permissions to the subjects. Default:
     * reference to the submodel referenced via defaultSubjectAttributes.
     * 
     * @param selectableSubjectAttributes desired value for the property selectableSubjectAttributes.
     *        More information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
     */
    public void setSelectableSubjectAttributes(Reference selectableSubjectAttributes);

    /**
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules. The submodel is of kind=Type.
     * 
     * @return Returns the Reference for the property defaultSubjectAttributes. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
    public Reference getDefaultSubjectAttributes();

    /**
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules. The submodel is of kind=Type.
     * 
     * @param defaultSubjectAttributes desired value for the property defaultSubjectAttributes. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
     */
    public void setDefaultSubjectAttributes(Reference defaultSubjectAttributes);

    /**
     * Reference to a submodel defining which permissions can be assigned to the subjects. Default:
     * reference to the submodel referenced via defaultPermissions
     * 
     * @return Returns the Reference for the property selectablePermissions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
    public Reference getSelectablePermissions();

    /**
     * Reference to a submodel defining which permissions can be assigned to the subjects. Default:
     * reference to the submodel referenced via defaultPermissions
     * 
     * @param selectablePermissions desired value for the property selectablePermissions. More
     *        information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
     */
    public void setSelectablePermissions(Reference selectablePermissions);

    /**
     * Reference to a submodel defining the default permissions for the AAS.
     * 
     * @return Returns the Reference for the property defaultPermissions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
    public Reference getDefaultPermissions();

    /**
     * Reference to a submodel defining the default permissions for the AAS.
     * 
     * @param defaultPermissions desired value for the property defaultPermissions. More information
     *        under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
     */
    public void setDefaultPermissions(Reference defaultPermissions);

    /**
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules.
     * 
     * @return Returns the Reference for the property selectableEnvironmentAttributes. More information
     *         under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
    public Reference getSelectableEnvironmentAttributes();

    /**
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules.
     * 
     * @param selectableEnvironmentAttributes desired value for the property
     *        selectableEnvironmentAttributes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
     */
    public void setSelectableEnvironmentAttributes(Reference selectableEnvironmentAttributes);

    /**
     * Reference to a submodel defining default environment attributes, i.e. attributes that are not
     * describing the asset itself. The submodel is of kind=Type. At the same type the values of these
     * environment attributes need to be accessible when evaluating the access permission rules. This is
     * realized as a policy information point.
     * 
     * @return Returns the Reference for the property defaultEnvironmentAttributes. More information
     *         under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
    public Reference getDefaultEnvironmentAttributes();

    /**
     * Reference to a submodel defining default environment attributes, i.e. attributes that are not
     * describing the asset itself. The submodel is of kind=Type. At the same type the values of these
     * environment attributes need to be accessible when evaluating the access permission rules. This is
     * realized as a policy information point.
     * 
     * @param defaultEnvironmentAttributes desired value for the property defaultEnvironmentAttributes.
     *        More information under
     *        https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
     */
    public void setDefaultEnvironmentAttributes(Reference defaultEnvironmentAttributes);

}
