package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Has Kind" "An element with a kind is an element that can either represent a type or an instance.
 * Default for an element is that it is representing an instance."@en
 */

public class DefaultHasKind implements HasKind {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has kind" "ModelingKind of the element: either type or instance."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected List<ModelingKind> kinds;

    // no manual construction
    protected DefaultHasKind() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.kinds});
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
            DefaultHasKind other = (DefaultHasKind) obj;
            return Objects.equals(this.kinds, other.kinds);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultHasKind other = new DefaultHasKind();
        other.kinds = (List<ModelingKind>) Util.clone(this.kinds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    final public List<ModelingKind> getKinds() {
        return kinds;
    }

    final public void setKinds(List<ModelingKind> kinds) {
        this.kinds = kinds;
    }
}
