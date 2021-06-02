package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Lang String Set" "A set of strings, each annotated by the language of the string. The meaning of
 * the string in each language shall be the same."@en
 */

public class DefaultLangStringSet implements LangStringSet {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "Lang String" "A string in a specified language."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
    protected List<LangString> langStrings = new ArrayList<>();

    public DefaultLangStringSet() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.langStrings});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultLangStringSet other = (DefaultLangStringSet) obj;
            return Objects.equals(this.langStrings, other.langStrings);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultLangStringSet other = new DefaultLangStringSet();
        other.langStrings = (List<LangString>) Util.clone(this.langStrings);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
    final public List<LangString> getLangStrings() {
        return langStrings;
    }

    final public void setLangStrings(List<LangString> langStrings) {
        this.langStrings = langStrings;
    }
}
