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
	"Relationship Element"

	"Constraint AASd-055: The semanticId of a RelationshipElement or a AnnotatedRelationshipElement shall only reference a ConceptDescription with the category RELATIONSHIP."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = RelationshipElementImpl.class),
@JsonSubTypes.Type(value = IAnnotatedRelationshipElement.class),})
public interface IRelationshipElement extends ISubmodelElement {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"First element in the relationship taking the role of the subject."@en
	@return the IReferable of relationshipElementFirst
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
	public IReferable getRelationshipElementFirst();

	/**
	"Second element in the relationship taking the role of the object."@en
	@return the IReferable of relationshipElementSecond
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
	public IReferable getRelationshipElementSecond();
}
