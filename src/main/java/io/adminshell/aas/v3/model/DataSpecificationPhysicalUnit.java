package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Data Specification Physical Unit" "Data Specification Template for Physical Units."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationPhysicalUnit.class)
})
public interface DataSpecificationPhysicalUnit extends DataSpecificationContent {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * @return Returns the List of Strings for the property conversionFactors. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    public List<String> getConversionFactors();

    /**
     * @param conversionFactors desired value for the property conversionFactors. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     */
    public void setConversionFactors(List<String> conversionFactors);

    /**
     * @return Returns the List of LangStrings for the property definitions. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    public List<LangString> getDefinitions();

    /**
     * @param definitions desired value for the property definitions. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition
     */
    public void setDefinitions(List<LangString> definitions);

    /**
     * @return Returns the List of Strings for the property dinNotations. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    public List<String> getDinNotations();

    /**
     * @param dinNotations desired value for the property dinNotations. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     */
    public void setDinNotations(List<String> dinNotations);

    /**
     * @return Returns the List of Strings for the property eceCodes. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    public List<String> getEceCodes();

    /**
     * @param eceCodes desired value for the property eceCodes. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     */
    public void setEceCodes(List<String> eceCodes);

    /**
     * @return Returns the List of Strings for the property eceNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    public List<String> getEceNames();

    /**
     * @param eceNames desired value for the property eceNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     */
    public void setEceNames(List<String> eceNames);

    /**
     * @return Returns the List of Strings for the property nistNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    public List<String> getNistNames();

    /**
     * @param nistNames desired value for the property nistNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     */
    public void setNistNames(List<String> nistNames);

    /**
     * @return Returns the List of Strings for the property siNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    public List<String> getSiNames();

    /**
     * @param siNames desired value for the property siNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     */
    public void setSiNames(List<String> siNames);

    /**
     * @return Returns the List of Strings for the property siNotations. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    public List<String> getSiNotations();

    /**
     * @param siNotations desired value for the property siNotations. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     */
    public void setSiNotations(List<String> siNotations);

    /**
     * @return Returns the List of Strings for the property registrationAuthorityIds. More information
     *         under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    public List<String> getRegistrationAuthorityIds();

    /**
     * @param registrationAuthorityIds desired value for the property registrationAuthorityIds. More
     *        information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     */
    public void setRegistrationAuthorityIds(List<String> registrationAuthorityIds);

    /**
     * @return Returns the List of Strings for the property suppliers. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    public List<String> getSuppliers();

    /**
     * @param suppliers desired value for the property suppliers. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     */
    public void setSuppliers(List<String> suppliers);

    /**
     * @return Returns the List of Strings for the property unitNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    public List<String> getUnitNames();

    /**
     * @param unitNames desired value for the property unitNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     */
    public void setUnitNames(List<String> unitNames);

    /**
     * @return Returns the List of Strings for the property unitSymbols. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    public List<String> getUnitSymbols();

    /**
     * @param unitSymbols desired value for the property unitSymbols. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     */
    public void setUnitSymbols(List<String> unitSymbols);

}
