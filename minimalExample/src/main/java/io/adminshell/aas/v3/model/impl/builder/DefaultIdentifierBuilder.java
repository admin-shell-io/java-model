package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultIdentifierBuilder extends AbstractBuilder<DefaultIdentifier> {

    public DefaultIdentifierBuilder() {
        super();
    }

    public DefaultIdentifierBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for identifiers
     * 
     * @param identifiers desired value to be set
     * @return Builder object with new value for identifiers
     */
    public DefaultIdentifierBuilder identifiers(List<String> identifiers) {
        this.map.put("identifiers", identifiers);
        return this;
    }

    /**
     * This function allows setting a value for idTypes
     * 
     * @param idTypes desired value to be set
     * @return Builder object with new value for idTypes
     */
    public DefaultIdentifierBuilder idTypes(List<IdentifierType> idTypes) {
        this.map.put("idTypes", idTypes);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultIdentifier build() {
        DefaultIdentifier defaultIdentifier = Util.fillInstanceFromMap(new DefaultIdentifier(), this.map);
        return defaultIdentifier;
    }
}
