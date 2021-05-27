package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultQualifiableBuilder extends AbstractBuilder<DefaultQualifiable> {

    public DefaultQualifiableBuilder() {
        super();
    }

    public DefaultQualifiableBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultQualifiableBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultQualifiable build() {
        DefaultQualifiable defaultQualifiable = Util.fillInstanceFromMap(new DefaultQualifiable(), this.map);
        return defaultQualifiable;
    }
}
