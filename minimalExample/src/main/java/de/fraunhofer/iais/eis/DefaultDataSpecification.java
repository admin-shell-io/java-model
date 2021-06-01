package de.fraunhofer.iais.eis;

import java.util.ArrayList;
import java.util.List;
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
    protected List<DataSpecificationContent> dataSpecificationContents = new ArrayList<>();

    // no manual construction
    protected DefaultDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dataSpecificationContents});
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
            return Objects.equals(this.dataSpecificationContents, other.dataSpecificationContents);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultDataSpecification other = new DefaultDataSpecification();
        other.dataSpecificationContents = (List<DataSpecificationContent>) Util.clone(this.dataSpecificationContents);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    final public List<DataSpecificationContent> getDataSpecificationContents() {
        return dataSpecificationContents;
    }

    final public void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        this.dataSpecificationContents = dataSpecificationContents;
    }
}
