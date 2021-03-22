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
	"Range"

	"An element that is referable by its idShort. This id is not globally unique. This id is unique within the name space of the element."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = RangeImpl.class),})
public interface Range extends DataElement {

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
	"has maximum value"

	"The maximum value of the range."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Range/max")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getRangeMax();
	/**
	"has minimum value"

	"The minimum value of the range."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Range/min")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getRangeMin();
}
