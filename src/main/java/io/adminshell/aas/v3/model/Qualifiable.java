package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Additional qualification of a qualifiable element. Constraint AASd-021: Every qualifiable can
 * only have one qualifier with the same Qualifier/type.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AccessPermissionRule.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Qualifiable {

    /**
     * Additional qualification of a qualifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
     *
     * @return Returns the List of Constraints for the property qualifiers.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    public List<Constraint> getQualifiers();

    /**
     * Additional qualification of a qualifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
     *
     * @param qualifiers desired value for the property qualifiers.
     */
    public void setQualifiers(List<Constraint> qualifiers);

}
