package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultExtensionBuilder extends AbstractBuilder<DefaultExtension> {

    public DefaultExtensionBuilder() {
        super();
    }

    public DefaultExtensionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for names
     * 
     * @param names desired value to be set
     * @return Builder object with new value for names
     */
    public DefaultExtensionBuilder names(List<String> names) {
        this.map.put("names", names);
        return this;
    }

    /**
     * This function allows setting a value for valueTypes
     * 
     * @param valueTypes desired value to be set
     * @return Builder object with new value for valueTypes
     */
    public DefaultExtensionBuilder valueTypes(List<String> valueTypes) {
        this.map.put("valueTypes", valueTypes);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultExtensionBuilder values(List<String> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for refersTos
     * 
     * @param refersTos desired value to be set
     * @return Builder object with new value for refersTos
     */
    public DefaultExtensionBuilder refersTos(List<Reference> refersTos) {
        this.map.put("refersTos", refersTos);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultExtensionBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
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
