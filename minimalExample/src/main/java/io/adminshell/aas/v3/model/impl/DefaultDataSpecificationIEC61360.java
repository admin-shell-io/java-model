package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.DataSpecificationIEC61360
 * 
 * Data Specification Template for defining Property Descriptions conformant to IEC 61360.
 * Constraint AASd-075: For all ConceptDescriptions using data specification template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the
 * attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and
 * Table 12.depending on its category are ignored and handled as undefined.
 */

public class DefaultDataSpecificationIEC61360 implements DataSpecificationIEC61360 {

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    protected List<DataTypeIEC61360> dataTypes = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    protected List<LangStringSet> definitions = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    protected List<LangStringSet> preferredNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    protected List<LangStringSet> shortNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    protected List<String> sourceOfDefinitions = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    protected List<String> units = new ArrayList<>();

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

    @Override
    public List<DataTypeIEC61360> getDataTypes() {
        return dataTypes;
    }

    @Override
    public void setDataTypes(List<DataTypeIEC61360> dataTypes) {
        this.dataTypes = dataTypes;
    }

    @Override
    public List<LangStringSet> getDefinitions() {
        return definitions;
    }

    @Override
    public void setDefinitions(List<LangStringSet> definitions) {
        this.definitions = definitions;
    }

    @Override
    public List<LangStringSet> getShortNames() {
        return shortNames;
    }

    @Override
    public void setShortNames(List<LangStringSet> shortNames) {
        this.shortNames = shortNames;
    }

    @Override
    public List<LangStringSet> getPreferredNames() {
        return preferredNames;
    }

    @Override
    public void setPreferredNames(List<LangStringSet> preferredNames) {
        this.preferredNames = preferredNames;
    }

    @Override
    public List<String> getSourceOfDefinitions() {
        return sourceOfDefinitions;
    }

    @Override
    public void setSourceOfDefinitions(List<String> sourceOfDefinitions) {
        this.sourceOfDefinitions = sourceOfDefinitions;
    }

    @Override
    public List<String> getUnits() {
        return units;
    }

    @Override
    public void setUnits(List<String> units) {
        this.units = units;
    }

    @Override
    public List<Reference> getUnitIds() {
        return unitIds;
    }

    @Override
    public void setUnitIds(List<Reference> unitIds) {
        this.unitIds = unitIds;
    }

}
