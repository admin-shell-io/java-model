package io.adminshell.aas.v3.model.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DataSpecificationBuilder<T extends DataSpecification, B extends DataSpecificationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

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
