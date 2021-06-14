package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Data Specification IEC 61360" "Data Specification Template for defining Property Descriptions
 * conformant to IEC 61360."@en "Constraint AASd-075: For all ConceptDescriptions using data
 * specification template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the
 * attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and
 * Table 12.depending on its category are ignored and handled as undefined."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationIEC61360.class)
})
public interface DataSpecificationIEC61360 extends DataSpecificationContent {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data
     * specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en "Constraint AASd-071:
     * For a ConceptDescription with category REFERENCE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is STRING by default."@en "Constraint AASd-072: For a
     * ConceptDescription with category DOCUMENT using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
     * "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
     * 
     * @return Returns the List of DataTypeIEC61360s for the property dataTypes. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    public List<DataTypeIEC61360> getDataTypes();

    /**
     * "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE using data
     * specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en "Constraint AASd-071:
     * For a ConceptDescription with category REFERENCE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is STRING by default."@en "Constraint AASd-072: For a
     * ConceptDescription with category DOCUMENT using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType shall be one of the following values: STRING or URL."@en
     * "Constraint AASd-073: For a ConceptDescription with category QUALIFIER using data specification
     * template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/dataType is mandatory and shall be defined."@en
     * 
     * @param dataTypes desired value for the property dataTypes. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType
     */
    public void setDataTypes(List<DataTypeIEC61360> dataTypes);

    /**
     * "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category
     * VALUE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
     * 
     * @return Returns the List of LangStringSets for the property definitions. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    public List<LangStringSet> getDefinitions();

    /**
     * "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions of category
     * VALUE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
     * 
     * @param definitions desired value for the property definitions. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition
     */
    public void setDefinitions(List<LangStringSet> definitions);

    /**
     * @return Returns the List of LangStringSets for the property shortNames. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    public List<LangStringSet> getShortNames();

    /**
     * @param shortNames desired value for the property shortNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName
     */
    public void setShortNames(List<LangStringSet> shortNames);

    /**
     * @return Returns the List of LangStringSets for the property preferredNames. More information
     *         under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    public List<LangStringSet> getPreferredNames();

    /**
     * @param preferredNames desired value for the property preferredNames. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName
     */
    public void setPreferredNames(List<LangStringSet> preferredNames);

    /**
     * @return Returns the List of Strings for the property sourceOfDefinitions. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    public List<String> getSourceOfDefinitions();

    /**
     * @param sourceOfDefinitions desired value for the property sourceOfDefinitions. More information
     *        under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition
     */
    public void setSourceOfDefinitions(List<String> sourceOfDefinitions);

    /**
     * @return Returns the List of Strings for the property units. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    public List<String> getUnits();

    /**
     * @param units desired value for the property units. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit
     */
    public void setUnits(List<String> units);

    /**
     * @return Returns the List of References for the property unitIds. More information under
     *         https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    public List<Reference> getUnitIds();

    /**
     * @param unitIds desired value for the property unitIds. More information under
     *        https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId
     */
    public void setUnitIds(List<Reference> unitIds);

}
