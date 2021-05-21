package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class IdentifierKeyValuePairBuilder {

    private Map<String, Object> map;

    public IdentifierKeyValuePairBuilder() {
        this.map = new HashMap<>();
    }

    public IdentifierKeyValuePairBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for keys
     * 
     * @param keys desired value to be set
     * @return Builder object with new value for keys
     */
    public IdentifierKeyValuePairBuilder keys(List<String> keys) {
        this.map.put("keys", keys);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public IdentifierKeyValuePairBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public IdentifierKeyValuePairBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
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
    final public IdentifierKeyValuePair build() throws ConstraintViolationException {
        DefaultIdentifierKeyValuePair defaultIdentifierKeyValuePair =
            Util.fillInstanceFromMap(new DefaultIdentifierKeyValuePair(), this.map);
        return defaultIdentifierKeyValuePair;
    }
}
