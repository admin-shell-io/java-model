package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "View" "A view is a collection of referable elements w.r.t. to a specific viewpoint of one or
 * more stakeholders."@en "Constraint AASd-064: If the semanticId of a View references a
 * ConceptDescription then the category of the ConceptDescription shall be VIEW."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultView.class)
})
public interface View extends ModelClass, Referable, HasDataSpecification, HasSemantics {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Referable elements that are contained in the view."@en
     * 
     * @return Returns the List of Referables for the property containedElements. More information under
     *         https://admin-shell.io/aas/3/0/RC01/View/containedElement
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/View/containedElement")
    public List<Referable> getContainedElements();

    /**
     * "Referable elements that are contained in the view."@en
     * 
     * @param containedElements desired value for the property containedElements. More information under
     *        https://admin-shell.io/aas/3/0/RC01/View/containedElement
     */
    public void setContainedElements(List<Referable> containedElements);

}
