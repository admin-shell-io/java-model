package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Identifier" "Used to uniquely identify an entity by using an identifier."@en
 */

public class DefaultIdentifier implements Identifier {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has idType" "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are
     * defined in the enumeration \'IdentifierType\'."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    protected List<IdentifierType> idTypes;

    /**
     * "has identification" "A globally unique identifier which might not be a URI. Its type is defined
     * in idType."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    protected List<String> identifiers;

    // no manual construction
    protected DefaultIdentifier() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.identifiers,
            this.idTypes});
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
            DefaultIdentifier other = (DefaultIdentifier) obj;
            return Objects.equals(this.identifiers, other.identifiers) &&
                Objects.equals(this.idTypes, other.idTypes);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultIdentifier other = new DefaultIdentifier();
        other.identifiers = (List<String>) Util.clone(this.identifiers);
        other.idTypes = (List<IdentifierType>) Util.clone(this.idTypes);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    final public List<String> getIdentifiers() {
        return identifiers;
    }

    final public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    final public List<IdentifierType> getIdTypes() {
        return idTypes;
    }

    final public void setIdTypes(List<IdentifierType> idTypes) {
        this.idTypes = idTypes;
    }
}
