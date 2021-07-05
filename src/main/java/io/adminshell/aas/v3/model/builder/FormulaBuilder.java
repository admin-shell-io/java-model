

package io.adminshell.aas.v3.model.builder;

import java.util.List;




import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class FormulaBuilder<T extends Formula, B extends FormulaBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dependsOns
     * 
     * @param dependsOns desired value to be set
     * @return Builder object with new value for dependsOns
     */
    public B dependsOns(List<Reference> dependsOns) {
        getBuildingInstance().setDependsOns(dependsOns);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dependsOns
     * 
     * @param dependsOn desired value to be added
     * @return Builder object with new value for dependsOns
     */
    public B dependsOn(Reference dependsOn) {
        getBuildingInstance().getDependsOns().add(dependsOn);
        return getSelf();
    }

}
