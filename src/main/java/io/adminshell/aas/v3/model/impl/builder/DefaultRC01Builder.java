package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultRC01Builder extends AbstractBuilder<DefaultRC01> {

    public DefaultRC01Builder() {
        super();
    }

    public DefaultRC01Builder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for conversionFactor
     * 
     * @param conversionFactor desired value to be set
     * @return Builder object with new value for conversionFactor
     */
    public DefaultRC01Builder conversionFactor(String conversionFactor) {
        this.map.put("conversionFactor", conversionFactor);
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
     * This function allows setting a value for dinNotation
     * 
     * @param dinNotation desired value to be set
     * @return Builder object with new value for dinNotation
     */
    public DefaultRC01Builder dinNotation(String dinNotation) {
        this.map.put("dinNotation", dinNotation);
        return this;
    }

    /**
     * This function allows setting a value for eceCode
     * 
     * @param eceCode desired value to be set
     * @return Builder object with new value for eceCode
     */
    public DefaultRC01Builder eceCode(String eceCode) {
        this.map.put("eceCode", eceCode);
        return this;
    }

    /**
     * This function allows setting a value for eceName
     * 
     * @param eceName desired value to be set
     * @return Builder object with new value for eceName
     */
    public DefaultRC01Builder eceName(String eceName) {
        this.map.put("eceName", eceName);
        return this;
    }

    /**
     * This function allows setting a value for nistName
     * 
     * @param nistName desired value to be set
     * @return Builder object with new value for nistName
     */
    public DefaultRC01Builder nistName(String nistName) {
        this.map.put("nistName", nistName);
        return this;
    }

    /**
     * This function allows setting a value for siName
     * 
     * @param siName desired value to be set
     * @return Builder object with new value for siName
     */
    public DefaultRC01Builder siName(String siName) {
        this.map.put("siName", siName);
        return this;
    }

    /**
     * This function allows setting a value for siNotation
     * 
     * @param siNotation desired value to be set
     * @return Builder object with new value for siNotation
     */
    public DefaultRC01Builder siNotation(String siNotation) {
        this.map.put("siNotation", siNotation);
        return this;
    }

    /**
     * This function allows setting a value for registrationAuthorityId
     * 
     * @param registrationAuthorityId desired value to be set
     * @return Builder object with new value for registrationAuthorityId
     */
    public DefaultRC01Builder registrationAuthorityId(String registrationAuthorityId) {
        this.map.put("registrationAuthorityId", registrationAuthorityId);
        return this;
    }

    /**
     * This function allows setting a value for supplier
     * 
     * @param supplier desired value to be set
     * @return Builder object with new value for supplier
     */
    public DefaultRC01Builder supplier(String supplier) {
        this.map.put("supplier", supplier);
        return this;
    }

    /**
     * This function allows setting a value for unitName
     * 
     * @param unitName desired value to be set
     * @return Builder object with new value for unitName
     */
    public DefaultRC01Builder unitName(String unitName) {
        this.map.put("unitName", unitName);
        return this;
    }

    /**
     * This function allows setting a value for unitSymbol
     * 
     * @param unitSymbol desired value to be set
     * @return Builder object with new value for unitSymbol
     */
    public DefaultRC01Builder unitSymbol(String unitSymbol) {
        this.map.put("unitSymbol", unitSymbol);
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
