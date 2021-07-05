package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration for denoting whether an entity is a self-managed entity or a
 * co-managed entity.
 */
public enum EntityType {

    /**
     * For co-managed entities there is no separate AAS. Co-managed entities
     * need to be part of a self-managed entity.
     */
    CO_MANAGED_ENTITY,
    /**
     * Self-Managed Entities have their own AAS but can be part of the bill of
     * material of a composite self-managed entity. The asset of an I4.0
     * Component is a self-managed entity per definition.
     */
    SELF_MANAGED_ENTITY;

}
