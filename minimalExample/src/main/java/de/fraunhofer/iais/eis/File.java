package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.builder.ExtendableBuilder;

/**
 * A File is a data element that represents a file via its path description.
 */
public interface File extends SubmodelElement {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * Mime type of the content of the File.
     *
     * @return Returns the String for the property mimeType.
     */
    public String getMimeType();

    /**
     * Mime type of the content of the File.
     *
     * @param value the String for the property mimeType.
     */
    public void setMimeType(String value);

    /**
     * Path and name of the referenced file (with file extension). The path can
     * be absolute or relative.
     *
     * @return Returns the String for the property value.
     */
    public String getValue();

    /**
     * Path and name of the referenced file (with file extension). The path can
     * be absolute or relative.
     *
     * @param value the String for the property value.
     */
    public void setValue(String value);

    public static abstract class AbstractBuilder<T extends File, B extends AbstractBuilder<T, B>> extends ExtendableBuilder<T, B> {

        public B mimeType(String value) {
            getBuildingInstance().setMimeType(value);
            return getSelf();
        }

        public B value(String value) {
            getBuildingInstance().setValue(value);
            return getSelf();
        }

    }
}
