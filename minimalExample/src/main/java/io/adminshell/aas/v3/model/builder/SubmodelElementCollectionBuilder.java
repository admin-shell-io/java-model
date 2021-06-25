package io.adminshell.aas.v3.model.builder;

import java.util.Collection;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class SubmodelElementCollectionBuilder<T extends SubmodelElementCollection, B extends SubmodelElementCollectionBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for allowDuplicates
     * 
     * @param allowDuplicates desired value to be set
     * @return Builder object with new value for allowDuplicates
     */
    public B allowDuplicates(List<Boolean> allowDuplicates) {
        getBuildingInstance().setAllowDuplicates(allowDuplicates);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List allowDuplicates
     * 
     * @param allowDuplicates desired value to be added
     * @return Builder object with new value for allowDuplicates
     */
    public B allowDuplicates(boolean allowDuplicates) {
        getBuildingInstance().getAllowDuplicates().add(allowDuplicates);
        return getSelf();
    }

    /**
     * This function allows setting a value for ordereds
     * 
     * @param ordereds desired value to be set
     * @return Builder object with new value for ordereds
     */
    public B ordereds(List<Boolean> ordereds) {
        getBuildingInstance().setOrdereds(ordereds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List ordereds
     * 
     * @param ordered desired value to be added
     * @return Builder object with new value for ordereds
     */
    public B ordered(boolean ordered) {
        getBuildingInstance().getOrdereds().add(ordered);
        return getSelf();
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public B values(Collection<SubmodelElement> values) {
        getBuildingInstance().setValues(values);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List values
     * 
     * @param value desired value to be added
     * @return Builder object with new value for values
     */
    public B value(SubmodelElement value) {
        getBuildingInstance().getValues().add(value);
        return getSelf();
    }

}
