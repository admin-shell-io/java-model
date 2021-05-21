package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class KeyBuilder {

    private Map<String, Object> map;

    public KeyBuilder() {
        this.map = new HashMap<>();
    }

    public KeyBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for idTypes
     * 
     * @param idTypes desired value to be set
     * @return Builder object with new value for idTypes
     */
    public KeyBuilder idTypes(List<KeyType> idTypes) {
        this.map.put("idTypes", idTypes);
        return this;
    }

    /**
     * This function allows setting a value for types
     * 
     * @param types desired value to be set
     * @return Builder object with new value for types
     */
    public KeyBuilder types(List<KeyElements> types) {
        this.map.put("types", types);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public KeyBuilder values(List<String> values) {
        this.map.put("values", values);
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
    final public Key build() throws ConstraintViolationException {
        DefaultKey defaultKey = Util.fillInstanceFromMap(new DefaultKey(), this.map);
        return defaultKey;
    }
}
