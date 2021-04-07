package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
	"Referable"

	"An element that is referable by its idShort. This id is not globally unique. This id is unique within the name space of the element."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ReferableImpl.class),
@JsonSubTypes.Type(value = IAccessPermissionRule.class),

@JsonSubTypes.Type(value = IIdentifiable.class),

@JsonSubTypes.Type(value = ISubmodelElement.class),

@JsonSubTypes.Type(value = IView.class),})
public interface IReferable {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	@return the List of referableReferableCategory
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	public List<? extends String> getReferableReferableCategory();

	/**
	"Description or comments on the element. The description can be provided in several languages."@en
	@return the List of referableDescription
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	public List<? extends TypedLiteral> getReferableDescription();

	/**
	"Display name. Can be provided in several languages."@en
	@return the TypedLiteral of referableDisplayName
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	public TypedLiteral getReferableDisplayName();

	/**
	"Identifying string of the element within its name space."@en

	"Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en

	"Constraint AASd-003: idShort shall be matched case-insensitive."@en

	"Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en

	"Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en

	"Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	@return the String of referableIdShort
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	public String getReferableIdShort();

	/**
	"Reference to the next referable parent element of the element."@en

	"Constraint AASd-004: Add parent in case of non-identifiable elements."@en

	"This element is used to ease navigation in the model and thus it enables more performant"@en
	@return the URI of referableParent
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	public URI getReferableParent();
}
