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
    public DefaultSubmodelElementCollectionBuilder allowDuplicates(boolean allowDuplicates) {
        this.map.put("allowDuplicates", allowDuplicates);
        return this;
    }

    /**
     * This function allows setting a value for ordered
     * 
     * @param ordered desired value to be set
     * @return Builder object with new value for ordered
     */
    public DefaultSubmodelElementCollectionBuilder ordered(boolean ordered) {
        this.map.put("ordered", ordered);
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
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public DefaultSubmodelElementCollectionBuilder category(String category) {
        this.map.put("category", category);
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
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public DefaultSubmodelElementCollectionBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
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
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public DefaultSubmodelElementCollectionBuilder kind(ModelingKind kind) {
        this.map.put("kind", kind);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public DefaultSubmodelElementCollectionBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
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
