package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.LangStringSet
 * 
 * A set of strings, each annotated by the language of the string. The meaning of the string in each
 * language shall be the same.
 */

public class DefaultLangStringSet implements LangStringSet {

    @IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
    protected List<LangString> langStrings = new ArrayList<>();

    public DefaultLangStringSet() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.langStrings);
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
    public List<LangString> getLangStrings() {
        return langStrings;
    }

    @Override
    public void setLangStrings(List<LangString> langStrings) {
        this.langStrings = langStrings;
    }

    /**
     * This builder class can be used to construct a DefaultLangStringSet bean.
     */
    public static class Builder extends LangStringSetBuilder<DefaultLangStringSet, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultLangStringSet newBuildingInstance() {
            return new DefaultLangStringSet();
        }
    }
}
