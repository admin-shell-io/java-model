package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "File Submodel Element" "A File is a data element that represents a file via its path
 * description."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFile.class)
})
public interface File extends DataElement, SubmodelElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Mime type of the content of the File."@en
     * 
     * @return Returns the String for the property mimeType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/File/mimeType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/mimeType")
    public String getMimeType();

    /**
     * "Mime type of the content of the File."@en
     * 
     * @param mimeType desired value for the property mimeType. More information under
     *        https://admin-shell.io/aas/3/0/RC01/File/mimeType
     */
    public void setMimeType(String mimeType);

    /**
     * "Path and name of the referenced file (with file extension). The path can be absolute or
     * relative."@en
     * 
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/File/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/value")
    public String getValue();

    /**
     * "Path and name of the referenced file (with file extension). The path can be absolute or
     * relative."@en
     * 
     * @param value desired value for the property value. More information under
     *        https://admin-shell.io/aas/3/0/RC01/File/value
     */
    public void setValue(String value);

}
