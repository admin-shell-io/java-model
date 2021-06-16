package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Defines a security policy decision point (PDP).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyDecisionPoint.class)
})
public interface PolicyDecisionPoint {

    /**
     * If externalPolicyDecisionPoints True then Endpoints to external available decision points taking
     * into consideration for access control for the AAS need to be configured.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints
     *
     * @return Returns the boolean for the property externalPolicyDecisionPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    public boolean getExternalPolicyDecisionPoints();

    /**
     * If externalPolicyDecisionPoints True then Endpoints to external available decision points taking
     * into consideration for access control for the AAS need to be configured.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints
     *
     * @param externalPolicyDecisionPoints desired value for the property externalPolicyDecisionPoints.
     */
    public void setExternalPolicyDecisionPoints(boolean externalPolicyDecisionPoints);

}
