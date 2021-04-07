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
	"Key"

	"A key is a reference to an element by its id."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = KeyImpl.class),})
public interface IKey {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Type of the key value. In case of idType = idShort local shall be true. In case type=GlobalReference idType shall not be IdShort."@en

	"Constraint AASd-080: In case Key/type == GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId)."@en

	"Constraint AASd-081: In case Key/type==AssetAdministrationShell Key/idType shall not be any  LocalKeyType (IdShort, FragmentId)."@en
	@return the KeyType of keyIdType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/idType")
	public KeyType getKeyIdType();

	/**
	"Denote which kind of entity is referenced. In case type = GlobalReference then the element is a global unique id. In all other cases the key references a model element of the same or of another AAS. The name of the model element is explicitly listed."@en
	@return the KeyElements of keyType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/type")
	public KeyElements getKeyType();

	/**
	"The key value, for example an IRDI if the idType=IRDI."@en
	@return the String of keyValue
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Key/value")
	public String getKeyValue();
}
