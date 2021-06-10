package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultReferableBuilder<T extends Referable, B extends DefaultReferableBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for categories
     * 
     * @param categories desired value to be set
     * @return Builder object with new value for categories
     */
    public B categories(List<String> categories) {
        getBuildingInstance().setCategories(categories);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List categories
     * 
     * @param category desired value to be added
     * @return Builder object with new value for categories
     */
    public B category(String category) {
        getBuildingInstance().getCategories().add(category);
        return getSelf();
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public B descriptions(List<LangStringSet> descriptions) {
        getBuildingInstance().setDescriptions(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List descriptions
     * 
     * @param description desired value to be added
     * @return Builder object with new value for descriptions
     */
    public B description(LangStringSet description) {
        getBuildingInstance().getDescriptions().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public B displayNames(List<LangStringSet> displayNames) {
        getBuildingInstance().setDisplayNames(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayNames
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayNames
     */
    public B displayName(LangStringSet displayName) {
        getBuildingInstance().getDisplayNames().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for idShorts
     * 
     * @param idShorts desired value to be set
     * @return Builder object with new value for idShorts
     */
    public B idShorts(List<String> idShorts) {
        getBuildingInstance().setIdShorts(idShorts);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List idShorts
     * 
     * @param idShort desired value to be added
     * @return Builder object with new value for idShorts
     */
    public B idShort(String idShort) {
        getBuildingInstance().getIdShorts().add(idShort);
        return getSelf();
    }
}
