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
	"Referable"

	"An element that is referable by its idShort. This id is not globally unique. This id is unique within the name space of the element."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ReferableImpl.class),
@JsonSubTypes.Type(value = AccessPermissionRule.class),

@JsonSubTypes.Type(value = Identifiable.class),

@JsonSubTypes.Type(value = SubmodelElement.class),

@JsonSubTypes.Type(value = View.class),})
public interface Referable {

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
	"has category"

	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	java.util.ArrayList<? extends String> getReferableReferableCategory();
	/**
	"has description"

	"Description or comments on the element. The description can be provided in several languages."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getReferableDescription();
	/**
	"has display name"

	"Display name. Can be provided in several languages."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	de.fraunhofer.iais.eis.util.TypedLiteral getReferableDisplayName();
	/**
	"has short id"

	"Identifying string of the element within its name space."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	String getReferableIdShort();
	/**
	"has parent"

	"Reference to the next referable parent element of the element."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	URI getReferableParent();
}
