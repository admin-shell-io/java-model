package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Asset" "An Asset describes meta data of an asset that is represented by an AAS. The asset may
 * either represent an asset type or an asset instance. The asset has a globally unique identifier
 * plus - if needed - additional domain specific (proprietary) identifiers."@en "Objects may be
 * known in the form of a type or of an instance. An object in the planning phase is known as a
 * type"@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAsset.class)
})
public interface Asset extends ModelClass {

    // standard methods

}
