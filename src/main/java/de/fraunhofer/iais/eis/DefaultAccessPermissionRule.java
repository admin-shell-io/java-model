package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Access Permission Rule" "Table that defines access permissions per authenticated subject for a
 * set of objects (referable elements)."@en
 */

public class DefaultAccessPermissionRule implements AccessPermissionRule {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has permissions per object" "Set of object-permission pairs that define the permissions per
     * object within the access permission rule."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
    protected List<PermissionsPerObject> permissionsPerObjects;

    /**
     * "has target subject attributes" "Target subject attributes that need to be fulfilled by the
     * accessing subject to get the permissions defined by this rule."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
    protected SubjectAttributes targetSubjectAttributes;

    /**
     * "has qualifier" "Additional qualification of a qualifiable element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers;

    /**
     * "has referable category" "The category is a value that gives further meta information w.r.t. to
     * the class of the element. It affects the expected existence of attributes and the applicability
     * of constraints."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected String category;

    /**
     * "has description" "Description or comments on the element. The description can be provided in
     * several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions;

    /**
     * "has display name" "Display name. Can be provided in several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames;

    /**
     * "has short id" "Identifying string of the element within its name space."@en "Constraint
     * AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small
     * letter. I.e. [a-z][a-zA-Z0-9_]+."@en "Constraint AASd-003: idShort shall be matched
     * case-insensitive."@en "Constraint AASd-022: idShort of non-identifiable referables shall be
     * unqiue in its namespace."@en "Note: In case the element is a property and the property has a
     * semantic definition (HasSemantics) the idShort is typically identical to the short name in
     * English. "@en "Note: In case of an identifiable element idShort is optional but recommended to be
     * defined. It can be used for unique reference in its name space and thus allows better usability
     * and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC
     * UA."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    // no manual construction
    protected DefaultAccessPermissionRule() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.permissionsPerObjects,
            this.targetSubjectAttributes,
            this.category,
            this.descriptions,
            this.displayNames,
            this.idShort,
            this.qualifiers});
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
            DefaultAccessPermissionRule other = (DefaultAccessPermissionRule) obj;
            return Objects.equals(this.permissionsPerObjects, other.permissionsPerObjects) &&
                Objects.equals(this.targetSubjectAttributes, other.targetSubjectAttributes) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultAccessPermissionRule other = new DefaultAccessPermissionRule();
        other.permissionsPerObjects = (List<PermissionsPerObject>) Util.clone(this.permissionsPerObjects);
        other.targetSubjectAttributes = (SubjectAttributes) Util.clone(this.targetSubjectAttributes);
        other.category = (String) Util.clone(this.category);
        other.descriptions = (List<LangString>) Util.clone(this.descriptions);
        other.displayNames = (List<LangString>) Util.clone(this.displayNames);
        other.idShort = (String) Util.clone(this.idShort);
        other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
    final public List<PermissionsPerObject> getPermissionsPerObjects() {
        return permissionsPerObjects;
    }

    final public void setPermissionsPerObjects(List<PermissionsPerObject> permissionsPerObjects) {
        this.permissionsPerObjects = permissionsPerObjects;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
    final public SubjectAttributes getTargetSubjectAttributes() {
        return targetSubjectAttributes;
    }

    final public void setTargetSubjectAttributes(SubjectAttributes targetSubjectAttributes) {
        this.targetSubjectAttributes = targetSubjectAttributes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public String getCategory() {
        return category;
    }

    final public void setCategory(String category) {
        this.category = category;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    final public List<LangString> getDescriptions() {
        return descriptions;
    }

    final public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    final public List<LangString> getDisplayNames() {
        return displayNames;
    }

    final public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    final public String getIdShort() {
        return idShort;
    }

    final public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    final public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    final public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }
}
