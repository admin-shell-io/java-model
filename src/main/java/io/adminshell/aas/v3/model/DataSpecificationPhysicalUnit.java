package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Data Specification Template for Physical Units.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationPhysicalUnit.class)
})
public interface DataSpecificationPhysicalUnit extends DataSpecificationContent {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * @return Returns the String for the property conversionFactor. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    public String getConversionFactor();

    /**
     * @param conversionFactor desired value for the property conversionFactor. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     */
    public void setConversionFactor(String conversionFactor);

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
     * @return Returns the String for the property dinNotation. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    public String getDinNotation();

    /**
     * @param dinNotation desired value for the property dinNotation. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     */
    public void setDinNotation(String dinNotation);

    /**
     * @return Returns the String for the property eceCode. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    public String getEceCode();

    /**
     * @param eceCode desired value for the property eceCode. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     */
    public void setEceCode(String eceCode);

    /**
     * @return Returns the String for the property eceName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    public String getEceName();

    /**
     * @param eceName desired value for the property eceName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     */
    public void setEceName(String eceName);

    /**
     * @return Returns the String for the property nistName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    public String getNistName();

    /**
     * @param nistName desired value for the property nistName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     */
    public void setNistName(String nistName);

    /**
     * @return Returns the String for the property siName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    public String getSiName();

    /**
     * @param siName desired value for the property siName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     */
    public void setSiName(String siName);

    /**
     * @return Returns the String for the property siNotation. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    public String getSiNotation();

    /**
     * @param siNotation desired value for the property siNotation. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     */
    public void setSiNotation(String siNotation);

    /**
     * @return Returns the String for the property registrationAuthorityId. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    public String getRegistrationAuthorityId();

    /**
     * @param registrationAuthorityId desired value for the property registrationAuthorityId. More
     *        information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     */
    public void setRegistrationAuthorityId(String registrationAuthorityId);

    /**
     * @return Returns the String for the property supplier. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    public String getSupplier();

    /**
     * @param supplier desired value for the property supplier. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     */
    public void setSupplier(String supplier);

    /**
     * @return Returns the String for the property unitName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    public String getUnitName();

    /**
     * @param unitName desired value for the property unitName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     */
    public void setUnitName(String unitName);

    /**
     * @return Returns the String for the property unitSymbol. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    public String getUnitSymbol();

    /**
     * @param unitSymbol desired value for the property unitSymbol. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     */
    public void setUnitSymbol(String unitSymbol);

}
