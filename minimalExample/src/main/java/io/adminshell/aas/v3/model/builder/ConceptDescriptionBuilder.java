package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class ConceptDescriptionBuilder<T extends ConceptDescription, B extends ConceptDescriptionBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for isCaseOfs
     * 
     * @param isCaseOfs desired value to be set
     * @return Builder object with new value for isCaseOfs
     */
    public B isCaseOfs(List<Reference> isCaseOfs) {
        getBuildingInstance().setIsCaseOfs(isCaseOfs);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List isCaseOfs
     * 
     * @param isCaseOf desired value to be added
     * @return Builder object with new value for isCaseOfs
     */
    public B isCaseOf(Reference isCaseOf) {
        getBuildingInstance().getIsCaseOfs().add(isCaseOf);
        return getSelf();
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecification desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecification(DataSpecification embeddedDataSpecification) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecification);
        return getSelf();
    }
}
