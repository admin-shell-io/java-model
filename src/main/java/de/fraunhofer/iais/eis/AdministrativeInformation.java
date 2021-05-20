package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Administrative Information" "Every Identifiable may have administrative information.
 * Administrative information includes for example 1) Information about the version of the element
 * 2) Information about who created or who made the last change to the element 3) Information about
 * the languages available in case the element contains text, for translating purposed also
 * themmaster or default language may be definedIn the first version of the AAS metamodel only
 * version information as defined by IEC 61360 is defined. In later versions additional attributes
 * may be added."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAdministrativeInformation.class)
})
public interface AdministrativeInformation extends ModelClass, HasDataSpecification {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Version of the element."@en
     * 
     * @return Returns the String for the property version. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
    public String getVersion();

    /**
     * "Revision of the element."@en "Constraint AASd-005: A revision requires a version. This means, if
     * there is no version there is no revision neither."@en
     * 
     * @return Returns the String for the property revision. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
    public String getRevision();

}
