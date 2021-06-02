package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultSubjectAttributesBuilder extends AbstractBuilder<DefaultSubjectAttributes> {

    public DefaultSubjectAttributesBuilder() {
        super();
    }

    public DefaultSubjectAttributesBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for subjectAttributes
     * 
     * @param subjectAttributes desired value to be set
     * @return Builder object with new value for subjectAttributes
     */
    public DefaultSubjectAttributesBuilder subjectAttributes(List<DataElement> subjectAttributes) {
        this.map.put("subjectAttributes", subjectAttributes);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultSubjectAttributes build() {
        DefaultSubjectAttributes defaultSubjectAttributes = Util.fillInstanceFromMap(new DefaultSubjectAttributes(), this.map);
        return defaultSubjectAttributes;
    }
}
