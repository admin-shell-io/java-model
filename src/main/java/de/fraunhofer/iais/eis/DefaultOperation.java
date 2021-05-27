package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Operation" "An operation is a submodel element with input and output variables."@en "Constraint
 * AASd-060: The semanticId of a Operation submodel element shall only reference a
 * ConceptDescription with the category FUNCTION."@en
 */

public class DefaultOperation implements Operation {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has Data Specification" "Global reference to the data specification template used by the
     * element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications;

    /**
     * "has kind" "ModelingKind of the element: either type or instance."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected ModelingKind kind;

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    /**
     * "has input/output variable" "Parameter that is input and output of the operation."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable")
    protected List<OperationVariable> inoutputVariables;

    /**
     * "has input variable" "Input parameter of the operation."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable")
    protected List<OperationVariable> inputVariables;

    /**
     * "has output variable" "Output parameter of the operation."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable")
    protected List<OperationVariable> outputVariables;

    /**
     * "has qualifier" "Additional qualification of a qualifiable element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers;

    /**
     * "has referable category" "The category is a value that gives further meta information w.r.t. to
     * the class of the element. It affects the expected existence of attributes and the applicability
     * of constraints."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected String category;

    /**
     * "has description" "Description or comments on the element. The description can be provided in
     * several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions;

    /**
     * "has display name" "Display name. Can be provided in several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames;

    /**
     * "has short id" "Identifying string of the element within its name space."@en "Constraint
     * AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small
     * letter. I.e. [a-z][a-zA-Z0-9_]+."@en "Constraint AASd-003: idShort shall be matched
     * case-insensitive."@en "Constraint AASd-022: idShort of non-identifiable referables shall be
     * unqiue in its namespace."@en "Note: In case the element is a property and the property has a
     * semantic definition (HasSemantics) the idShort is typically identical to the short name in
     * English. "@en "Note: In case of an identifiable element idShort is optional but recommended to be
     * defined. It can be used for unique reference in its name space and thus allows better usability
     * and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC
     * UA."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    // no manual construction
    protected DefaultOperation() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.inputVariables,
            this.inoutputVariables,
            this.outputVariables,
            this.category,
            this.descriptions,
            this.displayNames,
            this.idShort,
            this.qualifiers,
            this.dataSpecifications,
            this.kind,
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
            DefaultOperation other = (DefaultOperation) obj;
            return Objects.equals(this.inputVariables, other.inputVariables) &&
                Objects.equals(this.inoutputVariables, other.inoutputVariables) &&
                Objects.equals(this.outputVariables, other.outputVariables) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultOperation other = new DefaultOperation();
        other.inputVariables = (List<OperationVariable>) Util.clone(this.inputVariables);
        other.inoutputVariables = (List<OperationVariable>) Util.clone(this.inoutputVariables);
        other.outputVariables = (List<OperationVariable>) Util.clone(this.outputVariables);
        other.category = (String) Util.clone(this.category);
        other.descriptions = (List<LangString>) Util.clone(this.descriptions);
        other.displayNames = (List<LangString>) Util.clone(this.displayNames);
        other.idShort = (String) Util.clone(this.idShort);
        other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
        other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
        other.kind = (ModelingKind) Util.clone(this.kind);
        other.semanticId = (Reference) Util.clone(this.semanticId);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable")
    final public List<OperationVariable> getInputVariables() {
        return inputVariables;
    }

    final public void setInputVariables(List<OperationVariable> inputVariables) {
        this.inputVariables = inputVariables;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable")
    final public List<OperationVariable> getInoutputVariables() {
        return inoutputVariables;
    }

    final public void setInoutputVariables(List<OperationVariable> inoutputVariables) {
        this.inoutputVariables = inoutputVariables;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable")
    final public List<OperationVariable> getOutputVariables() {
        return outputVariables;
    }

    final public void setOutputVariables(List<OperationVariable> outputVariables) {
        this.outputVariables = outputVariables;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public String getCategory() {
        return category;
    }

    final public void setCategory(String category) {
        this.category = category;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    final public List<LangString> getDescriptions() {
        return descriptions;
    }

    final public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    final public List<LangString> getDisplayNames() {
        return displayNames;
    }

    final public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    final public String getIdShort() {
        return idShort;
    }

    final public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    final public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    final public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    final public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    final public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    final public ModelingKind getKind() {
        return kind;
    }

    final public void setKind(ModelingKind kind) {
        this.kind = kind;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public Reference getSemanticId() {
        return semanticId;
    }

    final public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }
}
