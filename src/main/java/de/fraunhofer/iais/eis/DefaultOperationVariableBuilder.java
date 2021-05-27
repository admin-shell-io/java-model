package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultOperationVariableBuilder extends AbstractBuilder<DefaultOperationVariable> {

    public DefaultOperationVariableBuilder() {
        super();
    }

    public DefaultOperationVariableBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultOperationVariableBuilder values(List<SubmodelElement> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultOperationVariable build() {
        DefaultOperationVariable defaultOperationVariable = Util.fillInstanceFromMap(new DefaultOperationVariable(), this.map);
        return defaultOperationVariable;
    }
}
