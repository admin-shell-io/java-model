package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class IdentifierKeyValuePairBuilder<T extends IdentifierKeyValuePair, B extends IdentifierKeyValuePairBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for keys
     * 
     * @param keys desired value to be set
     * @return Builder object with new value for keys
     */
    public B keys(List<String> keys) {
        getBuildingInstance().setKeys(keys);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List keys
     * 
     * @param key desired value to be added
     * @return Builder object with new value for keys
     */
    public B key(String key) {
        getBuildingInstance().getKeys().add(key);
        return getSelf();
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public B values(List<String> values) {
        getBuildingInstance().setValues(values);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List values
     * 
     * @param value desired value to be added
     * @return Builder object with new value for values
     */
    public B value(String value) {
        getBuildingInstance().getValues().add(value);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public B semanticIds(List<Reference> semanticIds) {
        getBuildingInstance().setSemanticIds(semanticIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List semanticIds
     * 
     * @param semanticId desired value to be added
     * @return Builder object with new value for semanticIds
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().getSemanticIds().add(semanticId);
        return getSelf();
    }
}
