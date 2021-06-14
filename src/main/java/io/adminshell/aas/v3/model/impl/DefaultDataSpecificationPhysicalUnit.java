package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * "Data Specification Physical Unit" "Data Specification Template for Physical Units."@en
 */

public class DefaultDataSpecificationPhysicalUnit implements DataSpecificationPhysicalUnit {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has conversion factor"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    protected String conversionFactor;

    /**
     * "has definition"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    protected List<LangString> definitions = new ArrayList<>();

    /**
     * "has DIN notation"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    protected String dinNotation;

    /**
     * "has ECE code"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    protected String eceCode;

    /**
     * "has ECE name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    protected String eceName;

    /**
     * "has NIST name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    protected String nistName;

    /**
     * "has registration authority"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    protected String registrationAuthorityId;

    /**
     * "has SI name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    protected String siName;

    /**
     * "has SI notation"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    protected String siNotation;

    /**
     * "has supplier"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    protected String supplier;

    /**
     * "unit has name"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    protected String unitName;

    /**
     * "unit has symbol"
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    protected String unitSymbol;

    public DefaultDataSpecificationPhysicalUnit() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.conversionFactor,
            this.definitions,
            this.dinNotation,
            this.eceCode,
            this.eceName,
            this.nistName,
            this.siName,
            this.siNotation,
            this.registrationAuthorityId,
            this.supplier,
            this.unitName,
            this.unitSymbol});
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
            return Objects.equals(this.conversionFactor, other.conversionFactor) &&
                Objects.equals(this.definitions, other.definitions) &&
                Objects.equals(this.dinNotation, other.dinNotation) &&
                Objects.equals(this.eceCode, other.eceCode) &&
                Objects.equals(this.eceName, other.eceName) &&
                Objects.equals(this.nistName, other.nistName) &&
                Objects.equals(this.siName, other.siName) &&
                Objects.equals(this.siNotation, other.siNotation) &&
                Objects.equals(this.registrationAuthorityId, other.registrationAuthorityId) &&
                Objects.equals(this.supplier, other.supplier) &&
                Objects.equals(this.unitName, other.unitName) &&
                Objects.equals(this.unitSymbol, other.unitSymbol);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    final public String getConversionFactor() {
        return conversionFactor;
    }

    final public void setConversionFactor(String conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    final public List<LangString> getDefinitions() {
        return definitions;
    }

    final public void setDefinitions(List<LangString> definitions) {
        this.definitions = definitions;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    final public String getDinNotation() {
        return dinNotation;
    }

    final public void setDinNotation(String dinNotation) {
        this.dinNotation = dinNotation;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    final public String getEceCode() {
        return eceCode;
    }

    final public void setEceCode(String eceCode) {
        this.eceCode = eceCode;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    final public String getEceName() {
        return eceName;
    }

    final public void setEceName(String eceName) {
        this.eceName = eceName;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    final public String getNistName() {
        return nistName;
    }

    final public void setNistName(String nistName) {
        this.nistName = nistName;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    final public String getSiName() {
        return siName;
    }

    final public void setSiName(String siName) {
        this.siName = siName;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    final public String getSiNotation() {
        return siNotation;
    }

    final public void setSiNotation(String siNotation) {
        this.siNotation = siNotation;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    final public String getRegistrationAuthorityId() {
        return registrationAuthorityId;
    }

    final public void setRegistrationAuthorityId(String registrationAuthorityId) {
        this.registrationAuthorityId = registrationAuthorityId;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    final public String getSupplier() {
        return supplier;
    }

    final public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    final public String getUnitName() {
        return unitName;
    }

    final public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    final public String getUnitSymbol() {
        return unitSymbol;
    }

    final public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }

    public static class Builder extends DataSpecificationPhysicalUnitBuilder<DefaultDataSpecificationPhysicalUnit, Builder> {

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
