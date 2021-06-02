package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultDataSpecificationPhysicalUnitBuilder extends AbstractBuilder<DefaultDataSpecificationPhysicalUnit> {

    public DefaultDataSpecificationPhysicalUnitBuilder() {
        super();
    }

    public DefaultDataSpecificationPhysicalUnitBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for conversionFactors
     * 
     * @param conversionFactors desired value to be set
     * @return Builder object with new value for conversionFactors
     */
    public DefaultDataSpecificationPhysicalUnitBuilder conversionFactors(List<String> conversionFactors) {
        this.map.put("conversionFactors", conversionFactors);
        return this;
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public DefaultDataSpecificationPhysicalUnitBuilder definitions(List<LangString> definitions) {
        this.map.put("definitions", definitions);
        return this;
    }

    /**
     * This function allows setting a value for dinNotations
     * 
     * @param dinNotations desired value to be set
     * @return Builder object with new value for dinNotations
     */
    public DefaultDataSpecificationPhysicalUnitBuilder dinNotations(List<String> dinNotations) {
        this.map.put("dinNotations", dinNotations);
        return this;
    }

    /**
     * This function allows setting a value for eceCodes
     * 
     * @param eceCodes desired value to be set
     * @return Builder object with new value for eceCodes
     */
    public DefaultDataSpecificationPhysicalUnitBuilder eceCodes(List<String> eceCodes) {
        this.map.put("eceCodes", eceCodes);
        return this;
    }

    /**
     * This function allows setting a value for eceNames
     * 
     * @param eceNames desired value to be set
     * @return Builder object with new value for eceNames
     */
    public DefaultDataSpecificationPhysicalUnitBuilder eceNames(List<String> eceNames) {
        this.map.put("eceNames", eceNames);
        return this;
    }

    /**
     * This function allows setting a value for nistNames
     * 
     * @param nistNames desired value to be set
     * @return Builder object with new value for nistNames
     */
    public DefaultDataSpecificationPhysicalUnitBuilder nistNames(List<String> nistNames) {
        this.map.put("nistNames", nistNames);
        return this;
    }

    /**
     * This function allows setting a value for siNames
     * 
     * @param siNames desired value to be set
     * @return Builder object with new value for siNames
     */
    public DefaultDataSpecificationPhysicalUnitBuilder siNames(List<String> siNames) {
        this.map.put("siNames", siNames);
        return this;
    }

    /**
     * This function allows setting a value for siNotations
     * 
     * @param siNotations desired value to be set
     * @return Builder object with new value for siNotations
     */
    public DefaultDataSpecificationPhysicalUnitBuilder siNotations(List<String> siNotations) {
        this.map.put("siNotations", siNotations);
        return this;
    }

    /**
     * This function allows setting a value for registrationAuthorityIds
     * 
     * @param registrationAuthorityIds desired value to be set
     * @return Builder object with new value for registrationAuthorityIds
     */
    public DefaultDataSpecificationPhysicalUnitBuilder registrationAuthorityIds(List<String> registrationAuthorityIds) {
        this.map.put("registrationAuthorityIds", registrationAuthorityIds);
        return this;
    }

    /**
     * This function allows setting a value for suppliers
     * 
     * @param suppliers desired value to be set
     * @return Builder object with new value for suppliers
     */
    public DefaultDataSpecificationPhysicalUnitBuilder suppliers(List<String> suppliers) {
        this.map.put("suppliers", suppliers);
        return this;
    }

    /**
     * This function allows setting a value for unitNames
     * 
     * @param unitNames desired value to be set
     * @return Builder object with new value for unitNames
     */
    public DefaultDataSpecificationPhysicalUnitBuilder unitNames(List<String> unitNames) {
        this.map.put("unitNames", unitNames);
        return this;
    }

    /**
     * This function allows setting a value for unitSymbols
     * 
     * @param unitSymbols desired value to be set
     * @return Builder object with new value for unitSymbols
     */
    public DefaultDataSpecificationPhysicalUnitBuilder unitSymbols(List<String> unitSymbols) {
        this.map.put("unitSymbols", unitSymbols);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultDataSpecificationPhysicalUnit build() {
        DefaultDataSpecificationPhysicalUnit defaultDataSpecificationPhysicalUnit =
            Util.fillInstanceFromMap(new DefaultDataSpecificationPhysicalUnit(), this.map);
        return defaultDataSpecificationPhysicalUnit;
    }
}
