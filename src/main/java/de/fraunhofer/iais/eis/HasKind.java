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
	"Has Kind"

	"An element with a kind is an element that can either represent a type or an instance. Default for an element is that it is representing an instance."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = HasKindImpl.class),
@JsonSubTypes.Type(value = Submodel.class),

@JsonSubTypes.Type(value = SubmodelElement.class),})
public interface HasKind {

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
	"has kind"

	"ModelingKind of the element: either type or instance."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	ModelingKind getHasKindKind();
}
