package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class DataTypeIEC61360Builder {

    private Map<String, Object> map;

    public DataTypeIEC61360Builder() {
        this.map = new HashMap<>();
    }

    public DataTypeIEC61360Builder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public DataTypeIEC61360 build() throws ConstraintViolationException {
        DefaultDataTypeIEC61360 defaultDataTypeIEC61360 = Util.fillInstanceFromMap(new DefaultDataTypeIEC61360(), this.map);
        return defaultDataTypeIEC61360;
    }
}
