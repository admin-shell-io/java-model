package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
	"Access ControlPolicy Points"

	"Container for access control policy points."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AccessControlPolicyPointsImpl.class),})
public interface AccessControlPolicyPoints {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"has policy administration point"

	"The access control administration policy point of the AAS."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
	PolicyAdministrationPoint getAccessControlPolicyPointsPolicyAdministrationPoint();
	/**
	"has policy decision point"

	"The access control policy decision point of the AAS."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
	PolicyDecisionPoint getAccessControlPolicyPointsPolicyDecisionPoint();
	/**
	"has policy enforcement point"

	"The access control policy enforcement point of the AAS."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
	PolicyEnforcementPoints getAccessControlPolicyPointsPolicyEnforcementPoint();
	/**
	"has policy information points"

	"The access control policy information points of the AAS."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
	PolicyInformationPoints getAccessControlPolicyPointsPolicyInformationPoints();
}
