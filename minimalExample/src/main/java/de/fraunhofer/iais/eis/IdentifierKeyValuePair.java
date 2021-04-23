package de.fraunhofer.iais.eis;

import java.lang.String;

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
     * The value of the identifier with the corresponding key.
     *
     * @return Returns the String for the property value.
     */
    public String getValue();

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * @return Returns the Reference for the property externalSubjectId.
     */
    public Reference getExternalSubjectId();

}
