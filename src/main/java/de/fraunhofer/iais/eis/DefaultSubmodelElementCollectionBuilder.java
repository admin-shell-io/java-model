package de.fraunhofer.iais.eis;

import java.util.Collection;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultSubmodelElementCollectionBuilder extends AbstractBuilder<DefaultSubmodelElementCollection> {

    public DefaultSubmodelElementCollectionBuilder() {
        super();
    }

    public DefaultSubmodelElementCollectionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for allowDuplicates
     * 
     * @param allowDuplicates desired value to be set
     * @return Builder object with new value for allowDuplicates
     */
    public DefaultSubmodelElementCollectionBuilder allowDuplicates(List<Boolean> allowDuplicates) {
        this.map.put("allowDuplicates", allowDuplicates);
        return this;
    }

    /**
     * This function allows setting a value for ordereds
     * 
     * @param ordereds desired value to be set
     * @return Builder object with new value for ordereds
     */
    public DefaultSubmodelElementCollectionBuilder ordereds(List<Boolean> ordereds) {
        this.map.put("ordereds", ordereds);
        return this;
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public DefaultSubmodelElementCollectionBuilder values(Collection<SubmodelElement> values) {
        this.map.put("values", values);
        return this;
    }

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public DefaultSubmodelElementCollectionBuilder categories(List<String> categories) {
        this.map.put("categories", categories);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultSubmodelElementCollectionBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultSubmodelElementCollectionBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public DefaultSubmodelElementCollectionBuilder idShorts(List<String> idShorts) {
        this.map.put("idShorts", idShorts);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultSubmodelElementCollectionBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultSubmodelElementCollectionBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kinds
     * 
     * @param kinds desired value to be set
     * @return Builder object with new value for kinds
     */
    public DefaultSubmodelElementCollectionBuilder kinds(List<ModelingKind> kinds) {
        this.map.put("kinds", kinds);
        return this;
    }

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public DefaultSubmodelElementCollectionBuilder semanticIds(List<Reference> semanticIds) {
        this.map.put("semanticIds", semanticIds);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultSubmodelElementCollection build() {
        DefaultSubmodelElementCollection defaultSubmodelElementCollection =
            Util.fillInstanceFromMap(new DefaultSubmodelElementCollection(), this.map);
        return defaultSubmodelElementCollection;
    }
}
