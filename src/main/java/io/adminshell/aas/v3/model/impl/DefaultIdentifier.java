package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Identifier
 * 
 * Used to uniquely identify an entity by using an identifier.
 */

public class DefaultIdentifier implements Identifier {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    protected IdentifierType idType;

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

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public IdentifierType getIdType() {
        return idType;
    }

    @Override
    public void setIdType(IdentifierType idType) {
        this.idType = idType;
    }
}
