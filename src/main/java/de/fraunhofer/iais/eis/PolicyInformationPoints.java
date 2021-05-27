package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Policy Information Points" "Defines the security policy information points (PIP). Serves as the
 * retrieval source of attributes, or the data required for policy evaluation to provide the
 * information needed by the policy decision point to make the decisions."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyInformationPoints.class)
})
public interface PolicyInformationPoints extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "If externalInformationPoints True then at least one Endpoint to external available information
     * needs to be configured for the AAS."@en
     * 
     * @return Returns the List of Booleans for the property externalInformationPoints. More information
     *         under
     *         https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
    public List<Boolean> getExternalInformationPoints();

    /**
     * "If externalInformationPoints True then at least one Endpoint to external available information
     * needs to be configured for the AAS."@en
     * 
     * @param externalInformationPoints desired value for the property externalInformationPoints. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
     */
    public void setExternalInformationPoints(List<Boolean> externalInformationPoints);

    /**
     * "References to submodels defining information used by security access permission rules."@en
     * 
     * @return Returns the List of Submodels for the property internalInformationPoints. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
    public List<Submodel> getInternalInformationPoints();

    /**
     * "References to submodels defining information used by security access permission rules."@en
     * 
     * @param internalInformationPoints desired value for the property internalInformationPoints. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
     */
    public void setInternalInformationPoints(List<Submodel> internalInformationPoints);

}
