package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultReferenceBuilder extends AbstractBuilder<DefaultReference> {

    public DefaultReferenceBuilder() {
        super();
    }

    public DefaultReferenceBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for keys
     * 
     * @param keys desired value to be set
     * @return Builder object with new value for keys
     */
    public DefaultReferenceBuilder keys(List<Key> keys) {
        this.map.put("keys", keys);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultReference build() {
        DefaultReference defaultReference = Util.fillInstanceFromMap(new DefaultReference(), this.map);
        return defaultReference;
    }
}
