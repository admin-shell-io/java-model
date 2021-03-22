package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
	"Blob Data Element"

	"A BLOB is a data element that represents a file that is contained with its source code in the value attribute."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = BlobImpl.class),})
public interface Blob extends DataElement {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"has mimetype"

	"Mime type of the content of the BLOB. The mime type states which file extension the file has. Valid values are e.g. \'application/json\', \'application/xls\', \'image/jpg\' The allowed values are defined as in RFC2046."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Blob/mimeType")
	String getBlobMimeType();
	/**
	"has value"

	"The value of the BLOB instance of a blob data element."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Blob/value")
	byte getBlobValue();
}
