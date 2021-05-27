package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultHasKindBuilder extends AbstractBuilder<DefaultHasKind> {

    public DefaultHasKindBuilder() {
        super();
    }

    public DefaultHasKindBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for kinds
     * 
     * @param kinds desired value to be set
     * @return Builder object with new value for kinds
     */
    public DefaultHasKindBuilder kinds(List<ModelingKind> kinds) {
        this.map.put("kinds", kinds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultHasKind build() {
        DefaultHasKind defaultHasKind = Util.fillInstanceFromMap(new DefaultHasKind(), this.map);
        return defaultHasKind;
    }
}
