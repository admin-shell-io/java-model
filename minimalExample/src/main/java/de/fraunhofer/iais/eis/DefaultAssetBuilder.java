package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultAssetBuilder extends AbstractBuilder<DefaultAsset> {

    public DefaultAssetBuilder() {
        super();
    }

    public DefaultAssetBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAsset build() {
        DefaultAsset defaultAsset = Util.fillInstanceFromMap(new DefaultAsset(), this.map);
        return defaultAsset;
    }
}
