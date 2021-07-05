package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Constraint AASd-055: The semanticId of a RelationshipElement or a
 * AnnotatedRelationshipElement shall only reference a ConceptDescription with
 * the category RELATIONSHIP.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRelationshipElement.class),
    @KnownSubtypes.Type(value = AnnotatedRelationshipElement.class)
})
public interface RelationshipElement extends SubmodelElement {

    /**
     * First element in the relationship taking the role of the subject.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
     *
     * @return Returns the Reference for the property first.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
    Reference getFirst();

    /**
     * First element in the relationship taking the role of the subject.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
     *
     * @param first desired value for the property first.
     */
    void setFirst(Reference first);

    /**
     * Second element in the relationship taking the role of the object.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
     *
     * @return Returns the Reference for the property second.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
    Reference getSecond();

    /**
     * Second element in the relationship taking the role of the object.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
     *
     * @param second desired value for the property second.
     */
    void setSecond(Reference second);

}
