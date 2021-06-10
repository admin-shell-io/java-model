package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultIdentifierBuilder<T extends Identifier, B extends DefaultIdentifierBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for identifier
     * 
     * @param identifier desired value to be set
     * @return Builder object with new value for identifier
     */
    public B identifier(String identifier) {
        getBuildingInstance().setIdentifier(identifier);
        return getSelf();
    }

    /**
     * This function allows setting a value for idType
     * 
     * @param idType desired value to be set
     * @return Builder object with new value for idType
     */
    public B idType(IdentifierType idType) {
        getBuildingInstance().setIdType(idType);
        return getSelf();
    }
}
