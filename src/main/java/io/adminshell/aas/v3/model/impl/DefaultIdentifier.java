package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Used to uniquely identify an entity by using an identifier.
 */

public class DefaultIdentifier implements Identifier {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the
     * enumeration 'IdentifierType'.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    protected IdentifierType idType;

    /**
     * A globally unique identifier which might not be a URI. Its type is defined in idType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    protected String identifier;

    public DefaultIdentifier() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.identifier,
            this.idType});
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
            return Objects.equals(this.identifier, other.identifier) &&
                Objects.equals(this.idType, other.idType);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    final public String getIdentifier() {
        return identifier;
    }

    final public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    final public IdentifierType getIdType() {
        return idType;
    }

    final public void setIdType(IdentifierType idType) {
        this.idType = idType;
    }

    public static class Builder extends IdentifierBuilder<DefaultIdentifier, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultIdentifier newBuildingInstance() {
            return new DefaultIdentifier();
        }
    }
}
