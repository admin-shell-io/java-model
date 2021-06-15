package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A view is a collection of referable elements w.r.t. to a specific viewpoint of one or more
 * stakeholders. Constraint AASd-064: If the semanticId of a View references a ConceptDescription
 * then the category of the ConceptDescription shall be VIEW.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultView.class)
})
public interface View extends Referable, HasDataSpecification, HasSemantics {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * Referable elements that are contained in the view.
     * 
     * @return Returns the List of References for the property containedElements. More information under
     *         https://admin-shell.io/aas/3/0/RC01/View/containedElement
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/View/containedElement")
    public List<Reference> getContainedElements();

    /**
     * Referable elements that are contained in the view.
     * 
     * @param containedElements desired value for the property containedElements. More information under
     *        https://admin-shell.io/aas/3/0/RC01/View/containedElement
     */
    public void setContainedElements(List<Reference> containedElements);

}
