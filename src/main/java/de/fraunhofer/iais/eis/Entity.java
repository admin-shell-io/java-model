package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Entity" "An entity is a submodel element that is used to model entities."@en "Constraint
 * AASd-056: The semanticId of a Entity submodel element shall only reference a ConceptDescription
 * with the category ENTITY. The ConceptDescription describes the elements assigned to the entity
 * via Entity/statement."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEntity.class)
})
public interface Entity extends ModelClass, SubmodelElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Reference to the asset the entity is representing."@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @return Returns the List of References for the property globalAssetIds. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    public List<Reference> getGlobalAssetIds();

    /**
     * "Reference to the asset the entity is representing."@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @param globalAssetIds desired value for the property globalAssetIds. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     */
    public void setGlobalAssetIds(List<Reference> globalAssetIds);

    /**
     * "Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell. "@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @return Returns the List of IdentifierKeyValuePairs for the property externalAssetIds. More
     *         information under https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    public List<IdentifierKeyValuePair> getExternalAssetIds();

    /**
     * "Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell. "@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @param externalAssetIds desired value for the property externalAssetIds. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId
     */
    public void setExternalAssetIds(List<IdentifierKeyValuePair> externalAssetIds);

    /**
     * "Describes whether the entity is a co-managed entity or a self-managed entity."@en
     * 
     * @return Returns the List of EntityTypes for the property entityTypes. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    public List<EntityType> getEntityTypes();

    /**
     * "Describes whether the entity is a co-managed entity or a self-managed entity."@en
     * 
     * @param entityTypes desired value for the property entityTypes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     */
    public void setEntityTypes(List<EntityType> entityTypes);

    /**
     * "Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value."@en
     * 
     * @return Returns the List of SubmodelElements for the property statements. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Entity/statement
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    public List<SubmodelElement> getStatements();

    /**
     * "Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value."@en
     * 
     * @param statements desired value for the property statements. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/statement
     */
    public void setStatements(List<SubmodelElement> statements);

}
