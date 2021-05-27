package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Has Data Specification" "Element that can have be extended by using data specification
 * templates. A data specification template defines the additional attributes an element may or
 * shall have. The data specifications used are explicitly specified with their id."@en "Constraint
 * AASd-050: If the DataSpecificationContent DataSpecificationIEC61360 is used for an element then
 * the value of hasDataSpecification/dataSpecification shall contain the global reference to the IRI
 * of the corresponding data specification template
 * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0."@en
 */

public class DefaultHasDataSpecification implements HasDataSpecification {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has Data Specification" "Global reference to the data specification template used by the
     * element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications;

    // no manual construction
    protected DefaultHasDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dataSpecifications});
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
            DefaultHasDataSpecification other = (DefaultHasDataSpecification) obj;
            return Objects.equals(this.dataSpecifications, other.dataSpecifications);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultHasDataSpecification other = new DefaultHasDataSpecification();
        other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    final public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    final public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }
}
