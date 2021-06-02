package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultAccessControlPolicyPointsBuilder extends AbstractBuilder<DefaultAccessControlPolicyPoints> {

    public DefaultAccessControlPolicyPointsBuilder() {
        super();
    }

    public DefaultAccessControlPolicyPointsBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for policyAdministrationPoint
     * 
     * @param policyAdministrationPoint desired value to be set
     * @return Builder object with new value for policyAdministrationPoint
     */
    public DefaultAccessControlPolicyPointsBuilder policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        this.map.put("policyAdministrationPoint", policyAdministrationPoint);
        return this;
    }

    /**
     * This function allows setting a value for policyDecisionPoint
     * 
     * @param policyDecisionPoint desired value to be set
     * @return Builder object with new value for policyDecisionPoint
     */
    public DefaultAccessControlPolicyPointsBuilder policyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
        this.map.put("policyDecisionPoint", policyDecisionPoint);
        return this;
    }

    /**
     * This function allows setting a value for policyEnforcementPoint
     * 
     * @param policyEnforcementPoint desired value to be set
     * @return Builder object with new value for policyEnforcementPoint
     */
    public DefaultAccessControlPolicyPointsBuilder policyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint) {
        this.map.put("policyEnforcementPoint", policyEnforcementPoint);
        return this;
    }

    /**
     * This function allows setting a value for policyInformationPoints
     * 
     * @param policyInformationPoints desired value to be set
     * @return Builder object with new value for policyInformationPoints
     */
    public DefaultAccessControlPolicyPointsBuilder policyInformationPoints(PolicyInformationPoints policyInformationPoints) {
        this.map.put("policyInformationPoints", policyInformationPoints);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAccessControlPolicyPoints build() {
        DefaultAccessControlPolicyPoints defaultAccessControlPolicyPoints =
            Util.fillInstanceFromMap(new DefaultAccessControlPolicyPoints(), this.map);
        return defaultAccessControlPolicyPoints;
    }
}
