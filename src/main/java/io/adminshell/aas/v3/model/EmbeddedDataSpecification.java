package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Link to the included description of the Data Specification.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEmbeddedDataSpecification.class)
})
public interface EmbeddedDataSpecification {

    /**
     * Global reference to the data specification template used by the element. Reference points to a
     * Data Specification.
     *
     * Reference must point to a Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification
     *
     * @return Returns the List of References for the property dataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification")
    List<Reference> getDataSpecifications();

    /**
     * Global reference to the data specification template used by the element. Reference points to a
     * Data Specification.
     *
     * Reference must point to a Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification
     *
     * @param dataSpecifications desired value for the property dataSpecifications.
     */
    void setDataSpecifications(List<Reference> dataSpecifications);

    /**
     * Property links to a Data Specification Content, which contains the formalized definitions
     * specifying this Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent
     *
     * @return Returns the List of DataSpecificationContents for the property dataSpecificationContents.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent")
    List<DataSpecificationContent> getDataSpecificationContents();

    /**
     * Property links to a Data Specification Content, which contains the formalized definitions
     * specifying this Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent
     *
     * @param dataSpecificationContents desired value for the property dataSpecificationContents.
     */
    void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents);

}
