package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class ObjectAttributesBuilder {

    private Map<String, Object> map;

    public ObjectAttributesBuilder() {
        this.map = new HashMap<>();
    }

    public ObjectAttributesBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for objectAttributes
     * 
     * @param objectAttributes desired value to be set
     * @return Builder object with new value for objectAttributes
     */
    public ObjectAttributesBuilder objectAttributes(List<Reference> objectAttributes) {
        this.map.put("objectAttributes", objectAttributes);
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
    final public ObjectAttributes build() throws ConstraintViolationException {
        DefaultObjectAttributes defaultObjectAttributes = Util.fillInstanceFromMap(new DefaultObjectAttributes(), this.map);
        return defaultObjectAttributes;
    }
}
