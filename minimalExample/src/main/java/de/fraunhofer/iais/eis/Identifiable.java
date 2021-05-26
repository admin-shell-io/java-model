package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Identifiable" "An element that has a globally unique identifier."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifiable.class)
})
public interface Identifiable extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Administrative information of an identifiable element."@en "Some of the administrative
     * information like the version number might need to be part of the identification."@en
     * 
     * @return Returns the List of AdministrativeInformations for the property administrations. More
     *         information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    public List<AdministrativeInformation> getAdministrations();

    /**
     * "Administrative information of an identifiable element."@en "Some of the administrative
     * information like the version number might need to be part of the identification."@en
     * 
     * @param administrations desired value for the property administrations. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     */
    public void setAdministrations(List<AdministrativeInformation> administrations);

    /**
     * "The globally unique identification of the element."@en
     * 
     * @return Returns the List of Identifiers for the property identifications. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    public List<Identifier> getIdentifications();

    /**
     * "The globally unique identification of the element."@en
     * 
     * @param identifications desired value for the property identifications. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     */
    public void setIdentifications(List<Identifier> identifications);

}
