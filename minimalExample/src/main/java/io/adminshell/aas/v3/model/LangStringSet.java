package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A set of strings, each annotated by the language of the string. The meaning of the string in each
 * language shall be the same.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultLangStringSet.class)
})
public interface LangStringSet {

    /**
     * A string in a specified language.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString
     *
     * @return Returns the List of LangStrings for the property langStrings.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
    List<LangString> getLangStrings();

    /**
     * A string in a specified language.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString
     *
     * @param langStrings desired value for the property langStrings.
     */
    void setLangStrings(List<LangString> langStrings);

}
