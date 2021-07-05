package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A capability is the implementation-independent description of the potential
 * of an asset to achieve a certain effect in the physical or virtual world.
 * Constraint AASd-058: If the semanticId of a Capability submodel element
 * references a ConceptDescription then the ConceptDescription/category shall be
 * CAPABILITY.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultCapability.class)
})
public interface Capability extends SubmodelElement {

}
