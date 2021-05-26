package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultFileBuilder extends AbstractBuilder<DefaultFile> {

    public DefaultFileBuilder() {
        super();
    }

    public DefaultFileBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for mimeTypes
     * 
     * @param mimeTypes desired value to be set
     * @return Builder object with new value for mimeTypes
     */
    public DefaultFileBuilder mimeTypes(List<String> mimeTypes) {
        this.map.put("mimeTypes", mimeTypes);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultFileBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultFile build() {
        DefaultFile defaultFile = Util.fillInstanceFromMap(new DefaultFile(), this.map);
        return defaultFile;
    }
}
