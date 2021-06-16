package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A set of data elements that further classifies a specific subject.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubjectAttributes.class)
})
public interface SubjectAttributes {

    /**
     * A data element that further classifies a specific subject.
     *
     * Constraint AASs-015: The data element SubjectAttributes/subjectAttribute shall be part of the
     * submodel that is referenced within the 'selectableSubjectAttributes' attribute of
     * 'AccessControl'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute
     *
     * @return Returns the List of DataElements for the property subjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
    List<DataElement> getSubjectAttributes();

    /**
     * A data element that further classifies a specific subject.
     *
     * Constraint AASs-015: The data element SubjectAttributes/subjectAttribute shall be part of the
     * submodel that is referenced within the 'selectableSubjectAttributes' attribute of
     * 'AccessControl'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute
     *
     * @param subjectAttributes desired value for the property subjectAttributes.
     */
    void setSubjectAttributes(List<DataElement> subjectAttributes);

}
