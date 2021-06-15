package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * A qualifier is a type-value pair that makes additional statements w.r.t. the value of the
 * element. Constraint AASd-063: The semanticId of a Qualifier shall only reference a
 * ConceptDescription with the category QUALIFIER.
 */

public class DefaultQualifier implements Qualifier {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Points to the Expression Semantic of the Submodels The semantic id might refer to an external
     * information source, which explains the formulation of the submodel (for example an PDF if a
     * standard).
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    /**
     * The qualifier type describes the type of the qualifier that is applied to the element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    protected String type;

    /**
     * The qualifier value is the value of the qualifier. Constraint AASd-006: if both, the value and
     * the valueId are present then the value needs to be identical to the short name of the referenced
     * coded value in qualifierValueId. Constraint AASd-020: The value of Qualifier/value shall be
     * consistent to the data type as defined in Qualifier/valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    protected String value;

    /**
     * Reference to the global unqiue id of a coded value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    protected Reference valueId;

    /**
     * Data type of the qualifier value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    protected String valueType;

    public DefaultQualifier() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.type,
            this.valueType,
            this.value,
            this.valueId,
            this.semanticId});
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
            return Objects.equals(this.type, other.type) &&
                Objects.equals(this.valueType, other.valueType) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueId, other.valueId) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    final public String getType() {
        return type;
    }

    final public void setType(String type) {
        this.type = type;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    final public String getValueType() {
        return valueType;
    }

    final public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    final public String getValue() {
        return value;
    }

    final public void setValue(String value) {
        this.value = value;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    final public Reference getValueId() {
        return valueId;
    }

    final public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public Reference getSemanticId() {
        return semanticId;
    }

    final public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    public static class Builder extends QualifierBuilder<DefaultQualifier, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultQualifier newBuildingInstance() {
            return new DefaultQualifier();
        }
    }
}
