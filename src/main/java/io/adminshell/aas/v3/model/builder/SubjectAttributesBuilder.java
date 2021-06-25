package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class SubjectAttributesBuilder<T extends SubjectAttributes, B extends SubjectAttributesBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for subjectAttributes
     * 
     * @param subjectAttributes desired value to be set
     * @return Builder object with new value for subjectAttributes
     */
    public B subjectAttributes(List<DataElement> subjectAttributes) {
        getBuildingInstance().setSubjectAttributes(subjectAttributes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List subjectAttributes
     * 
     * @param subjectAttribute desired value to be added
     * @return Builder object with new value for subjectAttributes
     */
    public B subjectAttribute(DataElement subjectAttribute) {
        getBuildingInstance().getSubjectAttributes().add(subjectAttribute);
        return getSelf();
    }
}
