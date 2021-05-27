package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Extensions" "Single extension of an element."@en "Constraint AASd-077: The name of an extension
 * within HasExtensions needs to be unique."@en
 */

public class DefaultExtension implements Extension {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has extension name" "An extension of the element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    protected List<String> names;

    /**
     * "has extension reference to" "Reference to an element the extension refers to."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    protected List<Reference> refersTos;

    /**
     * "has extension value" "Value of the extension."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    protected List<String> values;

    /**
     * "has extension value type" "Type of the value of the extension."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    protected List<String> valueTypes;

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected List<Reference> semanticIds;

    // no manual construction
    protected DefaultExtension() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.names,
            this.valueTypes,
            this.values,
            this.refersTos,
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
            DefaultExtension other = (DefaultExtension) obj;
            return Objects.equals(this.names, other.names) &&
                Objects.equals(this.valueTypes, other.valueTypes) &&
                Objects.equals(this.values, other.values) &&
                Objects.equals(this.refersTos, other.refersTos) &&
                Objects.equals(this.semanticIds, other.semanticIds);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultExtension other = new DefaultExtension();
        other.names = (List<String>) Util.clone(this.names);
        other.valueTypes = (List<String>) Util.clone(this.valueTypes);
        other.values = (List<String>) Util.clone(this.values);
        other.refersTos = (List<Reference>) Util.clone(this.refersTos);
        other.semanticIds = (List<Reference>) Util.clone(this.semanticIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    final public List<String> getNames() {
        return names;
    }

    final public void setNames(List<String> names) {
        this.names = names;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    final public List<String> getValueTypes() {
        return valueTypes;
    }

    final public void setValueTypes(List<String> valueTypes) {
        this.valueTypes = valueTypes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    final public List<String> getValues() {
        return values;
    }

    final public void setValues(List<String> values) {
        this.values = values;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    final public List<Reference> getRefersTos() {
        return refersTos;
    }

    final public void setRefersTos(List<Reference> refersTos) {
        this.refersTos = refersTos;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    final public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }
}
