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
	"Entity"

	"An entity is a submodel element that is used to model entities."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = EntityImpl.class),})
public interface Entity extends SubmodelElement {

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
	"has global asset id"

	"Reference to the asset the entity is representing."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
	Reference getEntityGlobalAssetId();
	/**
	"has external asset id"

	"Reference to an identifier key value pair representing an external identifier of the asset represented by the asset administration shell. "@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
	IdentifierKeyValuePair getEntityExternalAssetId();
	/**
	"has entity type"

	"Describes whether the entity is a co-managed entity or a self-managed entity."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
	EntityType getEntityEntityType();
	/**
	"has statement"

	"Describes statements applicable to the entity by a set of submodel elements, typically with a qualified value."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
	java.util.ArrayList<? extends SubmodelElement> getEntityStatement();
}
