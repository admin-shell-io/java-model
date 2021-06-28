package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class EmbeddedDataSpecificationBuilder<T extends EmbeddedDataSpecification, B extends EmbeddedDataSpecificationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecifications(List<Reference> dataSpecifications) {
        getBuildingInstance().setDataSpecifications(dataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecifications
     * 
     * @param dataSpecification desired value to be added
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecification(Reference dataSpecification) {
        getBuildingInstance().getDataSpecifications().add(dataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecificationContents
     * 
     * @param dataSpecificationContents desired value to be set
     * @return Builder object with new value for dataSpecificationContents
     */
    public B dataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        getBuildingInstance().setDataSpecificationContents(dataSpecificationContents);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecificationContents
     * 
     * @param dataSpecificationContent desired value to be added
     * @return Builder object with new value for dataSpecificationContents
     */
    public B dataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        getBuildingInstance().getDataSpecificationContents().add(dataSpecificationContent);
        return getSelf();
    }
}
