package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class LangStringSetBuilder<T extends LangStringSet, B extends LangStringSetBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for langStrings
     * 
     * @param langStrings desired value to be set
     * @return Builder object with new value for langStrings
     */
    public B langStrings(List<LangString> langStrings) {
        getBuildingInstance().setLangStrings(langStrings);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List langStrings
     * 
     * @param langString desired value to be added
     * @return Builder object with new value for langStrings
     */
    public B langString(LangString langString) {
        getBuildingInstance().getLangStrings().add(langString);
        return getSelf();
    }
}
