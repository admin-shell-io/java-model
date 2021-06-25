package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A File is a data element that represents a file via its path description.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFile.class)
})
public interface File extends SubmodelElement {

    /**
     * Mime type of the content of the File.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/mimeType
     *
     * @return Returns the List of Strings for the property mimeTypes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/mimeType")
    List<String> getMimeTypes();

    /**
     * Mime type of the content of the File.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/mimeType
     *
     * @param mimeTypes desired value for the property mimeTypes.
     */
    void setMimeTypes(List<String> mimeTypes);

    /**
     * Path and name of the referenced file (with file extension). The path can be absolute or relative.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/value
     *
     * @return Returns the List of Strings for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/value")
    List<String> getValues();

    /**
     * Path and name of the referenced file (with file extension). The path can be absolute or relative.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/value
     *
     * @param values desired value for the property values.
     */
    void setValues(List<String> values);

}
