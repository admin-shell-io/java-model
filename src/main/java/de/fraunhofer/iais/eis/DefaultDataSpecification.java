package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Specification" "Data specification template of the description of the concept."@en
 */

public class DefaultDataSpecification implements DataSpecification {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "Data Specification Content" "DataSpecificationContent contains the additional attributes to be
     * added to the element instance that references the data specification template and meta
     * information about the template itself."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    protected DataSpecificationContent dataSpecificationContent;

    // no manual construction
    protected DefaultDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dataSpecificationContent});
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
            DefaultDataSpecification other = (DefaultDataSpecification) obj;
            return Objects.equals(this.dataSpecificationContent, other.dataSpecificationContent);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultDataSpecification other = new DefaultDataSpecification();
        other.dataSpecificationContent = (DataSpecificationContent) Util.clone(this.dataSpecificationContent);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    final public DataSpecificationContent getDataSpecificationContent() {
        return dataSpecificationContent;
    }

    final public void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        this.dataSpecificationContent = dataSpecificationContent;
    }
}
