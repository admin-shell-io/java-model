package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultDataSpecificationBuilder extends AbstractBuilder<DefaultDataSpecification> {

    public DefaultDataSpecificationBuilder() {
        super();
    }

    public DefaultDataSpecificationBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for dataSpecificationContents
     * 
     * @param dataSpecificationContents desired value to be set
     * @return Builder object with new value for dataSpecificationContents
     */
    public DefaultDataSpecificationBuilder dataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        this.map.put("dataSpecificationContents", dataSpecificationContents);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultDataSpecification build() {
        DefaultDataSpecification defaultDataSpecification = Util.fillInstanceFromMap(new DefaultDataSpecification(), this.map);
        return defaultDataSpecification;
    }
}
