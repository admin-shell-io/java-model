package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DefaultIdentifierBuilder extends AbstractBuilder<DefaultIdentifier> {

    public DefaultIdentifierBuilder() {
        super();
    }

    public DefaultIdentifierBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for identifier
     * 
     * @param identifier desired value to be set
     * @return Builder object with new value for identifier
     */
    public DefaultIdentifierBuilder identifier(String identifier) {
        this.map.put("identifier", identifier);
        return this;
    }

    /**
     * This function allows setting a value for idType
     * 
     * @param idType desired value to be set
     * @return Builder object with new value for idType
     */
    public DefaultIdentifierBuilder idType(IdentifierType idType) {
        this.map.put("idType", idType);
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
