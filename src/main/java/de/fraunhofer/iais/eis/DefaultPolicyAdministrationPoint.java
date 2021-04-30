package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
* "Policy Administration Point"
* "Definition of a security administration point (PDP)."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PolicyAdministrationPoint")
public class DefaultPolicyAdministrationPoint implements PolicyAdministrationPoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Policy Administration Point", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Definition of a security administration point (PDP).", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has external access control"
	* "Endpoint to an external access control defining a policy administration point to be used by the AAS."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
	protected boolean externalAccessControl;


	/**
	* "has local access control"
	* "The policy administration point of access control as realized by the AAS itself."@en
	* "Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
	protected AccessControl localAccessControl;


	// no manual construction
	protected DefaultPolicyAdministrationPoint() {
		id = VocabUtil.getInstance().createRandomUrl("policyAdministrationPoint");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.localAccessControl,
			this.externalAccessControl});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPolicyAdministrationPoint other = (DefaultPolicyAdministrationPoint) obj;
			return Objects.equals(this.localAccessControl, other.localAccessControl) &&
				Objects.equals(this.externalAccessControl, other.externalAccessControl);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
	final public AccessControl getLocalAccessControl() {
		return localAccessControl;
	}
	
	final public void setLocalAccessControl (AccessControl localAccessControl) {
		this.localAccessControl = localAccessControl;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
	final public boolean getExternalAccessControl() {
		return externalAccessControl;
	}
	
	final public void setExternalAccessControl (boolean externalAccessControl) {
		this.externalAccessControl = externalAccessControl;
	}
}
