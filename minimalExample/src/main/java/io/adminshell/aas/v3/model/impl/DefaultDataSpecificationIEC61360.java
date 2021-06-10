package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.builder.*;

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
    protected List<DataTypeIEC61360> dataTypes = new ArrayList<>();

    /**
     * "has definition" "Constraint AASd-074: For all ConceptDescriptions except for ConceptDescriptions
     * of category VALUE using data specification template IEC61360
     * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) -
     * DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."@en
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    protected List<LangStringSet> definitions = new ArrayList<>();

    /**
     * "has preferred name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    protected List<LangStringSet> preferredNames = new ArrayList<>();

    /**
     * "has short name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    protected List<LangStringSet> shortNames = new ArrayList<>();

    /**
     * "has source of definition"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    protected List<String> sourceOfDefinitions = new ArrayList<>();

    /**
     * "has unit"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    protected List<String> units = new ArrayList<>();

    /**
     * "has unit id"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    protected List<Reference> unitIds = new ArrayList<>();

    public DefaultDataSpecificationIEC61360() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dataTypes,
            this.definitions,
            this.shortNames,
            this.preferredNames,
            this.sourceOfDefinitions,
            this.units,
            this.unitIds});
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
            return Objects.equals(this.dataTypes, other.dataTypes) &&
                Objects.equals(this.definitions, other.definitions) &&
                Objects.equals(this.shortNames, other.shortNames) &&
                Objects.equals(this.preferredNames, other.preferredNames) &&
                Objects.equals(this.sourceOfDefinitions, other.sourceOfDefinitions) &&
                Objects.equals(this.units, other.units) &&
                Objects.equals(this.unitIds, other.unitIds);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    final public List<DataTypeIEC61360> getDataTypes() {
        return dataTypes;
    }

    final public void setDataTypes(List<DataTypeIEC61360> dataTypes) {
        this.dataTypes = dataTypes;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    final public List<LangStringSet> getDefinitions() {
        return definitions;
    }

    final public void setDefinitions(List<LangStringSet> definitions) {
        this.definitions = definitions;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    final public List<LangStringSet> getShortNames() {
        return shortNames;
    }

    final public void setShortNames(List<LangStringSet> shortNames) {
        this.shortNames = shortNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    final public List<LangStringSet> getPreferredNames() {
        return preferredNames;
    }

    final public void setPreferredNames(List<LangStringSet> preferredNames) {
        this.preferredNames = preferredNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    final public List<String> getSourceOfDefinitions() {
        return sourceOfDefinitions;
    }

    final public void setSourceOfDefinitions(List<String> sourceOfDefinitions) {
        this.sourceOfDefinitions = sourceOfDefinitions;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    final public List<String> getUnits() {
        return units;
    }

    final public void setUnits(List<String> units) {
        this.units = units;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    final public List<Reference> getUnitIds() {
        return unitIds;
    }

    final public void setUnitIds(List<Reference> unitIds) {
        this.unitIds = unitIds;
    }

    public static class Builder extends DefaultDataSpecificationIEC61360Builder<DefaultDataSpecificationIEC61360, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecificationIEC61360 newBuildingInstance() {
            return new DefaultDataSpecificationIEC61360();
        }
    }
}
