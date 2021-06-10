package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultPolicyEnforcementPointsBuilder<T extends PolicyEnforcementPoints, B extends DefaultPolicyEnforcementPointsBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for externalPolicyEnforcementPoint
     * 
     * @param externalPolicyEnforcementPoint desired value to be set
     * @return Builder object with new value for externalPolicyEnforcementPoint
     */
    public B externalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint) {
        getBuildingInstance().setExternalPolicyEnforcementPoint(externalPolicyEnforcementPoint);
        return getSelf();
    }
}
