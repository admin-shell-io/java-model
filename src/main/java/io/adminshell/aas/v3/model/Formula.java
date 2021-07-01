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
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFormula.class)
})
public interface Formula extends Constraint {

    /**
     * A formula may depend on referable or even external global elements - assumed that can be
     * referenced and their value may be evaluated - that are used in the logical expression.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn
     *
     * @return Returns the List of References for the property dependsOns.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    List<Reference> getDependsOns();

    /**
     * A formula may depend on referable or even external global elements - assumed that can be
     * referenced and their value may be evaluated - that are used in the logical expression.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn
     *
     * @param dependsOns desired value for the property dependsOns.
     */
    void setDependsOns(List<Reference> dependsOns);

}
