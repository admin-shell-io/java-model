package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.List;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Element that can have be extended by using data specification templates. A
 * data specification template defines the additional attributes an element may
 * or shall have. The data specifications used are explicitly specified with
 * their id. Constraint AASd-050: If the DataSpecificationContent
 * DataSpecificationIEC61360 is used for an element then the value of
 * hasDataSpecification/dataSpecification shall contain the global reference to
 * the Iri of the corresponding data specification template
 * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultHasDataSpecification.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = AdministrativeInformation.class),
    @KnownSubtypes.Type(value = Asset.class),
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = View.class),
    @KnownSubtypes.Type(value = ConceptDescription.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface HasDataSpecification {

    /**
     * Link to the included description of the Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/embeddedDataSpecification
     *
     * @return Returns the List of EmbeddedDataSpecifications for the property
     * embeddedDataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/embeddedDataSpecification")
    List<EmbeddedDataSpecification> getEmbeddedDataSpecifications();

    /**
     * Link to the included description of the Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/embeddedDataSpecification
     *
     * @param embeddedDataSpecifications desired value for the property
     * embeddedDataSpecifications.
     */
    void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications);

}
