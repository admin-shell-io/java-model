package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "File Submodel Element" "A File is a data element that represents a file via its path
 * description."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFile.class)
})
public interface File extends ModelClass, DataElement, SubmodelElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Mime type of the content of the File."@en
     * 
     * @return Returns the List of Strings for the property mimeTypes. More information under
     *         https://admin-shell.io/aas/3/0/RC01/File/mimeType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/mimeType")
    public List<String> getMimeTypes();

    /**
     * "Mime type of the content of the File."@en
     * 
     * @param mimeTypes desired value for the property mimeTypes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/File/mimeType
     */
    public void setMimeTypes(List<String> mimeTypes);

    /**
     * "Path and name of the referenced file (with file extension). The path can be absolute or
     * relative."@en
     * 
     * @return Returns the List of Strings for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/File/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/value")
    public List<String> getValues();

    /**
     * "Path and name of the referenced file (with file extension). The path can be absolute or
     * relative."@en
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/File/value
     */
    public void setValues(List<String> values);

}
