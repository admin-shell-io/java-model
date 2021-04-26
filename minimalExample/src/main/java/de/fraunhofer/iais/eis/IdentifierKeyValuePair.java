package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.builder.ExtendableBuilder;

/**
 * An IdentifierKeyValuePair describes a generic identifier as key-value pair.
 */
public interface IdentifierKeyValuePair extends HasSemantics {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * Key of the identifier.
     *
     * @return Returns the String for the property key.
     */
    public String getKey();

    /**
     * Key of the identifier.
     *
     * @param value Returns the String for the property key.
     */
    public void setKey(String value);

    /**
     * The value of the identifier with the corresponding key.
     *
     * @return Returns the String for the property value.
     */
    public String getValue();

    /**
     * The value of the identifier with the corresponding key.
     *
     * @param value the String for the property value.
     */
    public void setValue(String value);

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * @return Returns the Reference for the property externalSubjectId.
     */
    public Reference getExternalSubjectId();

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * @para value the Reference for the property externalSubjectId.
     */
    public void setExternalSubjectId(Reference value);

    public static abstract class AbstractBuilder<T extends IdentifierKeyValuePair, B extends AbstractBuilder<T, B>> extends ExtendableBuilder<T, B> {

        public B externalSubjectId(Reference value) {
            getBuildingInstance().setExternalSubjectId(value);
            return getSelf();
        }

        public B key(String value) {
            getBuildingInstance().setKey(value);
            return getSelf();
        }

        public B value(String value) {
            getBuildingInstance().setValue(value);
            return getSelf();
        }

        public B semanticId(Reference value) {
            getBuildingInstance().setSemanticId(value);
            return getSelf();
        }

    }
}
