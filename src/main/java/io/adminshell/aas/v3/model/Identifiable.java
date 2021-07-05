package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An element that has a globally unique identifier.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = Asset.class),
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = ConceptDescription.class)
})
public interface Identifiable extends Referable {

    /**
     * Administrative information of an identifiable element.
     *
     * Some of the administrative information like the version number might need
     * to be part of the identification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     *
     * @return Returns the AdministrativeInformation for the property
     * administration.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    AdministrativeInformation getAdministration();

    /**
     * Administrative information of an identifiable element.
     *
     * Some of the administrative information like the version number might need
     * to be part of the identification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     *
     * @param administration desired value for the property administration.
     */
    void setAdministration(AdministrativeInformation administration);

    /**
     * The globally unique identification of the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     *
     * @return Returns the Identifier for the property identification.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    Identifier getIdentification();

    /**
     * The globally unique identification of the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     *
     * @param identification desired value for the property identification.
     */
    void setIdentification(Identifier identification);

}
