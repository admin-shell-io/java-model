package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * The semantics of a property or other elements that may have a semantic description is defined by
 * a concept description. The description of the concept should follow a standardized schema
 * (realized as data specification template). Constraint AASd-051: A ConceptDescription shall have
 * one of the following categories: VALUE, PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP,
 * COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW. Default: PROPERTY.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultConceptDescription.class)
})
public interface ConceptDescription {

    /**
     * Reference to an external definition the concept is compatible to or was derived from. Compare to
     * is-case-of relationship in ISO 13584-32 and IEC EN 61360.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf
     *
     * @return Returns the List of References for the property isCaseOfs.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
    public List<Reference> getIsCaseOfs();

    /**
     * Reference to an external definition the concept is compatible to or was derived from. Compare to
     * is-case-of relationship in ISO 13584-32 and IEC EN 61360.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf
     *
     * @param isCaseOfs desired value for the property isCaseOfs.
     */
    public void setIsCaseOfs(List<Reference> isCaseOfs);

    /**
     * The embedded data specification template of the description of the concept.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification
     *
     * @return Returns the List of DataSpecifications for the property embeddedDataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification")
    public List<DataSpecification> getEmbeddedDataSpecifications();

    /**
     * The embedded data specification template of the description of the concept.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification
     *
     * @param embeddedDataSpecifications desired value for the property embeddedDataSpecifications.
     */
    public void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications);

}
