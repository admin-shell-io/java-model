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
 * "Data Specification Physical Unit" "Data Specification Template for Physical Units."@en
 */

public class DefaultDataSpecificationPhysicalUnit implements DataSpecificationPhysicalUnit {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has conversion factor"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    protected List<String> conversionFactors = new ArrayList<>();

    /**
     * "has definition"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    protected List<LangString> definitions = new ArrayList<>();

    /**
     * "has DIN notation"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    protected List<String> dinNotations = new ArrayList<>();

    /**
     * "has ECE code"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    protected List<String> eceCodes = new ArrayList<>();

    /**
     * "has ECE name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    protected List<String> eceNames = new ArrayList<>();

    /**
     * "has NIST name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    protected List<String> nistNames = new ArrayList<>();

    /**
     * "has registration authority"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    protected List<String> registrationAuthorityIds = new ArrayList<>();

    /**
     * "has SI name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    protected List<String> siNames = new ArrayList<>();

    /**
     * "has SI notation"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    protected List<String> siNotations = new ArrayList<>();

    /**
     * "has supplier"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    protected List<String> suppliers = new ArrayList<>();

    /**
     * "unit has name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    protected List<String> unitNames = new ArrayList<>();

    /**
     * "unit has symbol"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    protected List<String> unitSymbols = new ArrayList<>();

    public DefaultDataSpecificationPhysicalUnit() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.conversionFactors,
            this.definitions,
            this.dinNotations,
            this.eceCodes,
            this.eceNames,
            this.nistNames,
            this.siNames,
            this.siNotations,
            this.registrationAuthorityIds,
            this.suppliers,
            this.unitNames,
            this.unitSymbols});
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
            DefaultDataSpecificationPhysicalUnit other = (DefaultDataSpecificationPhysicalUnit) obj;
            return Objects.equals(this.conversionFactors, other.conversionFactors) &&
                Objects.equals(this.definitions, other.definitions) &&
                Objects.equals(this.dinNotations, other.dinNotations) &&
                Objects.equals(this.eceCodes, other.eceCodes) &&
                Objects.equals(this.eceNames, other.eceNames) &&
                Objects.equals(this.nistNames, other.nistNames) &&
                Objects.equals(this.siNames, other.siNames) &&
                Objects.equals(this.siNotations, other.siNotations) &&
                Objects.equals(this.registrationAuthorityIds, other.registrationAuthorityIds) &&
                Objects.equals(this.suppliers, other.suppliers) &&
                Objects.equals(this.unitNames, other.unitNames) &&
                Objects.equals(this.unitSymbols, other.unitSymbols);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    final public List<String> getConversionFactors() {
        return conversionFactors;
    }

    final public void setConversionFactors(List<String> conversionFactors) {
        this.conversionFactors = conversionFactors;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    final public List<LangString> getDefinitions() {
        return definitions;
    }

    final public void setDefinitions(List<LangString> definitions) {
        this.definitions = definitions;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    final public List<String> getDinNotations() {
        return dinNotations;
    }

    final public void setDinNotations(List<String> dinNotations) {
        this.dinNotations = dinNotations;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    final public List<String> getEceCodes() {
        return eceCodes;
    }

    final public void setEceCodes(List<String> eceCodes) {
        this.eceCodes = eceCodes;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    final public List<String> getEceNames() {
        return eceNames;
    }

    final public void setEceNames(List<String> eceNames) {
        this.eceNames = eceNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    final public List<String> getNistNames() {
        return nistNames;
    }

    final public void setNistNames(List<String> nistNames) {
        this.nistNames = nistNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    final public List<String> getSiNames() {
        return siNames;
    }

    final public void setSiNames(List<String> siNames) {
        this.siNames = siNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    final public List<String> getSiNotations() {
        return siNotations;
    }

    final public void setSiNotations(List<String> siNotations) {
        this.siNotations = siNotations;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    final public List<String> getRegistrationAuthorityIds() {
        return registrationAuthorityIds;
    }

    final public void setRegistrationAuthorityIds(List<String> registrationAuthorityIds) {
        this.registrationAuthorityIds = registrationAuthorityIds;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    final public List<String> getSuppliers() {
        return suppliers;
    }

    final public void setSuppliers(List<String> suppliers) {
        this.suppliers = suppliers;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    final public List<String> getUnitNames() {
        return unitNames;
    }

    final public void setUnitNames(List<String> unitNames) {
        this.unitNames = unitNames;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    final public List<String> getUnitSymbols() {
        return unitSymbols;
    }

    final public void setUnitSymbols(List<String> unitSymbols) {
        this.unitSymbols = unitSymbols;
    }

    public static class Builder extends DefaultDataSpecificationPhysicalUnitBuilder<DefaultDataSpecificationPhysicalUnit, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecificationPhysicalUnit newBuildingInstance() {
            return new DefaultDataSpecificationPhysicalUnit();
        }
    }
}
