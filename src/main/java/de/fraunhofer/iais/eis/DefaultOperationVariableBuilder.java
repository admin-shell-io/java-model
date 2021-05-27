package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultOperationVariableBuilder extends AbstractBuilder<DefaultOperationVariable> {

    public DefaultOperationVariableBuilder() {
        super();
    }

    public DefaultOperationVariableBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DefaultOperationVariableBuilder value(SubmodelElement value) {
        this.map.put("value", value);
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
