/*
Copyright (c) 2021 Fraunhofer IOSB-INA Lemgo,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IOSB-ILT Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IAIS,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IESE,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IWU Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

This source code is licensed under the Apache License 2.0 (see LICENSE.txt).

This source code may use other Open Source software components (see LICENSE.txt).
 */
package io.adminshell.aas.v3.model.impl;

import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Range
 *
 * An element that is referable by its idShort. This id is not globally unique.
 * This id is unique within the name space of the element. Constraint AASd-053:
 * The semanticId of a Range submodel element shall only reference a
 * ConceptDescription with the category PROPERTY. Constraint AASd-068: If the
 * semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/dataType shall be a numerical one, i.e. REAL_* or
 * RATIONAL_*. Constraint AASd-069: If the semanticId of a Range references a
 * ConceptDescription then DataSpecificationIEC61360/levelType shall be
 * identical to the set {Min,Max}.
 */
public class DefaultRange implements Range {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/embeddedDataSpecification")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected ModelingKind kind;

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    protected String max;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    protected String min;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/valueType")
    protected String valueType;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    public DefaultRange() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.valueType,
                this.max,
                this.min,
                this.category,
                this.descriptions,
                this.displayNames,
                this.idShort,
                this.qualifiers,
                this.embeddedDataSpecifications,
                this.kind,
                this.semanticId);
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
            DefaultRange other = (DefaultRange) obj;
            return Objects.equals(this.valueType, other.valueType)
                    && Objects.equals(this.max, other.max)
                    && Objects.equals(this.min, other.min)
                    && Objects.equals(this.category, other.category)
                    && Objects.equals(this.descriptions, other.descriptions)
                    && Objects.equals(this.displayNames, other.displayNames)
                    && Objects.equals(this.idShort, other.idShort)
                    && Objects.equals(this.qualifiers, other.qualifiers)
                    && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications)
                    && Objects.equals(this.kind, other.kind)
                    && Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public String getValueType() {
        return valueType;
    }

    @Override
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public String getMax() {
        return max;
    }

    @Override
    public void setMax(String max) {
        this.max = max;
    }

    @Override
    public String getMin() {
        return min;
    }

    @Override
    public void setMin(String min) {
        this.min = min;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public List<LangString> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<LangString> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @Override
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    @Override
    public ModelingKind getKind() {
        return kind;
    }

    @Override
    public void setKind(ModelingKind kind) {
        this.kind = kind;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    /**
     * This builder class can be used to construct a DefaultRange bean.
     */
    public static class Builder extends RangeBuilder<DefaultRange, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultRange newBuildingInstance() {
            return new DefaultRange();
        }
    }
}