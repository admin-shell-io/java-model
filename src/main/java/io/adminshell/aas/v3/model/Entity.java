package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An entity is a submodel element that is used to model entities. Constraint AASd-056: The
 * semanticId of a Entity submodel element shall only reference a ConceptDescription with the
 * category ENTITY. The ConceptDescription describes the elements assigned to the entity via
 * Entity/statement.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEntity.class)
})
public interface Entity extends SubmodelElement {

    /**
     * Reference to the asset the entity is representing.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     *
     * @return Returns the Reference for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    Reference getGlobalAssetId();

    /**
     * Reference to the asset the entity is representing.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(Reference globalAssetId);

    /**
     * Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId
     *
     * @return Returns the IdentifierKeyValuePair for the property externalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    IdentifierKeyValuePair getExternalAssetId();

    /**
     * Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId
     *
     * @param externalAssetId desired value for the property externalAssetId.
     */
    void setExternalAssetId(IdentifierKeyValuePair externalAssetId);

    /**
     * Describes whether the entity is a co-managed entity or a self-managed entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     *
     * @return Returns the EntityType for the property entityType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    EntityType getEntityType();

    /**
     * Describes whether the entity is a co-managed entity or a self-managed entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     *
     * @param entityType desired value for the property entityType.
     */
    void setEntityType(EntityType entityType);

    /**
     * Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/statement
     *
     * @return Returns the List of SubmodelElements for the property statements.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    List<SubmodelElement> getStatements();

    /**
     * Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/statement
     *
     * @param statements desired value for the property statements.
     */
    void setStatements(List<SubmodelElement> statements);

}
