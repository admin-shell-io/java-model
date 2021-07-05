

package io.adminshell.aas.v3.model.builder;





import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class PolicyEnforcementPointsBuilder<T extends PolicyEnforcementPoints, B extends PolicyEnforcementPointsBuilder<T, B>>
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
