package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultAccessControlBuilder extends AbstractBuilder<DefaultAccessControl> {

    public DefaultAccessControlBuilder() {
        super();
    }

    public DefaultAccessControlBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for accessPermissionRules
     * 
     * @param accessPermissionRules desired value to be set
     * @return Builder object with new value for accessPermissionRules
     */
    public DefaultAccessControlBuilder accessPermissionRules(List<AccessPermissionRule> accessPermissionRules) {
        this.map.put("accessPermissionRules", accessPermissionRules);
        return this;
    }

    /**
     * This function allows setting a value for selectableSubjectAttributes
     * 
     * @param selectableSubjectAttributes desired value to be set
     * @return Builder object with new value for selectableSubjectAttributes
     */
    public DefaultAccessControlBuilder selectableSubjectAttributes(Reference selectableSubjectAttributes) {
        this.map.put("selectableSubjectAttributes", selectableSubjectAttributes);
        return this;
    }

    /**
     * This function allows setting a value for defaultSubjectAttributes
     * 
     * @param defaultSubjectAttributes desired value to be set
     * @return Builder object with new value for defaultSubjectAttributes
     */
    public DefaultAccessControlBuilder defaultSubjectAttributes(Reference defaultSubjectAttributes) {
        this.map.put("defaultSubjectAttributes", defaultSubjectAttributes);
        return this;
    }

    /**
     * This function allows setting a value for selectablePermissions
     * 
     * @param selectablePermissions desired value to be set
     * @return Builder object with new value for selectablePermissions
     */
    public DefaultAccessControlBuilder selectablePermissions(Reference selectablePermissions) {
        this.map.put("selectablePermissions", selectablePermissions);
        return this;
    }

    /**
     * This function allows setting a value for defaultPermissions
     * 
     * @param defaultPermissions desired value to be set
     * @return Builder object with new value for defaultPermissions
     */
    public DefaultAccessControlBuilder defaultPermissions(Reference defaultPermissions) {
        this.map.put("defaultPermissions", defaultPermissions);
        return this;
    }

    /**
     * This function allows setting a value for selectableEnvironmentAttributes
     * 
     * @param selectableEnvironmentAttributes desired value to be set
     * @return Builder object with new value for selectableEnvironmentAttributes
     */
    public DefaultAccessControlBuilder selectableEnvironmentAttributes(Reference selectableEnvironmentAttributes) {
        this.map.put("selectableEnvironmentAttributes", selectableEnvironmentAttributes);
        return this;
    }

    /**
     * This function allows setting a value for defaultEnvironmentAttributes
     * 
     * @param defaultEnvironmentAttributes desired value to be set
     * @return Builder object with new value for defaultEnvironmentAttributes
     */
    public DefaultAccessControlBuilder defaultEnvironmentAttributes(Reference defaultEnvironmentAttributes) {
        this.map.put("defaultEnvironmentAttributes", defaultEnvironmentAttributes);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAccessControl build() {
        DefaultAccessControl defaultAccessControl = Util.fillInstanceFromMap(new DefaultAccessControl(), this.map);
        return defaultAccessControl;
    }
}
