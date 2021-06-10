package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultDataSpecificationIEC61360Builder<T extends DataSpecificationIEC61360, B extends DefaultDataSpecificationIEC61360Builder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dataTypes
     * 
     * @param dataTypes desired value to be set
     * @return Builder object with new value for dataTypes
     */
    public B dataTypes(List<DataTypeIEC61360> dataTypes) {
        getBuildingInstance().setDataTypes(dataTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataTypes
     * 
     * @param dataType desired value to be added
     * @return Builder object with new value for dataTypes
     */
    public B dataType(DataTypeIEC61360 dataType) {
        getBuildingInstance().getDataTypes().add(dataType);
        return getSelf();
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public B definitions(List<LangStringSet> definitions) {
        getBuildingInstance().setDefinitions(definitions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List definitions
     * 
     * @param definition desired value to be added
     * @return Builder object with new value for definitions
     */
    public B definition(LangStringSet definition) {
        getBuildingInstance().getDefinitions().add(definition);
        return getSelf();
    }

    /**
     * This function allows setting a value for shortNames
     * 
     * @param shortNames desired value to be set
     * @return Builder object with new value for shortNames
     */
    public B shortNames(List<LangStringSet> shortNames) {
        getBuildingInstance().setShortNames(shortNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List shortNames
     * 
     * @param shortName desired value to be added
     * @return Builder object with new value for shortNames
     */
    public B shortName(LangStringSet shortName) {
        getBuildingInstance().getShortNames().add(shortName);
        return getSelf();
    }

    /**
     * This function allows setting a value for preferredNames
     * 
     * @param preferredNames desired value to be set
     * @return Builder object with new value for preferredNames
     */
    public B preferredNames(List<LangStringSet> preferredNames) {
        getBuildingInstance().setPreferredNames(preferredNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List preferredNames
     * 
     * @param preferredName desired value to be added
     * @return Builder object with new value for preferredNames
     */
    public B preferredName(LangStringSet preferredName) {
        getBuildingInstance().getPreferredNames().add(preferredName);
        return getSelf();
    }

    /**
     * This function allows setting a value for sourceOfDefinitions
     * 
     * @param sourceOfDefinitions desired value to be set
     * @return Builder object with new value for sourceOfDefinitions
     */
    public B sourceOfDefinitions(List<String> sourceOfDefinitions) {
        getBuildingInstance().setSourceOfDefinitions(sourceOfDefinitions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List sourceOfDefinitions
     * 
     * @param sourceOfDefinition desired value to be added
     * @return Builder object with new value for sourceOfDefinitions
     */
    public B sourceOfDefinition(String sourceOfDefinition) {
        getBuildingInstance().getSourceOfDefinitions().add(sourceOfDefinition);
        return getSelf();
    }

    /**
     * This function allows setting a value for units
     * 
     * @param units desired value to be set
     * @return Builder object with new value for units
     */
    public B units(List<String> units) {
        getBuildingInstance().setUnits(units);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List units
     * 
     * @param unit desired value to be added
     * @return Builder object with new value for units
     */
    public B unit(String unit) {
        getBuildingInstance().getUnits().add(unit);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitIds
     * 
     * @param unitIds desired value to be set
     * @return Builder object with new value for unitIds
     */
    public B unitIds(List<Reference> unitIds) {
        getBuildingInstance().setUnitIds(unitIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List unitIds
     * 
     * @param unitId desired value to be added
     * @return Builder object with new value for unitIds
     */
    public B unitId(Reference unitId) {
        getBuildingInstance().getUnitIds().add(unitId);
        return getSelf();
    }

}
