package io.adminshell.aas.v3.model;




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
     * @return Returns the DataSpecificationContent for the property dataSpecificationContent.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
    DataSpecificationContent getDataSpecificationContent();

    /**
     * DataSpecificationContent contains the additional attributes to be added to the element instance
     * that references the data specification template and meta information about the template itself.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent
     *
     * @param dataSpecificationContent desired value for the property dataSpecificationContent.
     */
    void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent);

}
