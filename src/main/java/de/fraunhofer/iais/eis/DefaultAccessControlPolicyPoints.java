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
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Access ControlPolicy Points", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Container for access control policy points.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has policy administration point"
	* "The access control administration policy point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint", "policyAdministrationPoint"})
	protected PolicyAdministrationPoint policyAdministrationPoint;


	/**
	* "has policy decision point"
	* "The access control policy decision point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint", "policyDecisionPoint"})
	protected PolicyDecisionPoint policyDecisionPoint;


	/**
	* "has policy enforcement point"
	* "The access control policy enforcement point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint", "policyEnforcementPoint"})
	protected PolicyEnforcementPoints policyEnforcementPoint;


	/**
	* "has policy information points"
	* "The access control policy information points of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints", "policyInformationPoints"})
	protected PolicyInformationPoints policyInformationPoints;


	// no manual construction
	protected DefaultAccessControlPolicyPoints() {
		id = VocabUtil.getInstance().createRandomUrl("accessControlPolicyPoints");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
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
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	/**
	* This function returns a hash code value for the AccessControlPolicyPoints for the benefit of e.g. hash tables.
	* @return a hash code value for the AccessControlPolicyPoints
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.policyAdministrationPoint, this.policyDecisionPoint, this.policyEnforcementPoint, this.policyInformationPoints});
	}

	/**
	* This function indicates wheather some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this AccessControlPolicyPoints is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAccessControlPolicyPoints other = (DefaultAccessControlPolicyPoints) obj;
			return super.equals(other) && Objects.equals(this.policyAdministrationPoint, other.policyAdministrationPoint) && Objects.equals(this.policyDecisionPoint, other.policyDecisionPoint) && Objects.equals(this.policyEnforcementPoint, other.policyEnforcementPoint) && Objects.equals(this.policyInformationPoints, other.policyInformationPoints);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "The access control administration policy point of the AAS."@en
	* @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
	final public PolicyAdministrationPoint getPolicyAdministrationPoint() {
		return policyAdministrationPoint;
	}

	
	/**
	* "The access control administration policy point of the AAS."@en
	* @param policyAdministrationPoint desired value for the property policyAdministrationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
	*/
	final public void setPolicyAdministrationPoint (PolicyAdministrationPoint policyAdministrationPoint) {
		this.policyAdministrationPoint = policyAdministrationPoint;
	}

	/**
	* "The access control policy decision point of the AAS."@en
	* @return Returns the PolicyDecisionPoint for the property policyDecisionPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
	final public PolicyDecisionPoint getPolicyDecisionPoint() {
		return policyDecisionPoint;
	}

	
	/**
	* "The access control policy decision point of the AAS."@en
	* @param policyDecisionPoint desired value for the property policyDecisionPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
	*/
	final public void setPolicyDecisionPoint (PolicyDecisionPoint policyDecisionPoint) {
		this.policyDecisionPoint = policyDecisionPoint;
	}

	/**
	* "The access control policy enforcement point of the AAS."@en
	* @return Returns the PolicyEnforcementPoints for the property policyEnforcementPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
	final public PolicyEnforcementPoints getPolicyEnforcementPoint() {
		return policyEnforcementPoint;
	}

	
	/**
	* "The access control policy enforcement point of the AAS."@en
	* @param policyEnforcementPoint desired value for the property policyEnforcementPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
	*/
	final public void setPolicyEnforcementPoint (PolicyEnforcementPoints policyEnforcementPoint) {
		this.policyEnforcementPoint = policyEnforcementPoint;
	}

	/**
	* "The access control policy information points of the AAS."@en
	* @return Returns the PolicyInformationPoints for the property policyInformationPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
	final public PolicyInformationPoints getPolicyInformationPoints() {
		return policyInformationPoints;
	}

	
	/**
	* "The access control policy information points of the AAS."@en
	* @param policyInformationPoints desired value for the property policyInformationPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
	*/
	final public void setPolicyInformationPoints (PolicyInformationPoints policyInformationPoints) {
		this.policyInformationPoints = policyInformationPoints;
	}
}
