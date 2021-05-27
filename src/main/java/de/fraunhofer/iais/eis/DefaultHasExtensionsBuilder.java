package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultHasExtensionsBuilder extends AbstractBuilder<DefaultHasExtensions> {

    public DefaultHasExtensionsBuilder() {
        super();
    }

    public DefaultHasExtensionsBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for extensions
     * 
     * @param extensions desired value to be set
     * @return Builder object with new value for extensions
     */
    public DefaultHasExtensionsBuilder extensions(List<Extension> extensions) {
        this.map.put("extensions", extensions);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultHasExtensions build() {
        DefaultHasExtensions defaultHasExtensions = Util.fillInstanceFromMap(new DefaultHasExtensions(), this.map);
        return defaultHasExtensions;
    }
}
