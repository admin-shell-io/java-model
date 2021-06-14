package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class PropertyBuilder<T extends Property, B extends PropertyBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for valueTypes
     * 
     * @param valueTypes desired value to be set
     * @return Builder object with new value for valueTypes
     */
    public B valueTypes(List<String> valueTypes) {
        getBuildingInstance().setValueTypes(valueTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List valueTypes
     * 
     * @param valueType desired value to be added
     * @return Builder object with new value for valueTypes
     */
    public B valueType(String valueType) {
        getBuildingInstance().getValueTypes().add(valueType);
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
     * This function allows setting a value for valueIds
     * 
     * @param valueIds desired value to be set
     * @return Builder object with new value for valueIds
     */
    public B valueIds(List<Reference> valueIds) {
        getBuildingInstance().setValueIds(valueIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List valueIds
     * 
     * @param valueId desired value to be added
     * @return Builder object with new value for valueIds
     */
    public B valueId(Reference valueId) {
        getBuildingInstance().getValueIds().add(valueId);
        return getSelf();
    }
}
