package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Definition of a security administration point (PDP).
 */

public class DefaultPolicyAdministrationPoint implements PolicyAdministrationPoint {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Endpoint to an external access control defining a policy administration point to be used by the
     * AAS.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    protected boolean externalAccessControl;

    /**
     * The policy administration point of access control as realized by the AAS itself. Constraint
     * AASd-009: Either there is an external policy administration point endpoint defined or the AAS has
     * its own access control.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    protected AccessControl localAccessControl;

    public DefaultPolicyAdministrationPoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.localAccessControl,
            this.externalAccessControl});
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
            DefaultPolicyAdministrationPoint other = (DefaultPolicyAdministrationPoint) obj;
            return Objects.equals(this.localAccessControl, other.localAccessControl) &&
                Objects.equals(this.externalAccessControl, other.externalAccessControl);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    final public AccessControl getLocalAccessControl() {
        return localAccessControl;
    }

    final public void setLocalAccessControl(AccessControl localAccessControl) {
        this.localAccessControl = localAccessControl;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    final public boolean getExternalAccessControl() {
        return externalAccessControl;
    }

    final public void setExternalAccessControl(boolean externalAccessControl) {
        this.externalAccessControl = externalAccessControl;
    }

    public static class Builder extends PolicyAdministrationPointBuilder<DefaultPolicyAdministrationPoint, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyAdministrationPoint newBuildingInstance() {
            return new DefaultPolicyAdministrationPoint();
        }
    }
}
