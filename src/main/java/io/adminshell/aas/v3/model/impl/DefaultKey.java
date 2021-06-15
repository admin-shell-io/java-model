package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of Key
 * 
 * A key is a reference to an element by its id.
 */

public class DefaultKey implements Key {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort. Constraint AASd-080: In case Key/type ==
     * GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId). Constraint AASd-081:
     * In case Key/type==AssetAdministrationShell Key/idType shall not be any LocalKeyType (IdShort,
     * FragmentId).
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    protected KeyType idType;

    /**
     * Denote which kind of entity is referenced. In case type = GlobalReference then the element is a
     * global unique id. In all other cases the key references a model element of the same or of another
     * AAS. The name of the model element is explicitly listed.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    protected KeyElements type;

    /**
     * The key value, for example an IRDI if the idType=IRDI.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    protected String value;

    public DefaultKey() {}

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

    public static class Builder extends KeyBuilder<DefaultKey, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultKey newBuildingInstance() {
            return new DefaultKey();
        }
    }
}
