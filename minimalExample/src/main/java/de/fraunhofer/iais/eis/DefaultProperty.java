package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Property" "A property is a data element that has a single value."@en "Constraint AASd-052a: If
 * the semanticId of a Property references a ConceptDescription then the ConceptDescription/category
 * shall be one of following values: VALUE, PROPERTY."@en "Constraint AASd-065: If the semanticId of
 * a Property or MultiLanguageProperty references a ConceptDescription with the category VALUE then
 * the value of the property is identical to DataSpecificationIEC61360/value and the valueId of the
 * property is identical to DataSpecificationIEC61360/valueId."@en "Constraint AASd-066: If the
 * semanticId of a Property or MultiLanguageProperty references a ConceptDescription with the
 * category PROPERTY and DataSpecificationIEC61360/valueList is defined the value and valueId of the
 * property is identical to one of the value reference pair types references in the value list, i.e.
 * ValueReferencePairType/value or ValueReferencePairType/valueId, resp."@en
 */

public class DefaultProperty implements Property {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has property value" "The value of the property instance."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/value")
    protected List<String> values;

    /**
     * "has property value id" "Reference to the global unique id of a coded value."@en "Constraint
     * AASd-007: if both, the value and the valueId are present then the value needs to be identical to
     * the value of the referenced coded value in valueId."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
    protected List<Reference> valueIds;

    /**
     * "has property value type" "Data type pf the value."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueType")
    protected List<String> valueTypes;

    // no manual construction
    protected DefaultProperty() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.valueTypes,
            this.values,
            this.valueIds});
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
            DefaultProperty other = (DefaultProperty) obj;
            return Objects.equals(this.valueTypes, other.valueTypes) &&
                Objects.equals(this.values, other.values) &&
                Objects.equals(this.valueIds, other.valueIds);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultProperty other = new DefaultProperty();
        other.valueTypes = (List<String>) Util.clone(this.valueTypes);
        other.values = (List<String>) Util.clone(this.values);
        other.valueIds = (List<Reference>) Util.clone(this.valueIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueType")
    final public List<String> getValueTypes() {
        return valueTypes;
    }

    final public void setValueTypes(List<String> valueTypes) {
        this.valueTypes = valueTypes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/value")
    final public List<String> getValues() {
        return values;
    }

    final public void setValues(List<String> values) {
        this.values = values;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
    final public List<Reference> getValueIds() {
        return valueIds;
    }

    final public void setValueIds(List<Reference> valueIds) {
        this.valueIds = valueIds;
    }
}
