package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A reference element is a data element that defines a logical reference to another element within
 * the same or another AAS or a reference to an external object or entity. Constraint AASd-054: The
 * semanticId of a ReferenceElement shall only reference a ConceptDescription with the category
 * REFERENCE.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReferenceElement.class)
})
public interface ReferenceElement extends DataElement {

    /**
     * Reference to any other referable element of the same of any other AAS or a reference to an
     * external object or entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value
     *
     * @return Returns the Reference for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value")
    Reference getValue();

    /**
     * Reference to any other referable element of the same of any other AAS or a reference to an
     * external object or entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value
     *
     * @param value desired value for the property value.
     */
    void setValue(Reference value);

}
