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
	"Policy Administration Point"

	"Definition of a security administration point (PDP)."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = PolicyAdministrationPointImpl.class),})
public interface IPolicyAdministrationPoint {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"The policy administration point of access control as realized by the AAS itself."@en

	"Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control."@en
	@return the IAccessControl of policyAdministrationPointLocalAccessControl
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
	public IAccessControl getPolicyAdministrationPointLocalAccessControl();

	/**
	"Endpoint to an external access control defining a policy administration point to be used by the AAS."@en
	@return the boolean of policyAdministrationPointExternalAccessControl
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
	public boolean getPolicyAdministrationPointExternalAccessControl();
}
