package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An element that has a globally unique identifier.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifiable.class)
})
public interface Identifiable {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * Administrative information of an identifiable element. Some of the administrative information
     * like the version number might need to be part of the identification.
     * 
     * @return Returns the List of AdministrativeInformations for the property administrations. More
     *         information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    public List<AdministrativeInformation> getAdministrations();

    /**
     * Administrative information of an identifiable element. Some of the administrative information
     * like the version number might need to be part of the identification.
     * 
     * @param administrations desired value for the property administrations. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     */
    public void setAdministrations(List<AdministrativeInformation> administrations);

    /**
     * The globally unique identification of the element.
     * 
     * @return Returns the List of Identifiers for the property identifications. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    public List<Identifier> getIdentifications();

    /**
     * The globally unique identification of the element.
     * 
     * @param identifications desired value for the property identifications. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     */
    public void setIdentifications(List<Identifier> identifications);

}
