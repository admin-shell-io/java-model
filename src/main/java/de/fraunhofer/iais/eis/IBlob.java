package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
	"Blob Data Element"

	"A BLOB is a data element that represents a file that is contained with its source code in the value attribute."@en

	"Constraint AASd-057: The semanticId of a File or Blob submodel element shall only reference a ConceptDescription with the category DOCUMENT."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = BlobImpl.class),})
public interface IBlob extends IDataElement {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Mime type of the content of the BLOB. The mime type states which file extension the file has. Valid values are e.g. \'application/json\', \'application/xls\', \'image/jpg\' The allowed values are defined as in RFC2046."@en
	@return the String of blobMimeType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Blob/mimeType")
	public String getBlobMimeType();

	/**
	"The value of the BLOB instance of a blob data element."@en

	"In contrast to the file property the file content is stored directly as value in the Blob data element."@en
	@return the byte of blobValue
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Blob/value")
	public byte getBlobValue();
}
