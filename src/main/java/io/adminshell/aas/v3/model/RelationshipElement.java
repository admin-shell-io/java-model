package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Relationship Element" "Constraint AASd-055: The semanticId of a RelationshipElement or a
 * AnnotatedRelationshipElement shall only reference a ConceptDescription with the category
 * RELATIONSHIP."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRelationshipElement.class),
    @KnownSubtypes.Type(value = AnnotatedRelationshipElement.class)
})
public interface RelationshipElement extends ModelClass, SubmodelElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "First element in the relationship taking the role of the subject."@en
     * 
     * @return Returns the Reference for the property first. More information under
     *         https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
    public Reference getFirst();

    /**
     * "First element in the relationship taking the role of the subject."@en
     * 
     * @param first desired value for the property first. More information under
     *        https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
     */
    public void setFirst(Reference first);

    /**
     * "Second element in the relationship taking the role of the object."@en
     * 
     * @return Returns the Reference for the property second. More information under
     *         https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
    public Reference getSecond();

    /**
     * "Second element in the relationship taking the role of the object."@en
     * 
     * @param second desired value for the property second. More information under
     *        https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
     */
    public void setSecond(Reference second);

}
