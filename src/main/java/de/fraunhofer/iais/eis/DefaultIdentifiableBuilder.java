package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultIdentifiableBuilder extends AbstractBuilder<DefaultIdentifiable> {

    public DefaultIdentifiableBuilder() {
        super();
    }

    public DefaultIdentifiableBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for administrations
     * 
     * @param administrations desired value to be set
     * @return Builder object with new value for administrations
     */
    public DefaultIdentifiableBuilder administrations(List<AdministrativeInformation> administrations) {
        this.map.put("administrations", administrations);
        return this;
    }

    /**
     * This function allows setting a value for identifications
     * 
     * @param identifications desired value to be set
     * @return Builder object with new value for identifications
     */
    public DefaultIdentifiableBuilder identifications(List<Identifier> identifications) {
        this.map.put("identifications", identifications);
        return this;
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultIdentifiableBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultIdentifiableBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultIdentifiableBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultIdentifiableBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultIdentifiable build() {
        DefaultIdentifiable defaultIdentifiable = Util.fillInstanceFromMap(new DefaultIdentifiable(), this.map);
        return defaultIdentifiable;
    }
}
