

package io.adminshell.aas.v3.model.builder;

import java.util.List;




import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class ReferenceBuilder<T extends Reference, B extends ReferenceBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for keys
     * 
     * @param keys desired value to be set
     * @return Builder object with new value for keys
     */
    public B keys(List<Key> keys) {
        getBuildingInstance().setKeys(keys);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List keys
     * 
     * @param key desired value to be added
     * @return Builder object with new value for keys
     */
    public B key(Key key) {
        getBuildingInstance().getKeys().add(key);
        return getSelf();
    }
}
