package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultConceptDescriptionBuilder extends AbstractBuilder<DefaultConceptDescription> {

    public DefaultConceptDescriptionBuilder() {
        super();
    }

    public DefaultConceptDescriptionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for isCaseOfs
     * 
     * @param isCaseOfs desired value to be set
     * @return Builder object with new value for isCaseOfs
     */
    public DefaultConceptDescriptionBuilder isCaseOfs(List<Reference> isCaseOfs) {
        this.map.put("isCaseOfs", isCaseOfs);
        return this;
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public DefaultConceptDescriptionBuilder embeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        this.map.put("embeddedDataSpecifications", embeddedDataSpecifications);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultConceptDescription build() {
        DefaultConceptDescription defaultConceptDescription = Util.fillInstanceFromMap(new DefaultConceptDescription(), this.map);
        return defaultConceptDescription;
    }
}
