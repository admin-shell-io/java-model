package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultFormulaBuilder extends AbstractBuilder<DefaultFormula> {

    public DefaultFormulaBuilder() {
        super();
    }

    public DefaultFormulaBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for dependsOns
     * 
     * @param dependsOns desired value to be set
     * @return Builder object with new value for dependsOns
     */
    public DefaultFormulaBuilder dependsOns(List<Reference> dependsOns) {
        this.map.put("dependsOns", dependsOns);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultFormula build() {
        DefaultFormula defaultFormula = Util.fillInstanceFromMap(new DefaultFormula(), this.map);
        return defaultFormula;
    }
}
