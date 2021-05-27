package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultOperationBuilder extends AbstractBuilder<DefaultOperation> {

    public DefaultOperationBuilder() {
        super();
    }

    public DefaultOperationBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for inputVariables
     * 
     * @param inputVariables desired value to be set
     * @return Builder object with new value for inputVariables
     */
    public DefaultOperationBuilder inputVariables(List<OperationVariable> inputVariables) {
        this.map.put("inputVariables", inputVariables);
        return this;
    }

    /**
     * This function allows setting a value for inoutputVariables
     * 
     * @param inoutputVariables desired value to be set
     * @return Builder object with new value for inoutputVariables
     */
    public DefaultOperationBuilder inoutputVariables(List<OperationVariable> inoutputVariables) {
        this.map.put("inoutputVariables", inoutputVariables);
        return this;
    }

    /**
     * This function allows setting a value for outputVariables
     * 
     * @param outputVariables desired value to be set
     * @return Builder object with new value for outputVariables
     */
    public DefaultOperationBuilder outputVariables(List<OperationVariable> outputVariables) {
        this.map.put("outputVariables", outputVariables);
        return this;
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public DefaultOperationBuilder category(String category) {
        this.map.put("category", category);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultOperationBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultOperationBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public DefaultOperationBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultOperationBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultOperationBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public DefaultOperationBuilder kind(ModelingKind kind) {
        this.map.put("kind", kind);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public DefaultOperationBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultOperation build() {
        DefaultOperation defaultOperation = Util.fillInstanceFromMap(new DefaultOperation(), this.map);
        return defaultOperation;
    }
}
