package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Data specification template of the description of the concept.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecification.class)
})
public interface DataSpecification {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template itself.
     * 
     * @return Returns the List of DataSpecificationContents for the property dataSpecificationContents.
     *         More information under
     *         https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    public List<DataSpecificationContent> getDataSpecificationContents();

    /**
     * DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template itself.
     * 
     * @param dataSpecificationContents desired value for the property dataSpecificationContents. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     */
    public void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents);

}
