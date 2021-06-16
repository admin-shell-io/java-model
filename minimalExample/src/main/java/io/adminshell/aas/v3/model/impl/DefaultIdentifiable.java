package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Identifiable
 * 
 * An element that has a globally unique identifier.
 */

public class DefaultIdentifiable implements Identifiable {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    protected List<AdministrativeInformation> administrations = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    protected List<Identifier> identifications = new ArrayList<>();

    public DefaultIdentifiable() {}

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
    public List<AdministrativeInformation> getAdministrations() {
        return administrations;
    }

    @Override
    public void setAdministrations(List<AdministrativeInformation> administrations) {
        this.administrations = administrations;
    }

    @Override
    public List<Identifier> getIdentifications() {
        return identifications;
    }

    @Override
    public void setIdentifications(List<Identifier> identifications) {
        this.identifications = identifications;
    }
}
