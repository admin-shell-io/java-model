package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultDataSpecificationContentBuilder extends AbstractBuilder<DefaultDataSpecificationContent> {

    public DefaultDataSpecificationContentBuilder() {
        super();
    }

    public DefaultDataSpecificationContentBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultDataSpecificationContent build() {
        DefaultDataSpecificationContent defaultDataSpecificationContent =
            Util.fillInstanceFromMap(new DefaultDataSpecificationContent(), this.map);
        return defaultDataSpecificationContent;
    }
}
