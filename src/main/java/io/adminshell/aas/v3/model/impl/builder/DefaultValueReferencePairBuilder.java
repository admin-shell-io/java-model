package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultValueReferencePairBuilder extends AbstractBuilder<DefaultValueReferencePair> {

    public DefaultValueReferencePairBuilder() {
        super();
    }

    public DefaultValueReferencePairBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DefaultValueReferencePairBuilder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for valueId
     * 
     * @param valueId desired value to be set
     * @return Builder object with new value for valueId
     */
    public DefaultValueReferencePairBuilder valueId(Reference valueId) {
        this.map.put("valueId", valueId);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultValueReferencePair build() {
        DefaultValueReferencePair defaultValueReferencePair = Util.fillInstanceFromMap(new DefaultValueReferencePair(), this.map);
        return defaultValueReferencePair;
    }
}
