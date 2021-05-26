package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultAccessPermissionRuleBuilder extends AbstractBuilder<DefaultAccessPermissionRule> {

    public DefaultAccessPermissionRuleBuilder() {
        super();
    }

    public DefaultAccessPermissionRuleBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for permissionsPerObjects
     * 
     * @param permissionsPerObjects desired value to be set
     * @return Builder object with new value for permissionsPerObjects
     */
    public DefaultAccessPermissionRuleBuilder permissionsPerObjects(List<PermissionsPerObject> permissionsPerObjects) {
        this.map.put("permissionsPerObjects", permissionsPerObjects);
        return this;
    }

    /**
     * This function allows setting a value for targetSubjectAttributes
     * 
     * @param targetSubjectAttributes desired value to be set
     * @return Builder object with new value for targetSubjectAttributes
     */
    public DefaultAccessPermissionRuleBuilder targetSubjectAttributes(SubjectAttributes targetSubjectAttributes) {
        this.map.put("targetSubjectAttributes", targetSubjectAttributes);
        return this;
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public DefaultAccessPermissionRuleBuilder category(String category) {
        this.map.put("category", category);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultAccessPermissionRuleBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultAccessPermissionRuleBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public DefaultAccessPermissionRuleBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultAccessPermissionRuleBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAccessPermissionRule build() {
        DefaultAccessPermissionRule defaultAccessPermissionRule = Util.fillInstanceFromMap(new DefaultAccessPermissionRule(), this.map);
        return defaultAccessPermissionRule;
    }
}
