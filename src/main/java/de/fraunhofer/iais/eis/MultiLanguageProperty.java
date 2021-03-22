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
	"Multi Language Property"

	"A property is a data element that has a multi language value."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = MultiLanguagePropertyImpl.class),})
public interface MultiLanguageProperty extends DataElement {

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
	"has value"

	"The value of the property instance."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getMultiLanguagePropertyValue();
	/**
	"hsa value Id"

	"Reference to the global unqiue id of a coded value."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId")
	java.util.ArrayList<? extends Reference> getMultiLanguagePropertyValueId();
}
