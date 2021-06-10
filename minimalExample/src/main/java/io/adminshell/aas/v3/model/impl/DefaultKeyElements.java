package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Key Elements" "Enumeration of different key value types within a key. Contains KeyElements,
 * ReferableElements, and IdentifiableElements."@en
 */

public class DefaultKeyElements implements KeyElements {

    // instance fields as derived from the Asset Administration Shell ontology

    public DefaultKeyElements() {}

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

    public static class Builder extends DefaultKeyElementsBuilder<DefaultKeyElements, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultKeyElements newBuildingInstance() {
            return new DefaultKeyElements();
        }
    }
}
