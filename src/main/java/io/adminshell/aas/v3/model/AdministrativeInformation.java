package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Every Identifiable may have administrative information. Administrative
 * information includes for example 1) Information about the version of the
 * element 2) Information about who created or who made the last change to the
 * element 3) Information about the languages available in case the element
 * contains text, for translating purposed also themmaster or default language
 * may be definedIn the first version of the AAS metamodel only version
 * information as defined by IEC 61360 is defined. In later versions additional
 * attributes may be added.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAdministrativeInformation.class)
})
public interface AdministrativeInformation extends HasDataSpecification {

    /**
     * Version of the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
     *
     * @return Returns the String for the property version.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
    String getVersion();

    /**
     * Version of the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
     *
     * @param version desired value for the property version.
     */
    void setVersion(String version);

    /**
     * Revision of the element.
     *
     * Constraint AASd-005: A revision requires a version. This means, if there
     * is no version there is no revision neither.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
     *
     * @return Returns the String for the property revision.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
    String getRevision();

    /**
     * Revision of the element.
     *
     * Constraint AASd-005: A revision requires a version. This means, if there
     * is no version there is no revision neither.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
     *
     * @param revision desired value for the property revision.
     */
    void setRevision(String revision);

}