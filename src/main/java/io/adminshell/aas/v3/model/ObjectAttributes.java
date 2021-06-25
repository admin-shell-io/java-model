package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A set of data elements that describe object attributes. These attributes need to refer to a data
 * element within an existing submodel.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultObjectAttributes.class)
})
public interface ObjectAttributes {

    /**
     * A data elements that further classifies an object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     *
     * @return Returns the List of References for the property objectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
    List<Reference> getObjectAttributes();

    /**
     * A data elements that further classifies an object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     *
     * @param objectAttributes desired value for the property objectAttributes.
     */
    void setObjectAttributes(List<Reference> objectAttributes);

}
