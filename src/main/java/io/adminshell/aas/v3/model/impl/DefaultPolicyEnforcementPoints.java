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
package io.adminshell.aas.v3.model.impl;

import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.Objects;

import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package
 * io.adminshell.aas.v3.model.PolicyEnforcementPoints
 *
 * Defines the security policy enforcement points (PEP).
 */
public class DefaultPolicyEnforcementPoints implements PolicyEnforcementPoints {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint")
    protected boolean externalPolicyEnforcementPoint;

    public DefaultPolicyEnforcementPoints() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.externalPolicyEnforcementPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultPolicyEnforcementPoints other = (DefaultPolicyEnforcementPoints) obj;
            return Objects.equals(this.externalPolicyEnforcementPoint, other.externalPolicyEnforcementPoint);
        }
    }

    @Override
    public boolean getExternalPolicyEnforcementPoint() {
        return externalPolicyEnforcementPoint;
    }

    @Override
    public void setExternalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint) {
        this.externalPolicyEnforcementPoint = externalPolicyEnforcementPoint;
    }

    /**
     * This builder class can be used to construct a
     * DefaultPolicyEnforcementPoints bean.
     */
    public static class Builder extends PolicyEnforcementPointsBuilder<DefaultPolicyEnforcementPoints, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyEnforcementPoints newBuildingInstance() {
            return new DefaultPolicyEnforcementPoints();
        }
    }
}
