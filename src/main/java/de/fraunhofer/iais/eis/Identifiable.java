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
	"Identifiable"

	"An element that has a globally unique identifier."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = IdentifiableImpl.class),
@JsonSubTypes.Type(value = Asset.class),

@JsonSubTypes.Type(value = AssetAdministrationShell.class),

@JsonSubTypes.Type(value = ConceptDescription.class),

@JsonSubTypes.Type(value = Submodel.class),})
public interface Identifiable extends Referable {

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
	"has administration"

	"Administrative information of an identifiable element."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	AdministrativeInformation getIdentifiableAdministration();
	/**
	"has identification"

	"The globally unique identification of the element."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	Identifier getIdentifiableIdentification();
}
