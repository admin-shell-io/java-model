package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Blob Data Element" "A BLOB is a data element that represents a file that is contained with its
 * source code in the value attribute."@en "Constraint AASd-057: The semanticId of a File or Blob
 * submodel element shall only reference a ConceptDescription with the category DOCUMENT."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBlob.class)
})
public interface Blob extends ModelClass, DataElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Mime type of the content of the BLOB. The mime type states which file extension the file has.
     * Valid values are e.g. \'application/json\', \'application/xls\', \'image/jpg\' The allowed values
     * are defined as in RFC2046."@en
     * 
     * @return Returns the String for the property mimeType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Blob/mimeType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Blob/mimeType")
    public String getMimeType();

    /**
     * "The value of the BLOB instance of a blob data element."@en "In contrast to the file property the
     * file content is stored directly as value in the Blob data element."@en
     * 
     * @return Returns the byte[] for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Blob/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Blob/value")
    public byte[] getValue();

}
