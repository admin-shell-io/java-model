package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultKeyBuilder<T extends Key, B extends DefaultKeyBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for idType
     * 
     * @param idType desired value to be set
     * @return Builder object with new value for idType
     */
    public B idType(KeyType idType) {
        getBuildingInstance().setIdType(idType);
        return getSelf();
    }

    /**
     * This function allows setting a value for type
     * 
     * @param type desired value to be set
     * @return Builder object with new value for type
     */
    public B type(KeyElements type) {
        getBuildingInstance().setType(type);
        return getSelf();
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public B value(String value) {
        getBuildingInstance().setValue(value);
        return getSelf();
    }
}
