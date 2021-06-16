package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.KeyElements
 * 
 * Enumeration of different key value types within a key. Contains KeyElements, ReferableElements,
 * and IdentifiableElements.
 */

public class DefaultKeyElements implements KeyElements {

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

}
