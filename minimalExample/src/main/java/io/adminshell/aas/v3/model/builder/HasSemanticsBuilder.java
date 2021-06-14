package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class HasSemanticsBuilder<T extends HasSemantics, B extends HasSemanticsBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for semanticIds
     * 
     * @param semanticIds desired value to be set
     * @return Builder object with new value for semanticIds
     */
    public B semanticIds(List<Reference> semanticIds) {
        getBuildingInstance().setSemanticIds(semanticIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List semanticIds
     * 
     * @param semanticId desired value to be added
     * @return Builder object with new value for semanticIds
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().getSemanticIds().add(semanticId);
        return getSelf();
    }
}
