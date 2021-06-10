package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultAccessControlPolicyPointsBuilder<T extends AccessControlPolicyPoints, B extends DefaultAccessControlPolicyPointsBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for policyAdministrationPoint
     * 
     * @param policyAdministrationPoint desired value to be set
     * @return Builder object with new value for policyAdministrationPoint
     */
    public B policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        getBuildingInstance().setPolicyAdministrationPoint(policyAdministrationPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyDecisionPoint
     * 
     * @param policyDecisionPoint desired value to be set
     * @return Builder object with new value for policyDecisionPoint
     */
    public B policyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
        getBuildingInstance().setPolicyDecisionPoint(policyDecisionPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyEnforcementPoint
     * 
     * @param policyEnforcementPoint desired value to be set
     * @return Builder object with new value for policyEnforcementPoint
     */
    public B policyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint) {
        getBuildingInstance().setPolicyEnforcementPoint(policyEnforcementPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyInformationPoints
     * 
     * @param policyInformationPoints desired value to be set
     * @return Builder object with new value for policyInformationPoints
     */
    public B policyInformationPoints(PolicyInformationPoints policyInformationPoints) {
        getBuildingInstance().setPolicyInformationPoints(policyInformationPoints);
        return getSelf();
    }
}
