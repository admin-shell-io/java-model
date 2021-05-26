package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultHasSemanticsBuilder extends AbstractBuilder<DefaultHasSemantics> {

    public DefaultHasSemanticsBuilder() {
        super();
    }

    public DefaultHasSemanticsBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultHasSemanticsBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultHasSemantics build() {
        DefaultHasSemantics defaultHasSemantics = Util.fillInstanceFromMap(new DefaultHasSemantics(), this.map);
        return defaultHasSemantics;
    }
}
