package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.List;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Defines the security policy information points (PIP). Serves as the retrieval
 * source of attributes, or the data required for policy evaluation to provide
 * the information needed by the policy decision point to make the decisions.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyInformationPoints.class)
})
public interface PolicyInformationPoints {

    /**
     * If externalInformationPoints True then at least one Endpoint to external
     * available information needs to be configured for the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
     *
     * @return Returns the boolean for the property externalInformationPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
    boolean getExternalInformationPoints();

    /**
     * If externalInformationPoints True then at least one Endpoint to external
     * available information needs to be configured for the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
     *
     * @param externalInformationPoints desired value for the property
     * externalInformationPoints.
     */
    void setExternalInformationPoints(boolean externalInformationPoints);

    /**
     * References to submodels defining information used by security access
     * permission rules.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
     *
     * @return Returns the List of References for the property
     * internalInformationPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
    List<Reference> getInternalInformationPoints();

    /**
     * References to submodels defining information used by security access
     * permission rules.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
     *
     * @param internalInformationPoints desired value for the property
     * internalInformationPoints.
     */
    void setInternalInformationPoints(List<Reference> internalInformationPoints);

}
