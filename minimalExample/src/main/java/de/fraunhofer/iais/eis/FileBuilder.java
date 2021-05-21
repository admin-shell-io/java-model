package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class FileBuilder {

    private Map<String, Object> map;

    public FileBuilder() {
        this.map = new HashMap<>();
    }

    public FileBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for mimeTypes
     * 
     * @param mimeTypes desired value to be set
     * @return Builder object with new value for mimeTypes
     */
    public FileBuilder mimeTypes(List<String> mimeTypes) {
        this.map.put("mimeTypes", mimeTypes);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public FileBuilder values(List<String> values) {
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
    final public File build() throws ConstraintViolationException {
        DefaultFile defaultFile = Util.fillInstanceFromMap(new DefaultFile(), this.map);
        return defaultFile;
    }
}
