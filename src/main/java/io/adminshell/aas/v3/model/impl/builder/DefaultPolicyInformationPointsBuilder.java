package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultPolicyInformationPointsBuilder<T extends PolicyInformationPoints, B extends DefaultPolicyInformationPointsBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for externalInformationPoints
     * 
     * @param externalInformationPoints desired value to be set
     * @return Builder object with new value for externalInformationPoints
     */
    public B externalInformationPoints(boolean externalInformationPoints) {
        getBuildingInstance().setExternalInformationPoints(externalInformationPoints);
        return getSelf();
    }

    /**
     * This function allows setting a value for internalInformationPoints
     * 
     * @param internalInformationPoints desired value to be set
     * @return Builder object with new value for internalInformationPoints
     */
    public B internalInformationPoints(List<Submodel> internalInformationPoints) {
        getBuildingInstance().setInternalInformationPoints(internalInformationPoints);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List internalInformationPoints
     * 
     * @param internalInformationPoint desired value to be added
     * @return Builder object with new value for internalInformationPoints
     */
    public B internalInformationPoint(Submodel internalInformationPoint) {
        getBuildingInstance().getInternalInformationPoints().add(internalInformationPoint);
        return getSelf();
    }
}
