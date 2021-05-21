package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class LangStringSetBuilder {

    private Map<String, Object> map;

    public LangStringSetBuilder() {
        this.map = new HashMap<>();
    }

    public LangStringSetBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for langStrings
     * 
     * @param langStrings desired value to be set
     * @return Builder object with new value for langStrings
     */
    public LangStringSetBuilder langStrings(List<LangString> langStrings) {
        this.map.put("langStrings", langStrings);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public LangStringSet build() throws ConstraintViolationException {
        DefaultLangStringSet defaultLangStringSet = Util.fillInstanceFromMap(new DefaultLangStringSet(), this.map);
        return defaultLangStringSet;
    }
}
