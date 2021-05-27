package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Key" "A key is a reference to an element by its id."@en
 */

public class DefaultKey implements Key {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has key type" "Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort."@en "Constraint AASd-080: In case Key/type ==
     * GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en "Constraint
     * AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any LocalKeyType
     * (IdShort, FragmentId)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    protected List<KeyType> idTypes;

    /**
     * "has type" "Denote which kind of entity is referenced. In case type = GlobalReference then the
     * element is a global unique id. In all other cases the key references a model element of the same
     * or of another AAS. The name of the model element is explicitly listed."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    protected List<KeyElements> types;

    /**
     * "has value" "The key value, for example an IRDI if the idType=IRDI."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    protected List<String> values;

    // no manual construction
    protected DefaultKey() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.idTypes,
            this.types,
            this.values});
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
            DefaultKey other = (DefaultKey) obj;
            return Objects.equals(this.idTypes, other.idTypes) &&
                Objects.equals(this.types, other.types) &&
                Objects.equals(this.values, other.values);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultKey other = new DefaultKey();
        other.idTypes = (List<KeyType>) Util.clone(this.idTypes);
        other.types = (List<KeyElements>) Util.clone(this.types);
        other.values = (List<String>) Util.clone(this.values);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    final public List<KeyType> getIdTypes() {
        return idTypes;
    }

    final public void setIdTypes(List<KeyType> idTypes) {
        this.idTypes = idTypes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    final public List<KeyElements> getTypes() {
        return types;
    }

    final public void setTypes(List<KeyElements> types) {
        this.types = types;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    final public List<String> getValues() {
        return values;
    }

    final public void setValues(List<String> values) {
        this.values = values;
    }
}
