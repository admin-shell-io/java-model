package de.fraunhofer.iais.eis;

import java.util.HashMap;
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
     * This function allows setting a value for key
     * 
     * @param key desired value to be set
     * @return Builder object with new value for key
     */
    public IdentifierKeyValuePairBuilder key(String key) {
        this.map.put("key", key);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public IdentifierKeyValuePairBuilder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for externalSubjectId
     * 
     * @param externalSubjectId desired value to be set
     * @return Builder object with new value for externalSubjectId
     */
    public IdentifierKeyValuePairBuilder externalSubjectId(Reference externalSubjectId) {
        this.map.put("externalSubjectId", externalSubjectId);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public IdentifierKeyValuePairBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
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
