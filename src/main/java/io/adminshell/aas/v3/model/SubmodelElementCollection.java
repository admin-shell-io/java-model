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

import java.util.Collection;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A submodel element collection is a set or list of submodel elements. Constraint AASd-059: If the
 * semanticId of a SubmodelElementCollection references a ConceptDescription then the category of
 * the ConceptDescription shall be COLLECTION or ENTITY. Constraint AASd-092: If the semanticId of a
 * SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == false references a
 * ConceptDescription then the ConceptDescription/category shall be ENTITY. Constraint AASd-093: If
 * the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates ==
 * true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElementCollection.class)
})
public interface SubmodelElementCollection extends SubmodelElement {

    /**
     * If allowDuplicates=true then it is allowed that the collection contains the same element several
     * times. Default = false
     *
     * Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection
     * contains several elements with the same semantics (i.e. the same semanticId).
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
     *
     * @return Returns the boolean for the property allowDuplicates.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
    boolean getAllowDuplicates();

    /**
     * If allowDuplicates=true then it is allowed that the collection contains the same element several
     * times. Default = false
     *
     * Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection
     * contains several elements with the same semantics (i.e. the same semanticId).
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
     *
     * @param allowDuplicates desired value for the property allowDuplicates.
     */
    void setAllowDuplicates(boolean allowDuplicates);

    /**
     * If ordered=false then the elements in the property collection are not ordered. If ordered=true
     * then the elements in the collection are ordered. Default = false
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
     *
     * @return Returns the boolean for the property ordered.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
    boolean getOrdered();

    /**
     * If ordered=false then the elements in the property collection are not ordered. If ordered=true
     * then the elements in the collection are ordered. Default = false
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
     *
     * @param ordered desired value for the property ordered.
     */
    void setOrdered(boolean ordered);

    /**
     * Submodel element contained in the collection.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
     *
     * @return Returns the Collection of SubmodelElements for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
    Collection<SubmodelElement> getValues();

    /**
     * Submodel element contained in the collection.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
     *
     * @param values desired value for the property values.
     */
    void setValues(Collection<SubmodelElement> values);

}
