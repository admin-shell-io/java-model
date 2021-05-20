package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Specification" "Data specification template of the description of the concept."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecification.class)
})
public interface DataSpecification extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template
     * itself."@en
     * 
     * @return Returns the DataSpecificationContent for the property dataSpecificationContent. More
     *         information under
     *         https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    public DataSpecificationContent getDataSpecificationContent();

}
