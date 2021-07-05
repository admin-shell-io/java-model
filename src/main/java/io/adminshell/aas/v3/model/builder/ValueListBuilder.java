

package io.adminshell.aas.v3.model.builder;

import java.util.List;




import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class ValueListBuilder<T extends ValueList, B extends ValueListBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for valueReferencePairTypes
     * 
     * @param valueReferencePairTypes desired value to be set
     * @return Builder object with new value for valueReferencePairTypes
     */
    public B valueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes) {
        getBuildingInstance().setValueReferencePairTypes(valueReferencePairTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List valueReferencePairTypes
     * 
     * @param valueReferencePairTypes desired value to be added
     * @return Builder object with new value for valueReferencePairTypes
     */
    public B valueReferencePairTypes(ValueReferencePair valueReferencePairTypes) {
        getBuildingInstance().getValueReferencePairTypes().add(valueReferencePairTypes);
        return getSelf();
    }
}