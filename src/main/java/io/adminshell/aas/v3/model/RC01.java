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
    @KnownSubtypes.Type(value = DefaultRC01.class)
})
public interface RC01 extends ModelClass, DataSpecificationContent {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * @return Returns the String for the property conversionFactor. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
    public String getConversionFactor();

    /**
     * @param conversionFactor desired value for the property conversionFactor. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
     */
    public void setConversionFactor(String conversionFactor);

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
     * @return Returns the String for the property dinNotation. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
    public String getDinNotation();

    /**
     * @param dinNotation desired value for the property dinNotation. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
     */
    public void setDinNotation(String dinNotation);

    /**
     * @return Returns the String for the property eceCode. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
    public String getEceCode();

    /**
     * @param eceCode desired value for the property eceCode. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
     */
    public void setEceCode(String eceCode);

    /**
     * @return Returns the String for the property eceName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
    public String getEceName();

    /**
     * @param eceName desired value for the property eceName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
     */
    public void setEceName(String eceName);

    /**
     * @return Returns the String for the property nistName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
    public String getNistName();

    /**
     * @param nistName desired value for the property nistName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
     */
    public void setNistName(String nistName);

    /**
     * @return Returns the String for the property siName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
    public String getSiName();

    /**
     * @param siName desired value for the property siName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
     */
    public void setSiName(String siName);

    /**
     * @return Returns the String for the property siNotation. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
    public String getSiNotation();

    /**
     * @param siNotation desired value for the property siNotation. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
     */
    public void setSiNotation(String siNotation);

    /**
     * @return Returns the String for the property registrationAuthorityId. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
    public String getRegistrationAuthorityId();

    /**
     * @param registrationAuthorityId desired value for the property registrationAuthorityId. More
     *        information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
     */
    public void setRegistrationAuthorityId(String registrationAuthorityId);

    /**
     * @return Returns the String for the property supplier. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
    public String getSupplier();

    /**
     * @param supplier desired value for the property supplier. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
     */
    public void setSupplier(String supplier);

    /**
     * @return Returns the String for the property unitName. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
    public String getUnitName();

    /**
     * @param unitName desired value for the property unitName. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
     */
    public void setUnitName(String unitName);

    /**
     * @return Returns the String for the property unitSymbol. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
    public String getUnitSymbol();

    /**
     * @param unitSymbol desired value for the property unitSymbol. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
     */
    public void setUnitSymbol(String unitSymbol);

}
