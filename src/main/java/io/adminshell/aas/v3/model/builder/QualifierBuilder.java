

package io.adminshell.aas.v3.model.builder;





import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class QualifierBuilder<T extends Qualifier, B extends QualifierBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for type
     * 
     * @param type desired value to be set
     * @return Builder object with new value for type
     */
    public B type(String type) {
        getBuildingInstance().setType(type);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueType
     * 
     * @param valueType desired value to be set
     * @return Builder object with new value for valueType
     */
    public B valueType(String valueType) {
        getBuildingInstance().setValueType(valueType);
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
     * This function allows setting a value for valueId
     * 
     * @param valueId desired value to be set
     * @return Builder object with new value for valueId
     */
    public B valueId(Reference valueId) {
        getBuildingInstance().setValueId(valueId);
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