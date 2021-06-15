package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of AdministrativeInformation
 * 
 * Every Identifiable may have administrative information. Administrative information includes for
 * example 1) Information about the version of the element 2) Information about who created or who
 * made the last change to the element 3) Information about the languages available in case the
 * element contains text, for translating purposed also themmaster or default language may be
 * definedIn the first version of the AAS metamodel only version information as defined by IEC 61360
 * is defined. In later versions additional attributes may be added.
 */

public class DefaultAdministrativeInformation implements AdministrativeInformation {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Revision of the element. Constraint AASd-005: A revision requires a version. This means, if there
     * is no version there is no revision neither.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
    protected List<String> revisions = new ArrayList<>();

    /**
     * Version of the element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
    protected List<String> versions = new ArrayList<>();

    public DefaultAdministrativeInformation() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.versions,
            this.revisions});
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
            DefaultAdministrativeInformation other = (DefaultAdministrativeInformation) obj;
            return Objects.equals(this.versions, other.versions) &&
                Objects.equals(this.revisions, other.revisions);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
    final public List<String> getVersions() {
        return versions;
    }

    final public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
    final public List<String> getRevisions() {
        return revisions;
    }

    final public void setRevisions(List<String> revisions) {
        this.revisions = revisions;
    }

    public static class Builder extends AdministrativeInformationBuilder<DefaultAdministrativeInformation, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAdministrativeInformation newBuildingInstance() {
            return new DefaultAdministrativeInformation();
        }
    }
}
