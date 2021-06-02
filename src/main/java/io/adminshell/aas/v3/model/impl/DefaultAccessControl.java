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
 * "Access Control" "Access Control defines the local access control policy administration point.
 * Access Control has the major task to define the access permission rules."@en
 */

public class DefaultAccessControl implements AccessControl {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has access permission rule" "Access permission rules of the AAS describing the rights assigned
     * to (already authenticated) subjects to access elements of the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
    protected List<AccessPermissionRule> accessPermissionRules = new ArrayList<>();

    /**
     * "has default environment attributes" "Reference to a submodel defining default environment
     * attributes, i.e. attributes that are not describing the asset itself. The submodel is of
     * kind=Type. At the same type the values of these environment attributes need to be accessible when
     * evaluating the access permission rules. This is realized as a policy information point."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
    protected Reference defaultEnvironmentAttributes;

    /**
     * "has default permissions" "Reference to a submodel defining the default permissions for the
     * AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
    protected Reference defaultPermissions;

    /**
     * "has default subject attributes" "Reference to a submodel defining the default subjects
     * attributes for the AAS that can be used to describe access permission rules."@en "The submodel is
     * of kind=Type."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
    protected Reference defaultSubjectAttributes;

    /**
     * "has selectable environment attributes" "Reference to a submodel defining which environment
     * attributes can be accessed via the permission rules."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
    protected Reference selectableEnvironmentAttributes;

    /**
     * "has selectable permissions" "Reference to a submodel defining which permissions can be assigned
     * to the subjects."@en "Default: reference to the submodel referenced via defaultPermissions"@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
    protected Reference selectablePermissions;

    /**
     * "has selectable subject attributes" "Reference to a submodel defining the authenticated subjects
     * that are configured for the AAS. They are selectable by the access permission rules to assign
     * permissions to the subjects."@en "Default: reference to the submodel referenced via
     * defaultSubjectAttributes."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
    protected Reference selectableSubjectAttributes;

    public DefaultAccessControl() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.accessPermissionRules,
            this.selectableSubjectAttributes,
            this.defaultSubjectAttributes,
            this.selectablePermissions,
            this.defaultPermissions,
            this.selectableEnvironmentAttributes,
            this.defaultEnvironmentAttributes});
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
            DefaultAccessControl other = (DefaultAccessControl) obj;
            return Objects.equals(this.accessPermissionRules, other.accessPermissionRules) &&
                Objects.equals(this.selectableSubjectAttributes, other.selectableSubjectAttributes) &&
                Objects.equals(this.defaultSubjectAttributes, other.defaultSubjectAttributes) &&
                Objects.equals(this.selectablePermissions, other.selectablePermissions) &&
                Objects.equals(this.defaultPermissions, other.defaultPermissions) &&
                Objects.equals(this.selectableEnvironmentAttributes, other.selectableEnvironmentAttributes) &&
                Objects.equals(this.defaultEnvironmentAttributes, other.defaultEnvironmentAttributes);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultAccessControl other = new DefaultAccessControl();
        other.accessPermissionRules = (List<AccessPermissionRule>) Util.clone(this.accessPermissionRules);
        other.selectableSubjectAttributes = (Reference) Util.clone(this.selectableSubjectAttributes);
        other.defaultSubjectAttributes = (Reference) Util.clone(this.defaultSubjectAttributes);
        other.selectablePermissions = (Reference) Util.clone(this.selectablePermissions);
        other.defaultPermissions = (Reference) Util.clone(this.defaultPermissions);
        other.selectableEnvironmentAttributes = (Reference) Util.clone(this.selectableEnvironmentAttributes);
        other.defaultEnvironmentAttributes = (Reference) Util.clone(this.defaultEnvironmentAttributes);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
    final public List<AccessPermissionRule> getAccessPermissionRules() {
        return accessPermissionRules;
    }

    final public void setAccessPermissionRules(List<AccessPermissionRule> accessPermissionRules) {
        this.accessPermissionRules = accessPermissionRules;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
    final public Reference getSelectableSubjectAttributes() {
        return selectableSubjectAttributes;
    }

    final public void setSelectableSubjectAttributes(Reference selectableSubjectAttributes) {
        this.selectableSubjectAttributes = selectableSubjectAttributes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
    final public Reference getDefaultSubjectAttributes() {
        return defaultSubjectAttributes;
    }

    final public void setDefaultSubjectAttributes(Reference defaultSubjectAttributes) {
        this.defaultSubjectAttributes = defaultSubjectAttributes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
    final public Reference getSelectablePermissions() {
        return selectablePermissions;
    }

    final public void setSelectablePermissions(Reference selectablePermissions) {
        this.selectablePermissions = selectablePermissions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
    final public Reference getDefaultPermissions() {
        return defaultPermissions;
    }

    final public void setDefaultPermissions(Reference defaultPermissions) {
        this.defaultPermissions = defaultPermissions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
    final public Reference getSelectableEnvironmentAttributes() {
        return selectableEnvironmentAttributes;
    }

    final public void setSelectableEnvironmentAttributes(Reference selectableEnvironmentAttributes) {
        this.selectableEnvironmentAttributes = selectableEnvironmentAttributes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
    final public Reference getDefaultEnvironmentAttributes() {
        return defaultEnvironmentAttributes;
    }

    final public void setDefaultEnvironmentAttributes(Reference defaultEnvironmentAttributes) {
        this.defaultEnvironmentAttributes = defaultEnvironmentAttributes;
    }
}
