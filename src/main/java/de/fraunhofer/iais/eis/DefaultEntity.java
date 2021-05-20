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
    protected EntityType entityType;

    /**
     * "has external asset id" "Reference to an identifier key value pair representing an external
     * identifier of the asset represented by the asset administration shell. "@en "The asset attribute
     * must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint
     * AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    protected IdentifierKeyValuePair externalAssetId;

    /**
     * "has global asset id" "Reference to the asset the entity is representing."@en "The asset
     * attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en
     * "Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    protected Reference globalAssetId;

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
    protected ModelingKind kind;

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

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
    protected String category;

    /**
     * "has description" "Description or comments on the element. The description can be provided in
     * several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected LangString description;

    /**
     * "has display name" "Display name. Can be provided in several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected LangString displayName;

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
    protected String idShort;

    // no manual construction
    protected DefaultEntity() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.globalAssetId,
            this.externalAssetId,
            this.entityType,
            this.statements,
            this.category,
            this.description,
            this.displayName,
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
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultEntity other = new DefaultEntity();
        other.globalAssetId = (Reference) Util.clone(this.globalAssetId);
        other.externalAssetId = (IdentifierKeyValuePair) Util.clone(this.externalAssetId);
        other.entityType = (EntityType) Util.clone(this.entityType);
        other.statements = (List<SubmodelElement>) Util.clone(this.statements);
        other.category = (String) Util.clone(this.category);
        other.description = (LangString) Util.clone(this.description);
        other.displayName = (LangString) Util.clone(this.displayName);
        other.idShort = (String) Util.clone(this.idShort);
        other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
        other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
        other.kind = (ModelingKind) Util.clone(this.kind);
        other.semanticId = (Reference) Util.clone(this.semanticId);
        return other;
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
    final public LangString getDescription() {
        return description;
    }

    final public void setDescription(LangString description) {
        this.description = description;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    final public LangString getDisplayName() {
        return displayName;
    }

    final public void setDisplayName(LangString displayName) {
        this.displayName = displayName;
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
}
