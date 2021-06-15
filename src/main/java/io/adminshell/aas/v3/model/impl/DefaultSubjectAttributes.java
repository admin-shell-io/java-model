package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.SubjectAttributes
 * 
 * A set of data elements that further classifies a specific subject.
 */

public class DefaultSubjectAttributes implements SubjectAttributes {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * A data element that further classifies a specific subject. Constraint AASs-015: The data element
     * SubjectAttributes/subjectAttribute shall be part of the submodel that is referenced within the
     * 'selectableSubjectAttributes' attribute of 'AccessControl'.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
    protected List<DataElement> subjectAttributes = new ArrayList<>();

    public DefaultSubjectAttributes() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.subjectAttributes});
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
            DefaultSubjectAttributes other = (DefaultSubjectAttributes) obj;
            return Objects.equals(this.subjectAttributes, other.subjectAttributes);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
    final public List<DataElement> getSubjectAttributes() {
        return subjectAttributes;
    }

    final public void setSubjectAttributes(List<DataElement> subjectAttributes) {
        this.subjectAttributes = subjectAttributes;
    }

    public static class Builder extends SubjectAttributesBuilder<DefaultSubjectAttributes, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubjectAttributes newBuildingInstance() {
            return new DefaultSubjectAttributes();
        }
    }
}
