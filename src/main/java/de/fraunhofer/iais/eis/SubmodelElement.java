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
	"Submodel Element"

	"A submodel element is an element suitable for the description and differentiation of assets."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = SubmodelElementImpl.class),
@JsonSubTypes.Type(value = Capability.class),

@JsonSubTypes.Type(value = DataElement.class),

@JsonSubTypes.Type(value = Entity.class),

@JsonSubTypes.Type(value = Event.class),

@JsonSubTypes.Type(value = EventElement.class),

@JsonSubTypes.Type(value = EventMessage.class),

@JsonSubTypes.Type(value = File.class),

@JsonSubTypes.Type(value = Operation.class),

@JsonSubTypes.Type(value = RelationshipElement.class),

@JsonSubTypes.Type(value = SubmodelElementCollection.class),})
public interface SubmodelElement extends Referable
, Qualifiable
, HasDataSpecification
, HasKind
, HasSemantics {

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

}
