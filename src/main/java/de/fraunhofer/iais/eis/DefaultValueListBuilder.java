package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultValueListBuilder extends AbstractBuilder<DefaultValueList> {

    public DefaultValueListBuilder() {
        super();
    }

    public DefaultValueListBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for valueReferencePairTypes
     * 
     * @param valueReferencePairTypes desired value to be set
     * @return Builder object with new value for valueReferencePairTypes
     */
    public DefaultValueListBuilder valueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes) {
        this.map.put("valueReferencePairTypes", valueReferencePairTypes);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultValueList build() {
        DefaultValueList defaultValueList = Util.fillInstanceFromMap(new DefaultValueList(), this.map);
        return defaultValueList;
    }
}
