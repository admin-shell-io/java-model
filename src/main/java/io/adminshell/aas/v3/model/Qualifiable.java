package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Qualifiable" "Additional qualification of a qualifiable element."@en "Constraint AASd-021: Every
 * qualifiable can only have one qualifier with the same Qualifier/type."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AccessPermissionRule.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Qualifiable extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Additional qualification of a qualifiable element."@en
     * 
     * @return Returns the List of Constraints for the property qualifiers. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    public List<Constraint> getQualifiers();

    /**
     * "Additional qualification of a qualifiable element."@en
     * 
     * @param qualifiers desired value for the property qualifiers. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
     */
    public void setQualifiers(List<Constraint> qualifiers);

}
