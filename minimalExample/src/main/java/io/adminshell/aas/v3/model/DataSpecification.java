package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

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
     * @return Returns the List of DataSpecificationContents for the property dataSpecificationContents.
     *         More information under
     *         https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    public List<DataSpecificationContent> getDataSpecificationContents();

    /**
     * "DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template
     * itself."@en
     * 
     * @param dataSpecificationContents desired value for the property dataSpecificationContents. More
     *        information under
     *        https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     */
    public void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents);

}
