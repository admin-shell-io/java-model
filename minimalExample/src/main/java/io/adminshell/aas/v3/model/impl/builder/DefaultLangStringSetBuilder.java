package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultLangStringSetBuilder extends AbstractBuilder<DefaultLangStringSet> {

    public DefaultLangStringSetBuilder() {
        super();
    }

    public DefaultLangStringSetBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for langStrings
     * 
     * @param langStrings desired value to be set
     * @return Builder object with new value for langStrings
     */
    public DefaultLangStringSetBuilder langStrings(List<LangString> langStrings) {
        this.map.put("langStrings", langStrings);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultLangStringSet build() {
        DefaultLangStringSet defaultLangStringSet = Util.fillInstanceFromMap(new DefaultLangStringSet(), this.map);
        return defaultLangStringSet;
    }
}
