package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultKeyBuilder extends AbstractBuilder<DefaultKey> {

    public DefaultKeyBuilder() {
        super();
    }

    public DefaultKeyBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for idTypes
     * 
     * @param idTypes desired value to be set
     * @return Builder object with new value for idTypes
     */
    public DefaultKeyBuilder idTypes(List<KeyType> idTypes) {
        this.map.put("idTypes", idTypes);
        return this;
    }

    /**
     * This function allows setting a value for types
     * 
     * @param types desired value to be set
     * @return Builder object with new value for types
     */
    public DefaultKeyBuilder types(List<KeyElements> types) {
        this.map.put("types", types);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultKeyBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultKey build() {
        DefaultKey defaultKey = Util.fillInstanceFromMap(new DefaultKey(), this.map);
        return defaultKey;
    }
}
