package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.List;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A view is a collection of referable elements w.r.t. to a specific viewpoint
 * of one or more stakeholders. Constraint AASd-064: If the semanticId of a View
 * references a ConceptDescription then the category of the ConceptDescription
 * shall be VIEW.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultView.class)
})
public interface View extends Referable, HasDataSpecification, HasSemantics {

    /**
     * Referable elements that are contained in the view.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/View/containedElement
     *
     * @return Returns the List of References for the property
     * containedElements.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/View/containedElement")
    List<Reference> getContainedElements();

    /**
     * Referable elements that are contained in the view.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/View/containedElement
     *
     * @param containedElements desired value for the property
     * containedElements.
     */
    void setContainedElements(List<Reference> containedElements);

}
