package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class ExtensionBuilder {

    private Map<String, Object> map;

    public ExtensionBuilder() {
        this.map = new HashMap<>();
    }

    public ExtensionBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for name
     * 
     * @param name desired value to be set
     * @return Builder object with new value for name
     */
    public ExtensionBuilder name(String name) {
        this.map.put("name", name);
        return this;
    }

    /**
     * This function allows setting a value for valueType
     * 
     * @param valueType desired value to be set
     * @return Builder object with new value for valueType
     */
    public ExtensionBuilder valueType(String valueType) {
        this.map.put("valueType", valueType);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public ExtensionBuilder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for refersTo
     * 
     * @param refersTo desired value to be set
     * @return Builder object with new value for refersTo
     */
    public ExtensionBuilder refersTo(Reference refersTo) {
        this.map.put("refersTo", refersTo);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public ExtensionBuilder semanticId(Reference semanticId) {
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
    final public Extension build() throws ConstraintViolationException {
        DefaultExtension defaultExtension = Util.fillInstanceFromMap(new DefaultExtension(), this.map);
        return defaultExtension;
    }
}
