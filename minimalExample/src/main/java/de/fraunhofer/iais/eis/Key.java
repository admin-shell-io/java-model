package de.fraunhofer.iais.eis;

import java.lang.String;

/**
 * A key is a reference to an element by its id.
 */
public interface Key {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * Type of the key value. In case of idType = idShort local shall be true.
     * In case type=GlobalReference idType shall not be IdShort.
     *
     * Constraint AASd-080: In case Key/type == GlobalReference idType shall not
     * be any LocalKeyType (IdShort, FragmentId).
     *
     * Constraint AASd-081: In caseKey/type==AssetAdministrationShell Key/idType
     * shall not be any LocalKeyType (IdShort, FragmentId).
     *
     * @return Returns the KeyType for the property idType.
     */
    public KeyType getIdType();

    /**
     * Denote which kind of entity is referenced. In case type = GlobalReference
     * then the element is a global unique id. In all other cases the key
     * references a model element of the same or of another AAS. The name of the
     * model element is explicitly listed.
     *
     * @return Returns the KeyElements for the property type.
     */
    public KeyElements getType();

    /**
     * The key value, for example an IRDI if the idType=IRDI.
     *
     * @return Returns the String for the property value.
     */
    public String getValue();

}
