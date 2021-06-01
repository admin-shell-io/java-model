package de.fraunhofer.iais.eis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Concept Description" "The semantics of a property or other elements that may have a semantic
 * description is defined by a concept description. The description of the concept should follow a
 * standardized schema (realized as data specification template)."@en "Constraint AASd-051: A
 * ConceptDescription shall have one of the following categories: VALUE, PROPERTY, REFERENCE,
 * DOCUMENT, CAPABILITY, RELATIONSHIP, COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS,
 * QUALIFIER, VIEW. Default: PROPERTY."@en
 */

public class DefaultConceptDescription implements ConceptDescription {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "embedded data speciification" "The embedded data specification template of the description of
     * the concept."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification")
    protected List<DataSpecification> embeddedDataSpecifications = new ArrayList<>();

    /**
     * "is case of" "Reference to an external definition the concept is compatible to or was derived
     * from."@en "Compare to is-case-of relationship in ISO 13584-32 and IEC EN 61360."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
    protected List<Reference> isCaseOfs = new ArrayList<>();

    // no manual construction
    protected DefaultConceptDescription() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.isCaseOfs,
            this.embeddedDataSpecifications});
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
            DefaultConceptDescription other = (DefaultConceptDescription) obj;
            return Objects.equals(this.isCaseOfs, other.isCaseOfs) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultConceptDescription other = new DefaultConceptDescription();
        other.isCaseOfs = (List<Reference>) Util.clone(this.isCaseOfs);
        other.embeddedDataSpecifications = (List<DataSpecification>) Util.clone(this.embeddedDataSpecifications);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
    final public List<Reference> getIsCaseOfs() {
        return isCaseOfs;
    }

    final public void setIsCaseOfs(List<Reference> isCaseOfs) {
        this.isCaseOfs = isCaseOfs;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification")
    final public List<DataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    final public void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }
}
