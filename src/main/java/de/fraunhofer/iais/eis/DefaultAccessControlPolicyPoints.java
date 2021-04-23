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
import java.util.Objects;
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
* "Access ControlPolicy Points"
* "Container for access control policy points."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AccessControlPolicyPoints")
public class DefaultAccessControlPolicyPoints implements Serializable, AccessControlPolicyPoints {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Access ControlPolicy Points", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Container for access control policy points.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has policy administration point"
	* "The access control administration policy point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint", "accessControlPolicyPointsPolicyAdministrationPoint"})
	protected PolicyAdministrationPoint accessControlPolicyPointsPolicyAdministrationPoint;


	/**
	* "has policy decision point"
	* "The access control policy decision point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint", "accessControlPolicyPointsPolicyDecisionPoint"})
	protected PolicyDecisionPoint accessControlPolicyPointsPolicyDecisionPoint;


	/**
	* "has policy enforcement point"
	* "The access control policy enforcement point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint", "accessControlPolicyPointsPolicyEnforcementPoint"})
	protected PolicyEnforcementPoints accessControlPolicyPointsPolicyEnforcementPoint;


	/**
	* "has policy information points"
	* "The access control policy information points of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints", "accessControlPolicyPointsPolicyInformationPoints"})
	protected PolicyInformationPoints accessControlPolicyPointsPolicyInformationPoints;


	// no manual construction
	protected DefaultAccessControlPolicyPoints() {
		id = VocabUtil.getInstance().createRandomUrl("accessControlPolicyPoints");
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

	public int hashCode() {
		return Objects.hash(new Object[]{this.accessControlPolicyPointsPolicyAdministrationPoint,
			this.accessControlPolicyPointsPolicyDecisionPoint,
			this.accessControlPolicyPointsPolicyEnforcementPoint,
			this.accessControlPolicyPointsPolicyInformationPoints});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAccessControlPolicyPoints other = (DefaultAccessControlPolicyPoints) obj;
			return Objects.equals(this.accessControlPolicyPointsPolicyAdministrationPoint, other.accessControlPolicyPointsPolicyAdministrationPoint) &&
				Objects.equals(this.accessControlPolicyPointsPolicyDecisionPoint, other.accessControlPolicyPointsPolicyDecisionPoint) &&
				Objects.equals(this.accessControlPolicyPointsPolicyEnforcementPoint, other.accessControlPolicyPointsPolicyEnforcementPoint) &&
				Objects.equals(this.accessControlPolicyPointsPolicyInformationPoints, other.accessControlPolicyPointsPolicyInformationPoints);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
	final public PolicyAdministrationPoint getAccessControlPolicyPointsPolicyAdministrationPoint() {
		return accessControlPolicyPointsPolicyAdministrationPoint;
	}
	
	final public void setAccessControlPolicyPointsPolicyAdministrationPoint (PolicyAdministrationPoint accessControlPolicyPointsPolicyAdministrationPoint) {
		this.accessControlPolicyPointsPolicyAdministrationPoint = accessControlPolicyPointsPolicyAdministrationPoint;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
	final public PolicyDecisionPoint getAccessControlPolicyPointsPolicyDecisionPoint() {
		return accessControlPolicyPointsPolicyDecisionPoint;
	}
	
	final public void setAccessControlPolicyPointsPolicyDecisionPoint (PolicyDecisionPoint accessControlPolicyPointsPolicyDecisionPoint) {
		this.accessControlPolicyPointsPolicyDecisionPoint = accessControlPolicyPointsPolicyDecisionPoint;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
	final public PolicyEnforcementPoints getAccessControlPolicyPointsPolicyEnforcementPoint() {
		return accessControlPolicyPointsPolicyEnforcementPoint;
	}
	
	final public void setAccessControlPolicyPointsPolicyEnforcementPoint (PolicyEnforcementPoints accessControlPolicyPointsPolicyEnforcementPoint) {
		this.accessControlPolicyPointsPolicyEnforcementPoint = accessControlPolicyPointsPolicyEnforcementPoint;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
	final public PolicyInformationPoints getAccessControlPolicyPointsPolicyInformationPoints() {
		return accessControlPolicyPointsPolicyInformationPoints;
	}
	
	final public void setAccessControlPolicyPointsPolicyInformationPoints (PolicyInformationPoints accessControlPolicyPointsPolicyInformationPoints) {
		this.accessControlPolicyPointsPolicyInformationPoints = accessControlPolicyPointsPolicyInformationPoints;
	}
}
