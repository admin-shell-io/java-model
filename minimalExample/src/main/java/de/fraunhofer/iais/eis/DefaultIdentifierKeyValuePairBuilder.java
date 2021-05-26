package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultIdentifierKeyValuePairBuilder extends AbstractBuilder<DefaultIdentifierKeyValuePair> {

    public DefaultIdentifierKeyValuePairBuilder() {
        super();
    }

    public DefaultIdentifierKeyValuePairBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for keys
     * 
     * @param keys desired value to be set
     * @return Builder object with new value for keys
     */
    public DefaultIdentifierKeyValuePairBuilder keys(List<String> keys) {
        this.map.put("keys", keys);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultIdentifierKeyValuePairBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultIdentifierKeyValuePairBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultIdentifierKeyValuePair build() {
        DefaultIdentifierKeyValuePair defaultIdentifierKeyValuePair =
            Util.fillInstanceFromMap(new DefaultIdentifierKeyValuePair(), this.map);
        return defaultIdentifierKeyValuePair;
    }
}
