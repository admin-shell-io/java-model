package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultExtensionBuilder extends AbstractBuilder<DefaultExtension> {

    public DefaultExtensionBuilder() {
        super();
    }

    public DefaultExtensionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for name
     * 
     * @param name desired value to be set
     * @return Builder object with new value for name
     */
    public DefaultExtensionBuilder name(String name) {
        this.map.put("name", name);
        return this;
    }

    /**
     * This function allows setting a value for valueType
     * 
     * @param valueType desired value to be set
     * @return Builder object with new value for valueType
     */
    public DefaultExtensionBuilder valueType(String valueType) {
        this.map.put("valueType", valueType);
        return this;
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public DefaultExtensionBuilder value(String value) {
        this.map.put("value", value);
        return this;
    }

    /**
     * This function allows setting a value for refersTo
     * 
     * @param refersTo desired value to be set
     * @return Builder object with new value for refersTo
     */
    public DefaultExtensionBuilder refersTo(Reference refersTo) {
        this.map.put("refersTo", refersTo);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public DefaultExtensionBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultExtension build() {
        DefaultExtension defaultExtension = Util.fillInstanceFromMap(new DefaultExtension(), this.map);
        return defaultExtension;
    }
}
