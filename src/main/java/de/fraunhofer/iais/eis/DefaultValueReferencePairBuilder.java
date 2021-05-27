package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultValueReferencePairBuilder extends AbstractBuilder<DefaultValueReferencePair> {

    public DefaultValueReferencePairBuilder() {
        super();
    }

    public DefaultValueReferencePairBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultValueReferencePairBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for valueIds
     * 
     * @param valueIds desired value to be set
     * @return Builder object with new value for valueIds
     */
    public DefaultValueReferencePairBuilder valueIds(List<Reference> valueIds) {
        this.map.put("valueIds", valueIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultValueReferencePair build() {
        DefaultValueReferencePair defaultValueReferencePair = Util.fillInstanceFromMap(new DefaultValueReferencePair(), this.map);
        return defaultValueReferencePair;
    }
}
