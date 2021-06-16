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

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     *
     * @return Returns the String for the property conversionFactor.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    public String getConversionFactor();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     *
     * @param conversionFactor desired value for the property conversionFactor.
     */
    public void setConversionFactor(String conversionFactor);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition
     *
     * @return Returns the List of LangStrings for the property definitions.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    public List<LangString> getDefinitions();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition
     *
     * @param definitions desired value for the property definitions.
     */
    public void setDefinitions(List<LangString> definitions);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     *
     * @return Returns the String for the property dinNotation.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    public String getDinNotation();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     *
     * @param dinNotation desired value for the property dinNotation.
     */
    public void setDinNotation(String dinNotation);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     *
     * @return Returns the String for the property eceCode.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    public String getEceCode();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     *
     * @param eceCode desired value for the property eceCode.
     */
    public void setEceCode(String eceCode);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     *
     * @return Returns the String for the property eceName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    public String getEceName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     *
     * @param eceName desired value for the property eceName.
     */
    public void setEceName(String eceName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     *
     * @return Returns the String for the property nistName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    public String getNistName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     *
     * @param nistName desired value for the property nistName.
     */
    public void setNistName(String nistName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     *
     * @return Returns the String for the property siName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    public String getSiName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     *
     * @param siName desired value for the property siName.
     */
    public void setSiName(String siName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     *
     * @return Returns the String for the property siNotation.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    public String getSiNotation();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     *
     * @param siNotation desired value for the property siNotation.
     */
    public void setSiNotation(String siNotation);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     *
     * @return Returns the String for the property registrationAuthorityId.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    public String getRegistrationAuthorityId();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     *
     * @param registrationAuthorityId desired value for the property registrationAuthorityId.
     */
    public void setRegistrationAuthorityId(String registrationAuthorityId);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     *
     * @return Returns the String for the property supplier.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    public String getSupplier();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     *
     * @param supplier desired value for the property supplier.
     */
    public void setSupplier(String supplier);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     *
     * @return Returns the String for the property unitName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    public String getUnitName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     *
     * @param unitName desired value for the property unitName.
     */
    public void setUnitName(String unitName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     *
     * @return Returns the String for the property unitSymbol.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    public String getUnitSymbol();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     *
     * @param unitSymbol desired value for the property unitSymbol.
     */
    public void setUnitSymbol(String unitSymbol);

}
