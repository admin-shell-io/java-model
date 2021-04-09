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
* "Entity"
* "An entity is a submodel element that is used to model entities."@en
* "Constraint AASd-056: The semanticId of a Entity submodel element shall only reference a ConceptDescription with the category ENTITY. The ConceptDescription describes the elements assigned to the entity via Entity/statement."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = EntityImpl.class)
})
public interface IEntity extends ISubmodelElement {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Reference to the asset the entity is representing."@en
	* "The asset attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en
	* "Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
	* @return Returns the IReference for the property entityGlobalAssetId.
	* More information under https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
	public IReference getEntityGlobalAssetId();

	/**
	* "Reference to an identifier key value pair representing an external identifier of the asset represented by the asset administration shell. "@en
	* "The asset attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en
	* "Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
	* @return Returns the IIdentifierKeyValuePair for the property entityExternalAssetId.
	* More information under https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
	public IIdentifierKeyValuePair getEntityExternalAssetId();

	/**
	* "Describes whether the entity is a co-managed entity or a self-managed entity."@en
	* @return Returns the EntityType for the property entityEntityType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Entity/entityType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
	public EntityType getEntityEntityType();

	/**
	* "Describes statements applicable to the entity by a set of submodel elements, typically with a qualified value."@en
	* @return Returns the List of ISubmodelElement for the property entityStatement.
	* More information under https://admin-shell.io/aas/3/0/RC01/Entity/statement
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
	public List<? extends ISubmodelElement> getEntityStatement();

}
