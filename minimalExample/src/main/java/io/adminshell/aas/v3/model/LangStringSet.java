package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Lang String Set" "A set of strings, each annotated by the language of the string. The meaning of
 * the string in each language shall be the same."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultLangStringSet.class)
})
public interface LangStringSet {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A string in a specified language."@en
     * 
     * @return Returns the List of LangStrings for the property langStrings. More information under
     *         https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
    public List<LangString> getLangStrings();

    /**
     * "A string in a specified language."@en
     * 
     * @param langStrings desired value for the property langStrings. More information under
     *        https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString
     */
    public void setLangStrings(List<LangString> langStrings);

}
