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
	"Concept Description"

	"The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template)."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ConceptDescriptionImpl.class),})
public interface ConceptDescription extends HasDataSpecification
, Identifiable {

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
	"has content"

	"Link from a ConceptDescription to its explaining DataSpecificationContent."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content")
	java.util.ArrayList<? extends DataSpecificationContent> getConceptDescriptionContent();
	/**
	"is case of"

	"Reference to an external definition the concept is compatible to or was derived from."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
	java.util.ArrayList<? extends Reference> getConceptDescriptionIsCaseOf();
}
