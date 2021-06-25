package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class SubmodelBuilder<T extends Submodel, B extends SubmodelBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for submodelElements
     * 
     * @param submodelElements desired value to be set
     * @return Builder object with new value for submodelElements
     */
    public B submodelElements(List<SubmodelElement> submodelElements) {
        getBuildingInstance().setSubmodelElements(submodelElements);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List submodelElements
     * 
     * @param submodelElement desired value to be added
     * @return Builder object with new value for submodelElements
     */
    public B submodelElement(SubmodelElement submodelElement) {
        getBuildingInstance().getSubmodelElements().add(submodelElement);
        return getSelf();
    }
}
