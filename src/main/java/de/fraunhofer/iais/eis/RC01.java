package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Specification Physical Unit" "Data Specification Template for Physical Units."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRC01.class)
})
public interface RC01 extends ModelClass, DataSpecificationContent {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * @return Returns the List of Strings for the property conversionFactors. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
    public List<String> getConversionFactors();

    /**
     * @param conversionFactors desired value for the property conversionFactors. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
     */
    public void setConversionFactors(List<String> conversionFactors);

    /**
     * @return Returns the List of LangStrings for the property definitions. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
    public List<LangString> getDefinitions();

    /**
     * @param definitions desired value for the property definitions. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
     */
    public void setDefinitions(List<LangString> definitions);

    /**
     * @return Returns the List of Strings for the property dinNotations. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
    public List<String> getDinNotations();

    /**
     * @param dinNotations desired value for the property dinNotations. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
     */
    public void setDinNotations(List<String> dinNotations);

    /**
     * @return Returns the List of Strings for the property eceCodes. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
    public List<String> getEceCodes();

    /**
     * @param eceCodes desired value for the property eceCodes. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
     */
    public void setEceCodes(List<String> eceCodes);

    /**
     * @return Returns the List of Strings for the property eceNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
    public List<String> getEceNames();

    /**
     * @param eceNames desired value for the property eceNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
     */
    public void setEceNames(List<String> eceNames);

    /**
     * @return Returns the List of Strings for the property nistNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
    public List<String> getNistNames();

    /**
     * @param nistNames desired value for the property nistNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
     */
    public void setNistNames(List<String> nistNames);

    /**
     * @return Returns the List of Strings for the property siNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
    public List<String> getSiNames();

    /**
     * @param siNames desired value for the property siNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
     */
    public void setSiNames(List<String> siNames);

    /**
     * @return Returns the List of Strings for the property siNotations. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
    public List<String> getSiNotations();

    /**
     * @param siNotations desired value for the property siNotations. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
     */
    public void setSiNotations(List<String> siNotations);

    /**
     * @return Returns the List of Strings for the property registrationAuthorityIds. More information
     *         under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
    public List<String> getRegistrationAuthorityIds();

    /**
     * @param registrationAuthorityIds desired value for the property registrationAuthorityIds. More
     *        information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
     */
    public void setRegistrationAuthorityIds(List<String> registrationAuthorityIds);

    /**
     * @return Returns the List of Strings for the property suppliers. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
    public List<String> getSuppliers();

    /**
     * @param suppliers desired value for the property suppliers. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
     */
    public void setSuppliers(List<String> suppliers);

    /**
     * @return Returns the List of Strings for the property unitNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
    public List<String> getUnitNames();

    /**
     * @param unitNames desired value for the property unitNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
     */
    public void setUnitNames(List<String> unitNames);

    /**
     * @return Returns the List of Strings for the property unitSymbols. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
    public List<String> getUnitSymbols();

    /**
     * @param unitSymbols desired value for the property unitSymbols. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
     */
    public void setUnitSymbols(List<String> unitSymbols);

}
