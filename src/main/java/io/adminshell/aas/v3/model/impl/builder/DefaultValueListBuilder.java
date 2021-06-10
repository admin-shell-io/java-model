package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultValueListBuilder<T extends ValueList, B extends DefaultValueListBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

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
