package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class KeyBuilder<T extends Key, B extends KeyBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for idTypes
     * 
     * @param idTypes desired value to be set
     * @return Builder object with new value for idTypes
     */
    public B idTypes(List<KeyType> idTypes) {
        getBuildingInstance().setIdTypes(idTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List idTypes
     * 
     * @param idType desired value to be added
     * @return Builder object with new value for idTypes
     */
    public B idType(KeyType idType) {
        getBuildingInstance().getIdTypes().add(idType);
        return getSelf();
    }

    /**
     * This function allows setting a value for types
     * 
     * @param types desired value to be set
     * @return Builder object with new value for types
     */
    public B types(List<KeyElements> types) {
        getBuildingInstance().setTypes(types);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List types
     * 
     * @param type desired value to be added
     * @return Builder object with new value for types
     */
    public B type(KeyElements type) {
        getBuildingInstance().getTypes().add(type);
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
}
