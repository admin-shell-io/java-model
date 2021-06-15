package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An annotated relationship element is an relationship element that can be annotated with
 * additional data elements.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAnnotatedRelationshipElement.class)
})
public interface AnnotatedRelationshipElement extends RelationshipElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * Annotations that hold for the relationships between the two elements.
     * 
     * @return Returns the List of References for the property annotations. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation")
    public List<Reference> getAnnotations();

    /**
     * Annotations that hold for the relationships between the two elements.
     * 
     * @param annotations desired value for the property annotations. More information under
     *        https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation
     */
    public void setAnnotations(List<Reference> annotations);

}
