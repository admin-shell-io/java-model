package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "HasExtensions" "Element that can be extended by proprietary extensions."@en
 */

public class DefaultHasExtensions implements HasExtensions {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has extension" "An extension of the element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension")
    protected List<Extension> extensions;

    // no manual construction
    protected DefaultHasExtensions() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.extensions});
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
            DefaultHasExtensions other = (DefaultHasExtensions) obj;
            return Objects.equals(this.extensions, other.extensions);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultHasExtensions other = new DefaultHasExtensions();
        other.extensions = (List<Extension>) Util.clone(this.extensions);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension")
    final public List<Extension> getExtensions() {
        return extensions;
    }

    final public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }
}
