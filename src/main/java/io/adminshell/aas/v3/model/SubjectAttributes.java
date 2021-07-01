/*
Copyright (c) 2021 Fraunhofer IOSB-INA Lemgo,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IOSB-ILT Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IAIS,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IESE,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IWU Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

This source code is licensed under the Apache License 2.0 (see LICENSE.txt).

This source code may use other Open Source software components (see LICENSE.txt).
*/

package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.util.*;
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
