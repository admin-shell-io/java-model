package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PolicyAdministrationPoint
 * 
 * Definition of a security administration point (PDP).
 */

public class DefaultPolicyAdministrationPoint implements PolicyAdministrationPoint {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    protected boolean externalAccessControl;

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

    @Override
    public AccessControl getLocalAccessControl() {
        return localAccessControl;
    }

    @Override
    public void setLocalAccessControl(AccessControl localAccessControl) {
        this.localAccessControl = localAccessControl;
    }

    @Override
    public boolean getExternalAccessControl() {
        return externalAccessControl;
    }

    @Override
    public void setExternalAccessControl(boolean externalAccessControl) {
        this.externalAccessControl = externalAccessControl;
    }
}
