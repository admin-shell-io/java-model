package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Entity" "An entity is a submodel element that is used to model entities."@en "Constraint
 * AASd-056: The semanticId of a Entity submodel element shall only reference a ConceptDescription
 * with the category ENTITY. The ConceptDescription describes the elements assigned to the entity
 * via Entity/statement."@en
 */

public class DefaultEntity implements Entity {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has entity type" "Describes whether the entity is a co-managed entity or a self-managed
     * entity."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    protected List<EntityType> entityTypes;

    /**
     * "has external asset id" "Reference to an identifier key value pair representing an external
     * identifier of the asset represented by the asset administration shell. "@en "The asset attribute
     * must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint
     * AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    protected List<IdentifierKeyValuePair> externalAssetIds;

    /**
     * "has global asset id" "Reference to the asset the entity is representing."@en "The asset
     * attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en
     * "Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    protected List<Reference> globalAssetIds;

    /**
     * "has statement" "Describes statements applicable to the entity by a set of submodel elements,
     * typically with a qualified value."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    protected List<SubmodelElement> statements;

    /**
     * "has Data Specification" "Global reference to the data specification template used by the
     * element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications;

    /**
     * "has kind" "ModelingKind of the element: either type or instance."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected List<ModelingKind> kinds;

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected List<Reference> semanticIds;

    /**
     * "has qualifier" "Additional qualification of a qualifiable element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers;

    /**
     * "has referable category" "The category is a value that gives further meta information w.r.t. to
     * the class of the element. It affects the expected existence of attributes and the applicability
     * of constraints."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected List<String> categories;

    /**
     * "has description" "Description or comments on the element. The description can be provided in
     * several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions;

    /**
     * "has display name" "Display name. Can be provided in several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames;

    /**
     * "has short id" "Identifying string of the element within its name space."@en "Constraint
     * AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small
     * letter. I.e. [a-z][a-zA-Z0-9_]+."@en "Constraint AASd-003: idShort shall be matched
     * case-insensitive."@en "Constraint AASd-022: idShort of non-identifiable referables shall be
     * unqiue in its namespace."@en "Note: In case the element is a property and the property has a
     * semantic definition (HasSemantics) the idShort is typically identical to the short name in
     * English. "@en "Note: In case of an identifiable element idShort is optional but recommended to be
     * defined. It can be used for unique reference in its name space and thus allows better usability
     * and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC
     * UA."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected List<String> idShorts;

    // no manual construction
    protected DefaultEntity() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.globalAssetIds,
            this.externalAssetIds,
            this.entityTypes,
            this.statements,
            this.categories,
            this.descriptions,
            this.displayNames,
            this.idShorts,
            this.qualifiers,
            this.dataSpecifications,
            this.kinds,
            this.semanticIds});
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
            return Objects.equals(this.globalAssetIds, other.globalAssetIds) &&
                Objects.equals(this.externalAssetIds, other.externalAssetIds) &&
                Objects.equals(this.entityTypes, other.entityTypes) &&
                Objects.equals(this.statements, other.statements) &&
                Objects.equals(this.categories, other.categories) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShorts, other.idShorts) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kinds, other.kinds) &&
                Objects.equals(this.semanticIds, other.semanticIds);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultEntity other = new DefaultEntity();
        other.globalAssetIds = (List<Reference>) Util.clone(this.globalAssetIds);
        other.externalAssetIds = (List<IdentifierKeyValuePair>) Util.clone(this.externalAssetIds);
        other.entityTypes = (List<EntityType>) Util.clone(this.entityTypes);
        other.statements = (List<SubmodelElement>) Util.clone(this.statements);
        other.categories = (List<String>) Util.clone(this.categories);
        other.descriptions = (List<LangString>) Util.clone(this.descriptions);
        other.displayNames = (List<LangString>) Util.clone(this.displayNames);
        other.idShorts = (List<String>) Util.clone(this.idShorts);
        other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
        other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
        other.kinds = (List<ModelingKind>) Util.clone(this.kinds);
        other.semanticIds = (List<Reference>) Util.clone(this.semanticIds);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    final public List<Reference> getGlobalAssetIds() {
        return globalAssetIds;
    }

    final public void setGlobalAssetIds(List<Reference> globalAssetIds) {
        this.globalAssetIds = globalAssetIds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    final public List<IdentifierKeyValuePair> getExternalAssetIds() {
        return externalAssetIds;
    }

    final public void setExternalAssetIds(List<IdentifierKeyValuePair> externalAssetIds) {
        this.externalAssetIds = externalAssetIds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    final public List<EntityType> getEntityTypes() {
        return entityTypes;
    }

    final public void setEntityTypes(List<EntityType> entityTypes) {
        this.entityTypes = entityTypes;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    final public List<SubmodelElement> getStatements() {
        return statements;
    }

    final public void setStatements(List<SubmodelElement> statements) {
        this.statements = statements;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public List<String> getCategories() {
        return categories;
    }

    final public void setCategories(List<String> categories) {
        this.categories = categories;
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
    final public List<String> getIdShorts() {
        return idShorts;
    }

    final public void setIdShorts(List<String> idShorts) {
        this.idShorts = idShorts;
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
    final public List<ModelingKind> getKinds() {
        return kinds;
    }

    final public void setKinds(List<ModelingKind> kinds) {
        this.kinds = kinds;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public List<Reference> getSemanticIds() {
        return semanticIds;
    }

    final public void setSemanticIds(List<Reference> semanticIds) {
        this.semanticIds = semanticIds;
    }
}
