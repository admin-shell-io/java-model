package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Capability" "A capability is the implementation-independent description of the potential of an
 * asset to achieve a certain effect in the physical or virtual world."@en "Constraint AASd-058: If
 * the semanticId of a Capability submodel element references a ConceptDescription then the
 * ConceptDescription/category shall be CAPABILITY."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultCapability.class)
})
public interface Capability extends ModelClass, SubmodelElement {

    // standard methods

}
