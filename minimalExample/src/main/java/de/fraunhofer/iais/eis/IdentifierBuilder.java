package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class IdentifierBuilder {

    private Map<String, Object> map;

    public IdentifierBuilder() {
        this.map = new HashMap<>();
    }

    public IdentifierBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for identifiers
     * 
     * @param identifiers desired value to be set
     * @return Builder object with new value for identifiers
     */
    public IdentifierBuilder identifiers(List<String> identifiers) {
        this.map.put("identifiers", identifiers);
        return this;
    }

    /**
     * This function allows setting a value for idTypes
     * 
     * @param idTypes desired value to be set
     * @return Builder object with new value for idTypes
     */
    public IdentifierBuilder idTypes(List<IdentifierType> idTypes) {
        this.map.put("idTypes", idTypes);
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
    final public Identifier build() throws ConstraintViolationException {
        DefaultIdentifier defaultIdentifier = Util.fillInstanceFromMap(new DefaultIdentifier(), this.map);
        return defaultIdentifier;
    }
}
