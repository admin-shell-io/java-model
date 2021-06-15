package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PolicyInformationPoints
 * 
 * Defines the security policy information points (PIP). Serves as the retrieval source of
 * attributes, or the data required for policy evaluation to provide the information needed by the
 * policy decision point to make the decisions.
 */

public class DefaultPolicyInformationPoints implements PolicyInformationPoints {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * If externalInformationPoints True then at least one Endpoint to external available information
     * needs to be configured for the AAS.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
    protected boolean externalInformationPoints;

    /**
     * References to submodels defining information used by security access permission rules.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
    protected List<Reference> internalInformationPoints = new ArrayList<>();

    public DefaultPolicyInformationPoints() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.externalInformationPoints,
            this.internalInformationPoints});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultPolicyInformationPoints other = (DefaultPolicyInformationPoints) obj;
            return Objects.equals(this.externalInformationPoints, other.externalInformationPoints) &&
                Objects.equals(this.internalInformationPoints, other.internalInformationPoints);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
    final public boolean getExternalInformationPoints() {
        return externalInformationPoints;
    }

    final public void setExternalInformationPoints(boolean externalInformationPoints) {
        this.externalInformationPoints = externalInformationPoints;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
    final public List<Reference> getInternalInformationPoints() {
        return internalInformationPoints;
    }

    final public void setInternalInformationPoints(List<Reference> internalInformationPoints) {
        this.internalInformationPoints = internalInformationPoints;
    }

    public static class Builder extends PolicyInformationPointsBuilder<DefaultPolicyInformationPoints, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyInformationPoints newBuildingInstance() {
            return new DefaultPolicyInformationPoints();
        }
    }
}
