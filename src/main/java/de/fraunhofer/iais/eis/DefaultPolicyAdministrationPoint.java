package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Policy Administration Point" "Definition of a security administration point (PDP)."@en
 */

public class DefaultPolicyAdministrationPoint implements PolicyAdministrationPoint {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has external access control" "Endpoint to an external access control defining a policy
     * administration point to be used by the AAS."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    protected List<Boolean> externalAccessControls;

    /**
     * "has local access control" "The policy administration point of access control as realized by the
     * AAS itself."@en "Constraint AASd-009: Either there is an external policy administration point
     * endpoint defined or the AAS has its own access control."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    protected List<AccessControl> localAccessControls;

    // no manual construction
    protected DefaultPolicyAdministrationPoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.localAccessControls,
            this.externalAccessControls});
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
            return Objects.equals(this.localAccessControls, other.localAccessControls) &&
                Objects.equals(this.externalAccessControls, other.externalAccessControls);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultPolicyAdministrationPoint other = new DefaultPolicyAdministrationPoint();
        other.localAccessControls = (List<AccessControl>) Util.clone(this.localAccessControls);
        other.externalAccessControls = (List<Boolean>) Util.clone(this.externalAccessControls);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    final public List<AccessControl> getLocalAccessControls() {
        return localAccessControls;
    }

    final public void setLocalAccessControls(List<AccessControl> localAccessControls) {
        this.localAccessControls = localAccessControls;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    final public List<Boolean> getExternalAccessControls() {
        return externalAccessControls;
    }

    final public void setExternalAccessControls(List<Boolean> externalAccessControls) {
        this.externalAccessControls = externalAccessControls;
    }
}
