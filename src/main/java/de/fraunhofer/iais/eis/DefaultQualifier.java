package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Qualifier" "A qualifier is a type-value pair that makes additional statements w.r.t. the value
 * of the element."@en "Constraint AASd-063: The semanticId of a Qualifier shall only reference a
 * ConceptDescription with the category QUALIFIER."@en
 */

public class DefaultQualifier implements Qualifier {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected List<Reference> semanticIds;

    /**
     * "has qualifier type" "The qualifier type describes the type of the qualifier that is applied to
     * the element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    protected List<String> types;

    /**
     * "The qualifier value is the value of the qualifier."@en "Constraint AASd-006: if both, the value
     * and the valueId are present then the value needs to be identical to the short name of the
     * referenced coded value in qualifierValueId."@en "Constraint AASd-020: The value of
     * Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    protected List<String> values;

    /**
     * "Reference to the global unqiue id of a coded value."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    protected List<Reference> valueIds;

    /**
     * "Data type of the qualifier value."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    protected List<String> valueTypes;

    // no manual construction
    protected DefaultQualifier() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.types,
            this.valueTypes,
            this.values,
            this.valueIds,
            this.semanticIds});
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
            DefaultQualifier other = (DefaultQualifier) obj;
            return Objects.equals(this.types, other.types) &&
                Objects.equals(this.valueTypes, other.valueTypes) &&
                Objects.equals(this.values, other.values) &&
                Objects.equals(this.valueIds, other.valueIds) &&
                Objects.equals(this.semanticIds, other.semanticIds);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultQualifier other = new DefaultQualifier();
        other.types = (List<String>) Util.clone(this.types);
        other.valueTypes = (List<String>) Util.clone(this.valueTypes);
        other.values = (List<String>) Util.clone(this.values);
        other.valueIds = (List<Reference>) Util.clone(this.valueIds);
        other.semanticIds = (List<Reference>) Util.clone(this.semanticIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    final public List<String> getTypes() {
        return types;
    }

    final public void setTypes(List<String> types) {
        this.types = types;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    final public List<String> getValueTypes() {
        return valueTypes;
    }

    final public void setValueTypes(List<String> valueTypes) {
        this.valueTypes = valueTypes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    final public List<String> getValues() {
        return values;
    }

    final public void setValues(List<String> values) {
        this.values = values;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    final public List<Reference> getValueIds() {
        return valueIds;
    }

    final public void setValueIds(List<Reference> valueIds) {
        this.valueIds = valueIds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    final public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }
}
