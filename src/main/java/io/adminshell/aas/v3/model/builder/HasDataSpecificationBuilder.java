

package io.adminshell.aas.v3.model.builder;

import java.util.List;




import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class HasDataSpecificationBuilder<T extends HasDataSpecification, B extends HasDataSpecificationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecification desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecification(EmbeddedDataSpecification embeddedDataSpecification) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecification);
        return getSelf();
    }
}
