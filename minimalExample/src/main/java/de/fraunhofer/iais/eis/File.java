package de.fraunhofer.iais.eis;

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
     * Path and name of the referenced file (with file extension). The path can
     * be absolute or relative.
     *
     * @return Returns the String for the property value.
     */
    public String getValue();

}
