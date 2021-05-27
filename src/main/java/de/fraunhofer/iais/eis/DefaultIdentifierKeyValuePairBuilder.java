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
     * This function allows setting a value for key
     * 
     * @param key desired value to be set
     * @return Builder object with new value for key
     */
    public DefaultIdentifierKeyValuePairBuilder key(String key) {
        this.map.put("key", key);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DefaultIdentifierKeyValuePairBuilder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for externalSubjectId
     * 
     * @param externalSubjectId desired value to be set
     * @return Builder object with new value for externalSubjectId
     */
    public DefaultIdentifierKeyValuePairBuilder externalSubjectId(Reference externalSubjectId) {
        this.map.put("externalSubjectId", externalSubjectId);
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
