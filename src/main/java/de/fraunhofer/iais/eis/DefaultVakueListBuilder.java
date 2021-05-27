package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultVakueListBuilder extends AbstractBuilder<DefaultVakueList> {

    public DefaultVakueListBuilder() {
        super();
    }

    public DefaultVakueListBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultVakueList build() {
        DefaultVakueList defaultVakueList = Util.fillInstanceFromMap(new DefaultVakueList(), this.map);
        return defaultVakueList;
    }
}
