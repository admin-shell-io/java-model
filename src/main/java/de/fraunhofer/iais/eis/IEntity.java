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
	"Entity"

	"An entity is a submodel element that is used to model entities."@en

	"Constraint AASd-056: The semanticId of a Entity submodel element shall only reference a ConceptDescription with the category ENTITY. The ConceptDescription describes the elements assigned to the entity via Entity/statement."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = EntityImpl.class),})
public interface IEntity extends ISubmodelElement {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Reference to the asset the entity is representing."@en

	"The asset attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en

	"Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
	@return the IReference of entityGlobalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
	public IReference getEntityGlobalAssetId();

	/**
	"Reference to an identifier key value pair representing an external identifier of the asset represented by the asset administration shell. "@en

	"The asset attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en

	"Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
	@return the IIdentifierKeyValuePair of entityExternalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
	public IIdentifierKeyValuePair getEntityExternalAssetId();

	/**
	"Describes whether the entity is a co-managed entity or a self-managed entity."@en
	@return the EntityType of entityEntityType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
	public EntityType getEntityEntityType();

	/**
	"Describes statements applicable to the entity by a set of submodel elements, typically with a qualified value."@en
	@return the List of entityStatement
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
	public List<? extends ISubmodelElement> getEntityStatement();
}
