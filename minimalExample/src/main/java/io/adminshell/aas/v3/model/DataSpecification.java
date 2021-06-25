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

    /**
     * DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template itself.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     *
     * @return Returns the List of DataSpecificationContents for the property dataSpecificationContents.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    List<DataSpecificationContent> getDataSpecificationContents();

    /**
     * DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template itself.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     *
     * @param dataSpecificationContents desired value for the property dataSpecificationContents.
     */
    void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents);

}
