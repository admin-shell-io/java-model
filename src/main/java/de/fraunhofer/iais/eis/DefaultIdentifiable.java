package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Identifiable" "An element that has a globally unique identifier."@en
 */

public class DefaultIdentifiable implements Identifiable {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has administration" "Administrative information of an identifiable element."@en "Some of the
     * administrative information like the version number might need to be part of the
     * identification."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    protected List<AdministrativeInformation> administrations;

    /**
     * "has identification" "The globally unique identification of the element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    protected List<Identifier> identifications;

    /**
     * "has referable category" "The category is a value that gives further meta information w.r.t. to
     * the class of the element. It affects the expected existence of attributes and the applicability
     * of constraints."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected List<String> categories;

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
    protected List<String> idShorts;

    // no manual construction
    protected DefaultIdentifiable() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.administrations,
            this.identifications,
            this.categories,
            this.descriptions,
            this.displayNames,
            this.idShorts});
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
            DefaultIdentifiable other = (DefaultIdentifiable) obj;
            return Objects.equals(this.administrations, other.administrations) &&
                Objects.equals(this.identifications, other.identifications) &&
                Objects.equals(this.categories, other.categories) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShorts, other.idShorts);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultIdentifiable other = new DefaultIdentifiable();
        other.administrations = (List<AdministrativeInformation>) Util.clone(this.administrations);
        other.identifications = (List<Identifier>) Util.clone(this.identifications);
        other.categories = (List<String>) Util.clone(this.categories);
        other.descriptions = (List<LangString>) Util.clone(this.descriptions);
        other.displayNames = (List<LangString>) Util.clone(this.displayNames);
        other.idShorts = (List<String>) Util.clone(this.idShorts);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    final public List<AdministrativeInformation> getAdministrations() {
        return administrations;
    }

    final public void setAdministrations(List<AdministrativeInformation> administrations) {
        this.administrations = administrations;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    final public List<Identifier> getIdentifications() {
        return identifications;
    }

    final public void setIdentifications(List<Identifier> identifications) {
        this.identifications = identifications;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public List<String> getCategories() {
        return categories;
    }

    final public void setCategories(List<String> categories) {
        this.categories = categories;
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
    final public List<String> getIdShorts() {
        return idShorts;
    }

    final public void setIdShorts(List<String> idShorts) {
        this.idShorts = idShorts;
    }
}
