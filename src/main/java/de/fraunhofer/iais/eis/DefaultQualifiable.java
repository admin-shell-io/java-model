package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Qualifiable" "Additional qualification of a qualifiable element."@en "Constraint AASd-021: Every
 * qualifiable can only have one qualifier with the same Qualifier/type."@en
 */

public class DefaultQualifiable implements Qualifiable {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has qualifier" "Additional qualification of a qualifiable element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers;

    // no manual construction
    protected DefaultQualifiable() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.qualifiers});
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
            DefaultQualifiable other = (DefaultQualifiable) obj;
            return Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultQualifiable other = new DefaultQualifiable();
        other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    final public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    final public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }
}
