package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Object Attributes" "A set of data elements that describe object attributes. These attributes
 * need to refer to a data element within an existing submodel."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultObjectAttributes.class)
})
public interface ObjectAttributes extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A data elements that further classifies an object."@en
     * 
     * @return Returns the List of References for the property objectAttributes. More information under
     *         https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
    public List<Reference> getObjectAttributes();

    /**
     * "A data elements that further classifies an object."@en
     * 
     * @param objectAttributes desired value for the property objectAttributes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     */
    public void setObjectAttributes(List<Reference> objectAttributes);

}
