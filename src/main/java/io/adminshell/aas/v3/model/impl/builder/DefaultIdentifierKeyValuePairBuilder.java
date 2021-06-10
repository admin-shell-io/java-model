package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultIdentifierKeyValuePairBuilder<T extends IdentifierKeyValuePair, B extends DefaultIdentifierKeyValuePairBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for key
     * 
     * @param key desired value to be set
     * @return Builder object with new value for key
     */
    public B key(String key) {
        getBuildingInstance().setKey(key);
        return getSelf();
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public B value(String value) {
        getBuildingInstance().setValue(value);
        return getSelf();
    }

    /**
     * This function allows setting a value for externalSubjectId
     * 
     * @param externalSubjectId desired value to be set
     * @return Builder object with new value for externalSubjectId
     */
    public B externalSubjectId(Reference externalSubjectId) {
        getBuildingInstance().setExternalSubjectId(externalSubjectId);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().setSemanticId(semanticId);
        return getSelf();
    }
}
