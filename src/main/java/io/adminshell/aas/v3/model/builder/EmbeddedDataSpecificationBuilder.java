package io.adminshell.aas.v3.model.builder;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class EmbeddedDataSpecificationBuilder<T extends EmbeddedDataSpecification, B extends EmbeddedDataSpecificationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dataSpecification
     * 
     * @param dataSpecification desired value to be set
     * @return Builder object with new value for dataSpecification
     */
    public B dataSpecification(Reference dataSpecification) {
        getBuildingInstance().setDataSpecification(dataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecificationContent
     * 
     * @param dataSpecificationContent desired value to be set
     * @return Builder object with new value for dataSpecificationContent
     */
    public B dataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        getBuildingInstance().setDataSpecificationContent(dataSpecificationContent);
        return getSelf();
    }
}
