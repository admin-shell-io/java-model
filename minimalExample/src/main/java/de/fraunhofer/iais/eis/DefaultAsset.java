package de.fraunhofer.iais.eis;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Asset" "An Asset describes meta data of an asset that is represented by an AAS. The asset may
 * either represent an asset type or an asset instance. The asset has a globally unique identifier
 * plus - if needed - additional domain specific (proprietary) identifiers."@en "Objects may be
 * known in the form of a type or of an instance. An object in the planning phase is known as a
 * type"@en
 */

public class DefaultAsset implements Asset {

    // instance fields as derived from the Asset Administration Shell ontology

    // no manual construction
    protected DefaultAsset() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {super.hashCode()});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public Object deepCopy() {
        DefaultAsset other = new DefaultAsset();

        return other;
    }

}
