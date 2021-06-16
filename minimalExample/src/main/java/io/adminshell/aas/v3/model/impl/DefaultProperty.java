package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Property
 * 
 * A property is a data element that has a single value. Constraint AASd-052a: If the semanticId of
 * a Property references a ConceptDescription then the ConceptDescription/category shall be one of
 * following values: VALUE, PROPERTY. Constraint AASd-065: If the semanticId of a Property or
 * MultiLanguageProperty references a ConceptDescription with the category VALUE then the value of
 * the property is identical to DataSpecificationIEC61360/value and the valueId of the property is
 * identical to DataSpecificationIEC61360/valueId. Constraint AASd-066: If the semanticId of a
 * Property or MultiLanguageProperty references a ConceptDescription with the category PROPERTY and
 * DataSpecificationIEC61360/valueList is defined the value and valueId of the property is identical
 * to one of the value reference pair types references in the value list, i.e.
 * ValueReferencePairType/value or ValueReferencePairType/valueId, resp.
 */

public class DefaultProperty implements Property {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/value")
    protected List<String> values = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
    protected List<Reference> valueIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueType")
    protected List<String> valueTypes = new ArrayList<>();

    public DefaultProperty() {}

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
    public List<String> getValueTypes() {
        return valueTypes;
    }

    @Override
    public void setValueTypes(List<String> valueTypes) {
        this.valueTypes = valueTypes;
    }

    @Override
    public List<String> getValues() {
        return values;
    }

    @Override
    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public List<Reference> getValueIds() {
        return valueIds;
    }

    @Override
    public void setValueIds(List<Reference> valueIds) {
        this.valueIds = valueIds;
    }
}
