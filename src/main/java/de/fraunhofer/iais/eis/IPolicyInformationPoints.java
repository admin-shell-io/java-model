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
	"Policy Information Points"

	"Defines the security policy information points (PIP). Serves as the retrieval source of attributes, or the data required for policy evaluation to provide the information needed by the policy decision point to make the decisions."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = PolicyInformationPointsImpl.class),})
public interface IPolicyInformationPoints {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"If externalInformationPoints True then at least one Endpoint to external available information needs to be configured for the AAS."@en
	@return the boolean of policyInformationPointsExternalInformationPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
	public boolean getPolicyInformationPointsExternalInformationPoints();

	/**
	"References to submodels defining information used by security access permission rules."@en
	@return the List of policyInformationPointsInternalInformationPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
	public List<? extends ISubmodel> getPolicyInformationPointsInternalInformationPoint();
}
