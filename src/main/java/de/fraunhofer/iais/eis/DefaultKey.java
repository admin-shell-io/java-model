package de.fraunhofer.iais.eis;

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
    protected KeyType idType;

    /**
     * "has type" "Denote which kind of entity is referenced. In case type = GlobalReference then the
     * element is a global unique id. In all other cases the key references a model element of the same
     * or of another AAS. The name of the model element is explicitly listed."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    protected KeyElements type;

    /**
     * "has value" "The key value, for example an IRDI if the idType=IRDI."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    protected String value;

    // no manual construction
    protected DefaultKey() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.idType,
            this.type,
            this.value});
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
            return Objects.equals(this.idType, other.idType) &&
                Objects.equals(this.type, other.type) &&
                Objects.equals(this.value, other.value);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultKey other = new DefaultKey();
        other.idType = (KeyType) Util.clone(this.idType);
        other.type = (KeyElements) Util.clone(this.type);
        other.value = (String) Util.clone(this.value);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    final public KeyType getIdType() {
        return idType;
    }

    final public void setIdType(KeyType idType) {
        this.idType = idType;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    final public KeyElements getType() {
        return type;
    }

    final public void setType(KeyElements type) {
        this.type = type;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    final public String getValue() {
        return value;
    }

    final public void setValue(String value) {
        this.value = value;
    }
}
