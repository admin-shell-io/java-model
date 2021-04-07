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
	"Administrative Information"

	"Every Identifiable may have administrative information. Administrative information includes for example 1) Information about the version of the element 2) Information about who created or who made the last change to the element 3) Information about the languages available in case the element contains text, for translating purposed also themmaster or default language may be definedIn the first version of the AAS metamodel only version information as defined by IEC 61360 is defined. In later versions additional attributes may be added."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AdministrativeInformationImpl.class),})
public interface IAdministrativeInformation extends IHasDataSpecification {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Version of the element."@en
	@return the String of administrativeInformationVersion
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
	public String getAdministrativeInformationVersion();

	/**
	"Revision of the element."@en

	"Constraint AASd-005: A revision requires a version. This means, if there is no version there is no revision neither."@en
	@return the String of administrativeInformationRevision
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
	public String getAdministrativeInformationRevision();
}
