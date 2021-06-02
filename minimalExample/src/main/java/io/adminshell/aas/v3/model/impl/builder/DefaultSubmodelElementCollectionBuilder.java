package io.adminshell.aas.v3.model.impl.builder;

import java.util.Collection;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

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
