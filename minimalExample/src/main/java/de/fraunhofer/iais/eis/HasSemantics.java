package de.fraunhofer.iais.eis;

/**
 * Element that can have a semantic definition. Identifier of the semantic
 * definition of the element. It is called semantic id of the element. The
 * semantic id may either reference an external global id or it may reference a
 * referable model element of kind=Type that defines the semantics of the
 * element. In many cases the idShort is identical to the English short name
 * within the semantic definition as referenced vi aits semantic id.
 */
public interface HasSemantics {

    /**
     * Points to the Expression Semantic of the Submodels The semantic id might
     * refer to an external information source, which explains the formulation
     * of the submodel (for example an PDF if a standard).
     *
     * @return Returns the Reference for the property semanticId.
     */
    public Reference getSemanticId();

    /**
     * Points to the Expression Semantic of the Submodels The semantic id might
     * refer to an external information source, which explains the formulation
     * of the submodel (for example an PDF if a standard).
     *
     * @param value the Reference for the property semanticId.
     */
    public void setSemanticId(Reference value);

}
