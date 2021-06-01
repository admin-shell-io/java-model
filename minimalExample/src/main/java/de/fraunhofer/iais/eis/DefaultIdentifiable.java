package de.fraunhofer.iais.eis;

import java.util.ArrayList;
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
    protected List<AdministrativeInformation> administrations = new ArrayList<>();

    /**
     * "has identification" "The globally unique identification of the element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    protected List<Identifier> identifications = new ArrayList<>();

    // no manual construction
    protected DefaultIdentifiable() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.administrations,
            this.identifications});
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
                Objects.equals(this.identifications, other.identifications);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultIdentifiable other = new DefaultIdentifiable();
        other.administrations = (List<AdministrativeInformation>) Util.clone(this.administrations);
        other.identifications = (List<Identifier>) Util.clone(this.identifications);
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
}
