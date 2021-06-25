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

    /**
     * Administrative information of an identifiable element.
     *
     * Some of the administrative information like the version number might need to be part of the
     * identification.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     *
     * @return Returns the List of AdministrativeInformations for the property administrations.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    List<AdministrativeInformation> getAdministrations();

    /**
     * Administrative information of an identifiable element.
     *
     * Some of the administrative information like the version number might need to be part of the
     * identification.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     *
     * @param administrations desired value for the property administrations.
     */
    void setAdministrations(List<AdministrativeInformation> administrations);

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     *
     * @return Returns the List of Identifiers for the property identifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    List<Identifier> getIdentifications();

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     *
     * @param identifications desired value for the property identifications.
     */
    void setIdentifications(List<Identifier> identifications);

}
