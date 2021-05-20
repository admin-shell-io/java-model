package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "HasExtensions" "Element that can be extended by proprietary extensions."@en
 */
@KnownSubtypes({
})
public interface HasExtensions extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "An extension of the element."@en
     * 
     * @return Returns the List of Extensions for the property extensions. More information under
     *         https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension")
    public List<Extension> getExtensions();

}
