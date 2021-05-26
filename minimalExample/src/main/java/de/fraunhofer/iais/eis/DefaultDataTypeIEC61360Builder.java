package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultDataTypeIEC61360Builder extends AbstractBuilder<DefaultDataTypeIEC61360> {

    public DefaultDataTypeIEC61360Builder() {
        super();
    }

    public DefaultDataTypeIEC61360Builder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultDataTypeIEC61360 build() {
        DefaultDataTypeIEC61360 defaultDataTypeIEC61360 = Util.fillInstanceFromMap(new DefaultDataTypeIEC61360(), this.map);
        return defaultDataTypeIEC61360;
    }
}
