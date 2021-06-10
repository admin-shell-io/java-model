package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Policy Decision Point" "Defines a security policy decision point (PDP). "@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyDecisionPoint.class)
})
public interface PolicyDecisionPoint {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "If externalPolicyDecisionPoints True then Endpoints to external available decision points taking
     * into consideration for access control for the AAS need to be configured."@en
     * 
     * @return Returns the boolean for the property externalPolicyDecisionPoints. More information under
     *         https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    public boolean getExternalPolicyDecisionPoints();

    /**
     * "If externalPolicyDecisionPoints True then Endpoints to external available decision points taking
     * into consideration for access control for the AAS need to be configured."@en
     * 
     * @param externalPolicyDecisionPoints desired value for the property externalPolicyDecisionPoints.
     *        More information under
     *        https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints
     */
    public void setExternalPolicyDecisionPoints(boolean externalPolicyDecisionPoints);

}
