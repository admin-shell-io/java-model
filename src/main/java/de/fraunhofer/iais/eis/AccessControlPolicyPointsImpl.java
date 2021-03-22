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

	"Container for access control policy points."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AccessControlPolicyPoints")
public class AccessControlPolicyPointsImpl implements Serializable, AccessControlPolicyPoints {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Access ControlPolicy Points", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Container for access control policy points.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has policy administration point"

	"The access control administration policy point of the AAS."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint", "accessControlPolicyPointsPolicyAdministrationPoint"})
	 PolicyAdministrationPoint _accessControlPolicyPointsPolicyAdministrationPoint;


	/**
	"has policy decision point"

	"The access control policy decision point of the AAS."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint", "accessControlPolicyPointsPolicyDecisionPoint"})
	 PolicyDecisionPoint _accessControlPolicyPointsPolicyDecisionPoint;


	/**
	"has policy enforcement point"

	"The access control policy enforcement point of the AAS."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint", "accessControlPolicyPointsPolicyEnforcementPoint"})
	 PolicyEnforcementPoints _accessControlPolicyPointsPolicyEnforcementPoint;


	/**
	"has policy information points"

	"The access control policy information points of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints", "accessControlPolicyPointsPolicyInformationPoints"})
	 PolicyInformationPoints _accessControlPolicyPointsPolicyInformationPoints;


	// no manual construction
	AccessControlPolicyPointsImpl() {
		id = VocabUtil.getInstance().createRandomUrl("accessControlPolicyPoints");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
	PolicyAdministrationPoint getAccessControlPolicyPointsPolicyAdministrationPoint() {
		return _accessControlPolicyPointsPolicyAdministrationPoint;
	}

	final public void setAccessControlPolicyPointsPolicyAdministrationPoint (PolicyAdministrationPoint _accessControlPolicyPointsPolicyAdministrationPoint_) {
		this._accessControlPolicyPointsPolicyAdministrationPoint = _accessControlPolicyPointsPolicyAdministrationPoint_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
	PolicyDecisionPoint getAccessControlPolicyPointsPolicyDecisionPoint() {
		return _accessControlPolicyPointsPolicyDecisionPoint;
	}

	final public void setAccessControlPolicyPointsPolicyDecisionPoint (PolicyDecisionPoint _accessControlPolicyPointsPolicyDecisionPoint_) {
		this._accessControlPolicyPointsPolicyDecisionPoint = _accessControlPolicyPointsPolicyDecisionPoint_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
	PolicyEnforcementPoints getAccessControlPolicyPointsPolicyEnforcementPoint() {
		return _accessControlPolicyPointsPolicyEnforcementPoint;
	}

	final public void setAccessControlPolicyPointsPolicyEnforcementPoint (PolicyEnforcementPoints _accessControlPolicyPointsPolicyEnforcementPoint_) {
		this._accessControlPolicyPointsPolicyEnforcementPoint = _accessControlPolicyPointsPolicyEnforcementPoint_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
	PolicyInformationPoints getAccessControlPolicyPointsPolicyInformationPoints() {
		return _accessControlPolicyPointsPolicyInformationPoints;
	}

	final public void setAccessControlPolicyPointsPolicyInformationPoints (PolicyInformationPoints _accessControlPolicyPointsPolicyInformationPoints_) {
		this._accessControlPolicyPointsPolicyInformationPoints = _accessControlPolicyPointsPolicyInformationPoints_;
	}
}
