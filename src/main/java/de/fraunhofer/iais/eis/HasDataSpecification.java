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
	"Has Data Specification"

	"Element that can have be extended by using data specification templates. A data specification template defines the additional attributes an element may or shall have. The data specifications used are explicitly specified with their id."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = HasDataSpecificationImpl.class),
@JsonSubTypes.Type(value = AdministrativeInformation.class),

@JsonSubTypes.Type(value = Asset.class),

@JsonSubTypes.Type(value = AssetAdministrationShell.class),

@JsonSubTypes.Type(value = ConceptDescription.class),

@JsonSubTypes.Type(value = Submodel.class),

@JsonSubTypes.Type(value = SubmodelElement.class),

@JsonSubTypes.Type(value = View.class),})
public interface HasDataSpecification {

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
	"has Data Specification"

	"Global reference to the data specification template used by the element."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	java.util.ArrayList<? extends Reference> getHasDataSpecificationDataSpecification();
}
