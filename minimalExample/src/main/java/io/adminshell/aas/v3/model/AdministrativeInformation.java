package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Every Identifiable may have administrative information. Administrative information includes for
 * example 1) Information about the version of the element 2) Information about who created or who
 * made the last change to the element 3) Information about the languages available in case the
 * element contains text, for translating purposed also themmaster or default language may be
 * definedIn the first version of the AAS metamodel only version information as defined by IEC 61360
 * is defined. In later versions additional attributes may be added.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAdministrativeInformation.class)
})
public interface AdministrativeInformation {

    /**
     * Version of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
     *
     * @return Returns the List of Strings for the property versions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
    List<String> getVersions();

    /**
     * Version of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
     *
     * @param versions desired value for the property versions.
     */
    void setVersions(List<String> versions);

    /**
     * Revision of the element.
     *
     * Constraint AASd-005: A revision requires a version. This means, if there is no version there is
     * no revision neither.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
     *
     * @return Returns the List of Strings for the property revisions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
    List<String> getRevisions();

    /**
     * Revision of the element.
     *
     * Constraint AASd-005: A revision requires a version. This means, if there is no version there is
     * no revision neither.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
     *
     * @param revisions desired value for the property revisions.
     */
    void setRevisions(List<String> revisions);

}
