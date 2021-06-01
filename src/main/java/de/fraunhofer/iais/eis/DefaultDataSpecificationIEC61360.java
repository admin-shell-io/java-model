package de.fraunhofer.iais.eis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Specification IEC 61360" "Data Specification Template for defining Property Descriptions
 * conformant to IEC 61360."@en "Constraint AASd-075: For all ConceptDescriptions using data
 * specification template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the
 * attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and
 * Table 12.depending on its category are ignored and handled as undefined."@en
 */

public class DefaultDataSpecificationIEC61360 implements DataSpecificationIEC61360 {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has datatype" "Constraint AASd-070: For a ConceptDescription with category PROPERTY or VALUE
     * using data specification template IEC61360
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
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    protected DataTypeIEC61360 dataType;

    /**
     * "has definition" "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions
     * of category VALUE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    protected List<LangString> definitions = new ArrayList<>();

    /**
     * "has level type"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
    protected List<LevelType> levelTypes = new ArrayList<>();

    /**
     * "has preferred name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    protected List<LangString> preferredNames = new ArrayList<>();

    /**
     * "has short name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    protected List<LangString> shortNames = new ArrayList<>();

    /**
     * "has source of definition"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    protected String sourceOfDefinition;

    /**
     * "has symbol"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
    protected String symbol;

    /**
     * "has unit"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    protected String unit;

    /**
     * "has unit id"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    protected Reference unitId;

    /**
     * "has value"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
    protected String value;

    /**
     * "has value format"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
    protected String valueFormat;

    /**
     * "has value id"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
    protected Reference valueId;

    /**
     * "has value list" "The Type \'ValueList\' lists all the allowed values for a concept description
     * for which the allowed values are listed in an enumeration. The value list is a set of value
     * reference pairs."@en
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
    protected ValueList valueList;

    // no manual construction
    protected DefaultDataSpecificationIEC61360() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dataType,
            this.definitions,
            this.levelTypes,
            this.preferredNames,
            this.shortNames,
            this.sourceOfDefinition,
            this.symbol,
            this.unit,
            this.unitId,
            this.valueFormat,
            this.value,
            this.valueList,
            this.valueId});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultDataSpecificationIEC61360 other = (DefaultDataSpecificationIEC61360) obj;
            return Objects.equals(this.dataType, other.dataType) &&
                Objects.equals(this.definitions, other.definitions) &&
                Objects.equals(this.levelTypes, other.levelTypes) &&
                Objects.equals(this.preferredNames, other.preferredNames) &&
                Objects.equals(this.shortNames, other.shortNames) &&
                Objects.equals(this.sourceOfDefinition, other.sourceOfDefinition) &&
                Objects.equals(this.symbol, other.symbol) &&
                Objects.equals(this.unit, other.unit) &&
                Objects.equals(this.unitId, other.unitId) &&
                Objects.equals(this.valueFormat, other.valueFormat) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueList, other.valueList) &&
                Objects.equals(this.valueId, other.valueId);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultDataSpecificationIEC61360 other = new DefaultDataSpecificationIEC61360();
        other.dataType = (DataTypeIEC61360) Util.clone(this.dataType);
        other.definitions = (List<LangString>) Util.clone(this.definitions);
        other.levelTypes = (List<LevelType>) Util.clone(this.levelTypes);
        other.preferredNames = (List<LangString>) Util.clone(this.preferredNames);
        other.shortNames = (List<LangString>) Util.clone(this.shortNames);
        other.sourceOfDefinition = (String) Util.clone(this.sourceOfDefinition);
        other.symbol = (String) Util.clone(this.symbol);
        other.unit = (String) Util.clone(this.unit);
        other.unitId = (Reference) Util.clone(this.unitId);
        other.valueFormat = (String) Util.clone(this.valueFormat);
        other.value = (String) Util.clone(this.value);
        other.valueList = (ValueList) Util.clone(this.valueList);
        other.valueId = (Reference) Util.clone(this.valueId);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    final public DataTypeIEC61360 getDataType() {
        return dataType;
    }

    final public void setDataType(DataTypeIEC61360 dataType) {
        this.dataType = dataType;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    final public List<LangString> getDefinitions() {
        return definitions;
    }

    final public void setDefinitions(List<LangString> definitions) {
        this.definitions = definitions;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
    final public List<LevelType> getLevelTypes() {
        return levelTypes;
    }

    final public void setLevelTypes(List<LevelType> levelTypes) {
        this.levelTypes = levelTypes;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    final public List<LangString> getPreferredNames() {
        return preferredNames;
    }

    final public void setPreferredNames(List<LangString> preferredNames) {
        this.preferredNames = preferredNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    final public List<LangString> getShortNames() {
        return shortNames;
    }

    final public void setShortNames(List<LangString> shortNames) {
        this.shortNames = shortNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    final public String getSourceOfDefinition() {
        return sourceOfDefinition;
    }

    final public void setSourceOfDefinition(String sourceOfDefinition) {
        this.sourceOfDefinition = sourceOfDefinition;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
    final public String getSymbol() {
        return symbol;
    }

    final public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    final public String getUnit() {
        return unit;
    }

    final public void setUnit(String unit) {
        this.unit = unit;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    final public Reference getUnitId() {
        return unitId;
    }

    final public void setUnitId(Reference unitId) {
        this.unitId = unitId;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
    final public String getValueFormat() {
        return valueFormat;
    }

    final public void setValueFormat(String valueFormat) {
        this.valueFormat = valueFormat;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
    final public String getValue() {
        return value;
    }

    final public void setValue(String value) {
        this.value = value;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
    final public ValueList getValueList() {
        return valueList;
    }

    final public void setValueList(ValueList valueList) {
        this.valueList = valueList;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
    final public Reference getValueId() {
        return valueId;
    }

    final public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }

}
