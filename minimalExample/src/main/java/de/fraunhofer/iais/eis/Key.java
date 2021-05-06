package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.builder.ExtendableBuilder;

/**
 * A key is a reference to an element by its id.
 */
public interface Key {

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
     * Type of the key value. In case of idType = idShort local shall be true.
     * In case type=GlobalReference idType shall not be IdShort.
     *
     * Constraint AASd-080: In case Key/type == GlobalReference idType shall not
     * be any LocalKeyType (IdShort, FragmentId).
     *
     * Constraint AASd-081: In caseKey/type==AssetAdministrationShell Key/idType
     * shall not be any LocalKeyType (IdShort, FragmentId).
     *
     * @para value the KeyType for the property idType.
     */
    public void setIdType(KeyType value);

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
     * Denote which kind of entity is referenced. In case type = GlobalReference
     * then the element is a global unique id. In all other cases the key
     * references a model element of the same or of another AAS. The name of the
     * model element is explicitly listed.
     *
     * @param value the KeyElements for the property type.
     */
    public void setType(KeyElements value);

    /**
     * The key value, for example an IRDI if the idType=IRDI.
     *
     * @return Returns the String for the property value.
     */
    public String getValue();

    /**
     * The key value, for example an IRDI if the idType=IRDI.
     *
     * @para value the String for the property value.
     */
    public void setValue(String value);

    public static abstract class AbstractBuilder<T extends Key, B extends AbstractBuilder<T, B>> extends ExtendableBuilder<T, B> {

        public B idType(KeyType value) {
            getBuildingInstance().setIdType(value);
            return getSelf();
        }

        public B type(KeyElements value) {
            getBuildingInstance().setType(value);
            return getSelf();
        }

        public B value(String value) {
            getBuildingInstance().setValue(value);
            return getSelf();
        }

    }
}
