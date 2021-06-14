package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Key" "A key is a reference to an element by its id."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultKey.class)
})
public interface Key {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort."@en "Constraint AASd-080: In case Key/type ==
     * GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en "Constraint
     * AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any LocalKeyType
     * (IdShort, FragmentId)."@en
     * 
     * @return Returns the KeyType for the property idType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Key/idType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/idType")
    public KeyType getIdType();

    /**
     * "Type of the key value. In case of idType = idShort local shall be true. In case
     * type=GlobalReference idType shall not be IdShort."@en "Constraint AASd-080: In case Key/type ==
     * GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en "Constraint
     * AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any LocalKeyType
     * (IdShort, FragmentId)."@en
     * 
     * @param idType desired value for the property idType. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Key/idType
     */
    public void setIdType(KeyType idType);

    /**
     * "Denote which kind of entity is referenced. In case type = GlobalReference then the element is a
     * global unique id. In all other cases the key references a model element of the same or of another
     * AAS. The name of the model element is explicitly listed."@en
     * 
     * @return Returns the KeyElements for the property type. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Key/type
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/type")
    public KeyElements getType();

    /**
     * "Denote which kind of entity is referenced. In case type = GlobalReference then the element is a
     * global unique id. In all other cases the key references a model element of the same or of another
     * AAS. The name of the model element is explicitly listed."@en
     * 
     * @param type desired value for the property type. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Key/type
     */
    public void setType(KeyElements type);

    /**
     * "The key value, for example an IRDI if the idType=IRDI."@en
     * 
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Key/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Key/value")
    public String getValue();

    /**
     * "The key value, for example an IRDI if the idType=IRDI."@en
     * 
     * @param value desired value for the property value. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Key/value
     */
    public void setValue(String value);

}
