package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Data Specification Template for defining Property Descriptions conformant to IEC 61360.
 * Constraint AASd-075: For all ConceptDescriptions using data specification template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the
 * attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and
 * Table 12.depending on its category are ignored and handled as undefined.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationIEC61360.class)
})
public interface DataSpecificationIEC61360 extends DataSpecificationContent {

    /**
     * Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data
     * specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined.
     *
     * Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is STRING by default.
     *
     * Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL.
     *
     * Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined.
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
     *
     * @return Returns the List of DataTypeIEC61360s for the property dataTypes.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    List<DataTypeIEC61360> getDataTypes();

    /**
     * Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data
     * specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined.
     *
     * Constraint AASd-071: For a ConceptDescription with category REFERENCE using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is STRING by default.
     *
     * Constraint AASd-072: For a ConceptDescription with category DOCUMENT using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL.
     *
     * Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined.
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
     *
     * @param dataTypes desired value for the property dataTypes.
     */
    void setDataTypes(List<DataTypeIEC61360> dataTypes);

    /**
     * Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE
     * using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English.
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
     *
     * @return Returns the List of LangStringSets for the property definitions.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    List<LangStringSet> getDefinitions();

    /**
     * Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category VALUE
     * using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English.
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
     *
     * @param definitions desired value for the property definitions.
     */
    void setDefinitions(List<LangStringSet> definitions);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
     *
     * @return Returns the List of LangStringSets for the property shortNames.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    List<LangStringSet> getShortNames();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
     *
     * @param shortNames desired value for the property shortNames.
     */
    void setShortNames(List<LangStringSet> shortNames);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
     *
     * @return Returns the List of LangStringSets for the property preferredNames.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    List<LangStringSet> getPreferredNames();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
     *
     * @param preferredNames desired value for the property preferredNames.
     */
    void setPreferredNames(List<LangStringSet> preferredNames);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
     *
     * @return Returns the List of Strings for the property sourceOfDefinitions.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    List<String> getSourceOfDefinitions();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
     *
     * @param sourceOfDefinitions desired value for the property sourceOfDefinitions.
     */
    void setSourceOfDefinitions(List<String> sourceOfDefinitions);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
     *
     * @return Returns the List of Strings for the property units.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    List<String> getUnits();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
     *
     * @param units desired value for the property units.
     */
    void setUnits(List<String> units);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
     *
     * @return Returns the List of References for the property unitIds.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    List<Reference> getUnitIds();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
     *
     * @param unitIds desired value for the property unitIds.
     */
    void setUnitIds(List<Reference> unitIds);

}
