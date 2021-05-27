package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultKeyBuilder extends AbstractBuilder<DefaultKey> {

    public DefaultKeyBuilder() {
        super();
    }

    public DefaultKeyBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for idType
     * 
     * @param idType desired value to be set
     * @return Builder object with new value for idType
     */
    public DefaultKeyBuilder idType(KeyType idType) {
        this.map.put("idType", idType);
        return this;
    }

    /**
     * This function allows setting a value for type
     * 
     * @param type desired value to be set
     * @return Builder object with new value for type
     */
    public DefaultKeyBuilder type(KeyElements type) {
        this.map.put("type", type);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DefaultKeyBuilder value(String value) {
        this.map.put("value", value);
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
