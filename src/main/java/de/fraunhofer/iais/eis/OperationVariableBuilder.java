package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class OperationVariableBuilder {

    private Map<String, Object> map;

    public OperationVariableBuilder() {
        this.map = new HashMap<>();
    }

    public OperationVariableBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public OperationVariableBuilder value(SubmodelElement value) {
        this.map.put("value", value);
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
    final public OperationVariable build() throws ConstraintViolationException {
        DefaultOperationVariable defaultOperationVariable = Util.fillInstanceFromMap(new DefaultOperationVariable(), this.map);
        return defaultOperationVariable;
    }
}
