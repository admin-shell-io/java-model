package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Element that can be extended by proprietary extensions.
 */
@KnownSubtypes({
})
public interface HasExtensions {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * An extension of the element.
     * 
     * @return Returns the List of Extensions for the property extensions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension")
    public List<Extension> getExtensions();

    /**
     * An extension of the element.
     * 
     * @param extensions desired value for the property extensions. More information under
     *        https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension
     */
    public void setExtensions(List<Extension> extensions);

}
