package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
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
    protected List<IdentifierType> idTypes = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    protected List<String> identifiers = new ArrayList<>();

    public DefaultIdentifier() {}

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
    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public List<IdentifierType> getIdTypes() {
        return idTypes;
    }

    @Override
    public void setIdTypes(List<IdentifierType> idTypes) {
        this.idTypes = idTypes;
    }

    /**
     * This builder class can be used to construct a DefaultIdentifier bean.
     */
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
