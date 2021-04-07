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
	"Identifiable"

	"An element that has a globally unique identifier."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = IdentifiableImpl.class),
@JsonSubTypes.Type(value = IAsset.class),

@JsonSubTypes.Type(value = IAssetAdministrationShell.class),

@JsonSubTypes.Type(value = IConceptDescription.class),

@JsonSubTypes.Type(value = ISubmodel.class),})
public interface IIdentifiable extends IReferable {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Administrative information of an identifiable element."@en

	"Some of the administrative information like the version number might need to be part of the identification."@en
	@return the IAdministrativeInformation of identifiableAdministration
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	public IAdministrativeInformation getIdentifiableAdministration();

	/**
	"The globally unique identification of the element."@en
	@return the IIdentifier of identifiableIdentification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	public IIdentifier getIdentifiableIdentification();
}
