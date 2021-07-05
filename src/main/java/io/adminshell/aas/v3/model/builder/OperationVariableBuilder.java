

package io.adminshell.aas.v3.model.builder;





import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class OperationVariableBuilder<T extends OperationVariable, B extends OperationVariableBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public B value(SubmodelElement value) {
        getBuildingInstance().setValue(value);
        return getSelf();
    }
}
