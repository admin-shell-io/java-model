package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Entity
 * 
 * An entity is a submodel element that is used to model entities. Constraint AASd-056: The
 * semanticId of a Entity submodel element shall only reference a ConceptDescription with the
 * category ENTITY. The ConceptDescription describes the elements assigned to the entity via
 * Entity/statement.
 */

public class DefaultEntity implements Entity {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Describes whether the entity is a co-managed entity or a self-managed entity.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    protected EntityType entityType;

    /**
     * Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell. The asset attribute must be set if entityType is
     * set to 'SelfManagedEntity'. It is empty otherwise. Constraint AASd-014: Either the attribute
     * globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to
     * 'SelfManagedEntity'. They are not existing otherwise.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    protected IdentifierKeyValuePair externalAssetId;

    /**
     * Reference to the asset the entity is representing. The asset attribute must be set if entityType
     * is set to 'SelfManagedEntity'. It is empty otherwise. Constraint AASd-014: Either the attribute
     * globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to
     * 'SelfManagedEntity'. They are not existing otherwise.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    protected Reference globalAssetId;

    /**
     * Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    protected List<SubmodelElement> statements = new ArrayList<>();

    /**
     * Global reference to the data specification template used by the element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    /**
     * ModelingKind of the element: either type or instance.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected ModelingKind kind;

    /**
     * Points to the Expression Semantic of the Submodels The semantic id might refer to an external
     * information source, which explains the formulation of the submodel (for example an PDF if a
     * standard).
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    /**
     * Additional qualification of a qualifiable element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers = new ArrayList<>();

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected String category;

    /**
     * Description or comments on the element. The description can be provided in several languages.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    /**
     * Display name. Can be provided in several languages.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames = new ArrayList<>();

    /**
     * Identifying string of the element within its name space. Constraint AASd-002: idShort shall only
     * feature letters, digits, underscore ('_'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+.
     * Constraint AASd-003: idShort shall be matched case-insensitive. Constraint AASd-022: idShort of
     * non-identifiable referables shall be unqiue in its namespace. Note: In case the element is a
     * property and the property has a semantic definition (HasSemantics) the idShort is typically
     * identical to the short name in English. Note: In case of an identifiable element idShort is
     * optional but recommended to be defined. It can be used for unique reference in its name space and
     * thus allows better usability and a more performant implementation. In this case it is similar to
     * the 'BrowserPath' in OPC UA.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    public DefaultEntity() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.globalAssetId,
            this.externalAssetId,
            this.entityType,
            this.statements,
            this.category,
            this.descriptions,
            this.displayNames,
            this.idShort,
            this.qualifiers,
            this.dataSpecifications,
            this.kind,
            this.semanticId});
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
            DefaultEntity other = (DefaultEntity) obj;
            return Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.externalAssetId, other.externalAssetId) &&
                Objects.equals(this.entityType, other.entityType) &&
                Objects.equals(this.statements, other.statements) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    final public Reference getGlobalAssetId() {
        return globalAssetId;
    }

    final public void setGlobalAssetId(Reference globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    final public IdentifierKeyValuePair getExternalAssetId() {
        return externalAssetId;
    }

    final public void setExternalAssetId(IdentifierKeyValuePair externalAssetId) {
        this.externalAssetId = externalAssetId;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    final public EntityType getEntityType() {
        return entityType;
    }

    final public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    final public List<SubmodelElement> getStatements() {
        return statements;
    }

    final public void setStatements(List<SubmodelElement> statements) {
        this.statements = statements;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public String getCategory() {
        return category;
    }

    final public void setCategory(String category) {
        this.category = category;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    final public List<LangString> getDescriptions() {
        return descriptions;
    }

    final public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    final public List<LangString> getDisplayNames() {
        return displayNames;
    }

    final public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    final public String getIdShort() {
        return idShort;
    }

    final public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    final public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    final public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    final public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    final public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    final public ModelingKind getKind() {
        return kind;
    }

    final public void setKind(ModelingKind kind) {
        this.kind = kind;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public Reference getSemanticId() {
        return semanticId;
    }

    final public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    public static class Builder extends EntityBuilder<DefaultEntity, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEntity newBuildingInstance() {
            return new DefaultEntity();
        }
    }
}
