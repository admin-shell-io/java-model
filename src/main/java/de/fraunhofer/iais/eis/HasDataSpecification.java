package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Has Data Specification" "Element that can have be extended by using data specification
 * templates. A data specification template defines the additional attributes an element may or
 * shall have. The data specifications used are explicitly specified with their id."@en "Constraint
 * AASd-050: If the DataSpecificationContent DataSpecificationIEC61360 is used for an element then
 * the value of hasDataSpecification/dataSpecification shall contain the global reference to the IRI
 * of the corresponding data specification template
 * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = AdministrativeInformation.class),
    @KnownSubtypes.Type(value = Asset.class),
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = View.class),
    @KnownSubtypes.Type(value = ConceptDescription.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface HasDataSpecification extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Global reference to the data specification template used by the element."@en
     * 
     * @return Returns the List of References for the property dataSpecifications. More information
     *         under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    public List<Reference> getDataSpecifications();

}
