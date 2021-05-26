package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultRC01Builder extends AbstractBuilder<DefaultRC01> {

    public DefaultRC01Builder() {
        super();
    }

    public DefaultRC01Builder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for conversionFactors
     * 
     * @param conversionFactors desired value to be set
     * @return Builder object with new value for conversionFactors
     */
    public DefaultRC01Builder conversionFactors(List<String> conversionFactors) {
        this.map.put("conversionFactors", conversionFactors);
        return this;
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public DefaultRC01Builder definitions(List<LangString> definitions) {
        this.map.put("definitions", definitions);
        return this;
    }

    /**
     * This function allows setting a value for dinNotations
     * 
     * @param dinNotations desired value to be set
     * @return Builder object with new value for dinNotations
     */
    public DefaultRC01Builder dinNotations(List<String> dinNotations) {
        this.map.put("dinNotations", dinNotations);
        return this;
    }

    /**
     * This function allows setting a value for eceCodes
     * 
     * @param eceCodes desired value to be set
     * @return Builder object with new value for eceCodes
     */
    public DefaultRC01Builder eceCodes(List<String> eceCodes) {
        this.map.put("eceCodes", eceCodes);
        return this;
    }

    /**
     * This function allows setting a value for eceNames
     * 
     * @param eceNames desired value to be set
     * @return Builder object with new value for eceNames
     */
    public DefaultRC01Builder eceNames(List<String> eceNames) {
        this.map.put("eceNames", eceNames);
        return this;
    }

    /**
     * This function allows setting a value for nistNames
     * 
     * @param nistNames desired value to be set
     * @return Builder object with new value for nistNames
     */
    public DefaultRC01Builder nistNames(List<String> nistNames) {
        this.map.put("nistNames", nistNames);
        return this;
    }

    /**
     * This function allows setting a value for siNames
     * 
     * @param siNames desired value to be set
     * @return Builder object with new value for siNames
     */
    public DefaultRC01Builder siNames(List<String> siNames) {
        this.map.put("siNames", siNames);
        return this;
    }

    /**
     * This function allows setting a value for siNotations
     * 
     * @param siNotations desired value to be set
     * @return Builder object with new value for siNotations
     */
    public DefaultRC01Builder siNotations(List<String> siNotations) {
        this.map.put("siNotations", siNotations);
        return this;
    }

    /**
     * This function allows setting a value for registrationAuthorityIds
     * 
     * @param registrationAuthorityIds desired value to be set
     * @return Builder object with new value for registrationAuthorityIds
     */
    public DefaultRC01Builder registrationAuthorityIds(List<String> registrationAuthorityIds) {
        this.map.put("registrationAuthorityIds", registrationAuthorityIds);
        return this;
    }

    /**
     * This function allows setting a value for suppliers
     * 
     * @param suppliers desired value to be set
     * @return Builder object with new value for suppliers
     */
    public DefaultRC01Builder suppliers(List<String> suppliers) {
        this.map.put("suppliers", suppliers);
        return this;
    }

    /**
     * This function allows setting a value for unitNames
     * 
     * @param unitNames desired value to be set
     * @return Builder object with new value for unitNames
     */
    public DefaultRC01Builder unitNames(List<String> unitNames) {
        this.map.put("unitNames", unitNames);
        return this;
    }

    /**
     * This function allows setting a value for unitSymbols
     * 
     * @param unitSymbols desired value to be set
     * @return Builder object with new value for unitSymbols
     */
    public DefaultRC01Builder unitSymbols(List<String> unitSymbols) {
        this.map.put("unitSymbols", unitSymbols);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultRC01 build() {
        DefaultRC01 defaultRC01 = Util.fillInstanceFromMap(new DefaultRC01(), this.map);
        return defaultRC01;
    }
}
