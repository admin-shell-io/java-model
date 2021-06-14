package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class IdentifierBuilder<T extends Identifier, B extends IdentifierBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for identifiers
     * 
     * @param identifiers desired value to be set
     * @return Builder object with new value for identifiers
     */
    public B identifiers(List<String> identifiers) {
        getBuildingInstance().setIdentifiers(identifiers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List identifiers
     * 
     * @param identifier desired value to be added
     * @return Builder object with new value for identifiers
     */
    public B identifier(String identifier) {
        getBuildingInstance().getIdentifiers().add(identifier);
        return getSelf();
    }

    /**
     * This function allows setting a value for idTypes
     * 
     * @param idTypes desired value to be set
     * @return Builder object with new value for idTypes
     */
    public B idTypes(List<IdentifierType> idTypes) {
        getBuildingInstance().setIdTypes(idTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List idTypes
     * 
     * @param idType desired value to be added
     * @return Builder object with new value for idTypes
     */
    public B idType(IdentifierType idType) {
        getBuildingInstance().getIdTypes().add(idType);
        return getSelf();
    }
}
