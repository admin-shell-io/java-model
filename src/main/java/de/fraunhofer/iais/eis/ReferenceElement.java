package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Reference Element" "A reference element is a data element that defines a logical reference to
 * another element within the same or another AAS or a reference to an external object or
 * entity."@en "Constraint AASd-054: The semanticId of a ReferenceElement shall only reference a
 * ConceptDescription with the category REFERENCE."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReferenceElement.class)
})
public interface ReferenceElement extends ModelClass, DataElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Reference to any other referable element of the same of any other AAS or a reference to an
     * external object or entity."@en
     * 
     * @return Returns the List of References for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value")
    public List<Reference> getValues();

    /**
     * "Reference to any other referable element of the same of any other AAS or a reference to an
     * external object or entity."@en
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value
     */
    public void setValues(List<Reference> values);

}
